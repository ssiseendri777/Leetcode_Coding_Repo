class Solution {

    public int[] maximumWeight(List<List<Integer>> intervals) {
        int n = intervals.size();
        int[][] arr = new int[n][4];
        for (int i = 0; i < n; i++) {
            arr[i][0] = intervals.get(i).get(0);
            arr[i][1] = intervals.get(i).get(1);
            arr[i][2] = intervals.get(i).get(2);
            arr[i][3] = i;
        }
        // Sort by rightindex endpoint.
        Arrays.sort(arr, (a, b) -> Integer.compare(a[1], b[1]));

        long[][] dp2darray = new long[n + 1][5];
        List<Integer>[][] indices = new List[n + 1][5];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < 5; j++) {
                indices[i][j] = new ArrayList<>();
            }
        }

        for (int i = 0; i < n; i++) {
            int l = arr[i][0],
                    weight = arr[i][2],
                    index = arr[i][3];
            // Use binary search to find intervals whose rightindex endpoints are smaller than l.
            int k = binarySearch(arr, i, l);

            for (int j = 1; j < 5; j++) {
                long a1 = dp2darray[i][j];
                long a2 = dp2darray[k][j - 1] + weight;
                if (a1 > a2) {
                    dp2darray[i + 1][j] = dp2darray[i][j];
                    indices[i + 1][j] = new ArrayList<>(indices[i][j]);
                    continue;
                }

                List<Integer> newIndex = new ArrayList<>(indices[k][j - 1]);
                newIndex.add(index);
                Collections.sort(newIndex);
                if (a1 == a2 && compareLists(indices[i][j], newIndex) < 0) {
                    newIndex = new ArrayList<>(indices[i][j]);
                }
                dp2darray[i + 1][j] = a2;
                indices[i + 1][j] = newIndex;
            }
        }

        List<Integer> result = indices[n][4];
        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }

    private int binarySearch(int[][] arr, int end, int target) {
        int leftindex = 0,
                rightindex = end;
        while (leftindex < rightindex) {
            int mid = (leftindex + rightindex) / 2;
            if (arr[mid][1] < target) {
                leftindex = mid + 1;
            } else {
                rightindex = mid;
            }
        }
        return leftindex;
    }

    private int compareLists(List<Integer> list1, List<Integer> list2) {
        int minLength = Math.min(list1.size(), list2.size());
        for (int i = 0; i < minLength; i++) {
            if (!list1.get(i).equals(list2.get(i))) {
                return Integer.compare(list1.get(i), list2.get(i));
            }
        }
        return Integer.compare(list1.size(), list2.size());
    }
}