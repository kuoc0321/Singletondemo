package com.example.demo;

public enum LoggerEnum {
    INSTANCE;
    public void log(String message){
        System.out.println("Log: " + message);
    }

}
