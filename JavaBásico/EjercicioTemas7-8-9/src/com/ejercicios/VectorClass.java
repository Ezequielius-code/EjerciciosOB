package com.ejercicios;

import java.util.Vector;

public class VectorClass {
    //Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o
    //y 3er elemento y muestra el resultado final.
    public static void main(String[] args) {
        Vector<String> coconutVector = new Vector();
        String coconut = "coco";

        for (int i = 1; i < 6; i++) {
            coconutVector.add(coconut + i);
        }

        coconutVector.remove(1);
        coconutVector.remove(1);

        for (String coco : coconutVector) {
            System.out.println("Remaining coconuts: " + coco);
        }
    }
}

    //Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si
    // tuviésemos 1000 elementos para ser añadidos al mismo.

    /*
    * Para poder indicar el problema propuesto, primero hace falta entender qué es un Vector.
    * Se puede decir que un vector es similar a un array, con la diferencia de que el vector
    * es de tamaño dinámico. Es decir, tiene la capacidad de expandirse de acuerdo a nuestra
    * necesidad de almacenamiento. Con esta noción básica, abordemos el problema:
    * El vector tiene por defecto una capacidad de 10 espacios, al pedirle más espacios, el
    * vector no se amplía verdaderamente sino que lo que ocurre internamente, es que el vector
    * se copia y se duplica generando un vector de mayor capacidad (10 espacios más, por defecto)
    * esto implica un uso muy grande de recursos, tanto de procesamiento como de memoria.
    * A partir de esto, se entiende que si tenemos que añadir 1000 elementos a un vector por
    * defecto, generaríamos este proceso tan costoso para nuestros recursos unas 100 veces.
     */