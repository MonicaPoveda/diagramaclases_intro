package org.example;

public class ProductoDigital extends Producto {
    //Atributos de la clase hija
    private double tamanoDoc;

    public ProductoDigital() {
    }


    public ProductoDigital(String nombre, double precio, boolean disponibilidad, double tamanoDoc) {
        super(nombre, precio, disponibilidad);
        this.tamanoDoc = tamanoDoc;
    }

    public double getTamanoDoc() {
        return tamanoDoc;
    }

    public void setTamanoDoc(double tamanoDoc) {
        this.tamanoDoc = tamanoDoc;
    }

    @Override
    public String toString() {
        return "ProductoDigital{" +
                "tamanoDoc=" + tamanoDoc +
                '}';
    }
    public void mostrarinf(){
        super.mostrarInf();
        System.out.println(" Tamano del documento: " + tamanoDoc);

    }
}
