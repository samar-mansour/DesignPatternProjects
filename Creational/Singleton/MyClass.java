package com.samar;

public class MyClass {

    //when we create lazy singleton, we created this instance, then we initiate it in MyClass method
    /* private static MyClass uniqueInstance; */


    //Eagerly creating singleton class
    private static MyClass uniqueInstance = new MyClass();

    String name;

    private MyClass() {
    }

    //Simple Singleton - one instance to our class
    /*
    public static MyClass getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new MyClass();
        }
        return uniqueInstance;
    }*/

    //when we are running multi-thread at the same time, it'll create an Issue!
    //that's why will use Singleton Synchronized Method, to make our singleton thread safe
    /*public static synchronized MyClass getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new MyClass();
        }
        return uniqueInstance;
    }*/

    //Creating Eager singleton
    public static MyClass getInstance() {
        return uniqueInstance;
    }
}
