package com.company.Affichage;

import com.company.Affichage.CarreauAffichage;

import java.util.List;

public class DefaultCarreauAffichage implements CarreauAffichage {
    @Override
    public void printResult(List<Integer> bools) {

            System.out.println("+----------------+");
            System.out.println("       numCarreau         ");
            System.out.println("+----------------+");
            System.out.println("    boule1 |  boul2      ");
            System.out.println("+----------------+");
            System.out.println("       totalCarreau         ");
            System.out.println("+----------------+");


    }
}
