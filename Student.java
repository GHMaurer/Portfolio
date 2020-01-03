


import java.util.Scanner;
public class Student {
      //gets name and gpa 
   private float gpa;
   private String name;

//constructor instance variables 
//makes the regular student
   public Student(String name, float gpa) {
       super();
       this.name = name;
       this.gpa = gpa;
   }
   //get method for name
   public String getName() {
       return name;
   }
   //set method for name
   public void setName(String name) {
       this.name = name;
   }
  //float for GPA
  //get method
   public float getGpa() {
       return gpa;
   }
   //set method
   public void setGpa(float gpa) {
       this.gpa = gpa;
   }
   //to string
   public String toString() {
       return "Student [name=" + name + ", gpa=" + gpa + "]";
   }
  
}