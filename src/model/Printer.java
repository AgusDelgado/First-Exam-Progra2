package model;

public class Printer extends ComputerProducts {

    private Integer numberOfPrints;

    public Integer getNumberOfPrints() {
        return numberOfPrints;
    }

    public void setNumberOfPrints(Integer numberOfPrints) {
        this.numberOfPrints = numberOfPrints;
    }

    public Printer(Integer nStock, String name, Double price, String manufacturer) {
        super(nStock, name, price, manufacturer);
        this.numberOfPrints = 0;
    }

    public Printer(Integer nStock, String name, Double price) {
        super(nStock, name, price);
    }
    public String toString() {
        return super.toString() + "Numero de impresiones : " + numberOfPrints;
    }
}
