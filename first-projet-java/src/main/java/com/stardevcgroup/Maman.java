package com.stardevcgroup;

import com.stardevcgroup.opertions.Calcule;

public class Maman {
    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("Vous devez passer deux arguments");
            System.exit(1);
        }

        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        Calcule calcule = new Calcule();
        double result = calcule.somme(a, b);

        System.out.println(String.format("la somme de %s et %s est de %s", a, b, result));
    }
}