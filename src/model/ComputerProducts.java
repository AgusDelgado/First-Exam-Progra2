package model;

public abstract class  ComputerProducts extends OfficeProducts{

    protected String manufacturer;

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public ComputerProducts(Integer nStock, String name, Double price, String manufacturer) {
        super(nStock, name, price);
        this.manufacturer = manufacturer;
    }

    public ComputerProducts(Integer nStock, String name, Double price) {
        super(nStock, name, price);
    }
    public String toString() {
        return super.toString() + " Fabricante: " + manufacturer;
    }
}
