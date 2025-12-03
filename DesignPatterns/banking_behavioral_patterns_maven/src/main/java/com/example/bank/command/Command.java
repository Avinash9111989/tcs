package com.example.bank.command;

public interface Command {
    void execute();
    void undo();
}
