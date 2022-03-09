package com.EjercicioTema5;

import java.util.List;

public interface CarCRUD {
    void save(CarCRUDImpl carCRUD);

    String findAll();

    void delete(CarCRUDImpl carCRUD);
}
