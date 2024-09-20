package model;

public class Chair extends Furniture {

    private boolean wheel;

    public boolean isWheel() {
        return wheel;
    }

    public void setWheel(boolean wheel) {
        this.wheel = wheel;
    }


    public Chair(Integer nStock, String name, Double price, Boolean wheel) {
        super(nStock, name, price);
        this.wheel = true;
    }
    public String toString() {
        return super.toString() + " Tiene ruedas: " + wheel;
    }
}
