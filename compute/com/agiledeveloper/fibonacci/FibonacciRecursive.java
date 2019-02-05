package com.agiledeveloper.fibonacci;

import com.agiledeveloper.compute.Fibonacci;

public class FibonacciRecursive implements Fibonacci {
    
    public int fib( int position ) {

        if ( position < 3 ) return 1;

        return fib( position - 1 ) + fib ( position - 2 );
    }

    public void hidden() {
        System.out.println( "you called the hidden method" );
    }
}
