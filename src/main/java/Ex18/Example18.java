package Ex18;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Richard Pekarski
 */

public class Example18{
    public static void main(String[] args)
    {
        int temp_f,temp_c,conv_c,conv_f;
        Scanner input = new Scanner(System.in);
        System.out.print("Type C for Fahrenheit to Celsius, and F for the opposite. ");
        String Character = input.next();
        Character = Character.toUpperCase();

        String Case1 = "C", Case2 = "F";
        if(Character.equals(Case1))
        {
            //System.out.print("Case 1");
            System.out.print("Enter the temperature in Fahrenheit. ");
            temp_f = input.nextInt();
            conv_c = (temp_f - 32) * 5 / 9;
            System.out.print("The temperature in Celsius is " + conv_c);
        }
        else if(Character.equals(Case2))
        {
            //System.out.print("Case 2");
            System.out.print("Enter the temperature in Celsius. ");
            temp_c = input.nextInt();
            conv_f = (temp_c * 9 / 5) + 32;
            System.out.print("The temperature in Fahrenheit is " + conv_f);
        }
    }
}
