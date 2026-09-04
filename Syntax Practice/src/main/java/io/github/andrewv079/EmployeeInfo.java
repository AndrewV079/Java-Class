package io.github.andrewv079;

public class EmployeeInfo {
    private String firstName;
    private String lastName;
    private int month;
    private int birthYear;
    private int birthDay;
    private String email;
    private String phoneNumber;
    private String streetAddress;
    private String city;
    private String state;
    private String zip;

    public EmployeeInfo(
            String firstName, String lastName,
            int month, int birthYear, int birthDay,
            String email, String phoneNumber,
            String streetAddress, String city, String state, String zip
    ){
        this.firstName = firstName;
        this.lastName = lastName;
        this.month = month;
        this.birthYear = birthYear;
        this.birthDay = birthDay;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.streetAddress = streetAddress;
        this.city = city;
        this.zip = zip;
    }

    public String firstName(){
        return firstName;
    }

    public String lastName() {
        return lastName;
    }

    public int Month() {
        return month;
    }

    public int BirthDay() {
        return birthDay;
    }

    public int BirthYear() {
        return birthYear;
    }

    public String Email() {
        return email;
    }

    public String PhoneNumber() {
        return phoneNumber;
    }

    public String StreetAddress() {
        return streetAddress;
    }

    public String getCity() {
        return city;
    }

    public String State() {
        return state;
    }

    public String Zip() {
        return zip;
    }
}
