package com.company;

import com.company.interfaces.CocheCRUD;
import com.company.interfaces.CocheCRUDImpl;

public class Main {
    public static void main(String[] args) {
        CocheCRUD cocheCrud = new CocheCRUDImpl();

        cocheCrud.save();
        cocheCrud.findAll();
        cocheCrud.delete();
    }
}
