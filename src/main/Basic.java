package main;

public class Basic {

    public static void main(String[] args) {

        boolean stringVered = "vered"=="vered";
        boolean stringAlmog = new String("almog")== new String("almog");

        System.out.println("equals " + stringVered);
        System.out.println("equals " + stringAlmog);

        int x = 4;
        int y = 3;
        float z = 4;
        float w = 3;

        int answer = x/y;
        float answerLong = x/y;
        float answerFloat = z/w;

        System.out.println("answer " + answer);
        System.out.println("answerLong " + answerLong);
        System.out.println("answerFloat " + answerFloat);



    }

}
