package Fibonacci_Series;

import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int x = scanner.nextInt();

        int first = 0;
        int second = 1;
        int third;
        System.out.print(first+" ");
        System.out.print(second+" ");
        for(int i=2;i<x;i++)
        {
            third = first+second;
            System.out.print(third+" ");
            first=second;
            second = third;
        }
    }
}
