package org.example;

public class Cliente {
    //atributos de la clase Cliente
    private String id;
    private String nombre;
    private int edad;
    private String email;

    //constructor vacio

    public Cliente() {
    }
    // constructores

    public Cliente(String id, String nombre, int edad, String email) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
    }

    //generar set y get

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //generar to string

    @Override
    public String toString() {
        return "Cliente{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", email='" + email + '\'' +
                '}';
    }

    //generar metodos
    public void mostrarinf(){
        System.out.println("nombre: " + nombre);
        System.out.println("id: " + id);
        System.out.println("Edad: " + edad);
        System.out.println("Email: " + email);
    }
}
