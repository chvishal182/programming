package org.example.continousSubarraySum;

import java.util.HashMap;
import java.util.Map;

/**
 * SolutionTwo
 */
public class SolutionTwo {

    public static void main(String[] args) {
        
        

        int[] nums = {23,2,6,4,7};
        int k = 0;


        
    }
    boolean trailMethod(int[] a, int k){

        class Solution {
            public boolean checkSubarraySum(int[] a, int k) {
                
                if(a.length == 1){return false;}
                int sizeOfA = a.length;
                Map<Integer, Integer> reminderTrack = new HashMap<>();
                reminderTrack.put(0, -1);
        
                int totalSum = 0, endIndex, checkIndex, reminder;
                for(int i = 0; i<sizeOfA; i++){
        
                    totalSum += a[i];
                    reminder = totalSum%k;
                    if(!reminderTrack.containsKey(reminder)){
                        
                        reminderTrack.put(reminder, i);
                    }
                    else{
                        checkIndex = reminderTrack.get(reminder);
                        if (i - checkIndex > 1) {
                            return true;
                        }
                    }
                }return false;
            }
        }

        return false;

    }

}