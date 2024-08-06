package edu.sandbox;

import java.util.Comparator;

public class ParentAgeComparator implements Comparator<Parent> {
    @Override
    public int compare(Parent o1, Parent o2) {
        return o1.getAge().compareTo(o2.getAge());
    }
}
