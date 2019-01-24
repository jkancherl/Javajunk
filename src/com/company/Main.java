package com.company;
/*
John K
1/24/2019
 */
import javax.xml.bind.SchemaOutputResolver;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

//        String myAnswer = scan.next();

        //
        Random random = new Random();
        long from = 1;
        long to = 10;
        int randomNumber = random.nextInt(2 + 1);
        //
        int guessedNumber = 0;

        //
        System.out.printf("The number is between %d and %d.\n", from , to );

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

        System.out.println("What is your firstInitial?");
        String firstInitial = scan.next();
        System.out.println("What is your lastName ?");
        String lastName = scan.next();
        System.out.println("What is your houseNumber ?");
        String houseNumber = scan.next();
        System.out.println("What is your Street Name?");
        String streetName = scan.next();
        scan.nextLine();
        System.out.println("What is your Street Type?");
        String streetType = scan.nextLine();
//        scan.nextLine();
        System.out.println("What is the name of your City?");
        String city = scan.nextLine();




        System.out.print(firstInitial + "is my initials " + lastName + " is living at " + houseNumber + "crazy");
        System.out.println(streetName + streetType + " City is " + city);
    }

    }

