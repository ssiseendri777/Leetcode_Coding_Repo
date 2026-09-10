// treenode creation
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

// my own pair class creation
class nodeSumCountpair<K, V> {
    K key;
    V value;

    nodeSumCountpair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    K getKey() {
        return key;
    }

    V getValue() {
        return value;
    }
}

class Solution {
    static int count = 0;

    public static int averageOfSubtree(TreeNode root) {
        count = 0;
        // static count make it increase one after another
        DFS(root);
        return count;
    }

    static nodeSumCountpair<Integer, Integer> DFS(TreeNode root) {
        if (root == null) {
            return new nodeSumCountpair<>(0, 0);
        }
        // recursive dfs call
        nodeSumCountpair<Integer, Integer> left = DFS(root.left);
        nodeSumCountpair<Integer, Integer> right = DFS(root.right);
        //counting the nodes also sum of the subtrees
        int nodeSum = left.getKey() + right.getKey() + root.val;
        int nodeCount = left.getValue() + right.getValue() + 1;
        // checking the average is equal to root
        if (root.val == nodeSum / nodeCount) {
            count++;
            // increase count if case satisfies
        }
        return new nodeSumCountpair<>(nodeSum, nodeCount);
    }

    public static void main(String[] args) {
        // used wrapper class because int cant store null
        Integer[] tree = { 4, 8, 5, 0, 1, null, 6 };
        // storing nodes after they created
        TreeNode[] nodes = new TreeNode[tree.length];
        // creating all nodes of the tree
        for (int i = 0; i < tree.length; i++) {
            if (tree[i] != null) {
                nodes[i] = new TreeNode(tree[i]);
            }
        }
        // tree creation from array
        for (int i = 0; i < tree.length; i++) {
            if (nodes[i] == null) {
                continue;
            }
            int leftindex = 2 * i + 1; // left node for binarytree
            int rightindex = 2 * i + 2; // right node for binarytree

            if (leftindex < tree.length) {
                nodes[i].left = nodes[leftindex];
            }

            if (rightindex < tree.length) {
                nodes[i].right = nodes[rightindex];
            }
        }
        System.out.println(
                "The number of nodes where the value of the node is equal to the average of the values in its subtree is : "
                        + averageOfSubtree(nodes[0]));
    }
}