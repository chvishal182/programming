package org.example.reverseInBtwinParan;

import java.util.Stack;

public class WormHole {

    public static void main(String[] args) {
        
        Stack<Integer> openRoundBracket = new Stack<>();
        String s = "(u(love)i)";
        int sizeToWork = s.length();

        int[] WormHole = new int[sizeToWork];
        int j;

        for(int i = 0; i<sizeToWork; i++){

            if(s.charAt(i) =='('){
                openRoundBracket.push(i);
            }

            if(s.charAt(i) == ')'){
                j = openRoundBracket.pop();
                WormHole[j] = i;
                WormHole[i] = j;
            }
        }

        StringBuilder result = new StringBuilder();
        char indiChar;
        for(int i = 0, direction = 1; i<sizeToWork; i+= direction){
            
            indiChar = s.charAt(i);
            System.out.println("i: "+i);
            if(indiChar == ')' || indiChar == '('){
                i = WormHole[i];
                direction *= -1;     
            }
            else{
                result.append(indiChar);
            }
        }
        System.out.println(result.toString());
    }

}
