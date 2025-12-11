package com.example.bank.module;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ModuleRegistry {
    private final Map<String, Module> modules = new ConcurrentHashMap<>();
    public void register(Module m){ modules.put(m.getName(), m); }
    public void startAll(){ modules.values().forEach(Module::start); }
    public void stopAll(){ modules.values().forEach(Module::stop); }
}
