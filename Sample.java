import java.util.Scanner;

public class Sample{
    public static void main(String []arg){
    //it is a sample code
    System.out.println("Hello World");  
    System.out.println("Welcome you all");
    System.out.println("edited in branch 2");
    //changes to be added
    //changes are get input from user
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Number : ");
    int a = sc.nextInt();
    System.out.println(a);
    sc.close();
  }
}
