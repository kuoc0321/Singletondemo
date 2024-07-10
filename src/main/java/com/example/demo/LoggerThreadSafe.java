package com.example.demo;

public class LoggerThreadSafe {
    private static LoggerThreadSafe loggerThreadSafe;
    private LoggerThreadSafe(){};
    public static synchronized LoggerThreadSafe getInstance(){
        if(loggerThreadSafe == null){
            loggerThreadSafe = new LoggerThreadSafe();
        }
        return loggerThreadSafe;
    }
    public void log(String message){
        System.out.println("Log: " + message);
    }
}
