package com.agiledeveloper.user;

import com.agiledeveloper.compute.Calculator;
import com.agiledeveloper.compute.Fibonacci;

public class User {
    
    public static void main( String[] args ) {
        System.out.println( "Hello this is User" );

        Calculator calculator = new Calculator();
        System.out.println( calculator.add( 1, 2 ));

        Fibonacci fib = calculator.createFibonacci();
        System.out.println( fib.fib( 5 ));
        System.out.println( fib );
        System.out.println( fib.getClass() );
    }
}
