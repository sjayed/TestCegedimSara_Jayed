package com.company.Calcul;

import com.company.Model.Carreau;

import java.util.Optional;

public class NormalCarreau implements  Caclculator {

    @Override
    public Carreau runCalculation(Carreau carreau) {

            Optional<Integer> result = carreau.getBoules().stream().reduce((integer, integer2) -> integer + integer2);
            carreau.setResults(result.get());
            carreau.setAffichage(carreau.getBoules().get(0) +" | "+ carreau.getBoules().get(0));

        return carreau;
    }
}
