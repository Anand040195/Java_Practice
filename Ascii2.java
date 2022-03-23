import java.util.*;
class Ascii2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        char ch = sc.next().charAt(0);
        int v=ch;// widing
        char c=(char)v; // Narrowing
        System.out.println(c);
    }
}