package org.example.firstAndLastBS;

public class ApproachOne {

    public static void main(String[] args) {
        
        int[] arr = {5, 8, 8, 10};
        int[] b = new int[]{1, 2};
        int target = 7;
        int m = 0 + (((arr.length) - 1)/2);
        int l = leftBinarySearch(arr, 0, m, target);
        int r = riteBinarySearch(arr, m+1, arr.length - 1, target);
        System.out.println(l+" "+r);
        System.out.println("ji");


    }

     static int leftBinarySearch(int[] arr, int l, int r, int target){
        System.out.println("left: "+l+", rite: "+r);
        
        if(l>r){
            System.out.println("ho");
            return -1;}

        if(l == r && arr[l] == target){return l;}
        if(l == r){return -1;}

        int m = l + ((r - l)/2);
        int left = leftBinarySearch(arr, l, m, target);
        System.out.println("left middle: "+arr[m]+", index: "+m+", left: "+left);
        if(left == -1 && arr[m] == target){
            left = m;
        } 
        System.out.println("after change left: "+left);

        return left;

        
    }

    static int riteBinarySearch(int[] arr, int l, int r, int targert){
        
        if(l>r){return - 1;}

        if(l == r && arr[l] == targert){return l;}

        int m = l + ((r - l)/2);

        int rite = riteBinarySearch(arr, m+1, r, targert);
        rite = (rite == -1 && arr[m] == targert)? m:-1;

        return rite;

    }
}
