class Solution {
    public static boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        return (rec1[0] < rec2[2] &&
                rec1[1] < rec2[3] &&
                rec1[2] > rec2[0] &&
                rec1[3] > rec2[1]);

    }

    public static void main(String[] args) {
        int[] rect1 = { 0, 1, 2, 3 }, rect2 = { 1, 0, 3, 2 };
        System.out.println("Is rectangle 1 and 2 overlap : " + isRectangleOverlap(rect1, rect2));

    }
}