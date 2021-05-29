package practica3.main;

import practica3.clases.ATM;
import practica3.clases.Card;
import practica3.clases.CreditCard;
import practica3.clases.DebitCard;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    //Atributos estaticos

    static Scanner sc = new Scanner(System.in);
    static int op;
    static CreditCard cred;
    static DebitCard deb;
    static ATM myATM;
    static ArrayList<Card> cards;

    //Metodo main

    public static void main(String[] args) {

        cards = new ArrayList<>();
        cred = new CreditCard("X3017271Q", 1234, "Georgie", "Benevento", 40, 100);
        deb = new DebitCard("X3017271Y", 5678, "Georgie", "Benevento", 10000);
        cards.add(cred);
        cards.add(deb);
        int[][] bills = {{500, 10}, {200, 0}, {100, 0}, {50, 30}, {20, 0}, {10, 20}, {5, 25}};
        myATM = new ATM(bills, cards);

        System.out.println("================");
        System.out.println("||  WELCOME!  ||");
        System.out.println("================");
        cred.showCard();
        deb.showCard();
        myATM.showATMBalance();
        menu();

        while (op == 1) {
            withdrawMoney(myATM);
            menu();
        }

        System.out.println("=========================================");
        System.out.println("Goodbye, thank you for visiting this ATM.");
        System.out.println("=========================================");
    }

    //Metodos estaticos

    static void menu() { //imprime el menu al usuario y espera una respuesta
        System.out.println("**************************************");
        System.out.println("Press 1 to withdraw money ");
        System.out.println("Press any other number to exit the ATM");
        System.out.println("**************************************");
        op = sc.nextInt();
        sc.nextLine();
    }

    static void withdrawMoney(ATM atm) { //Metodo que se ejecuta al seleccionar la opcion 1 del menu, metodo "sacarDinero()"
        System.out.println("Please enter your NIF: ");
        String NIF = sc.nextLine();
        System.out.println("Please enter your PIN: ");
        Integer PIN = sc.nextInt();

        if (atm.authentication(NIF, PIN)) {
            System.out.println("PIN entry succeeded!");
            System.out.println(" ");
            System.out.println("Enter the amount you would like to withdraw: ");

            Integer amount = sc.nextInt();
            sc.nextLine();

            if (atm.checkATMBalance() > amount) {

                for (int i = 0; i < atm.getCards().size(); i++) {
                    Card tempCard = atm.getCards().get(i);

                    if (tempCard.getNIF().equals(NIF)) {

                        if (tempCard.getType().equals("DEBIT")) {

                            if (deb.getAvailableBalance() > amount) {
                                atm.takeMoney(amount);
                                deb.setAvailableBalance(deb.getAvailableBalance() - amount);

                                System.out.println("==========================");
                                System.out.println("** UPDATED:  DEBIT CARD **");
                                deb.showCard();
                                System.out.println("==============================");
                                System.out.println("**** UPDATED: ATM BALANCE ****");
                                myATM.showATMBalance();
                            } else {
                                System.out.println(" ");
                                System.out.println("I'm sorry, that's more than your balance.");
                            }
                        } else {

                            if (cred.totalAvailable() > amount) {
                                atm.takeMoney(amount);

                                if (cred.getAvailableBalance() < amount) {
                                    cred.setAvailableCredit(cred.getAvailableCredit() + cred.getAvailableBalance() - amount);
                                    cred.setAvailableBalance(0);

                                } else {
                                    cred.setAvailableBalance(cred.getAvailableBalance() - amount);
                                }
                                System.out.println("==========================");
                                System.out.println("** UPDATED: CREDIT CARD **");
                                cred.showCard();
                                System.out.println("==============================");
                                System.out.println("**** UPDATED: ATM BALANCE ****");
                                myATM.showATMBalance();
                            } else {
                                System.out.println(" ");
                                System.out.println("I'm sorry, that's more than your balance and credit combined.");
                            }
                        }
                    }
                }
            } else {
                System.out.println("***************************");
                System.out.println("Not enough money in the ATM");
                System.out.println(" ");
                System.out.println("The ATM currently has: " + atm.checkATMBalance() + " €");
            }

        }
        System.out.println(" ");
        System.out.println("*** Returning to main menu ***");
        System.out.println(" ");
    }
}

