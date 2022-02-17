package com.akanahmet.object_orianted_programming;

class Family {

    private String name;

    public Family() {
    }

    public Family(String tür){
            this.name = tür;
    }

    public String getName() {
        return name;
    }

}
public class Overriding extends  Family{ // Override için extends etmek lazım (Object ve Family)

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}