package com.agiledeveloper.user;

import com.agiledeveloper.compute.Calculator;

public class User {
    
    public static void main( String[] args ) {
        System.out.println( "Hello this is User" );

        Calculator calculator = new Calculator();

        System.out.println( calculator.add(4, 5) );
    }

    public Calculator getCalculator() {
        return new Calculator();
    }
}
