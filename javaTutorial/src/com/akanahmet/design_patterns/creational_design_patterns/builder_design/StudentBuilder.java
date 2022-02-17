package com.akanahmet.design_patterns.creational_design_patterns.builder_design;

public class StudentBuilder {

    private String name;
    private String surname;

    public  StudentBuilder(){
    }

    public  StudentBuilder(Builder builder){
        this.name =builder.name;
        this.surname =builder.surname;
    }

    //getter and setter
    public String getName() {
        return name;
    }

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public StudentBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    //inner class
    public static class Builder{
        private String name;
        private String surname;

        public Builder() {
        }

        public Builder name(String name){
            this.name=name;
            return this;
        }

        public Builder surname(String surname){
            this.surname=surname;
            return this;
        }

        public StudentBuilder build(){
            return  new StudentBuilder(this);
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    '}';
        }
    }
}
