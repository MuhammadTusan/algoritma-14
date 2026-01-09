import java.util.Scanner;

public class factorial{
    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    System.out.print("Factorial : ");
        int n =  scanner.nextInt();
        System.out.println(factorial(n));
        }
        static int factorial(int n){
            if (n<=1) return 1;
            return n * factorial(n-1);
        }
    }
        


