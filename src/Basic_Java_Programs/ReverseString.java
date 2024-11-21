package Basic_Java_Programs;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string : ");
        String str = sc.nextLine();

        reverse(str);
    }

    public static void reverse(String str){

        String newStr = "";
        for(int i=str.length()-1;i>=0;i--){
            newStr += str.charAt(i);
        }

        System.out.println(newStr);
    }
}
