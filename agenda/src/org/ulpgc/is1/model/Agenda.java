package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contact> contacts;
    private List<Group> groups;


    public Agenda() {
        this.contacts = new ArrayList<>();
        this.groups = new ArrayList<>();
    }

    public List<Contact> getContactList() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public List<Group> getGroupList() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    public void addPerson(String firstName, String lastName, String telephone, String email){
        Person person = new Person(firstName, lastName, telephone, email);
        contacts.add(person);
    }

    public void addCompany(String name, String description, String telephone, String email) {
        Company company = new Company(name, description, telephone, email);
        contacts.add(company);
    }

    public void addGroup(String name) {
        Group group = new Group(name);
        groups.add(group);
    }

    public void addContactToGroup(Contact contact, String groupName) {
        for (Group group : groups) {
            if (group.getName().equals(groupName)) {
                group.addContact(contact);
                return;
            }
        }
    }

    public void removeContactFromGroup(Contact contact, String groupName) {
        for (Group group : groups) {
            if (group.getName().equals(groupName)) {
                group.removeContact(contact);
                return;
            }
        }
    }

    public int getContactCount() {
        return contacts.size();
    }

    public int getGroupCount() {
        return groups.size();
    }

    public Contact getContact(int index) {
        if (index >= 0 && index < contacts.size()) {
            return contacts.get(index);
        }
        return null;
    }

    public Group getGroup(int index) {
        if (index >= 0 && index < groups.size()) {
            return groups.get(index);
        }
        return null;
    }

    public void removeContact(int index) {
        if (index >= 0 && index < contacts.size()) {
            Contact contact = contacts.get(index);
            contacts.remove(index);

            // Remove from all groups
            for (Group group : groups) {
                group.removeContact(contact);
            }
        }
    }

    public Group getGroupByName(String name) {
        for (Group group : groups) {
            if (group.getName().equals(name)) {
                return group;
            }
        }
        return null;
    }

}
