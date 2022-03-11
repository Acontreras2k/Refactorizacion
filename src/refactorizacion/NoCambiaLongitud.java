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
public class NoCambiaLongitud {

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

    private int valor;
//metodo que modifica el contenido de la posicion p de un array con el valor pasado
    //metodo que borra el elemento de la posicion p desplazando a la izquierda todos los elementos
    public int longitud;


    public void Visualizar(int longitud1, int[] vector) {
        //Mostramos los elementos del array
        System.out.print("v={");
        for (int i = 0; i < longitud1; i++) {
            System.out.print(vector[i] + ",");
        }
        System.out.println("}");
    }




}
