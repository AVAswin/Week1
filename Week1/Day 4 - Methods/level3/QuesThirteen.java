import java.util.*;

class QuesThirteen {
    public static int[][] add(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length, cols = matrix1[0].length;
        int[][] ans = new int[rows][cols];

        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                ans[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return ans;
    }

    public static int[][] subtract(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length, cols = matrix1[0].length;
        int[][] ans = new int[rows][cols];

        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                ans[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return ans;
    }

    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length, cols = matrix1[0].length;
        int[][] ans = new int[rows][cols];

        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                for(int k=0; k<cols; k++) {
                    ans[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows1 = scanner.nextInt();
        int cols1 = scanner.nextInt();
        int[][] matrix1 = new int [rows1][cols1];
        for(int i=0;i<rows1;i++) {
            for(int j=0;j<cols1;j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        int rows2 = scanner.nextInt();
        int cols2 = scanner.nextInt();
        int[][] matrix2 = new int [rows2][cols2];
        for(int i=0;i<rows2;i++) {
            for(int j=0;j<cols2;j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        int[][] addedMatrix = add(matrix1, matrix2);
        int[][] subedMatrix = subtract(matrix1, matrix2);
        int[][] productMatrix = multiply(matrix1, matrix2);
        
        for(int i=0;i<rows1;i++) {
            for(int j=0;j<cols1;j++) {
                System.out.print(addedMatrix[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

        for(int i=0;i<rows1;i++) {
            for(int j=0;j<cols1;j++) {
                System.out.print(subedMatrix[i][j]);
                System.out.println(" ");
            }
            System.out.println();
        }      

        for(int i=0;i<rows1;i++) {
            for(int j=0;j<cols1;j++) {
                System.out.print(productMatrix[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
