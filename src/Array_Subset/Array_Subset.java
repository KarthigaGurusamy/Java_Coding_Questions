package Array_Subset;

import java.util.Scanner;

public class Array_Subset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the first array:");
        int x = scanner.nextInt();
        System.out.println("Enter the first array elements");
        int[] FirstArr = new int[x];
        for(int i=0;i<x;i++)
        {
            FirstArr[i]= scanner.nextInt();
        }

        System.out.println("Enter the size of the second array");
        int y= scanner.nextInt();
        if(y<=x)
        {
            System.out.println("Enter the second array elements");
            int[] SecondArr = new int[y];
            for(int i=0;i<y;i++)
            {
                SecondArr[i]= scanner.nextInt();
            }

            int count =0;
            for(int i=0;i<y;i++)
            {
                for(int j=0;j<x;j++)
                {
                    if(SecondArr[i]==FirstArr[j])
                    {
                        count++;
                    }
                }
            }

            if(count==SecondArr.length)
            {
                System.out.println("True!");
            }
            else
            {
                System.out.println("False!");
            }
        }
        else
        {
            System.out.println("The second array size must be less than or equal to the size of the first array");

        }
    }
}
