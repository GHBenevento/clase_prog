package actividades2;

import java.util.Scanner;

public class Actividad7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Esbribe la cantidad de productos.");
        int numb = sc.nextInt();
        float cont = 0;
        for (int i = 1; i < numb + 1; i++) {
            System.out.println("Escribe el precio del producto numero " + i);
            float price = sc.nextFloat();
            cont = cont + price;
        }
        System.out.println("El precio total es " + cont);
    }
}
