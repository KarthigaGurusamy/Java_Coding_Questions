package Spiral_Matrix;

import java.util.Scanner;

public class Spiral_Matrix {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the row size of the matrix:");

        int x = scanner.nextInt();

        System.out.println("Enter the column size of the matrix:");

        int y = scanner.nextInt();

        System.out.println("Enter the elements:");

        int[][] MatArr = new int[x][y];

        for(int i=0;i<x;i++)
        {
            for(int j=0;j<y;j++)
            {
                MatArr[i][j]=scanner.nextInt();
            }
        }

        int rStart = 0, rEnd = x-1, cStart = 0, cEnd = y-1;

        while(rStart<=rEnd && cStart<=cEnd)
        {
            for(int i=rStart;i<=rStart;i++)
            {
                for(int j=cStart;j<=cEnd;j++)
                {
                    System.out.print(MatArr[i][j]+" ");
                }
            }
            rStart++;

            for(int i=rStart;i<=rEnd;i++)
            {
                for(int j=cEnd;j<=cEnd;j++)
                {
                    System.out.print(MatArr[i][j]+" ");
                }
            }
            cEnd--;

            if(rStart<=rEnd)
            {
                for(int i=rEnd;i>=rEnd;i--)
                {
                    for(int j=cEnd;j>=0;j--)
                    {
                        System.out.print(MatArr[i][j]+" ");
                    }
                }

                rEnd--;
            }

            if(cStart<=cEnd)
            {
                for(int i=rStart;i>=rEnd;i--)
                {
                    for(int j=cStart;j>=cEnd;j--)
                    {
                        System.out.print(MatArr[i][j]+" ");
                    }
                }

                cStart++;
            }
        }

    }
}
