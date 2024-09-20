package model;

public class Desk extends  Furniture{
    private Double heigth;
    private Double width;

    public Double getHeigth() {
        return heigth;
    }

    public void setHeigth(Double heigth) {
        this.heigth = heigth;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Desk(Integer nStock, String name, Double price, Double heigth, Double width) {
        super(nStock, name, price);
        this.heigth = heigth;
        this.width = width;
    }

    public Desk(Integer nStock, String name, Double price) {
        super(nStock, name, price);
    }

    public String toString() {
        return super.toString() + " Altura: " + heigth + " Ancho: " + width;
    }
}
