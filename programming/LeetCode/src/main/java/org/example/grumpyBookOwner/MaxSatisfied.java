package org.example.grumpyBookOwner;

public class MaxSatisfied {

    public static void main(String[] args) {

        int[] customers = {1,0,1,2,1,1,7,5};
        int[] grumpy    = {0,1,0,1,0,1,0,1};
        int minutes = 3;

        int maxSatisfied = 0;
        System.out.println(maxSatisfied);
    }


    public static int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int initialSatisfacation = 0;

        int sizeToWork   = customers.length;
        int currentCount = 0, previousConsecutiveNonGrumpy = 0,consecutiveNonGrumpy = 0;
        int highestConsecutiveNonGrumpy = -1;

        for(int i = 0; i<sizeToWork; i++){
            if(grumpy[i] == 0){
                initialSatisfacation += customers[i];
            }
        }

        int highestConsider, previousSum = 0, p = 0, currentSum = 0;
        for(int j = 0; j<minutes; j++){
            if(grumpy[j] == 1){
            currentSum += customers[j];
            }
        }

        for(int k = minutes; k<sizeToWork; k++){
            
            
            
            if(grumpy[p] == 1){
            currentSum   = currentSum - customers[p];
            }

            if(grumpy[k] == 1){
                currentSum += customers[k];
            }
            currentSum = previousSum > currentSum? previousSum:currentSum;
            p++;
            System.out.println(currentSum);
        }

       return 0;

    }

}
