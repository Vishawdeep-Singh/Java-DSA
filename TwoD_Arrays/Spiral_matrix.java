package TwoD_Arrays;

public class Spiral_matrix {
    public static void printspiral(int matrix[][]) {
        int startRow=0;
        int startCol=0;
        int endRow=  matrix.length-1;
        int endCol=matrix[0].length-1;
        while (startCol<=endCol && startRow // if we dont apply equal to here the middle cell left in odd matrix will not be printed and AND operator so that vaulue does not repeat.
        <=endRow) {
            //top
            for (int j= startCol; j<=endCol; j++) {
                System.out.print(matrix[startRow][j]); // we did not add those below conditions here because we have to print that one  value once.
            }
            //right
            for (int i = startRow+1; i <=endRow; i++) {
                System.out.print(matrix[i][endCol]); // we did not add those below conditions here because at single cell this right loop will be terminated easily.
            }
            //Bottom
            for (int j= endCol-1; j >= startCol; j--) {
                if (startCol==endCol) { // we add this condition so that value in middle that is left does not repeat in specially odd matrix
                    break;
                }
                System.out.print(matrix[endRow][j]);
            }
            //left
            for (int i = endRow-1; i >= startRow+1 ; i--) {
                if (startRow==endRow) { // we add this condition so that value does not repeat in specially odd matrix
                    break;
                }
                System.out.print(matrix[i][startCol]);
            }
            startCol++;
            startRow++;
            endRow--;
            endCol--;
        }

    }
    public static void main(String[] args) {
                int matrix[][]={{1,2,3,4},
                                {5,6,7,8},
                                {9,10,11,12},
                                {13,14,15,16}};     

    

            printspiral(matrix);
    }
}
