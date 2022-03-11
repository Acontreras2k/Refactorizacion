/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactorizacion;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Diurno
 */
public class CambiaLongitudTest {
    
    public CambiaLongitudTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testGetValor() {
        System.out.println("getValor");
        CambiaLongitud instance = new CambiaLongitud();
        int expResult = 0;
        int result = instance.getValor();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetValor() {
        System.out.println("setValor");
        int valor = 0;
        CambiaLongitud instance = new CambiaLongitud();
        instance.setValor(valor);
        fail("The test case is a prototype.");
    }

    @Test
    public void testModificar() {
        System.out.println("modificar");
        int[] vector = null;
        int longitudActual = 0;
        int posicion = 0;
        CambiaLongitud instance = new CambiaLongitud();
        instance.modificar(vector, longitudActual, posicion);
        fail("The test case is a prototype.");
    }

    @Test
    public void testBorrar() {
        System.out.println("borrar");
        int[] vector = null;
        int longitudActual = 0;
        int posicion = 0;
        CambiaLongitud instance = new CambiaLongitud();
        instance.borrar(vector, longitudActual, posicion);
        fail("The test case is a prototype.");
    }

    @Test
    public void testVisualizar() {
        System.out.println("Visualizar");
        int longitud1 = 0;
        int[] vector = null;
        CambiaLongitud instance = new CambiaLongitud();
        instance.Visualizar(longitud1, vector);
        fail("The test case is a prototype.");
    }

    @Test
    public void testInsertar() {
        System.out.println("insertar");
        int[] vector = null;
        int longitudActual = 0;
        int posicion = 0;
        CambiaLongitud instance = new CambiaLongitud();
        instance.insertar(vector, longitudActual, posicion);
        fail("The test case is a prototype.");
    }
    
}
