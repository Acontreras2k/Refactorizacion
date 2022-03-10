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

    public int va;
//metodo que modifica el contenido de la posicion p de un array con el valor pasado

    public void mo(int[] v) {
        int i;
        int p = 1;
//Mostramos los elementos del array
        System.out.print("v={");
        for (i = 0; i < v.length; i++) {
            System.out.print(v[i] + ",");
        }
        System.out.println("}");
//Modificamos el array
        if (p < v.length) {
            ModificaElemento(v, p);
        }
//Mostramos los elementos del array
        System.out.print("v={");
        for (i = 0; i < v.length; i++) {
            System.out.print(v[i] + ",");
        }
        System.out.println("}");
    }
    //metodo que borra el elemento de la posicion p desplazando a la izquierda todos los elementos

    public void bo(int[] v) {
        int p = 1, i;
//mostramos su contenido
//Mostramos los elementos del array
        System.out.print("v={");
        for (i = 0; i < v.length; i++) {
            System.out.print(v[i] + ",");
        }
        System.out.println("}");
//Borramos el elemento
        if (p < v.length) {
            BorraElemento(v, p, i);
        }
//Mostramos los elementos del array
        System.out.print("v={");
        for (i = 0; i < v.length; i++) {
            System.out.print(v[i] + ",");
        }
        System.out.println("}");
    }
//metodo que inserta un elemento en la posicion p desplazando a la derecha todos los elementos

    public void in(int[] v) {
        int p = 1, i;
//mostramos su contenido
//Mostramos los elementos del array
        System.out.print("v={");
        for (i = 0; i < v.length; i++) {
            System.out.print(v[i] + ",");
        }
        System.out.println("}");
//Borramos el elemento
        if (p < v.length) {
            InsertaElemento(i, v, p);
        }
//Mostramos los elementos del array
        System.out.print("v={");
        for (i = 0; i < v.length; i++) {
            System.out.print(v[i] + ",");
        }
        System.out.println("}");
    }

    void BorraElemento(int[] v, int p, int i) {
        System.out.println("Elemento a borrar=" + v[p]);
        for (i = p; i > v.length - 1; i--) {   //CORREGIR//
            v[i] = v[i + 1];
        }
    }

    void InsertaElemento(int i, int[] v, int p) {
        System.out.println("Elemento a insertar=" + this.va);
        for (i = v.length - 1; i < p; i++) { //CORREGIR//
            v[i] = v[i - 1];
        }
        v[p] = this.va;
    }

    void ModificaElemento(int[] v, int p) {
//mostramos su contenido
        System.out.println("Elemento a modificar=" + v[p]);
        v[p] = this.va;
    }
}
