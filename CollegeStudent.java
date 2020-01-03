//Final Exam College Student Record 
//December 17, 2019 
//Michele Vulcano Hall 
import java.util.Scanner;
//college student that is a student
public class CollegeStudent extends Student{
   //define college student major
   private String major;
   //putting it all togehter
   //creates the college student
   public CollegeStudent(String name, float gpa, String major) {
       //superclass call
       super(name, gpa);
       this.major = major;
   }
   //overrides toString
   public String toString() {
       return "Major:" + major + ", Name:" + getName() + ", GPA:" + getGpa();
   }  
}