package org.example.subarrayDivByK;

import java.util.HashMap;
import java.util.Map;

public class NeetCode {

    public static void main(String[] args) {
        
        int arr[] = {-1,2,9};
        System.out.println(subarraysDivByK(arr, 2));
    }

    public static int subarraysDivByK(int[] nums, int k) {

        int sizeOfNums = nums.length;

        Map<Integer, Integer> reminderAppearance = new HashMap<>();
        reminderAppearance.put(0, 1);
        

        int totalSum = 0, reminder, sumPossibilities = 0, reminderAppearCount;
        for(int i = 0; i<sizeOfNums; i++){
            totalSum += nums[i];
            reminderAppearCount = 0;
            reminder = totalSum%k;
            if(reminderAppearance.containsKey(reminder)){
                reminderAppearCount = reminderAppearance.get(reminder);
                sumPossibilities += reminderAppearCount;
                reminderAppearance.put(reminder,reminderAppearCount+1);
            }
            else{
                reminderAppearance.put(reminder, 1);
            }
                
                
        }
                
        return sumPossibilities;
    }
                
}
                