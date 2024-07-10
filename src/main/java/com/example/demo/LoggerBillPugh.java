package com.example.demo;

public class LoggerBillPugh {
    private LoggerBillPugh(){}
    private static class SingletonHelper{
        private static final LoggerBillPugh INSTANCE =  new LoggerBillPugh();
    }

    private static LoggerBillPugh getInstance(){
        return SingletonHelper.INSTANCE;
    }

    public void log(String message){
        System.out.println("Log: "+ message);
    }

}
