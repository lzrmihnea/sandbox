package edu.sandbox;

public class Parent {

    private String name;
    private int age;

    public Parent() {

    }

    public Parent(String name) {
        this.name = name;
    }

    public Parent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int compareTo(Parent o) {
        return this.name.compareTo(o.name);
    }

    public Integer getAge() {
        return Integer.valueOf(this.age);
    }

    @Override
    public String toString() {
        return "[" + getName() + ", " + getAge() + "]";
    }
}
