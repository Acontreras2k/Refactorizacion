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
public class CambiaLongitud extends Vector {

    /**
     * @return the valor
     */
    public int getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(int valor) {
        this.valor = valor;
    }


    public void modificar(int[] vector, int longitudActual, int posicion) {
        int i;
//Mostramos los elementos del array
        System.out.print("v={");
        longitud = vector.length;
        for (i = 0; i < longitud; i++) {
            System.out.print(vector[i] + ",");
        }
        System.out.println("}");
//Modificamos el array
        if (posicion < longitud) {
//mostramos su contenido
System.out.println("Elemento a modificar=" + vector[posicion]);
vector[posicion] = this.getValor();
        }
//Mostramos los elementos del array
        Visualizar(longitud, vector);
    }
    //metodo que borra el elemento de la posicion p desplazando a la izquierda todos los elementos
    public int longitud;

    public void borrar(int[] vector, int longitudActual, int posicion) {
        int i;
//mostramos su contenido
//Mostramos los elementos del array
        System.out.print("v={");
        int longitud = vector.length;
        for (i = 0; i < longitud; i++) {
            System.out.print(vector[i] + ",");
        }
        System.out.println("}");
//Borramos el elemento
        if (posicion < longitud) {
            System.out.println("Elemento a borrar=" + vector[posicion]);
            for (i = posicion; i > longitud - 1; i--) {
                //CORREGIR//
                vector[i] = vector[i + 1];
            }
        }
        Visualizar(longitud, vector);
    }
//metodo que inserta un elemento en la posicion p desplazando a la derecha todos los elementos

    public void insertar(int[] vector, int longitudActual, int posicion) {
        int i;
//mostramos su contenido
//Mostramos los elementos del array
        System.out.print("v={");
        int longitud = vector.length;
        for (i = 0; i < longitud; i++) {
            System.out.print(vector[i] + ",");
        }
        System.out.println("}");
//Borramos el elemento
        if (posicion < longitud) {
            System.out.println("Elemento a insertar=" + this.getValor());
            for (i = longitud - 1; i < posicion; i++) {
                //CORREGIR//
                vector[i] = vector[i - 1];
            }
            vector[posicion] = this.getValor();
        }
//Mostramos los elementos del array
        Visualizar(longitud, vector);
    }



}
