package com.stardevcgroup.opertions;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import javax.naming.spi.DirStateFactory.Result;

public class CalculeTest {
    @Test
    public void testSomme() {
        Calcule calcule = new Calcule();
        double a = 12;
        double b = 13;
        double expected = 25;
        double resultat = calcule.somme(a, b);

        assertEquals(resultat, expected, 0.001);
    }
}
