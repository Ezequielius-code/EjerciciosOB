package com.EjercicioTema5;

public class CarCRUDImpl implements CarCRUD{
    public CarCRUDImpl() {
    }


    @Override
    public void save(CarCRUDImpl carCRUD) {
        System.out.println("Save");
    }

    @Override
    public String findAll() {
        return "Find All";
    }

    @Override
    public void delete(CarCRUDImpl carCRUD) {
        System.out.println("Delete");
    }
}
