package com.company.Calcul;

import com.company.Model.Carreau;
import com.company.IOUtils;

import java.util.Optional;

public class Spare  implements  Caclculator {
    @Override
    public Carreau runCalculation(Carreau carreau) {

        carreau.setAffichage(carreau.getBoules().get(0) + " |  / ");
        return CalculateCarreau(carreau);

    }

    static Carreau CalculateCarreau(Carreau carreau) {
        int extraBoule = IOUtils.readCommandLine(carreau.getId(),carreau.getBoules().size());
        carreau.getBoules().add(extraBoule);
        Optional<Integer> result = carreau.getBoules().stream().reduce((integer, integer2) -> integer + integer2);
        carreau.setResults(result.get());

        return carreau;
    }
}
