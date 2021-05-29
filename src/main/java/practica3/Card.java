package practica3;

public abstract class Card {
    private String NIF;
    private Integer PIN;
    private String name;
    private String surname;
    private boolean isActive;
    private String type; //He puesto el atributo "type" para poder reconocer si la tarjeta es de debito o credito desde el listado de trajets del cajero.

    //Constructores

    public Card() {
    }

    public Card(String NIF, Integer PIN, String name, String surname, String type) {
        this.NIF = NIF;
        this.PIN = PIN;
        this.name = name;
        this.surname = surname;
        this.isActive = true;
        this.type = type;
    }

    public Card(Card copyCard){
        setNIF(copyCard.getNIF());
        setPIN(copyCard.getPIN());
        setName(copyCard.getName());
        setSurname(copyCard.getSurname());
        setActive(copyCard.isActive());
        setType(copyCard.getType());
    }

    //Setters y getters

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public Integer getPIN() {
        return PIN;
    }

    public void setPIN(Integer PIN) {
        this.PIN = PIN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    //Metodo

    public void showCard() { //Imprime los detalles del cliente especificados
        System.out.println("==========================");
        System.out.println("|    -CLIENT DETAILS-    |");
        System.out.println("==========================");
        System.out.println("Name: " + this.name);
        System.out.println("Surname: " + this.surname);
        System.out.println("NIF: " + this.NIF);
        System.out.println("==========================");
    }
}
