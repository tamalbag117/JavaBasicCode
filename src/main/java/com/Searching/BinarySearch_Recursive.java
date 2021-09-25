package com.Searching;

public class BinarySearch_Recursive {
    public static void main(String[] args) {
        try {
        int [] arr ={10,1,9,2,8,3,7,4,6,5}; 
        int key =9;  
        Search_2A obj = new Search_2A();
        int ans = obj.binaryS(arr, key,0, arr.length-1);
        if(ans==-1)System.out.println("Element not found");
        else System.out.println("Element found at index : "+ ans);
        } catch (Exception e) {
            return;
        }
    }
}
class Search_2A{
    public int binaryS(int []a,int key ,int low,int high){
    if(high>=low){int mid = low+(high-low)/2;
    if(a[mid]==key)return mid;
    if(key>a[mid]) return binaryS(a, key, mid+1, high);
    else return binaryS(a, key, low, mid-1);
    }else return -1;
}
}