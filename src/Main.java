import model.*;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

       OfficeProducts notebook1 = new Notebooks(3,"Monster",200.0,"adad",16);
       OfficeProducts printer1 = new Printer(4,"Style",550.0, "Epson");
       OfficeProducts chair1 = new Chair(5,"Silla de Escritorio", 32.00,true);
       OfficeProducts desk1 = new Desk(8,"Estudiantil",840.0, 180.0 ,80.0);

//        System.out.println(printer1.toString());
//        System.out.println(notebook1.toString());
//        System.out.println(chair1.toString());
//        System.out.println(desk1.toString());

        List<OfficeProducts> officeProductsArrayList = List.of(notebook1,printer1,chair1,desk1);
        officeProductsArrayList.forEach(officeProducts -> System.out.println(officeProducts.toString()));

        for (OfficeProducts product : officeProductsArrayList) {
            if (product instanceof Notebooks) {
                product.updatePrice(20);
            } else if (product instanceof Printer) {
                product.updatePrice(15);
            } else if (product instanceof Chair) {
                product.updatePrice(5);
            } else if (product instanceof Desk) {
                product.updatePrice(10);
            }
        }

    }
}


    /*La empresa nos encarga otra tarea. Nos dice que tanto las Impresoras como las Sillas se encuentran
de oferta. Y que para cada cliente se puede aplicar un descuento especial. Se debe indicar por parámetro
el porcentaje de descuento y retornar el precio del producto con el descuento aplicado. Se tendrá en
cuenta la forma en que solucionan este punto.*/
