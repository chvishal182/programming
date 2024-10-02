package org.example.miniNumDaysToDisConIsland_1568;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ApproachOne {

    public static void main(String[] args) {

        Set<Integer[]> visit = new HashSet<>();
        int count = 0;
        
        int[][] grid  = new int[10][];

        int rowNum = grid.length, colNum = grid[0].length;

        for(int i = 0; i<rowNum; i++){
            for(int j = 0; j<colNum; j++){

                if(grid[i][j] == 1 && !visit.contains(new int[]{i, j})){
                    dfs(i, j, visit);
                    count++;
                }

            }
        }
        if(count != 1){
            //return 0;
        }

        List<Integer[]> landCells = visit.
        
    }

    public static void dfs(int r, int c, Set<Integer[]> visit){

    }
}   
