// Creating classes & objects challenge
public class Main {
   public static void main(String[] args) {
       
       //create a Loading object with the same name
       Loading loading = new Loading();
       
       loading.LoadingMessage();
   }
}

public class Loading {
     //complete the class, add LoadingMessage() method
     static public void LoadingMessage() {
         System.out.println("Loading");
         }
}



// Class attributes challenge
import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
       Scanner read = new Scanner(System.in);
       String firstName = read.nextLine();
       String secondName = read.nextLine();
       int age = read.nextInt();
       int roomNumber = read.nextInt();
       Customer customer = new Customer();
       //set customer's data to object here
      customer.firstName = firstName;
      customer.secondName = secondName;
      customer.age = age;
      customer.roomNumber = roomNumber;
      
       customer.saveCustomerInfo();
   }
}

class Customer {
   //add all necessary attributes here
   String firstName;
   String secondName;
   int age;
   int roomNumber;
  
   public void saveCustomerInfo() {
       System.out.println("First name: " + firstName);
       System.out.println("Second name: " + secondName);
       System.out.println("Age: " + age);
       System.out.println("Room number: " + roomNumber);
   }
}


// Getters and setters challenge
import java.util.Scanner;

class Main {

   public static void main(String[] args) {
       Scanner read = new Scanner(System.in);
       String name = read.nextLine();
       int age = read.nextInt();
       Student student = new Student();
       student.name = name;
       student.setAge(age);
       
       //set the age via Setter
       
       System.out.println("Name: " + student.name);
       System.out.println("Age: " + student.getAge());
   }
}

class Student {

   public String name;
   private int age;
   
   public int getAge() {
       //complete Getter
       return this.age;
       
   }
   public void setAge(int age) {
       //complete Setter
       if(age < 0) {
           System.out.println("Invalid age");
           this.age = 0;
       } else {
           this.age = age;
       }
   }
}
