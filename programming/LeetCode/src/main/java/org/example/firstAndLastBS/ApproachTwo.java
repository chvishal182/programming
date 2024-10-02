package org.example.firstAndLastBS;

public class ApproachTwo {

    public static void main(String[] args) {

        int[] arr = {5,7,7,8,8,8, 8, 8 , 8 ,8, 8, 9,10};
        int sizeToWork = arr.length - 1;

        int firstFound = binarySearch(arr, 0, sizeToWork, 8);
        System.out.println("firstFound: "+firstFound);
        int leftFind   = leftBS(arr, 0, firstFound - 1, 8);
        System.out.println("rite");
        int riteFind   = directionalBinarySearch(arr, firstFound, sizeToWork, 8);
        System.out.println(leftFind+" "+riteFind);
        
    }

    public static int binarySearch(int[] arr, int l, int r, int t){
       
        if(l>r){
            return -1;
        }
        int m = l + ((r-l)/2);
        System.out.println("middle index: "+m);
        int index;
        if(arr[m]>t){
            index = binarySearch(arr, l, m-1 , t);
        }
        else if(arr[m] < t){
            index = binarySearch(arr, m+1, r, t);
        }else{index = m;}

        return index;
    }

    public static int leftBS(int[] arr, int l, int r, int t){
        if(l == r){
            if(arr[l] == t){return l;}
        }
        int  m = l + (r-l)/2;
        int index;
        if(arr[m]<t){//m+1, r
            index = leftBS(arr, m+1, r, t);
        }
        else{
            index = leftBS(arr, l, m-1, t);
        }
        if(index == -1){
            if(arr[m] == t){index = m;}
        }
        return index;
    }

    public static int directionalBinarySearch(int[] arr, int l, int r, int t){

        System.out.println("left: "+l+", rite:"+r);

        if(l == r){
            return (arr[l] == t)? l:-1;
        }
        int m = l + ((r-l)/2);
        int index;
        if(arr[m]>t){
            index = directionalBinarySearch(arr, l, m-1 , t);
        }
        else{
            index = directionalBinarySearch(arr, m+1, r, t);
        }
        if(index == -1){
            if(arr[m] == t){index = m;}
        }
        return index;
    }


}
