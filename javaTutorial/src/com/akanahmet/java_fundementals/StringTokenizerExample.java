package com.akanahmet.java_fundementals;

import java.util.StringTokenizer;
public class StringTokenizerExample {

    public static void main(String[] args) {

        String jsonObject = "Html5, Css3 ,Js, React, Hibernate,Spring, Spring Boot#Spring MVC";
        //1. Way
        String [] result=jsonObject.split(",");
        for(String temp:result){
            System.out.println(temp);
        }
        System.out.println("*************");

        //2. Way
        StringTokenizer stringTokenizer =new StringTokenizer(jsonObject,",# ");
        while (stringTokenizer.hasMoreTokens()){
            System.out.println(stringTokenizer.nextToken());
        }
    }
}
