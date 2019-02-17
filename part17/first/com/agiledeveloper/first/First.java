package com.agiledeveloper.first;

import com.agiledeveloper.two.Two;

public class First {

    public static void main( String[] args ) {
        System.out.println( "first calling Two" );
        Two two = new Two();

        two.someMethod2();
    }
}
