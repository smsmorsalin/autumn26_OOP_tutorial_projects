package main.class_object;

import java.time.LocalDate;

public class Student {
    private int id;
    private String name;
    private LocalDate DoB;
    private String Address;
    private String Dept;
    private float cGPA;

    public Student(int id, String name, LocalDate doB, String address, String dept, float cGPA) {
        this.id = id;
        this.name = name;
        DoB = doB;
        Address = address;
        Dept = dept;
        this.cGPA = cGPA;
    }

    public Student(int id, String name, LocalDate doB, String address, String dept) {
        this.id = id;
        this.name = name;
        DoB = doB;
        Address = address;
        Dept = dept;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDoB() {
        return DoB;
    }

    public String getAddress() {
        return Address;
    }

    public String getDept() {
        return Dept;
    }

    public float getcGPA() {
        return cGPA;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", DoB=" + DoB +
                ", Address='" + Address + '\'' +
                ", Dept='" + Dept + '\'' +
                ", cGPA=" + cGPA +
                '}';
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void setDept(String dept) {
        Dept = dept;
    }

    public void setcGPA(float cGPA) {
        this.cGPA = cGPA;
    }

    public void Course_reg(){
        //coursse_reg process
    }


    // over_Loaded method
    public void pay_bill(){
        //pay blill
    }

    public void pay_bill(String x){

    }

    public void pay_bill(String x, int y){

    }

    public void pay_bill(int w){
        int id;

        System.out.println("Bill pay complete");
    }


}
