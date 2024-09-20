package model;

public abstract class OfficeProducts {

    protected Integer nStock;
    protected String name;
    protected Double price;

    public Integer getnStock() {
        return nStock;
    }

    public void setnStock(Integer nStock) {
        this.nStock = nStock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public OfficeProducts(Integer nStock, String name, Double price) {
        this.nStock = nStock;
        this.name = name;
        this.price = price;
    }
    public void updatePrice(double percentage) {
        this.price += this.price * (percentage / 100);
    }
    public String toString() {
        return "Nombre del Producto: " + getName() + " Precio: " + getPrice() + " Stock: " + getnStock();
    }
}
