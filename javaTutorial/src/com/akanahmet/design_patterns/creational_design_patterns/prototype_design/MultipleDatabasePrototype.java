package com.akanahmet.design_patterns.creational_design_patterns.prototype_design;

 abstract public  class MultipleDatabasePrototype implements  Cloneable  {

     private String userName="root";
     private String userPassword="root";

     //clone object
     @Override
     protected Object clone() throws CloneNotSupportedException {
         return super.clone();
     }

     //getter and setter
     public String getUserName() {
         return userName;
     }

     public MultipleDatabasePrototype setUserName(String userName) {
         this.userName = userName;
         return this;
     }

     public String getUserPassword(String root2) {
         return userPassword;
     }

     public MultipleDatabasePrototype setUserPassword(String userPassword) {
         this.userPassword = userPassword;
         return this;
     }
 }
