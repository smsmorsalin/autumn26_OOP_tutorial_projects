package com.example.combo_table_generic;

public class forTable {
    public int SL;
    public String Name;
    public String phone;

    public forTable(int SL, String name, String phone) {
        this.SL = SL;
        Name = name;
        this.phone = phone;
    }

    public int getSL() {
        return SL;
    }

    public void setSL(int SL) {
        this.SL = SL;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
