package com.tcs.SearchingAndSorting;

import java.util.Scanner;

public class InsertionSort{

    public static void insertionsort(int []arr)
    {
        for(int i=1;i<arr.length;i++)
        {
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }   
    }
   
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            int size= sc.nextInt();
            int []arr=new int[size];
            for(int i=0;i<size;i++)
            {
                arr[i]=sc.nextInt();
            }
          
            insertionsort(arr);
           for(int i=0;i<size;i++)
              {
                System.out.print(arr[i]+" ");
              }
    
        }
        
    }
