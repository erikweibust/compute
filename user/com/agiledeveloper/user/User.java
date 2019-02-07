package com.agiledeveloper.user;

import java.lang.reflect.Method;

public class User {
    
    public static void main( String[] args ) throws Exception {
        System.out.println( "Hello this is User" );

        Class klass = Class.forName( "com.agiledeveloper.compute.Calculator" );
        Object obj = klass.newInstance();

        Method foo = klass.getMethod("foo");
        System.out.println( foo );

        foo.invoke(obj);
    
    }
}