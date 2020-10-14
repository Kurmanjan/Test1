package com.example.test;

public class Math {

    public int aad(int a,int b){

        return a + b;
    }

    public int minus(int a, int b){

        return a - b;
    }

    public int multiply(int a,int b){
        return a * b;
    }

    public int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new  ArithmeticException("Divided ny zero");
        } else {

        return a / b;
    }
}
    }

