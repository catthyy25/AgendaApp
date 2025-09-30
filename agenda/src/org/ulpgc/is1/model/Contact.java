package org.ulpgc.is1.model;

import java.util.Objects;

public abstract class Contact {
    private String telephone;
    private String email;
    private Address address;

    public Contact(String telephone, String email) {
        this.telephone = telephone;
        this.email = email;
    }

    public abstract String getName();

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address.toString();
    }

    public void setAddress(String street, int number, int floor, String city) {
        this.address = new Address(street, number, floor, city);
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(telephone, contact.telephone) && Objects.equals(email, contact.email) && Objects.equals(address, contact.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(telephone, email, address);
    }
}
