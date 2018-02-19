package main;

public class WhileFor {
    public static void main(String[] args) {
//
//        while (true)
//            System.out.println("Hello, World!");
//
//        while (false)
//            System.out.println("Hello, World!");

        int i, j, k;
        for (i = 0; i <= 6; i++) {
            for (j = 1; j <= 7; j++)
                System.out.print("*");
            System.out.println("");
        }

        System.out.println("");

        for (i = 0; i <= 6; i++) {
            for (j = 1; j <= 7 - i; j++)
                System.out.print("*");
            System.out.println("");
        }

        System.out.println("");

        for (i = 0; i <= 6; i++) {
            for (j = 1; j <= 7 - i; j++)
                System.out.print(" ");
            for (k = 7-i; k <= 7; k++)
                System.out.print("*");
            System.out.println("");
        }
    }
}
