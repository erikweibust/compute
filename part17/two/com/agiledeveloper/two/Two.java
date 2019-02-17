package com.agiledeveloper.two;

import java.lang.reflect.Method;

public class Two {
    
    public void someMethod2() {
        try {
            System.out.println( "someMethod2 using reflection..." );

            Class<?> klass = Class.forName( "com.agiledeveloper.one.One" );
            Method method = klass.getMethod( "someMethod1" );

            method.invoke( klass.getConstructor().newInstance() );
        } catch( Exception ex ) {
            System.out.println( ex );
        }
    }
}

