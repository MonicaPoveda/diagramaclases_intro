package org.example;

public class ProductoFisico extends Producto{
    //atributos de la clase hija
    private double peso;
    private int stock;

    public ProductoFisico() {
    }

    public ProductoFisico(String nombre, double precio, boolean disponibilidad, double peso, int stock) {
        super(nombre, precio, disponibilidad);
        this.peso = peso;
        this.stock = stock;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "ProductoFisico{" +
                "peso=" + peso +
                ", stock=" + stock +
                '}';
    }

    public void mostrarInf(){
        super.mostrarInf();
        System.out.println("Peso: " + peso);
        System.out.println("Stock: " + stock);
    }
}
