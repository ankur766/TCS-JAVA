package com.tcs.SearchingAndSorting;

import java.util.*;
public class BinarySearch{
public static int binarySearch(int []arr,int key)
{
    int start=0;
    int end=arr.length-1;
    while(start<=end)
    {
        int mid=(start+end)/2;
        if(arr[mid]==key)
        {
            return mid;
        }
        else if(arr[mid]<key)
        {
            start=mid+1;
        }
        else
        {
            end=mid-1;
        }
    }
    return -1;
}

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size= sc.nextInt();
        int []arr=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        int search=sc.nextInt();
       System.out.println(binarySearch(arr,search)); 

    }
    
}
