package com.gabhi.pkg06.strategy;

public class ConsoleLogging implements Logging {
    @Override
    public void write(final String message) {
        System.out.println(message);
    }
}
