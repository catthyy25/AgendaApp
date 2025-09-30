package org.ulpgc.is1.model;

import java.time.LocalDateTime;

public class Member {
    private final LocalDateTime date;
    private final Contact contact;

    public Member(LocalDateTime date, Contact contact) {
        this.date = date;
        this.contact = contact;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public Contact getContact() {
        return contact;
    }


}
