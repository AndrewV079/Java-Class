package io.github.andrewv079;

public class FakeClass {
    public int age;
    public String FirstName;
    public String LastName;

    public Fake(int age, String FirstName, String LastName){
        this.age = age;
        this.FirstName = FirstName;
        this.LastName = LastName;
    }

    public int getAge(){
        return age;
    }
}
