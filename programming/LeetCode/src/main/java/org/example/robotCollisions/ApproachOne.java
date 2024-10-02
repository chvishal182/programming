package org.example.robotCollisions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ApproachOne {


    public static void main(String[] args) {
        
        int[] positions = {5,4,3,2,1}, healths = {2,17,9,15,10};
        String directions = "RRRRR";

        Stack workerStack = new Stack<>();

        Map<Integer, Integer> valueIndex = new HashMap();
        int s = positions.length;

        for(int i = 0; i<s; i++){
            valueIndex.put(positions[i], i);
        }

        Arrays.sort(positions);

        int ind;
        for(int i = 0; i<s; i++){

            ind = valueIndex.get(positions[i]);
            
        }
    }
}
