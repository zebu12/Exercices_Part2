package se.lexicon;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Scanner
        Scanner scanner = new Scanner(System.in);

        /*
         * 1. Write a Java program to print 'Hello' on screen and then print your name on
         * a separate line.
         */
        System.out.println("Hello \nJean-Pierre!");
        System.out.println("-------------------------------------------------------------------------");

        /*
         * 2. Create a program that takes a year as input from user and print if it’s leap
         * year or not.
         */
        System.out.println("Please enter a year: ");
        int year = scanner.nextInt();

        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " is a leap year");
        } else if (year % 4 == 0 && year % 100 == 0) {
            if (year % 400 == 0) {
                System.out.println(year + " is a leap year");
            } else {
                System.out.println(year + " is not a leap year");
            }
        } else {
            System.out.println(year + " is not a leap year");
        }
        System.out.println("-------------------------------------------------------------------------");

        /*
         * 3.Write a Java program to print the sum/multiplication/division and
         * subtraction of two numbers
         * Expected result:
         * 45 + 11 = 56
         * 12 * 4 = 48
         * 24 / 6 = 4
         * 55 – 12 = 43
         */

        int firstValue = 45;
        int secondValue = 11;
        int sum = firstValue + secondValue;
        System.out.println("The sum is: " + sum);
        System.out.println("-------------------------------------------------------------------------");

        firstValue = 12;
        secondValue = 4;
        int resultOfMultiplication = firstValue * secondValue;
        System.out.println("The result is: " + resultOfMultiplication);
        System.out.println("-------------------------------------------------------------------------");

        firstValue = 24;
        secondValue = 6;
        double quotientOfDivision = (double) firstValue / secondValue;
        System.out.println("The quotient is: " + quotientOfDivision);
        System.out.println("-------------------------------------------------------------------------");

        firstValue = 55;
        secondValue = 12;
        int difference = firstValue - secondValue;
        System.out.println("The difference is: " + difference);
        System.out.println("-------------------------------------------------------------------------");

        /*
         * 4.Write a Java program that prints the average of three numbers
         * Expected result:
         * (23 + 11 + 77) / 3 = 37
         */
        int number1 = 23;
        int number2 = 11;
        int number3 = 77;
        int average = (number1 + number2 + number3) / 3;
        System.out.println("The average of three numbers is: " + average);
        System.out.println("-------------------------------------------------------------------------");


        /*
         * 5.Create a program that asks user to input his/her name and store it in a
         * variable instead of having fixed name. Then print ‘Hello username’ where
         * username is what you got from user as input.
         */
        System.out.println("Please enter your username: ");
        String username = scanner.next();
        System.out.println("Hello " + username );
        System.out.println("-------------------------------------------------------------------------");


        /*
         * 6.Create a program that asks user to input two numbers and print the
         * sum/multiplication/division and subtraction of given numbers
         */
        System.out.println("Please enter your first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Please enter your second number: ");
        int secondNumber = scanner.nextInt();
        int sum1 = firstNumber + secondNumber;
        System.out.println("The sum is: " + sum1);
        int resultOfMultiplication1 = firstNumber * secondNumber;
        System.out.println("The result is: " + resultOfMultiplication1);
        double quotientOfDivision1 = (double) firstNumber / secondNumber;
        System.out.println("The quotient is: " + quotientOfDivision1);
        int difference1 = firstNumber - secondNumber;
        System.out.println("The difference is: " + difference1);
        System.out.println("-------------------------------------------------------------------------");


        /*
         * 7.Create a program that converts seconds to hours, minutes and seconds
         * Input seconds: 86399
         * Expected output:
         * 23:59:59
         */

        System.out.println("Please enter hours in seconds: ");
        int seconds = scanner.nextInt();
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int seconds2 = seconds % 60;
        System.out.printf("%02d:%02d:%02d%n", hours, minutes, seconds2);

        System.out.println("-------------------------------------------------------------------------");

        /*
         * 8.Write a program that first generates a random number between 1 and 500
         * and stores it into a variable (see the Random class). Then let the user make a
         * guess for which number it is. If the user types the correct number, he should be
         * presented with a message (including the number of guesses he has made). If he
         * types a number that is greater or smaller than the given number, display either
         * “Your guess was too small” or “Your guess was too big”. The program should
         * keep executing until the user input the correct guess.
         */
        int randomNumber = (int) (Math.random() * 1 * 50);
        System.out.println("Please enter a number between 1 and 50: ");
        int guessNumber = scanner.nextInt();

        if (guessNumber == randomNumber) {
            System.out.println("You guessed it right: " + randomNumber);
        } else if (guessNumber > randomNumber) {
            System.out.println("Your guess was too big: " + randomNumber);
        } else
            System.out.println("Your guess was too small: " + randomNumber);

        System.out.println("-------------------------------------------------------------------------");

        scanner.close();
    }
}
