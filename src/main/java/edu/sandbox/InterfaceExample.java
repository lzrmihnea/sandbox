package edu.sandbox;

public interface InterfaceExample {

    void doSomething();

    default void doSomething2() {
        System.out.println("Do something default");
    }
}
