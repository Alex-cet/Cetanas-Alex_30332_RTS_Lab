package Ex1_2;

public class Ex1_2 {
    public static void main(String[] args) {
        int[][] matrix1 = { {2, 3, 1}, {7, 1, 6}, {9, 2, 4} };
        int[][] matrix2 = { {8, 5, 3}, {3, 9, 2}, {2, 7, 3} };
        int[][] sumMatrix = new int[3][3];
        int[][] prodMatrix = new int[3][3];

        for (int i = 0; i < matrix1.length; ++i) {
            for (int j = 0; j < matrix2.length; ++j) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
                for (int k = 0; k < matrix1.length; ++k) {
                    prodMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        for (int i = 0; i < matrix1.length; ++i) {
            for (int j = 0; j < matrix2.length; ++j) {
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.print("\n");
        }

        System.out.println();

        for (int i = 0; i < matrix1.length; ++i) {
            for (int j = 0; j < matrix2.length; ++j) {
                System.out.print(prodMatrix[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}