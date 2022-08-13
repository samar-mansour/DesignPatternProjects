package com.samar;

public class Singleton {

    //Volatile prevents memory writes from being re-ordered, making it impossible for other threads to
    //read uninitialized fields of your singleton through the singleton's pointer.
    private volatile static Singleton uniqueInstance;
    String name;

    private Singleton() {
    }

    // Double-check locking singleton
    public static Singleton getInstance() {
        if(uniqueInstance == null){
            synchronized ((Singleton.class)) {
                if (uniqueInstance == null){
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
