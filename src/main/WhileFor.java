package main;

public class WhileFor {
    public static void main(String[] args) {
//
//        while (true)
//            System.out.println("Hello, World!");
//
//        while (false)
//            System.out.println("Hello, World!");

        //print each digit of the number 1237653
        int t = 123654;
        while (t > 0) {
            System.out.println(t % 10);
            t = t / 10;
        }

        System.out.println("");
        printNum(123654);

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
            for (k = 7 - i; k <= 7; k++)
                System.out.print("*");
            System.out.println("");
        }


    }

    private static void printNum(int i) {

        if (i > 0) {
            System.out.println(i % 10);
            printNum(i/10);
        }

    }
}
