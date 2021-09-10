package com.stardevcgroup;

import com.stardevcgroup.opertions.Calcule;

public class Maman {
    public static void main(String[] args) {
        double a = 18;
        double b = 12;
        Calcule calcule = new Calcule();
        double result = calcule.somme(a, b);

        System.out.println(String.format("la somme de %s et %s est de %s", a, b, result));
    }
}