import java.util.Scanner;

class Blood
{
  public static void main(String args[])
  {
    int age, Weight;
    System.out.println("Enter an Integer age:");
    Scanner input = new Scanner(System.in);
    age = input.nextInt();
    System.out.println("Enter an Integer Weight:");
    Weight = input.nextInt();
    if ( age>=18 && Weight>=52 )
        System.out.println("Eligible for blood donate");
    else
        System.out.println("Not Eligible for blood donate");
  }
}