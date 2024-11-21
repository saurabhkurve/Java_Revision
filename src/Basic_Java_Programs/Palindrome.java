package Basic_Java_Programs;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to check it is palidrome or not : ");
        int num = sc.nextInt();
        boolean result = isPalindrome(num);
        if(result){
            System.out.println("Basic_Java_Programs.Palindrome");
        }else{
            System.out.println("Not Basic_Java_Programs.Palindrome");
        }
    }

    public static boolean isPalindrome(int n){
        int original = n;
        int rev = 0;
        while(n!=0){
            int rem = n % 10;
            rev = rev * 10 + rem;
            n /= 10;
        }

        if(rev == original){
            return true;
        }

        return false;
    }
}