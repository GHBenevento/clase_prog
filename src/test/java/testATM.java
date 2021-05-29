import practica3.ATM;
import practica3.Card;
import practica3.CreditCard;

import java.util.ArrayList;

//Hice un par de pruebas para comprobar el estado del cajero al sacar dinero y para ver si se genera correctamente la id del cajero

public class testATM {

    public static void main(String[] args) {
        Card card = new CreditCard();
        ArrayList<Card> cards = new ArrayList<>();
        cards.add(card);
        int[][] b ={{500, 10}, {200, 0}, {100, 0}, {50, 30}, {20, 0}, {10, 20}, {5, 25}};
        ATM prueba = new ATM(b, cards);
        prueba.showATMBalance();
        prueba.takeMoney(595);
        int[][] c ={{500, 10}, {200, 0}, {100, 0}, {50, 30}, {20, 0}, {10, 20}, {5, 25}};
        ATM prueba2 = new ATM(c, cards);
        System.out.println(prueba2.getIdATM());
    }




}
