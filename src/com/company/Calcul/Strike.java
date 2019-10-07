package com.company.Calcul;

import com.company.Model.Carreau;

import static com.company.Calcul.Spare.CalculateCarreau;

public class Strike implements  Caclculator{


    @Override
    public Carreau runCalculation(Carreau carreau) {

        carreau.setAffichage("   |  X  ");
        return CalculateCarreau(carreau);
    }
}
