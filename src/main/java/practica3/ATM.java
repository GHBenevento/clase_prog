package practica3;

import java.util.ArrayList;

public class ATM {

    static Integer idLastATM = 0;
    private Integer idATM;
    private int[][] bills;
    private ArrayList<Card> cards = new ArrayList<>();

    //Constructores

    public ATM() {
    }

    public ATM(int[][] money, ArrayList<Card> cards) {
        setIdATM(++idLastATM);
        setBills(money);
        setCards(cards);
        setIdLastATM(this.idATM);
    }

    public ATM(ATM copyATM) {
        this.idATM = copyATM.idATM;
        this.bills = copyATM.bills;
        this.cards = copyATM.cards;
    }

    //Setters y getters

    public static Integer getIdLastATM() {
        return idLastATM;
    }

    public static void setIdLastATM(Integer idLastATM) {
        ATM.idLastATM = idLastATM;
    }

    public Integer getIdATM() {
        return idATM;
    }

    public void setIdATM(Integer idATM) {
        this.idATM = idATM;
    }

    public int[][] getBills() {
        return bills;
    }

    public void setBills(int[][] bills) {
        this.bills = bills;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    //Metodos

    public void showATMBalance() { // Imprime los billetes del cajero
        System.out.println("==================================");
        System.out.println("|        - ATM  BALANCE -        |");
        System.out.println("==================================");
        System.out.println("There is " + bills[0][1] + " 500 € bills");
        System.out.println("There is " + bills[1][1] + " 200 € bills");
        System.out.println("There is " + bills[2][1] + " 100 € bills");
        System.out.println("There is " + bills[3][1] + " 50 € bills");
        System.out.println("There is " + bills[4][1] + " 20 € bills");
        System.out.println("There is " + bills[5][1] + " 10 € bills");
        System.out.println("There is " + bills[6][1] + " 5 € bills");
        System.out.println("==================================");
    }

    public Integer checkATMBalance() { //Devuelve el valor exacto de dinero que queda en el cajero
        int balance = 0;
        for (int i = 0; i < this.getBills().length; i++) {
            balance += this.getBills()[i][1] * this.getBills()[i][0];
        }
        return balance;
    }

    public boolean authentication(String NIF, Integer PIN) { //Comprueba si el NIF y el PIN son correctos
        boolean authentication = false, unknownNIF = true;
        for (int i = 0; i < this.getCards().size(); i++) {
            Card ourCard = this.getCards().get(i);
            if (ourCard.getNIF().equals(NIF)) {
                unknownNIF = false;
                if (ourCard.getPIN().equals(PIN)) {
                    authentication = true;
                } else {
                    System.out.println("Incorrect PIN for NIF: " + NIF);
                }
            }
        }
        if (unknownNIF) {
            System.out.println("Unknown NIF");
        }
        return authentication;
    }

    public void takeMoney(Integer amount) { // Saca billetes del cajero y imprime que billetes se han sacado
        int cont = 0;
        int[][] bills = this.getBills();
        int[][] taken = new int[][]{{500, 0}, {200, 0}, {100, 0}, {50, 0}, {20, 0}, {10, 0}, {5, 0}};
        for (int i = 0; i < bills.length; i++) {
            for (int j = 0; j < bills[i][1]; j++) {
                if (amount > 0 && bills[i][0] <= amount) {
                    if (bills[i][1] > 0) {
                        amount = amount - bills[i][0];
                        taken[i][1] += 1;
                        cont++;
                    }
                }
            }
            this.bills[i][1] -= cont;
            cont = 0;
        }
        System.out.println("****************************");
        for (int i = 0; i < taken.length; i++) {
            if (taken[i][1] > 0) {

                System.out.println(taken[i][1] + " bills of " + taken[i][0] + " € were taken");
            }
        }
        System.out.println("****************************");
    }


}