package com.EjercicioTema5;

public class Main {

    public static void main(String[] args) {
        CarCRUD carCRUD = new CarCRUDImpl();

        carCRUD.save((CarCRUDImpl) carCRUD);
        System.out.println(carCRUD.findAll());
        carCRUD.delete((CarCRUDImpl) carCRUD);
    }
}
