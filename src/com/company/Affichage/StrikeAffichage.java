package com.company.Affichage;

import java.util.List;

public class StrikeAffichage implements CarreauAffichage{


    @Override
    public void printResult(List<Integer> bools) {
        System.out.println("X");
        System.out.println(bools.stream().reduce((integer, integer2) -> integer + integer2));

        System.out.println("+----------------+");
        System.out.println("       numCarreau         ");
        System.out.println("+----------------+");
        System.out.println("    boule1 |  boul2      ");
        System.out.println("+----------------+");
        System.out.println("       bools.stream().reduce((integer, integer2) -> integer + integer2)         ");
        System.out.println("+----------------+");

    }


}
