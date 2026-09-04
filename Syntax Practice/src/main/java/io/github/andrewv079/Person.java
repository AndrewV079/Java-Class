package io.github.andrewv079;

public class Person {
    private int age;
    private String FirstName;
    private String LastName;

    public Person(int age, String FirstName, String LastName){
        this.age = age;
        this.FirstName = FirstName;
        this.LastName = LastName;
    }



    public int getAge(){
        return age;
    }

    public void setAge(int age){
        if ( age < 0 || age >  125){
            throw new IllegalArgumentException("Invalid Age");
        }
        this.age = age;
    }

    public String getName(){
        String wholeName = this.FirstName + " " + this.LastName;
        return wholeName;
    }
}
