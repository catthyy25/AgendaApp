package org.ulpgc.is1.model;

public class Person extends Contact {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName, String telephone, String email, String street, int number, int floor, String city) {
        super(telephone, email);
        this.firstName = firstName;
        this.lastName = lastName;
        setAddress(street, number, floor, city);
    }

    @Override
    public String getName() {
        return firstName + " " + lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
