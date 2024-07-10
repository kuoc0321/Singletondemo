package com.example.demo;

public class LoggerLazyInitialization {
    private static LoggerLazyInitialization loggerLazyInitialization;
    private LoggerLazyInitialization(){};

    public static LoggerLazyInitialization getInstance(){
        if(loggerLazyInitialization == null){
            loggerLazyInitialization = new LoggerLazyInitialization();
        }
        return loggerLazyInitialization;
    }

    public void log(String message){
        System.out.println("Log: " + message);
    }
}
