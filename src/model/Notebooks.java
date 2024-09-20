package model;

public class Notebooks extends ComputerProducts {

    private Integer memory;

    public Integer getMemory() {
        return memory;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
    }


    public Notebooks(Integer nStock, String name, Double price, String manufacturer, Integer memory) {
        super(nStock, name, price, manufacturer);
        this.memory = memory;
    }

    public Notebooks(Integer nStock, String name, Double price) {
        super(nStock, name, price);
    }

    public String toString() {
        return super.toString() + "La Memoria  de la Notebook en GB es de: " + memory ;
    }

}
