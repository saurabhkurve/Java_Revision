package Basic_Java_Programs;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int number = sc.nextInt();

        boolean res = isPrime(number);
        if (res){
            System.out.println("Number is prime");
        }else {
            System.out.println("Number is not prime");
        }
    }

    public static boolean isPrime(int n){
        if(n==0 || n==1) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
