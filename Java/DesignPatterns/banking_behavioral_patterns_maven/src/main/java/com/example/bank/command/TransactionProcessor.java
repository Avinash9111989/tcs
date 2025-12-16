package com.example.bank.command;

import java.util.Stack;

public class TransactionProcessor {
    private final Stack<Command> history = new Stack<>();
    public void execute(Command c){ c.execute(); history.push(c); }
    public void undoLast(){ if(!history.isEmpty()) history.pop().undo(); }
}
