package com.company;
import java.lang.reflect.Field;
public class Tester1 {


    public static void main(String[] args) {

            long[] restaurantContacts = { 9992346725L, 9992346726L, 9992346727L };
            Restaurant restaurant1 = new Restaurant("SwiftFood",
                    restaurantContacts, "Carolina Street, Springfield, 62702", 4.1f);
            restaurant1.displayRestaurantDetails();



            Teacher[] obj = new Teacher[4];

            obj[0]=new Teacher("Alex","java",15550);
            obj[0].displayDetailsOfTeachers();








    }


}
class Teacher {
    //Implement your code here
    private String teacherName;
    private String subject;
    private double salary;
    public Teacher(String teacherName, String subject, double salary){
        this.teacherName=teacherName;
        this.subject=subject;
        this.salary=salary;

    }
    public void setTeacherName(String teacherName){
        this.teacherName=teacherName;
    }
    public String getTeacherName(){
        return this.teacherName;
    }
    public void setSubject(String subject){
        this.subject=subject;
    }
    public String getSubject(){
        return this.subject;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }
    public double getSalary(){
        return this.salary;
    }
    public void displayDetailsOfTeachers(){
        System.out.println("Name : "+this.teacherName+", "+"Subject : "+this.subject+", "+"Salary : "+salary);

    }
}

