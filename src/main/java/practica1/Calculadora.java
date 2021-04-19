package practica1;

import java.util.Scanner;

public class Calculadora {

    static Scanner input = new Scanner(System.in);
    static Scanner again = new Scanner(System.in);

    static String input() { //Prints menu and takes the user input and sends it to operation method
        System.out.println("----------------------------------------------------");
        System.out.println("||  What type of operation would you like to do?  ||");
        System.out.println("||------------------------------------------------||");
        System.out.println("||      Enter '+' to summ two numbers             ||");
        System.out.println("||      Enter '-' to subtract two numbers         ||");
        System.out.println("||      Enter '*' to multiply two numbers         ||");
        System.out.println("||      Enter '/' to divide two numbers           ||");
        System.out.println("|| Enter '%' to get the remainder of two numbers  ||");
        System.out.println("----------------------------------------------------");
        String symbol = again.nextLine();
        System.out.println("||           Now write the first number:          ||");
        double num1 = input.nextDouble();
        System.out.println("||           Now write the second number:         ||");
        double num2 = input.nextDouble();
        return operation(symbol, num1, num2);
    }

    static String operation(String op, double num1, double num2) { //Method that calculates the operation and returns it in a String.
        return switch (op) {
            case "+" -> "     The summ of " + num1 + " and " + num2 + " is " + (num1 + num2);
            case "-" -> "     The subtraction of " + num1 + " and " + num2 + " is " + (num1 - num2);
            case "*" -> "     The multiplication of " + num1 + " and " + num2 + " is " + (num1 * num2);
            case "/" -> "     The division of " + num1 + " and " + num2 + " is " + (num1 / num2);
            case "%" -> "     The remainder of " + num1 + " and " + num2 + " is " + (num1 % num2);
            default -> "                  Invalid option";
        };
    }

    static String again() { //Method that asks if the user wants to do another operation and returns y or x
        System.out.println("----------------------------------------------------");
        System.out.println("||     Would you like to do another operation?    ||");
        System.out.println("||------------------------------------------------||");
        System.out.println("||       Press 'y' to do another operation        ||");
        System.out.println("||       Enter 'x' to leave the calculator        ||");
        System.out.println("----------------------------------------------------");
        return again.nextLine();
    }

    public static void main(String[] args) {
        System.out.println("----------------------------------------------------");
        System.out.println("||         Welcome to your new calculator!        ||");
        System.out.println("----------------------------------------------------");
        String continuar = "y";
        int counter = 0;
        while (!continuar.equals("x")) { //Will keep going until the user input's the letter x
            String answer = Calculadora.input(); //Calculates the operation and puts it in a String
            System.out.println("----------------------------------------------------");
            System.out.println(answer); //Print String with answer
            System.out.println("----------------------------------------------------");
            if (!answer.equals("Invalid option")) { //Counts how many time you use calculator correctly.
                counter++;
            }
            continuar = Calculadora.again(); //Check if user wants to continue
        }
        System.out.println("----------------------------------------------------");
        System.out.println("|| You have used the calculator correctly " + (counter) + " times.||");
        System.out.println("||                  Goodbye!                      ||");
        System.out.println("----------------------------------------------------");
    }
}
