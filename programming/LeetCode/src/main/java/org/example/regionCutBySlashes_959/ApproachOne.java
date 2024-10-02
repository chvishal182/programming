package org.example.regionCutBySlashes_959;

public class ApproachOne {

    public static void main(String[] args) {
        String[] grid = new String[]{"/\\", "\\/"};

        int m = grid.length, n = grid[0].length();
        System.out.println(m+" "+n);

        int[][] actualSquare = new int[m][n];

        int solveM = 3*m, solveN = 3*n;

        int[][] helperSquare = new int[solveM][solveN];

        char curr;
        int currentRow = 0, currentCol = 0; 
        int rowInHelper = 0, colInHelper = 0;
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                rowInHelper = 3*i;
                colInHelper = 3*j;

                curr = grid[i].charAt(j);
                System.out.println("current char: "+curr+" at "+i+" "+j);

                if(curr == '/'){

                    helperSquare[rowInHelper][colInHelper + 2] = 1;
                    helperSquare[rowInHelper + 1][colInHelper + 1] = 1;
                    helperSquare[rowInHelper + 2][colInHelper] = 1;

                }
                else if(curr == '\\'){

                    helperSquare[rowInHelper][colInHelper] = 1;
                    helperSquare[rowInHelper + 1][colInHelper + 1] = 1;
                    helperSquare[rowInHelper + 2][colInHelper + 2] = 1;

                }
            }
        }

        for(int a = 0; a<solveM; a++){
            for(int b = 0; b<solveN; b++){
                System.out.print(helperSquare[a][b]+" ");
            }System.out.println();
        }
    }
}
