package Palindrome;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = scanner.nextLine();

        int count=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==str.charAt(str.length()-i-1))
            {
                count++;
            }
        }

        if(count==str.length())
        {
            System.out.println("True!");
        }
        else
        {
            System.out.println("False!");
        }

    }
}
