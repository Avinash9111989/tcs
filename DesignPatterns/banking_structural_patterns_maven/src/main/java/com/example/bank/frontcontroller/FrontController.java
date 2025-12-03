package com.example.bank.frontcontroller;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class FrontController {
    private final Map<String, Consumer<String[]>> handlers = new HashMap<>();
    public void register(String cmd, Consumer<String[]> handler){ handlers.put(cmd, handler); }
    public void dispatch(String line){
        String[] parts = line.split("\\s+"); 
        if(parts.length==0) return;
        Consumer<String[]> h = handlers.get(parts[0]);
        if(h!=null) h.accept(parts);
        else System.out.println("Unknown command: " + parts[0]);
    }
}
