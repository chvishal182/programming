package org.example.reverseInBtwinParan;

import java.util.ArrayList;
import java.util.List;

public class ApproachOne {

    public static void main(String[] args) {
        
        List<Integer> openBracketIndex  = new ArrayList<>(), 
                      closeBracketIndex = new ArrayList<>();

        String s = "(ed(et(oc))el)";
        char[] sToCharArray = s.toCharArray();
        int sizeToWork = s.length();
        char indiChar;
        for(int i = 0; i<sizeToWork; i++){

            indiChar = sToCharArray[i];
            if(indiChar == '('){
                openBracketIndex.add(i);
            }else if(indiChar == ')'){
                closeBracketIndex.add(i);
            }
        }

        System.out.println(openBracketIndex);
        System.out.println(closeBracketIndex);

       int counter = 0;
       sizeToWork  = openBracketIndex.size();
       int q = 0, p = sizeToWork - 1;
       String subString, toReplace;
       while(counter < sizeToWork){

        subString = s.substring(openBracketIndex.get(p)+1, closeBracketIndex.get(q));
        System.out.println("sub: "+subString);
        toReplace = reverseString(subString);
        System.out.println("toReplace: "+subString);
        s.replace("("+subString+")", toReplace);
        System.out.println("hoii: "+s);
        counter++; p --; q++;

       }System.out.println(s);


    }

    public static String reverseString(String s){

        
        return "vishal";
    }



}
