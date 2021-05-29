package practica3;

public class CreditCard extends Card {
    private Integer availableBalance;
    private Integer availableCredit;

    //Constructores

    public CreditCard() {

    }

    public CreditCard(String NIF, Integer PIN, String name, String surname, Integer availableBalance, Integer availableCredit) {
        setNIF(NIF);
        setPIN(PIN);
        setName(name);
        setSurname(surname);
        setActive(true);
        this.availableBalance = availableBalance;
        this.availableCredit = availableCredit;
        setType("CREDIT");
    }

    public CreditCard(CreditCard copyCard) {
        setNIF(copyCard.getNIF());
        setPIN(copyCard.getPIN());
        setName(copyCard.getName());
        setSurname(copyCard.getSurname());
        setActive(copyCard.isActive());
        setType(copyCard.getType());
        this.availableBalance = copyCard.availableBalance;
        this.availableCredit = copyCard.availableCredit;
    }

    //Setters y getters

    public Integer getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(Integer availableBalance) {
        this.availableBalance = availableBalance;
    }

    public Integer getAvailableCredit() {
        return availableCredit;
    }

    public void setAvailableCredit(Integer availableCredit) {
        this.availableCredit = availableCredit;
    }

    //Metodos

    @Override //Override del metodo showCard que proviene de la clase Card
    public void showCard() { //Imprime los detalles del cliente especificados
        System.out.println("==========================");
        System.out.println("|    -CLIENT DETAILS-    |");
        System.out.println("==========================");
        System.out.println("Name: " + this.getName());
        System.out.println("Surname: " + this.getSurname());
        System.out.println("NIF: " + this.getNIF());
        System.out.println("Available Credit: " + this.getAvailableCredit());
        System.out.println("Available Balance: " + this.getAvailableBalance());
        System.out.println("==========================");

    }

    public int totalAvailable() { //Devuelve el saldo + el credito
        return (this.availableBalance + this.availableCredit);
    }
}
