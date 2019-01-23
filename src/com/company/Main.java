package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //
        Random random = new Random();
        long from = 1;
        long to = 10;
        int randomNumber = random.nextInt(3 + 1);
        //
        int guessedNumber = 0;

        //System.out.printf("The number is between %d and %d.\n", from , to );

        //
        do {
            System.out.println(("Guess what the number is: "));
            guessedNumber = scan.nextInt();
            if (guessedNumber > randomNumber) {
                System.out.println("Your guess is too hight!");
            } else if (guessedNumber < randomNumber) {
                System.out.println("Your guess is too low!");
            } else
                System.out.println("You got it!");
        } while (guessedNumber != randomNumber);

    }

    }

