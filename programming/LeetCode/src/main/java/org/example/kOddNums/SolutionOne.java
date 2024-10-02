package org.example.kOddNums;

public class SolutionOne {

    public static void main(String[] args) {

        int[] nums = {2,2,2,1,2,2,1,2,2,2};
        int k = 2;
        int sizeOfNums = nums.length;

        int l = 0, m = 0, r = 0, oddsSeen = 0, ansToReturn = 0;
        
        for(int i = 0; i<sizeOfNums; i++){

            //increament oddsSeen if you have seen an odd number
            if(nums[i]%2 != 0){oddsSeen++;}
            
            //if the oddsSeen are greater than the asked size
            if(oddsSeen > k){

                if(nums[l]%2 == 1){oddsSeen--;}
                l++; m = l;

            }
            
            //when I have got the array of k numbers of odd
            if(oddsSeen == k){
                while (nums[m]%2 != 1) {
                    m++;
                }
                ansToReturn += ((m - l)+1);

            }

        }
    
    }

}
