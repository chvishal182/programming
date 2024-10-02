package org.example.miniDeletionToBalance;

public class PowerBank {

    char c;
    int from, to, count;

    PowerBank(){

    }

    PowerBank(char c,int from, int to){
        
        this.c    = c; 
        this.from = from;
        this.to   = to;
        count     = (to - from)+1;
    }
}
