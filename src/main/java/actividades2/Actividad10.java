package actividades2;

import java.util.Scanner;

public class Actividad10 {
    public static void main(String[] args) {
        System.out.println("Escribe un dia de la semana.");
        Scanner sc = new Scanner(System.in);
        String day = sc.nextLine();
        switch (day){
            case("lunes"):
                System.out.println("Lunes es un dia laboral");
                break;
            case("martes"):
                System.out.println("Martes es un dia laboral");
                break;
            case("miercoles"):
                System.out.println("Miercoles es un dia laboral");
                break;
            case("jueves"):
                System.out.println("Jueves es un dia laboral");
                break;
            case("viernes"):
                System.out.println("Viernes es un dia laboral");
                break;
            case("sabado"):
                System.out.println("Sabado no es un dia laboral");
                break;
            case("domingo"):
                System.out.println("Domingo no es un dia laboral");
                break;
            default:
                System.out.println("Eso no es un dia de la semana");
                break;
        }
    }
}
