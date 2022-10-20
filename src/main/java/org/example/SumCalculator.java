package org.example;

public class SumCalculator {

    int sum(int n){
       if(n <= 0){
           throw new IllegalArgumentException("The number is 0 or less!!");
       }

       return n * (n + 1) / 2;
    }


}
