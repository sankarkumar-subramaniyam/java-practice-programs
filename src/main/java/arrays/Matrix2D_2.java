package arrays;

public class Matrix2D_2 {


    public static void main(String[] args) {

        Matrix2D_2 new2Dx = new Matrix2D_2();
        int row = 5;
        int col = 5;
        int[][] mat2d = new int[row][col];

        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                mat2d[r][c] = r * 10 + c;
            }
        }
        new2Dx.print2Dmat(mat2d);

        System.out.println(new2Dx.searchValueIn2DMat(mat2d, 43));
        System.out.println(new2Dx.searchValueIn2DMat(mat2d, 45));

        System.out.println(new2Dx.searchValueIn2DMatSorted(mat2d, 43));
        System.out.println(new2Dx.searchValueIn2DMatSorted(mat2d, 45));

        new2Dx.rotate2DMatrixImage90D(mat2d);
    }

    public void print2Dmat(int[][] mat2d) {
        System.out.println("-----------------");
        System.out.print("[");

        for (int r = 0; r < mat2d.length; r++) {
            //System.out.print("\t");
            for (int c = 0; c < mat2d[r].length; c++) {
                if (c == 0)
                    System.out.println("\t");
                System.out.print(mat2d[r][c] + " ");
                if (c < mat2d.length - 1)
                    System.out.print(",");
            }
        }
        System.out.println("]");
        System.out.println("-----------------");
    }

    public boolean searchValueIn2DMat(int[][] mat2D, int val) {

        int row = mat2D.length;
        int col = mat2D[0].length;

        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                if (val == mat2D[r][c])
                    return true;
            }
        }

        return false;
    }

    public boolean searchValueIn2DMatSorted(int[][] mat2D, int val) {

        if (mat2D.length <= 0 || mat2D[0].length <= 0)
            return false;

        int row = mat2D.length;
        int col = mat2D[0].length;

        int start = 0;
        int end = row * col - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            int midRow = mid / col;
            int midCol = mid % col;

            if (val == mat2D[midRow][midCol]) {
                return true;
            }

            if (val < mat2D[midRow][midCol]) {
                end = mid - 1;
            }

            if (val > mat2D[midRow][midCol]) {
                start = mid + 1;
            }

        }
        return false;
    }

    public void rotate2DMatrixImage90D(int[][] matrix) {
        int length = matrix.length;

        // maxIndex
        int k = length - 1;

        for (int i = 0; i < length / 2; i++) {
            for (int j = 0; j < Math.ceil(((double) length) / 2); j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[k - j][i];
                matrix[k - j][i] = matrix[k - i][k - j];
                matrix[k - i][k - j] = matrix[j][k - i];
                matrix[j][k - i] = temp;
            }
        }

        System.out.println("------- rotate2DMatrixImage --------");
        print2Dmat(matrix);
    }

}
