package com.company.Calcul;

import com.company.Affichage.CarreauAffichage;
import com.company.Affichage.DefaultCarreauAffichage;
import com.company.IOUtils;
import com.company.Model.Carreau;
import com.company.Model.Joueur;
import com.sun.xml.internal.ws.api.streaming.XMLStreamWriterFactory;

import java.util.ArrayList;
import java.util.List;

public interface Caclculator {

    Joueur joueur = new Joueur();
    CarreauAffichage dAffichage = new DefaultCarreauAffichage();

    default Joueur play(){

        List<Carreau> carreaus =  new ArrayList<>();
        Carreau carreau = new Carreau();
        carreau.setId(1);
        carreaus.add(carreau);
        joueur.setCarreaus(carreaus);
        List<Integer> boules = new ArrayList<>();
        boules.add(IOUtils.readCommandLine(this.joueur.getCarreaus().get(0).getId(),this.joueur.getCarreaus().get(0).getBoules().size())+1);
        carreau.setBoules(boules);
        dAffichage.printResult();

        this.joueur.getCarreaus()
    Carreaus();
                carreaus.get(0).setBoules();


        return this.joueur;
    }
    Carreau runCalculation(Carreau carreau);

}
