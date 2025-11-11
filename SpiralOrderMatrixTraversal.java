import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralOrderMatrixTraversal {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if (matrix == null || matrix.length==0) return res;
        int top=0, bottom=matrix.length-1, left=0, right=matrix[0].length-1;
        while (left<=right && top<=bottom) {
            for (int j=left;j<=right;j++) res.add(matrix[top][j]);
            top++;
            for (int i=top;i<=bottom;i++) res.add(matrix[i][right]);
            right--;
            if (top<=bottom) {
                for (int j=right;j>=left;j--) res.add(matrix[bottom][j]);
                bottom--;
            }
            if (left<=right) {
                for (int i=bottom;i>=top;i--) res.add(matrix[i][left]);
                left++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println("15. Spiral Order Matrix Traversal");
        int[][][] p15 = {
            {{1,2,3},{4,5,6},{7,8,9}},
            {{1}},
            {{1,2},{3,4}},
            {{1,2,3},{4,5,6}},
            {{1,2},{3,4},{5,6}}
        };
        for (int[][] mat : p15) System.out.printf("%s -> %s%n", Arrays.deepToString(mat), spiralOrder(mat));
        System.out.println();
    }
}
