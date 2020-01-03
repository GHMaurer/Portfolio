//Final Exam College Student Record 
//December 17, 2019 
//Michele Vulcano Hall 
import java.util.Scanner;

public class Driver {

   public static void main(String[] args) {
       //auto-generated method 
       //defines variables to get inputs for the student objects
       String yn;
       String nameIn;
       String majorIn;
       float gpaIn;
       //test run of college student constructor
       CollegeStudent collegeStudent=new CollegeStudent("Michele", 3.0f,"Euducation");
       System.out.println(collegeStudent.toString());
       //creates scanner
       Scanner sc = new Scanner(System.in);
       //asks if college student
       System.out.println("Are you a college student? ");
       yn = sc.nextLine();
       //checks if student is in college
       if(yn.equalsIgnoreCase("yes"))
       {
         
         //asks about information needed
         System.out.println("Name: ");
         nameIn = sc.nextLine();
         System.out.println("Major: ");
         majorIn = sc.nextLine();
         System.out.println("Gpa: ");
         gpaIn = sc.nextFloat();
         
         //defines college student
         CollegeStudent me = new CollegeStudent(nameIn, gpaIn, majorIn);
         System.out.println(me.toString());
         
       }else
       {
         //asks about information needed
         System.out.println("Name: ");
         nameIn = sc.nextLine();
         System.out.println("Gpa: ");
         gpaIn = sc.nextFloat();

         //defines regular student
         Student me = new Student(nameIn, gpaIn);
         System.out.println(me.toString());

       }
   }

}

