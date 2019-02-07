package com.agiledeveloper.compute;

import com.agiledeveloper.fibonacci.FibonacciRecursive;

public class Calculator {

    public void foo() {
        System.out.println("foo called...");
    }

    public int add( int op1, int op2 ) {
        return op1 + op2;
    }

    public Fibonacci createFibonacci() {
        return new FibonacciRecursive();
    }
}
