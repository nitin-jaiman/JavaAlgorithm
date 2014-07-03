/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nitin.jaiman;

/**
 *
 * @author nitin
 */
public class MergeSort {
    
    public double generatearray(int n){
    int    tobesorted[]=new int[n]; 
     for (int i = 0; i < n; i++) {
            tobesorted[i] = (int) (Math.random() * 100);

        }
        for (int values : tobesorted) {


            System.out.print(" [" + values + "] ");
        }
 

        System.out.println();
        int size = tobesorted.length;
        double start=System.currentTimeMillis();
        divide(tobesorted);
    double end=System.currentTimeMillis();
    return end-start;
    
    }
    
    
    public void divide(int tobesorted[]){
    
    int n=tobesorted.length;
       
        if(n<2){
       return;
        }
    int mid=n/2;
    int left[]=new int[mid];
    int right[]=new int[n-mid];
    for(int i=0;i<=mid-1;i++){
    
    left[i]=tobesorted[i];
    
    }
       System.arraycopy(tobesorted, mid, right, 0, n - mid);
         
      
    divide(left);
    divide(right);
    sort(left,right,tobesorted);
    
    }
    
    
    
    public void sort(int left[],int right[],int tobesorted[]){
    int leftsize=left.length;
    int rightsize=right.length;
    int totalsize=tobesorted.length;
    int i = 0,j = 0,k=0;
    while(i<leftsize&&j<rightsize){
    
    if(left[i]<right[j]){
    tobesorted[k]=left[i];
    i++;
    }
    else if(left[i]>=right[j]){
    
    tobesorted[k]=right[j];
    j++;
    }
    k++;
    }
    while(i<leftsize){
    tobesorted[k]=left[i];
    i++;
    k++;
   }
     while(j<rightsize){
    tobesorted[k]=right[j];
    j++;
    k++;
   }
    
    
    
    }
    
    
}
