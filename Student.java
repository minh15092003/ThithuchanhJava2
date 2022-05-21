package Thithuchanhjava2;

/*
    @author:  TA VAN MINH
    Date   : 5/21/2022
    Project: Java2
*/
public class Student {
    private int studentID;
    private String name, address, phone;
    // Constructor
    public Student(int studentID, String name, String address, String phone) {
        this.studentID = studentID;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }
    // getter-setter

    public int getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
    public String getPhone() {
        return phone;
    }
    public void setStudentID(int studentID){
        this.studentID = studentID;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}