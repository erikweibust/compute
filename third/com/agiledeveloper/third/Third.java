package com.agiledeveloper.third;

import com.agiledeveloper.user.User;

public class Third {
    
    public static void main( String[] args ) {
        User user = new User();

        System.out.println( user.getInfo() );

        System.out.println( new com.agiledeveloper.compute.Calculator() );
    }
}
