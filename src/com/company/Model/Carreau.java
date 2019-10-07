package com.company.Model;

import com.company.Calcul.Caclculator;
import com.company.Calcul.Strike;

import java.util.ArrayList;
import java.util.List;

public class Carreau {


    private int results;
    private List<Integer> boules;
    private Caclculator caclculator;
    private int id;
    private String Affichage ;


    public  Carreau(){

         boules = new ArrayList<>();
    }

    public void addBoule(List<Integer> boules){

        if(boules.get(0) == 10){
           caclculator = new Strike();
          // caclculator.runCalculation(boules.get(1), this.boules);
        }else if(boules.get(0)<10){

        }

    }

    public int getResults() {
        return results;
    }

    public void setResults(int results) {
        this.results = results;
    }

    public List<Integer> getBoules() {
        return boules;
    }

    public void setBoules(List<Integer> boules) {
        this.boules = boules;
    }

    public Caclculator getCaclculator() {
        return caclculator;
    }

    public void setCaclculator(Caclculator caclculator) {
        this.caclculator = caclculator;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getAffichage() {
        return Affichage;
    }

    public void setAffichage(String affichage) {
        Affichage = affichage;
    }

}
