package edu.najah.eng.solid.srp.assignment.impl;

import edu.najah.eng.solid.srp.assignment.intf.IDatabase;

public class Database implements IDatabase {
    @Override
    public void connectDatabase(){
        System.out.println("connect to data base");
    }
    @Override
    public void insertRecord(){
        System.out.println("insert to database");
    }
    @Override
    public void deleteRecord(){ System.out.println("delete from database");}
    @Override
    public void closeDatabase(){
        System.out.println("close the database");
    }
}
