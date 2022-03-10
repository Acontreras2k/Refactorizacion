/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactorizacion;

/**
 *
 * @author Diurno
 */
public class Prueba {

    public int valor;
//metodo que modifica el contenido de la posicion p de un array con el valor pasado

    public void modificar(int[] vector) {
        int i;
        int posicion = 1;
//Mostramos los elementos del array
        System.out.print("v={");
        for (i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + ",");
        }
        System.out.println("}");
//Modificamos el array
        if (posicion < vector.length) {
            ModificaElemento(vector, posicion);
        }
//Mostramos los elementos del array
        System.out.print("v={");
        for (i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + ",");
        }
        System.out.println("}");
    }
    //metodo que borra el elemento de la posicion p desplazando a la izquierda todos los elementos

    public void borrar(int[] vector) {
        int posicion = 1, i;
//mostramos su contenido
//Mostramos los elementos del array
        System.out.print("v={");
        for (i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + ",");
        }
        System.out.println("}");
//Borramos el elemento
        if (posicion < vector.length) {
            BorraElemento(vector, posicion, i);
        }
//Mostramos los elementos del array
        System.out.print("v={");
        for (i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + ",");
        }
        System.out.println("}");
    }
//metodo que inserta un elemento en la posicion p desplazando a la derecha todos los elementos

    public void insertar(int[] vector) {
        int posicion = 1, i;
//mostramos su contenido
//Mostramos los elementos del array
        System.out.print("v={");
        for (i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + ",");
        }
        System.out.println("}");
//Borramos el elemento
        if (posicion < vector.length) {
            InsertaElemento(i, vector, posicion);
        }
//Mostramos los elementos del array
        System.out.print("v={");
        for (i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + ",");
        }
        System.out.println("}");
    }

    void BorraElemento(int[] vector, int posicion, int i) {
        System.out.println("Elemento a borrar=" + vector[posicion]);
        for (i = posicion; i > vector.length - 1; i--) {   //CORREGIR//
            vector[i] = vector[i + 1];
        }
    }

    void InsertaElemento(int i, int[] vector, int posicion) {
        System.out.println("Elemento a insertar=" + this.valor);
        for (i = vector.length - 1; i < posicion; i++) { //CORREGIR//
            vector[i] = vector[i - 1];
        }
        vector[posicion] = this.valor;
    }

    void ModificaElemento(int[] vector, int posicion) {
//mostramos su contenido
        System.out.println("Elemento a modificar=" + vector[posicion]);
        vector[posicion] = this.valor;
    }
}
