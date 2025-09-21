package org.ulpgc.is1.control;

import org.ulpgc.is1.model.Contact;
import org.ulpgc.is1.model.Group;
import org.ulpgc.is1.model.Person;

public class Main {
    public static void main(String[] args) {
        Person contacto1 = new Person("648515151", "ana@gmail.com", "Ana", "Moreno");
        Person contacto2 = new Person("648636363", "pepe@gmail.com", "Pepe", "Lorenzo");

        Group trabajo = new Group("Trabajo");

        trabajo.addContact(contacto1);
        System.out.println("El numero de contactos de este grupo es " + trabajo.size() + " contactos.");

        trabajo.removeContact(contacto1);
        System.out.println("El numero de contactos de este grupo es " + trabajo.size() + " contactos.");
    }
}
