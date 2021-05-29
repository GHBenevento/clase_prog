package practica3.clases;

public class DebitCard extends Card {
    private Integer availableBalance;

    //Constructores

    public DebitCard() {

    }

    public DebitCard(String NIF, Integer PIN, String name, String surname, Integer availableBalance) {
        super(NIF, PIN, name, surname);
        this.availableBalance = availableBalance;
        setType("DEBIT");
    }

    public DebitCard(DebitCard copyCard) {
        super(copyCard);
        this.availableBalance = copyCard.availableBalance;
    }

    //Setter y getter

    public Integer getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(Integer availableBalance) {
        this.availableBalance = availableBalance;
    }

    //Metodo

    @Override //Override del metodo showCard que proviene de la clase Card
    public void showCard() {  //Imprime los detalles del cliente especificados
        System.out.println("==========================");
        System.out.println("|    -CLIENT DETAILS-    |");
        System.out.println("==========================");
        System.out.println("Name: " + this.getName());
        System.out.println("Surname: " + this.getSurname());
        System.out.println("NIF: " + this.getNIF());
        System.out.println("Available Balance: " + this.getAvailableBalance() + " €");
        System.out.println("==========================");
    }
}
