package org.example.subarrayDivByK;

import java.util.HashMap;
import java.util.Map;

public class SolutionTwo {

    public static void main(String[] args) {
        
        int arr[] = {4,5,0,-2,-3,1};
        System.out.println(subarraysDivByK(arr, 5));
    }

    public static int subarraysDivByK(int[] nums, int k) {

        Map<Integer, Integer> reminderTrack;
        
        int sizeOfNums = nums.length;
        int totalSum = 0, sumPossibilities = 0, reminder;
        
        for(int j = 0; j<sizeOfNums; j++){

            //reminderTrack = new HashMap<>();
            totalSum      = 0;
            System.out.println("newLoop");
            for(int i = j; i<sizeOfNums; i++){
            
                totalSum += nums[i];
                reminder  = totalSum%k;
                System.out.print(reminder+" , totalSum: "+totalSum);
                if(totalSum%k == 0){
                    sumPossibilities++;
                }System.out.println("");
    
            }
        }
        
        return sumPossibilities;

    }

}
