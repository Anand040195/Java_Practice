import java.util.Scanner;  
class Numodd  
{  
public static void main(String[] args)   
{  
int number, i=1;  
Scanner sc=new Scanner(System.in);  
System.out.print("Enter the limit: ");  
number = sc.nextInt();    
System.out.print("Lit of odd numbers: ");  

while(i<=number)  
{  
 
System.out.print(i +" ");   

i=i+2;  
}     
}  
}