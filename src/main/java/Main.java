import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
    int a = 10;

    System.out.println(a);
    String[] studentName;
    studentName = new String[4];

    studentName[0] = "Jayson";
    studentName[1] = "Marcus";
    studentName[2] = "";
    studentName[3] = "Dom";
    System.out.println("The students are: " + studentName[0] +", "+ studentName[1] +", " + studentName[2] +", "+ studentName[3]);
    double[] gpa = {4.0, 3.9, 0.0, 3.5};
    for (int i = 0; i < 4; i++) {
      System.out.println(studentName[i] + " has a gpa of " + gpa[i]);
    }
    System.out.println("How big is your array? ");
    Scanner scan = new Scanner(System.in);
    int size = scan.nextInt();
    String s = " ";
    System.out.println("Your array size is " + size);
    String[] myArray = new String[size];
    for (int i = 0; i < myArray.length; i++) {
      s = scan.nextLine();

      System.out.println("What is the name? ");
      myArray[i] = s;
    }

    for (int i = 0; i < myArray.length; i++) {
      System.out.println("the length of " + i + " is "+ myArray[i]);
    }
    

    
  }
  
}