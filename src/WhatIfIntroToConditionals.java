import java.util.Scanner;

public class WhatIfIntroToConditionals {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;
        int z = 2;

        if (x > 5) {
            System.out.println("This line is inside the if statement");
        } else {
            System.out.println("The else block is optional ");
            System.out.println("The else block runs if the booleanExpression is false ");
        }

        if (x > 5) {
            y = 3;
            x = 4;
        } else {
            y = 4;
            z = 5;

        }
    }}
