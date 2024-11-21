package Basic_Java_Programs;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int number = sc.nextInt();

        int fact = factorial(number);
        System.out.println(fact);
    }

    public static int factorial(int number){
        if(number == 0 || number == 1) return 1;
        return number * factorial(number-1);
    }

}
