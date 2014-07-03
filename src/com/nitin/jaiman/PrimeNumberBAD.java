/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nitin.jaiman;

/**
 *
 * @author nitin
 */
public class PrimeNumberBAD {
    
    public double evaluatePrime(int n){
    boolean isPrime=true;
     double start=System.currentTimeMillis();
    for(int i=2;i<n;i++){
        if(n%i==0){
        
           isPrime=false;
        }
    }
     double end=System.currentTimeMillis();
   
    
     System.out.println();
        System.out.println("time take for n = "+n+" is "+(end-start)+" ");
        return end-start;
    
    
    }
    
     
}
