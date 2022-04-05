import java.util.*;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {


        long n, fact = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        n=sc.nextLong();
        for (int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial is"+fact);
    }
}