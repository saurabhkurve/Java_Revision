package Basic_Java_Programs;

import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int number = sc.nextInt();

        fibonacci(number);
    }

    public static void fibonacci(int number){
        int prev1 = 0, prev2 = 1;
        System.out.print(prev1 + " " + prev2 + " ");

        for(int i=3;i<number;i++){
            int current = prev1 + prev2;
            System.out.print(current + " ");
            prev1 = prev2;
            prev2 = current;
        }
    }
}
