package com.example.bank.objectpool;

public class MockConnection {
    private static int counter = 0;
    private final int id;
    public MockConnection() { id = ++counter; }
    public void execute(String q) { System.out.println("Conn#"+id+" executing: " + q); }
    @Override public String toString() { return "MockConnection#"+id; }
}
