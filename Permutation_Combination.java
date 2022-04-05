import java.util.Scanner;

public class Permutation_Combination {
    public static int fact(int num){
        int fact=1, i;
        for(i=1; i<=num; i++){
            fact = fact*i;
        }
        return fact;
    }
    public static void main(String args[]){
        int n, r;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Value of 1st number : ");
        n = scanner.nextInt();
        System.out.print("Enter Value of 2nd number : ");
        r = scanner.nextInt();

        System.out.println("Combination is " +(fact(n)/(fact(n-r)*fact(r))));
        System.out.println("Permutation is " +(fact(n)/(fact(n-r))));
    }
}


