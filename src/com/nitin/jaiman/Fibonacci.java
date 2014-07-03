/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nitin.jaiman;

/**
 *
 * @author nitin
 */
public class Fibonacci {
    
    public double fibitteration(int n){
    
    int temp=1;
    int b=1;
    int result=2;
      double start=System.currentTimeMillis();
    for(int i=0;i<n;i++){
        temp=result;
       
    result=result+b;
    b=temp;
    
    
    
    }
        System.out.println(result);  
    
    double end=System.currentTimeMillis();
     return end-start;
    } 
    public double executefibrecurrsion(int n){
          double start=System.currentTimeMillis();
          
         System.out.println(fibrecurrsion(n)); 
      double end=System.currentTimeMillis();
     return end-start;
    
    }
    
    public double fibrecurrsion(int n){
    
    
    if(n<2){
    return 1;
    
    }
    
    return fibrecurrsion(n-1)+fibrecurrsion(n-2);
    
    
    }
    
}
