package org.example.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ContactDao {

    public List<Contact> contacts = new ArrayList<>();

    public void add(Contact contact) { contacts.add(contact); }

}
