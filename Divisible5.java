import java. util. Scanner;
class Divisible5
{
    public static void main (String args[ ]) 
    {
        int number;
        System.out.println("Enter number:");
        Scanner sc = new Scanner (System.in) ;
        number= sc.nextInt( ) ;
        if(number%5==0) 
            System.out.println("Number is divisible by 5");
        else
            System.out.println("Number is not divisible by 5");
    }
}

