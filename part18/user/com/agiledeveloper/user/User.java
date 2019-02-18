package com.agiledeveloper.user;
import com.agiledeveloper.util.Util;

public class User {
    
    public static void main( String[] args ) {
        System.out.println( "User called..." );

        Util util = new Util();
        System.out.println( util.getInfo() );
    }
}
