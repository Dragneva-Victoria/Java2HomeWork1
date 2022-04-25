package com.company.homework3;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HomeWork3b {

    Map<String, Set<String>> phoneBook = new TreeMap<>();

   public void add (String surname, String phoneNumber){
       Set<String> phone = phoneBook.get(surname);
       if (phone == null){
           Set<String> phoneSet = new HashSet<>();
           phoneSet.add(phoneNumber);
           phoneBook.put(surname, phoneSet);
       } else {
           phone.add(phoneNumber);
           phoneBook.put(surname, phone);
       }
   }

   public Set<String> get (String s){
       return phoneBook.get(s);
   }

   public Set<String> surnames(){
       return phoneBook.keySet();
   }
}
