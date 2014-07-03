/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nitin.jaiman;

/**
 *
 * @author nitin
 */
public class QuickSort {
    
    
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
        sort(tobesorted,0,tobesorted.length-1);
    double end=System.currentTimeMillis();
     
for (int values : tobesorted) {


            System.out.print(" [" + values + "] ");
        }
    

    return end-start;
    
    }
    
    
    public  void sort(int tobesorted[],int start,int end){
    
    if(start<end){
    
    
    int pindex=partition(tobesorted,start,end);
    sort(tobesorted,start,pindex-1);
    sort(tobesorted,pindex+1,end);
    }
    
    
     
    }
    public  int  partition(int []a,int start,int end){
    
    int pivot=a[end];
    int pindex=start;
    for(int i=start;i<end;i++){
    if(a[i]<=pivot){
    int temp=a[pindex];
    a[pindex]=a[i];
    a[i]=temp;
    pindex++;
    }
    }
    int temp=a[end];
    a[end]=a[pindex];
    a[pindex]=temp;
    return pindex;
    
    }
    
    
    
}
