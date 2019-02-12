package com.agiledeveloper.third;

import com.agiledeveloper.user.User;
import com.agiledeveloper.compute.Calculator;

public class Third {
    
    public static void main( String[] args ) {
        System.out.println( "Hello, this is Third" );

        User user = new User();

        Calculator instance = user.getCalculator();

        System.out.println( instance.add( 1, 7 ));
    }
}
