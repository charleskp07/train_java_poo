package org.example;

public class Staff {

    private String personal_name;

//    public Staff() { personal_name=null ;}

    public Staff(String names) {
        this.personal_name = names;
    }

    public String getNames() {
        return personal_name;
    }

    public void setNames(String names) {
        this.personal_name = names;
    }
}
