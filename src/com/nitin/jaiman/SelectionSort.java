/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nitin.jaiman;

/**
 *
 * @author nitin
 */
public class SelectionSort {
    
    public double selectionAlgo(int n){
    
      int tobesorted[] = new int[n];
        for (int i = 0; i < n; i++) {
            tobesorted[i] = (int) (Math.random() * 100);

        }
        for (int values : tobesorted) {


            System.out.print(" [" + values + "] ");
        }
 

        System.out.println();
        int size = tobesorted.length;
        double start=System.currentTimeMillis();
        
     
  for(int i=0;i<n-1;i++){
         int min=i;
  for(int j=i+1;j<n;j++){
  
  if(tobesorted[j]<tobesorted[min]){
  min=j;
  }
  
  }
  int temp;
  temp=tobesorted[min];
  tobesorted[min]=tobesorted[i];
  tobesorted[i]=temp;
  
  }
  
  double end=System.currentTimeMillis();
        for (int values : tobesorted) {


            System.out.print(" [" + values + "] ");
        }

        System.out.println();
        System.out.println("time take for n = "+n+" is "+(end-start)+" ");
        return end-start;
    
    }
    
    
}
