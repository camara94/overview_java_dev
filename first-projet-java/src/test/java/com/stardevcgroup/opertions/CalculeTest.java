package com.stardevcgroup.opertions;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculeTest {
    @Test
    public void testSomme() {
        Calcule calcule = new Calcule();
        double a = 12;
        double b = 13;
        double expected = 25.000;
        double resultat = calcule.somme(a, b);
        System.out.println(resultat);
        assertEquals(resultat, expected, 0.001);
    }
}
