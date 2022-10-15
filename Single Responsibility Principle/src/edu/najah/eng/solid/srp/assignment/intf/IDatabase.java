package edu.najah.eng.solid.srp.assignment.intf;

public interface IDatabase {
    void connectDatabase();
    void insertRecord();
    void deleteRecord();
    void closeDatabase();
}
