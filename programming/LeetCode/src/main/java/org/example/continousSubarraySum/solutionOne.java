package org.example.continousSubarraySum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class solutionOne {
    

    public static void main(String[] args) {
        
        int[] nums     = {1,1};
        int k          = 2;
    
        System.out.println(checkSubarraySum(nums, k));

    }


    public static boolean checkSubarraySum(int[] nums, int k) {

        int sizeOfNums = nums.length;

        int checkSize = ((sizeOfNums)*(sizeOfNums+1))/2;
        boolean[] isSizeOne = new boolean[checkSize];
        Arrays.fill(isSizeOne, false);
        

        int indexMaintain = 0;
        for(int i = 2; indexMaintain<checkSize; i++){
            isSizeOne[indexMaintain] = true;
            indexMaintain += i; 
        }System.out.println(Arrays.toString(isSizeOne));

      

        //lets get our list to keep track of our sum through the iteration
        List<Integer> trackOfSum = new ArrayList<>();
        trackOfSum.add(nums[0]);
        int sizeOfTrackOfSum     = trackOfSum.size();

        //let us iterate over all the elements of the nums array
            //let's get our working variables
            boolean isObjectiveReached  = false;
            int omegaForTrack = 0;
            int currentNumber;
        
        for(int i = 1; i<sizeOfNums; i++){
            
            int fetchSum;
            currentNumber = nums[i];
            System.out.print("currentNumber: "+currentNumber+" and ");
            for(int j = omegaForTrack; j <sizeOfTrackOfSum; j++){
                fetchSum = trackOfSum.get(j);
                if(fetchSum % k == 0 && sizeOfTrackOfSum > 1 && !isSizeOne[j]){
                    return true;
                }
                System.out.print("toAdd: "+(fetchSum+currentNumber)+'\n');
                trackOfSum.add(fetchSum + currentNumber);

            }
            trackOfSum.add(currentNumber);
            omegaForTrack+=i;
            sizeOfTrackOfSum = trackOfSum.size();

        }

        System.out.println(trackOfSum);

        sizeOfTrackOfSum = trackOfSum.size();
        for(int j = omegaForTrack; j<sizeOfTrackOfSum; j++){
            currentNumber = trackOfSum.get(j);
            if(currentNumber%k == 0 && currentNumber > k && !isSizeOne[j]){return true;}
            }
        
       

        return false;
        
    }
}
