package com.example;

public enum Logger {
    Instance;

    private Logger() {
    }

    public static Logger getLogger() {
        return Instance;
    }

    void log(String logMessage) {
        System.out.println(logMessage);
    }

}
