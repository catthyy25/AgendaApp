package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contact> contactList;
    private List<Group> groupList;


    public Agenda() {
        this.contactList = new ArrayList<>();
        this.groupList = new ArrayList<>();
    }

    public List<Contact> getContactList() {
        return contactList;
    }

    public void setContactList(List<Contact> contacts) {
        this.contactList = contacts;
    }

    public List<Group> getGroupList() {
        return groupList;
    }

    public void setGroupList(List<Group> groups) {
        this.groupList = groups;
    }

    public void addPerson(String firstName, String lastName, String telephone, String email, String street, int number, int floor, String city){
        Person person = new Person(firstName, lastName, telephone, email, street, number, floor, city);
        if (!contactList.contains(person)) {
            contactList.add(person);
        }
    }

    public void addCompany(String name, String description, String telephone, String email) {
        Company company = new Company(name, description, telephone, email);
        if (!contactList.contains(company)) {
            contactList.add(company);
        }
    }

    public void addGroup(String name) {
        Group group = new Group(name);
        groupList.add(group);
    }

}
