package actividades2;

import java.util.Scanner;

public class Actividad11 {
    public static void main(String[] args) {
        System.out.println("Escribe dos numeros.");
        Scanner sc = new Scanner(System.in);
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        for (int i = 0; i < 11; i++) {
            System.out.println(Math.random() * (num1 - num2) + num2);
        }
    }
}
