package org.example.sprialMatrix_885;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ApproachOne {

    public static void main(String[] args) {
        int rows = 5, cols = 6, rStart = 1, cStart = 4;

        int sz = rows*cols;

        int[][] dir = new int[][] { { 0, 1 }, { 0, -1 }, { -1, 0 } };
        int[][] traversed = new int[rows * cols][2];
        int idx = 0, i = 0, prevCStart = cStart, prevRStart = rStart;

        boolean[] visited = new boolean[rows];


        int nextRow = rStart, nextCol = cStart;
        traversed[idx][0] = nextRow; traversed[idx][1] = nextCol;
        visited[rStart] = true;
        idx++;
        while(idx < sz){

            nextRow += dir[i][0];
            nextCol += dir[i][1];
            System.out.println(nextRow+" "+nextCol+" "+nextRow%rows);
            visited[nextRow%rows] = true;

            //if the direction is in down then change it to rite 

            if(nextCol < cols && i == 0){
                traversed[idx][0] = nextRow;
                traversed[idx][1] = nextCol;
            }
            else if(nextCol >= cols && i == 0){
                System.out.println("col going out of bound");
                // now you need to jump onto the unvisited row in the same col;
                while(visited[nextRow%rows]){
                    nextRow++;
                }
                nextCol -= 1;
                traversed[idx][0] = nextRow;
                traversed[idx][1] = nextCol;
                System.out.println(nextRow+" "+nextCol+" "+nextRow%rows);
                i = (i+1)%3;
            }
            else if(nextCol >= prevCStart && i == 1){
                traversed[idx][0] = nextRow;
                traversed[idx][1] = nextCol;
            }
            else if(nextCol < prevCStart && i == 1){
                traversed[idx][0] = nextRow;
                traversed[idx][1] = nextCol;
                i = (i+1)%3;
                System.out.println("update: "+nextRow);
                
                prevCStart = nextCol;
            }
            else if(nextRow >= prevRStart && i == 2){
                traversed[idx][0] = nextRow;
                traversed[idx][1] = nextCol;
            }
            else if(nextRow < prevRStart && i ==2){
                System.out.println("else if "+nextRow);
                traversed[idx][0] = nextRow;
                traversed[idx][1] = nextCol;
                i = (i+1)%3;
                prevRStart = nextRow;
            }
            for(int j = 0; j < rows*cols; j++){
                System.out.print(Arrays.toString(traversed[j])+"    ");
            }idx++;
        }

        System.out.println("\n");
        for(int j = 0; j < rows*cols; j++){
            System.out.print(Arrays.toString(traversed[j])+"    ");
        }
        
    }

}
