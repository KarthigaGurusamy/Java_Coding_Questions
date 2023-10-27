package Pair_In_An_Array;

import java.util.Scanner;

public class Pair_In_An_Array {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();

        int[] Arr = new int[size];

        System.out.println("Enter the array elements:");
        for(int i=0;i<size;i++)
        {
            Arr[i] = scanner.nextInt();

        }

        System.out.println("Enter the integer to find sum:");
        int K = scanner.nextInt();

        boolean isPair=false;
        int sum=0;
        for(int i=0;i<size-1;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                sum = Arr[i] + Arr[j];
                if(Math.abs(sum)==K)
                {
                    isPair=true;

                }
            }
            if(isPair)
            {
                break;
            }
        }

        if(isPair)
        {
            System.out.println("True!");
        }
        else
        {
            System.out.println("False!");
        }

    }
}
