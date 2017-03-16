package com.simpleCalc.java;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double firstNumber = sc.nextInt();

        System.out.print("Enter another number to add: ");
        double secondNumber = sc.nextInt();

        double answer = firstNumber + secondNumber;
        System.out.println("The answer is: " + answer);
    }
}
