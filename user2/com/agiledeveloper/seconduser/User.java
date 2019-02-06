package com.agiledeveloper.seconduser;

import com.agiledeveloper.compute.Calculator;
import com.agiledeveloper.compute.Fibonacci;

import java.lang.reflect.Method;

public class User {
    
    public static void main( String[] args ) {
        System.out.println( "Hello this is User" );

        Calculator calculator = new Calculator();
        System.out.println( calculator.add( 1, 2 ));

        Fibonacci fib = calculator.createFibonacci();
        System.out.println( fib.fib( 5 ));
        
        System.out.println( fib.getClass() );

        //com.agiledeveloper.fibonacci.FibonacciRecursive fb = null;

        try {
            

            Method method = fib.getClass().getMethod("hidden");

            System.out.println( method );
            method.invoke( fib );

        } catch ( Exception exception) {
            System.out.println( "ERROR: " + exception );
        }
        
    }
}
