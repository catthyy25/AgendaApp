package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private final String name;
    private List<Contact> contactList;
    private List<Group> groupList;
    private Contact contact;

    public Group(String name) {
        this.name = name;
        this.contactList = new ArrayList<>();
        this.groupList = new ArrayList<>();
        this.contact = null;
    }

    public String getName() {
        return name;
    }

    public void addContact(Contact contact) {
        contactList.add(contact);
    }

    public void removeContact(Contact contact) {
        if (contactList.contains(contact)) {
            contactList.remove(contact);
            System.out.println("Removed contact: " + contact.getName() + " from group: " + name);
        }
    }

    public List<Contact> getContactList() {
        return contactList;
    }

    public int size() {
        return contactList.size();
    }

    public void addGroup(Group group) {
        groupList.add(group);
        group.addContact(contact);
    }

    public void removeGroup(Group group) {
        if (groupList.contains(group)) {
            groupList.remove(group);
            group.removeContact(contact);
        }
    }

    public List<Group> getGroupList() {
        return groupList;
    }


}
