package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;

    public Person() {
        name = "";
        age = Integer.MAX_VALUE;
    }

    public Person(int personsAge) {
        age = personsAge;
    }

    public Person(String personsName) {
        name = personsName;
    }

    public Person(String personsName, int personsAge) {
        name = personsName;
        age = personsAge;
    }

    public void setName(String personsName) {
        name = personsName;
    }

    public void setAge(int personsAge) {
        age = personsAge;

    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
