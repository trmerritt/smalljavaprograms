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


// Constructors Challenge
import java.util.Scanner;

class Main {
   public static void main(String[] args) {
       Scanner read = new Scanner(System.in);
       String movie = read.nextLine();
       int row = read.nextInt();
       int seat = read.nextInt();
       Ticket ticket = new Ticket(movie, row, seat);
       System.out.println("Movie: " + ticket.getMovie());
       System.out.println("Row: " + ticket.getRow());
       System.out.println("Seat: " + ticket.getSeat());
   }
}

class Ticket {
   private String movie;
   private int row;
   private int seat;

   //complete the constructor
   public Ticket(String movie, int row, int seat) {
       this.movie = movie;
       this.row = row;
       this.seat = seat;
       
   }

   public String getMovie() {
       return movie;
   }

   public int getRow() {
       return row;
   }

   public int getSeat() {
       return seat;
   }
}


// The Math Class Challenge
import java.util.Scanner;

class Main {
   public static void main(String[] args) {
       Scanner read = new Scanner(System.in);
       int num1 = read.nextInt();
       int num2 = read.nextInt();
       double result = squared(num1, num2);
       System.out.println(result);

       //your code goes here
       
   }
//your code goes here
   static public double squared(int number1, int number2) {
       double result = Math.pow(number1, number2);
       return result;
   }
}


// Encapsulation
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner read = new Scanner(System.in);
	    int a = read.nextInt();
	    
	    Pupil pupil =  new Pupil();
            pupil.setAge(a);
	}
}

class Pupil{
    private int age;
    
    //complete setter method
    public void  setAge(int a){
        if (a > 6) {
            age += a;
            System.out.println("Welcome");
        } else {
            System.out.println("Sorry");
        }
       
    }
    
    public int getAge(){
        return age;
    }
}



// Inheritance Challenge
//be attentive to access modifiers
class Standard {
   protected void draw() {
       System.out.println("Drawing");
   }

   protected void write() {
       System.out.println("Writing");
   }
}
//fix the class
class Pro extends Standard {

   protected void useEffects() {
       System.out.println("Using Effects");
   }

   protected void changeResolution() {
       System.out.println("Changing Resolution");
   }
}

public class Main {
   public static void main(String[] args) {
       Standard standard1 = new Standard();
       Pro pro1 = new Pro();
       
       //standard version
       standard1.draw();
       standard1.write();
       
       //Pro version
       pro1.draw();
       pro1.write();
       pro1.useEffects();
       pro1.changeResolution();
   }
}


