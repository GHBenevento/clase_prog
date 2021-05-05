package practica2;

import java.util.Arrays;
import java.util.Scanner;

public class Methods {

    static Scanner sc = new Scanner(System.in);
    static int op;
    static double[] arr = new double[5];
    static double countPos, countNeg;
    static int countZero;

    static void option() {
        System.out.println("____________________");
        System.out.println("| Select an option |");
        System.out.println("_________________________________________________________________");
        System.out.println("| 1 : Save 5 numbers in an array.                               |");
        System.out.println("| 2 : Save 5 numbers in an array but backwards.                 |");
        System.out.println("| 3 : Analyze the value of 5 numbers.                           |");
        System.out.println("| 4 : Count the amount of characters in a string.               |");
        System.out.println("| 5 : Print a string backwards.                                 |");
        System.out.println("| 6 : Print a string without any spaces.                        |");
        System.out.println("| 7 : Concatenate 2 strings.                                    |");
        System.out.println("| 8 : Replace all the vowels in a string with one specific one. |");
        System.out.println("| 9 : Print the ascii code of each character of a string.       |");
        System.out.println("| 0 : To leave the program.                                     |");
        System.out.println("_________________________________________________________________");
        op = sc.nextInt();
        sc.nextLine();
    }

    static void saveArray(double num, int i) {
        arr[i] = num;
    }

    static void reverseArray(double num, int i) {
        arr[(4 - i)] = num;
    }

    static void analyzeNumbers(double[] arr) {
        countPos = 0;
        countNeg = 0;
        countZero = 0;
        double positive = 0;
        double negative = 0;
        double num;
        for (int i = 0; i < 5; i++) {
            num = arr[i];
            if (num > 0) {
                countPos++;
                positive = positive + num;
            } else if (num < 0) {
                countNeg++;
                negative = negative + num;
            } else {
                countZero++;
            }
        }
        if (countPos != 0) {
            countPos = positive / countPos;
        }
        if (countNeg != 0) {
            countNeg = negative / countNeg;
        }

    }

    static int countCharacters(String text) {
        return text.replace(" ", "").length();
    }

    static char[] reverseText(String text) {
        char[] cArr = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            cArr[(text.length() - 1) - i] = text.charAt(i);
        }
        return cArr;
    }

    static String removeSpace(String text) {
        return text.replace(" ", "");
    }

    static String concat(String text1, String text2) {
        return (text1 + text2);
    }

    static void changeVowel(String text, String vowel) {
        System.out.println("______________________________________________");
        System.out.println("Here is your string with the vowels replaced :");
        System.out.println(text.replaceAll("[aeiou]", vowel));
        System.out.println("______________________________________________");
    }

    static void ascii(String text) {
        int[] iArr = new int[text.length()];
        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);
            iArr[i] = character;
        }
        System.out.println("__________________________");
        System.out.println("Here are the ascii codes :");
        System.out.println(Arrays.toString(iArr));
        System.out.println("__________________________");
    }

    public static void main(String[] args) {
        System.out.println("Welcome!");
        option();
        while (op != 0) {
            switch (op) {
                case (1) -> {
                    System.out.println("Write 5 numbers and I will save them in an array and print it :");
                    for (int i = 0; i < 5; i++) {
                        System.out.println("Number " + (i + 1) + " :");
                        double num = sc.nextDouble();
                        saveArray(num, i);
                    }
                    System.out.println("________________________________________");
                    System.out.println("Here is the array with your 5 numbers:");
                    System.out.println(Arrays.toString(arr));
                    System.out.println("________________________________________");
                }
                case (2) -> {
                    System.out.println("Write 5 numbers and I will save them in an array but in reverse order and print it :");
                    for (int i = 0; i < 5; i++) {
                        System.out.println("Number " + (i + 1) + " :");
                        double num = sc.nextDouble();
                        reverseArray(num, i);
                    }
                    System.out.println("________________________________________________________");
                    System.out.println("Here is the array with your 5 numbers but in reverse: ");
                    System.out.println(Arrays.toString(arr));
                    System.out.println("________________________________________________________");
                }
                case (3) -> {
                    System.out.println("Write 5 numbers and I will tell you the average of the positive numbers, the average of the negative numbers and the amount of 0's you wrote :");
                    for (int i = 0; i < 5; i++) {
                        System.out.println("Number " + (i + 1) + " :");
                        double num = sc.nextDouble();
                        saveArray(num, i);
                    }
                    analyzeNumbers(arr);
                    System.out.println("____________________________________________________________________");
                    System.out.println("These are the numbers you wrote : " + Arrays.toString(arr));
                    System.out.println("____________________________________________________________________");
                    System.out.println("The average of the positive numbers is " + (countPos));
                    System.out.println("The average of the negative numbers is " + (countNeg));
                    System.out.println("The amount of times you wrote the number 0 is : " + (countZero));
                    System.out.println("____________________________________________________________________");
                }
                case (4) -> {
                    System.out.println("Write a string and I will tell you how many characters it contains (without the white spaces) : ");
                    int characters = countCharacters(sc.nextLine());
                    System.out.println("___________________________________________________");
                    System.out.println(" The amount of characters in the string is " + characters);
                    System.out.println("___________________________________________________");
                }
                case (5) -> {
                    System.out.println("Write a string and I will print it in reverse :");
                    String text = sc.nextLine();
                    System.out.println("________________________________");
                    System.out.println("This is your string in reverse :");
                    System.out.println(String.valueOf(reverseText(text)));
                    System.out.println("________________________________");
                }
                case (6) -> {
                    System.out.println("Write a string and I will print it without any white spaces :");
                    String text = sc.nextLine();
                    System.out.println("______________________________________________");
                    System.out.println("This is your string without any white spaces :");
                    System.out.println(removeSpace(text));
                    System.out.println("______________________________________________");
                }
                case (7) -> {
                    System.out.println("Write 2 strings and I will print them concatenated");
                    System.out.println("Write the first string :");
                    String text1 = sc.nextLine();
                    System.out.println("Write the second string :");
                    String text2 = sc.next();
                    System.out.println("________________________________________");
                    System.out.println("Here are your two strings concatenated :");
                    System.out.println(concat(text1, text2));
                    System.out.println("________________________________________");
                }
                case (8) -> {
                    System.out.println("Write a string and I will replace all the vowels for one of your choice and print it");
                    System.out.println("Write the string :");
                    String text = sc.nextLine();
                    System.out.println("Write a vowel :");
                    String vowel = sc.next();
                    changeVowel(text, vowel);
                }
                case (9) -> {
                    System.out.println("Write a string and I will print each characters ascii code :");
                    String text = sc.nextLine();
                    ascii(text);
                }
                default -> throw new IllegalStateException("Unexpected value: " + op);
            }
            option();
        }
        System.out.println("______________________________");
        System.out.println("Goodbye, thank you for coming!");
        System.out.println("______________________________");
    }
}
