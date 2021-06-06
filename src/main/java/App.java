/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Luis Corona
 */
import java.util.Scanner;

public class App {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App app = new App();
        String tempConvert = app.readTempConvert();
        app.tempConversion(tempConvert);
    }

    private void tempConversion(String tempConvert) {
        if(tempConvert.equalsIgnoreCase("c")){
            String message = String.format("Your choice: %s", tempConvert);
            System.out.println(message);
            System.out.print("Please enter the temperature in Fahrenheit: ");
            String fTemp = in.nextLine();
            int tempInt = Integer.parseInt(fTemp);
            int finalTemp = (tempInt-32) *(5/9);
            System.out.print("The temperature in Celsius is " +finalTemp);

        }
        else{
            String message = String.format("Your choice: %s", tempConvert);
            System.out.println(message);
            System.out.print("Please enter the temperature in Celsius: ");
            String cTemp = in.nextLine();
            int tempInt = Integer.parseInt(cTemp);
            int finalTemp = (tempInt * (9/5)) +32;
            System.out.print("The temperature in Fahrenheit is " +finalTemp);
        }
    }

    private String readTempConvert() {
        System.out.println("Press C to convert from Fahrenheit to Celsius. ");
        System.out.println("Press F to convert from Celsius to Fahrenheit. ");
        String tempConvert = in.nextLine();

        return tempConvert;

    }
}
