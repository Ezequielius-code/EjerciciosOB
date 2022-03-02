package com.company;

public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente(45, "Eduardo", "+34 860 45 68 76", 1059.78);
        System.out.println("Cliente: " + cliente.getNombre() + " Edad: " + cliente.getEdad() +
                           " Número de teléfono: " + cliente.getNumeroTelefono() + " Crédito: \u20ac " +
                           cliente.getCredito() + ".-\n");

        Trabajador trabajador = new Trabajador( 28, "Sebastián", "+34 962 36 89 66", 2355.89);
        System.out.println("Trabajador: " + trabajador.getNombre() + " Edad: " + trabajador.getEdad() +
                           " Número de teléfono: " + trabajador.getNumeroTelefono() + " Salario: \u20ac " +
                           trabajador.getSalario() + ".-");
    }
}

class Persona {
    int edad;
    String nombre;
    String numeroTelefono;

    public Persona(int edad, String nombre, String numeroTelefono) {
        this.edad = edad;
        this.nombre = nombre;
        this.numeroTelefono = numeroTelefono;
    }

    public int getEdad() {
        return this.edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getNumeroTelefono() {
        return this.numeroTelefono;
    }
}

class Cliente extends Persona {
    double credito;

    public Cliente(int edad, String nombre, String numeroTelefono, double credito) {
        super(edad, nombre, numeroTelefono);
        this.credito = credito;
    }

    public double getCredito() {
        return this.credito;
    }
}

class Trabajador extends Persona {
    double salario;

    public Trabajador(int edad, String nombre, String numeroTelefono, double salario) {
        super(edad, nombre, numeroTelefono);
        this.salario = salario;
    }

    public double getSalario() {
        return this.salario;
    }
}