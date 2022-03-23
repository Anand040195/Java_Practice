import java.util.Scanner;  
class Numeve  
{  
public static void main(String[] args)   
{  
int number, i=0;  
Scanner sc=new Scanner(System.in);  
System.out.print("Enter the limit: ");  
number = sc.nextInt();    
System.out.print("Lit of even numbers: ");  

while(i<=number)  
{  
 
System.out.print(i +" ");   

i=i+2;  
}     
}  
}