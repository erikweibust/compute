package com.agiledeveloper.user;

import com.agiledeveloper.compute.Calculator;

public class User {
    
    public static void main( String[] args ) throws Exception {
        System.out.println( "Hello this is User" );

        Calculator calculator = new Calculator();

        System.out.println( calculator.add(4, 5) );
    }

    public String getInfo() {
        return String.format( "%d", new Calculator().add( 6, 4 ));
    }
}
