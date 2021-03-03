import java.util.Scanner;

class hello
{
  public static void main(String[] args)
  {
    int test = 10;
    String s;
    
    System.out.println("hello maggie");
    System.out.println("we are live from jenkins");
    System.out.println("this is how we do continuous delivery or continuous integration");
    if (test == 10) {
      System.out.println("this is a 10 out of 10");
    }
    Scanner obj = new Scanner(System.in);
    System.out.println("What is the name of our software ");
    s = obj.nextLine();
    System.out.println("It is " + s);
    }
 }
