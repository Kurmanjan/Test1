package com.example.test;

public class Check {

    public String onReceive(String s) {
        String[] strings = String.valueOf(s).split(" ");


        return strings[1] + " " + strings[0];

    }


    public String onRevers(String s2){
        StringBuffer buffer = new StringBuffer(s2);
        buffer.reverse();

        return buffer.toString();
    }



}