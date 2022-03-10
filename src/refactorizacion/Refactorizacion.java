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
public class Refactorizacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// TODO code application logic here
        int[] v = new int[5];
        v[0] = 2;
        v[1] = 4;
        v[2] = 6;
        v[3] = 8;
        Prueba p = new Prueba();
        p.va = 10;
        p.mo(v);
        p.bo(v);
        p.in(v);
    }

}
