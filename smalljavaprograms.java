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



// Polymorphism Challenge
class Main {
   public static void main(String[] args) {
       
       Vehicle vehicle = new Vehicle();
       Vehicle electric = new ElVehicle();
       Vehicle hybrid = new HybridVehicle();
       
       //calls
       vehicle.start();
       vehicle.resource();
       electric.start();
       electric.resource();
       hybrid.start();
       hybrid.resource();
   }
}
class Vehicle{
    public void start(){
        System.out.println("Starting");
    }
    public void resource(){
        System.out.println("I use petrol");
    }
}

class ElVehicle extends Vehicle{
    /*reimplement resource() method 
    to output "I use electricity"*/
    public void resource() {
        System.out.println("I use electricity");
    }
    
}

class HybridVehicle extends Vehicle{
    /*reimplement resource() method 
    to output "I use both petrol and electricity"*/
    public void resource() {
        System.out.println("I use both petrol and electricity");
    }
}



// Overloading Challenge
public class Main {
    public static void main(String[] args) {
        
        int a = 5;
        double b = 10.2;
        
        System.out.println(doubleTheValue(a));
        System.out.println(doubleTheValue(b));
                
    }
    //complete the method for integer value type
    public static int doubleTheValue(int number) {
        return number*2;
    }
    //overload the method for double value type
    public static double doubleTheValue(double num) {
        return num*2;
    }
}



// Abastract Classes Challenge
class Main {
   public static void main(String[] args) {
       //do not touch this code
       Monopoly monopoly = new Monopoly();
       Chess chess = new Chess();
       Battleships battleships = new Battleships();
       
       monopoly.play();
       chess.play();
       battleships.play();
   }
}

abstract class Game {
   abstract String getName();
   abstract void play();
}

class Monopoly extends Game {

   //give "Monopoly" name to game
   String getName() {
      String name = "Monopoly";
       return name;
   }

   // play method should print "Buy all property."
   void play() {
      System.out.println("Buy all property.");
   }
}

class Chess extends Game {

   //give "Chess" name to game
   String getName() {
       String name = "Chess";
       return name;
   }

   // play method should print "Kill the enemy king."
   void play() {
       System.out.println("Kill the enemy king.");
   }
}

class Battleships extends Game {

   //give "Battleships" name to game
   String getName() {
       String name = "Battleships";
       return name;
   }

   // play method should print "Sink all ships."
   void play() {
       System.out.println("Sink all ships.");
   }
}


// Interfaces Challenge
class Main {
   public static void main(String[] args) {
       Animal dog = new Dog();
       Animal cat = new Cat();
       
       dog.swim();
       dog.play();
       cat.swim();
       cat.play();

   }
}

interface Swimmer {
   void swim();
}

interface Player {
   void play();
}

abstract class Animal implements Swimmer, Player {
   public abstract void swim();
   public abstract void play();
}

class Dog extends Animal {
   //Override the swim() and the play() methods
   public void swim() {
      System.out.println("Dog is swimming");
   }
   public void play() {
      System.out.println("Dog is playing");
   }
}

class Cat extends Animal {
   //Override the swim() and the play() methods
   public void swim() {
      System.out.println("Cat is swimming");
   }
   public void play() {
      System.out.println("Cat is playing");
   }
}


// Casting Challenge
import java.util.Scanner;

class Main {
   public static void main(String[] args) {
       Scanner read = new Scanner(System.in);
       char a = read.next().charAt(0);
       
       //your code goes here
       int typeCasted = (int) a;
       System.out.println(typeCasted);
    }   
}


// Anonymous Classes Challenge
public class Main
{
	public static void main(String[] args) {
        
       Purchase customer = new Purchase();
       Purchase specialCustomer = new Purchase(){
           //your code goes here
           @Override public int totalAmount(int price) {
               return price - (price*20)/100;
               }
       };
        
        System.out.println(customer.totalAmount(1000));
        System.out.println(specialCustomer.totalAmount(100000));
	}
}

class Purchase {
    int price;
    
    public int totalAmount(int price) {
        return price - (price*10)/100;
    }
}


// Exception Handling Challenge
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner scanner = new Scanner(System.in);
	    int choice = scanner.nextInt();
	    
	    String[] categories = {"PCs", "Notebooks", "Tablets", "Phones", "Аccessories"};
	    
	    //complete the code
		if (choice >= 0 && choice < categories.length) {
            try {
                System.out.println(categories[choice]);
            } catch (Exception e) {
                System.out.println("An error occurred");
            }
        } else {
            System.out.println("Wrong Option");
        }
    }


import java.util.Scanner;
import java.util.InputMismatchException;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner scanner = new Scanner(System.in);
	    
	    try {
	        int num1 = scanner.nextInt();
	        int num2 = scanner.nextInt();
	        /*
	        1. Error: division by zero
	        2. Error: wrong value type
	        */
	        //your code goes here
	    if (num2 == 0) {
                throw new ArithmeticException();
            }
            
            System.out.println(num1 / num2);
            
        } catch (ArithmeticException e) {
            System.out.println("Error: division by zero");
        } catch (InputMismatchException e) {
            System.out.println("Error: wrong value type");
        }
    }
}


// Threads Challenge
class Main {
    public static void main(String[ ] args) {
        Name name = new Name();
        //set priority
        name.setPriority(1);
        
        Welcome welcome = new Welcome();
        //set priority
        welcome.setPriority(10);
        
        name.start();
        welcome.start();
    }
}

//extend the Thread class
class Welcome extends Thread{
    public void run() {
        System.out.println("Welcome!");
    }
}

//extend the Thread class
class Name extends Thread{
    public void run() {
        System.out.println("Please enter your name");
    }
}
