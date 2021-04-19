package actividades1;

import java.util.Scanner;

public class Actividad6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write a number: ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("Es divisible por 2");
        } else {
            System.out.println("No es divisible por 2");
        }

    }

}
