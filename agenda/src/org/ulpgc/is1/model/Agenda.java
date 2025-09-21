package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Person> persons;
    private List<Company> companies;
    private List<Group> groups;
    private List<Contact> contactList;
    private List<Contact> groupList;

    public Agenda() {
        this.persons = new ArrayList<>();
        this.companies = new ArrayList<>();
        this.groups = new ArrayList<>();
        this.contactList = new ArrayList<>();
        this.groupList = new ArrayList<>();
    }

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }

    public List<Company> getCompanies() {
        return companies;
    }

    public void setCompanies(List<Company> companies) {
        this.companies = companies;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    public void addPerson(String firstName, String lastName, String phone, String email){
        contactList.add(new Person(firstName, lastName, phone, email));
    }

    public void addCompany(String firstName, String lastName, String telephone, String email, Address address) {
        Company company = new Company(firstName, lastName, telephone, email);
        company.setAddress(address);
        companies.add(company);
        System.out.println("Added company: " + company.getName() + " with address: " + address);
    }

    public void addGroup(String name) {
        Group group = new Group(name);
        groups.add(group);
        System.out.println("Added group: " + group.getName() + " with name: " + name);
    }



}
