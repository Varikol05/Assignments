package com.assignments;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Tree {
    public static void main(String args[]) {
        PhoneNumbers n1 = new PhoneNumbers(9812345638L);
        PhoneNumbers n2 = new PhoneNumbers(9453156841L);
        PhoneNumbers n3 = new PhoneNumbers(7834745581L);
        PhoneNumbers n4 = new PhoneNumbers(8347466711L);
        Contact c1 = new Contact("Bhuv", "bhuv@gmail.com", "female");
        Contact c2 = new Contact("Keerthi", "keerthiraj@gmail.com", "female");
        Contact c3 = new Contact("Vivek", "vivekkantha@gmail.com", "male");
        Contact c4 = new Contact("Prawin", "Prawin@gmail.com", "male");
        TreeMap<PhoneNumbers, Contact> phnContact = new TreeMap<>(new SortByPhoneNumber());
        phnContact.put(n1, c1);
        phnContact.put(n2, c2);
        phnContact.put(n3, c3);
        phnContact.put(n4, c4);
        System.out.println(phnContact);
        Set<Map.Entry<PhoneNumbers, Contact>>                entrySet = phnContact.entrySet();
        System.out.println("Keys.......................");
        for (Map.Entry<PhoneNumbers, Contact> entry : entrySet) {
            System.out.println(entry.getKey());
        }
        System.out.println("Values..................");
        for (Map.Entry<PhoneNumbers, Contact> entry : entrySet) {
            System.out.println(entry.getValue());
        }

        System.out.println("KeyValuePairs..................");
        for (Map.Entry<PhoneNumbers, Contact> entry : entrySet) {
            System.out.println(entry.getKey() + "=>" + entry.getValue());
        }
    }
}


