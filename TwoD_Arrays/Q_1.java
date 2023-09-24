package TwoD_Arrays;

public class Q_1 {
    public static void main(String[] args) {
        int matrix [][] = {{4,7,8},{8,8,7}};
        int key = 7;
        int count = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j]==key) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
