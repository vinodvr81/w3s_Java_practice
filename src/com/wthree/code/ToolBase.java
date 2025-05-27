package com.wthree.code;
public abstract class ToolBase {
    public void registerHandler(Object handler) {
        // Register custom arg handler
    }

    public boolean processArgs(String[] args) {
        // Logic to process args using registered handlers
        return true;
    }
}