package org.example.mostProfitAssigningWork;

import java.util.*;

public class MostProfit {

    

    public static void main(String[] args) {

    int[] difficulty = {2,4,6,8,10};
    int[] profit = {10,20,30,40,50};
    int[] worker = {4,5,6,7};

    int sizeOfDifficulty = difficulty.length;
    int sizeOfProfit     = profit.length;
    int sizeOfWorker     = worker.length;

    JobProfile[] jobProfiles = new JobProfile[sizeOfDifficulty];

    for(int i = 0; i<sizeOfDifficulty; i++){
        jobProfiles[i] = new JobProfile(difficulty[i], profit[i]);
    }
    
    Comparator<JobProfile> compareByProfit = 
    (JobProfile jobProfile1, JobProfile jobProfile2) -> Integer.compare(jobProfile1.getDifficulty(),jobProfile2.getDifficulty());
    
    Arrays.sort(jobProfiles, compareByProfit);

    for (JobProfile jobProfile : jobProfiles) {
        System.out.println("Difficulty: " + jobProfile.getDifficulty() + ", Profit: " + jobProfile.getProfit());
    }

    int netMaxProfit  = 0, currentProfit, maxProfit = -1;
    int currentProfileDifficulty, currentProfileProfit;
    int currentDifficulty  = 0;
    int k = 0;
    JobProfile currentProfile = null;
    for(int j = 0; j <sizeOfWorker; j++){

        currentDifficulty = worker[j];

        currentProfile = jobProfiles[k];
        currentProfileDifficulty = currentProfile.getDifficulty();
        currentProfileProfit     = currentProfile.getProfit();

        while(currentDifficulty <= currentProfileDifficulty){
            
        }



    }

    }

    

}
