package org.example.numberOfAtoms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Stack;

public class ApproachOne {

    public static void main(String[] args){

        Stack<String> atoms = new Stack<>();

        int countOpen = 0, countClose = 0;

        String formula = "K4(ON(SO3)2)2";

        Map<String, Integer> atomicity = new TreeMap<>();

        char[] forCArray = formula.toCharArray();

        int sWork = formula.length();
        boolean isNumber;
        String indiAtom;
        for(int i= 0; i<sWork; i++){
            
            indiAtom = formula.charAt(i)+"";
            isNumber = isNumeric(indiAtom);

            if(!isNumber){
                if(Character.isLowerCase(forCArray[i+1])){
                    
                }
            }

        }
    }

    public static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
      }

}
