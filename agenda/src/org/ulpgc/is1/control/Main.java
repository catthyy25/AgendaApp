package org.ulpgc.is1.control;

import org.ulpgc.is1.model.Agenda;
import org.ulpgc.is1.model.Contact;
import org.ulpgc.is1.model.Group;


public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        // 1. Crear dos contactos en la agenda de tipo Person
        agenda.addPerson("Juan", "Pérez", "123456789", "juan@email.com", "Pasaje", 2, 3, "Arucas");
        agenda.addPerson("María", "González", "987654321", "maria@email.com", "Calle", 4, 5, "Firgas");

        Contact contact1 = agenda.getContact(0);
        Contact contact2 = agenda.getContact(1);

        contact1.setAddress("Calle Principal", 123, 1, "Las Palmas");
        contact2.setAddress("Avenida Central", 456, 2, "Las Palmas");

        // 2. Crear un grupo en la agenda llamado "trabajo"
        agenda.addGroup("trabajo");

        // 3. Añadir al grupo "trabajo" uno de los contactos creados en el paso 1
        agenda.addContactToGroup(contact1, "trabajo");

        // 4. Imprimir por pantalla el número de contactos de la agenda
        System.out.println("Número de contactos en la agenda: " + agenda.getContactCount());

        // 5. Imprimir por pantalla el número de contactos del grupo "trabajo"
        Group workGroup = agenda.getGroupByName("trabajo");
        System.out.println("Número de contactos en el grupo 'trabajo': " + workGroup.size());

        // 6. Borrar el primer contacto del grupo "trabajo"
        workGroup.removeContact(contact1);

        // 7. Volver a imprimir por pantalla el número de contactos del grupo "trabajo"
        System.out.println("Número de contactos en el grupo 'trabajo' después de borrar: " + workGroup.size());

        System.out.println("\nInformación de contactos:");
        for (int index = 0; index < agenda.getContactCount(); index++) {
            Contact contact = agenda.getContact(index);
            System.out.println((index + 1) + ". " + contact.getName() + " - Tel: " + contact.getTelephone() + " - Email: " + contact.getEmail());
        }
    }
}
