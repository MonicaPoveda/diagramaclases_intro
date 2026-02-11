package org.example;
public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE COMPRAS ===");

        // se crea objetos productos fisicos usando constructor vacio
        ProductoFisico producto1 = new ProductoFisico();
        producto1.setNombre("Laptop Dell XPS 15");
        producto1.setPrecio(1299.99);
        producto1.setDisponibilidad(true);
        producto1.setPeso(2.5);
        producto1.setStock(10);

        // se crea objetos producto fisico usando constructor con parametros
        ProductoFisico producto2 = new ProductoFisico("Teclado mecanico RGB", 89.99, true, 0.8, 25
        );
//-----------------------------------------------------------------------------
        // se crea objeto producto digital usando constructor vacio
        ProductoDigital producto3 = new ProductoDigital();
        producto3.setNombre("Curso de Java Avanzado");
        producto3.setPrecio(49.99);
        producto3.setDisponibilidad(true);
        producto3.setTamanoDoc(2500.5);

        // se crea objeto  producto digital usando constructor con parametros
        ProductoDigital producto4 = new ProductoDigital("eBook: Programacion Orientada a Objetos", 29.99, false, 15.3
        );

        // se muestra informacion de los productos
        System.out.println("--- CATALOGO DE PRODUCTOS ---");
        producto1.mostrarInf();
        System.out.println("-----------------------------------");
        producto2.mostrarInf();
        System.out.println("-----------------------------------");
        producto3.mostrarinf();
        System.out.println("-----------------------------------");
        producto4.mostrarinf();

        // se crea objetos clientes usando constructor vacio
        Cliente cliente1 = new Cliente();
        cliente1.setId("1254111");
        cliente1.setNombre("Maria Gonzalez");
        cliente1.setEdad(28);
        cliente1.setEmail("mariagonzalez@gmail.com");

        // se crea cliente usando constructor con parametros
        Cliente cliente2 = new Cliente("1255402", "Carlos Ramirez", 35, "carlosramirez@gmail.com");

        // se muestran todos los clientes
        System.out.println("--- CLIENTES REGISTRADOS ---");
        System.out.println(cliente1.toString());
        System.out.println(cliente2.toString());
        System.out.println();



    }
}