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
public class NoCambiaLongitudTest {
    
    public NoCambiaLongitudTest() {
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
        NoCambiaLongitud instance = new NoCambiaLongitud();
        int expResult = 0;
        int result = instance.getValor();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetValor() {
        System.out.println("setValor");
        int valor = 0;
        NoCambiaLongitud instance = new NoCambiaLongitud();
        instance.setValor(valor);
        fail("The test case is a prototype.");
    }

    @Test
    public void testVisualizar() {
        System.out.println("Visualizar");
        int longitud1 = 0;
        int[] vector = null;
        NoCambiaLongitud instance = new NoCambiaLongitud();
        instance.Visualizar(longitud1, vector);
        fail("The test case is a prototype.");
    }
    
}
