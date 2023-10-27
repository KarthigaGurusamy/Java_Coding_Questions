package Character_Occurences;

import java.util.Scanner;

public class Character_Occurences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = scanner.nextLine();

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {

                if (str.charAt(i) == str.charAt(j)) {
                    count++;

                }
            }
            if (str.charAt(i) != '.') {
                System.out.print(str.charAt(i) + "" + count + " ");

            }
            count = 0;

            for (int k = 0; k < str.length(); k++) {
                if (str.charAt(k) == str.charAt(i)) {
                    str = str.replace(str.charAt(k), '.');
                }
            }

        }
    }
}
