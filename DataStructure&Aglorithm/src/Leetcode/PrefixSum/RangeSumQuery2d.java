package Leetcode.PrefixSum;


public class RangeSumQuery2d {

    private int[][] prefixArr;

    public RangeSumQuery2d(int[][] matrix) {
        if (matrix.length == 0 || matrix == null || matrix[0].length == 0)
            return;
        int row = matrix[0].length;
        int col = matrix.length;
        
        prefixArr = new int[row + 1][col + 1];
        for (int a = 1; a <= row; a++) {
            for (int b = 1; b <= col; b++) {
                prefixArr[a][b] = matrix[a - 1][b - 1]
                        + prefixArr[a - 1][b]
                        + prefixArr[a][b - 1]
                        - prefixArr[a - 1][b - 1];
            }
        }
    }

    public int sumRegion(int r1, int c1, int r2, int c2) {
        return prefixArr[r2 + 1][c2 + 1] - prefixArr[r1][c2 + 1] - prefixArr[r2 + 1][c1] + prefixArr[r1][c1];
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 3, 0, 1, 4, 2 }, // { (0,0) | (0,1), (0,2) | (0,3)| (0,4) }
                { 5, 6, 3, 2, 1 }, // { (1,0) | (1,1), (1,2) | (1,3)| (1,4) }
                { 1, 2, 0, 1, 5 }, // { (2,0) | (2,1), (2,2) | (2,3)| (2,4) }
                { 4, 1, 0, 1, 7 }, // { (3,0) | (3,1), (3,2) | (3,3)| (3,4) }
                { 1, 0, 3, 0, 5 }, // { (4,0) | (4,1), (4,2) | (4,3)| (4,4) }
        };
        RangeSumQuery2d rangeSumQuery2d = new RangeSumQuery2d(matrix);
        int sum = rangeSumQuery2d.sumRegion(2, 2, 3, 4);
        System.err.println(sum);
    }
}
