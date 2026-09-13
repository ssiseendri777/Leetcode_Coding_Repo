class Solution {
    public static int largestOverlap(int[][] img1, int[][] img2) {
        int n = img1.length;
        int maxoverlap = 0;
        for (int x = -(n - 1); x < n; ++x) {
            for (int y = -(n - 1); y < n; ++y) {
                int count = 0;
                for (int i = 0; i < n && i + x < n; ++i) {
                    for (int j = 0; j < n && j + y < n; ++j) {
                        int newx = i + x;
                        int newy = j + y;
                        if (newx >= 0 && newx < n) {
                            if (newy >= 0 && newy < n) {
                                if (img1[newx][newy] == 1 && img2[i][j] == 1) {
                                    ++count;
                                }
                            }
                        }
                    }
                }
                maxoverlap = Math.max(maxoverlap, count);
            }
        }
        return maxoverlap;
    }

    public static void main(String[] args) {
        int[][] img1 = { { 1, 1, 1 }, { 1, 0, 0 }, { 0, 1, 0 } };
        int[][] img2 = { { 0, 1, 1 }, { 0, 0, 0 }, { 0, 1, 1 } };
        System.out.println("The largest possible overlap is : " + largestOverlap(img1, img2));
    }
}