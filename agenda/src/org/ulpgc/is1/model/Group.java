package org.ulpgc.is1.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Group {
    private final String name;
    private List<Contact> contactList;
    private List<Member> memberList;

    public Group(String name) {
        this.name = name;
        this.contactList = new ArrayList<>();
        this.memberList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addContact(Contact contact) {
        memberList.add(new Member(LocalDateTime.now(), contact));
    }

    public void removeContact(int index) {
        contactList.remove(index);
    }

    public List<Member> getMemberList() {
        return memberList;
    }

    public Member getMember(int index) {
        return memberList.get(index);
    }

    public void setMember(int index, Member member) {
        memberList.set(index, member);
    }

    public void addMember(Contact contact) {
        memberList.add(new Member(LocalDateTime.now(), contact));
    }

    public void removeMember(int index) {
        memberList.remove(index);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return name.equals(group.name);
    }

}
