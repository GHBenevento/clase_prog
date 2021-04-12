package actividades2;

import java.util.Scanner;

import static java.lang.Float.parseFloat;
import static java.lang.Integer.parseInt;

public class Actividad7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Esbribe la cantidad de productos.");
        String number = sc.nextLine();
        int numb = parseInt(number);
        float cont = 0;
        for (int i = 1; i < numb+1 ; i++) {
            System.out.println("Escribe el precio del producto numero "+i);
            String price = sc.nextLine();
            float precio = parseFloat(price);
            cont = cont + precio;
        }
        System.out.println("El prcio total es "+cont);
    }
}
