package org.ulpgc.is1.control;

import org.ulpgc.is1.model.Agenda;
import org.ulpgc.is1.model.Contact;
import org.ulpgc.is1.model.Group;


public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        // 1. Crear dos contactos en la agenda de tipo Person
        agenda.addPerson("Juan", "Pérez", "928565956", "juan@email.com", "Pasaje", 2, 3, "Arucas");
        agenda.addPerson("María", "González", "987654321", "maria@email.com", "Calle", 4, 5, "Firgas");
        agenda.addPerson("María", "González", "987654321", "maria@email.com", "Calle", 4, 5, "Firgas");

        // 2. Crear un grupo en la agenda llamado "trabajo"
        agenda.addGroup("trabajo");


        // 3. Añadir al grupo "trabajo" uno de los contactos creados en el paso 1
        agenda.getGroupList().get(0).addContact(agenda.getContactList().get(0));

        System.out.println(agenda.getContactList().get(0).hashCode());

        // 4. Imprimir por pantalla el número de contactos de la agenda
        System.out.println("Número de contactos en la agenda: " + agenda.getContactList().size());

        // 5. Imprimir por pantalla el número de contactos del grupo "trabajo"
        System.out.println("Número de contactos del grupo: " + agenda.getGroupList().get(0).getMemberList().size());

        //segunda parte (Member)  imprimir por pantalla la fecha en la que se agregó al grupo “trabajo”
        System.out.println(agenda.getGroupList().get(0).getMemberList().get(0).getDate().toString());

        // 6. Borrar el primer contacto del grupo "trabajo"
        agenda.getGroupList().get(0).removeContact(0);

        // 7. Volver a imprimir por pantalla el número de contactos del grupo "trabajo"

    }
}
