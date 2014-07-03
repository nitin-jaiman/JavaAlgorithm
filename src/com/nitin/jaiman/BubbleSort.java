
package com.nitin.jaiman;

/**
 *
 * @author nitin
 */
public class BubbleSort {
    
    static BubbleSort _this;
    
    public BubbleSort (){
       _this = this;
    }
   

    public double bubbleSort(int n) {
   
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
  
        for (int i = 0; i < tobesorted.length; i++) {
          
            for (int j = 0; j < size - 1; j++) {
                if (tobesorted[j] > tobesorted[j + 1]) {
                    int temp;
                    temp = tobesorted[j];
                    tobesorted[j] = tobesorted[j + 1];
                    tobesorted[j + 1] = temp;
                }

            }
            size--;
      
        }
        
        
 double end=System.currentTimeMillis();
        for (int values : tobesorted) {


            System.out.print(" [" + values + "] ");
        }

        System.out.println();
        System.out.println("time take for n = "+n+" is "+(end-start)+" ");
        return end-start;
    }

public double bubbleSortAlternative(int n){


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
        boolean fixed=true;
        while(fixed){
            fixed=false;
            for (int j = 0; j < size - 1; j++) {
                if (tobesorted[j] > tobesorted[j + 1]) {
                    int temp;
                    temp = tobesorted[j];
                    tobesorted[j] = tobesorted[j + 1];
                    tobesorted[j + 1] = temp;
               fixed=true;
                }

            }
            size--;
            
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
