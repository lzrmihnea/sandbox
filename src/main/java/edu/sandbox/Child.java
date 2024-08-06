package edu.sandbox;

public class Child extends Parent implements InterfaceExample {

   private String childName;

    public Child() {
        super();
    }

    public Child(String parentName,
                 String childName) {
        this();
    }

    public String getName() {
        return childName;
    }

    public String getChildName() {
        return this.childName;
    }


    @Override
    public void doSomething() {
        System.out.println("Do something, child");
    }

    public void doSomething2() {
        System.out.println("Child default");
    }

}
