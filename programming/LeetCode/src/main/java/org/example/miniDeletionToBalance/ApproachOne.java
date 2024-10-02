package org.example.miniDeletionToBalance;

import java.util.ArrayList;
import java.util.List;
import org.example.miniDeletionToBalance.PowerBank;

public class ApproachOne {

    public static void main(String[] args) {
        String s = "aababbab";

        List<PowerBank> powerBanks = new ArrayList<>();
        int sz = s.length();
        
        int j = 0;
        char current;
        for(int i = 0; i<sz; i++){
            j = i;
            
            current = s.charAt(i);
            while((i+1)<(sz) && s.charAt(i) == s.charAt(i+1)){
                i++;
            }
            powerBanks.add(new PowerBank(current, j, i));
        }

        System.out.println(powerBanks.size());
    }

}
