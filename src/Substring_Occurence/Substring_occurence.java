package Substring_Occurence;

import java.util.Scanner;

public class Substring_occurence {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String str = scanner.nextLine();

        String[] strArr = str.split(" ");

        int count = 0;
        for (int i = 0; i < strArr.length; i++) {
            for (int j = i; j < strArr.length; j++) {

                if (strArr[i].equals(strArr[j])) {
                    count++;

                }
            }
            if (!strArr[i].equals(".")) {
                System.out.println(strArr[i] + " " + count);

            }
            count = 0;

            String s = strArr[i];
            for(int k=0;k<strArr.length;k++)
            {
                if(strArr[k].equals(s)) {
                    strArr[k] = ".";
                }
            }

        }
    }

}
