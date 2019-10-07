package com.company.Model;

import com.company.IOUtils;

import java.util.ArrayList;
import java.util.List;

public class Joueur {

    private List<Carreau> carreaus;
    private int Score ;

    public List<Carreau> getCarreaus() {
        return carreaus;
    }

    public void setCarreaus(List<Carreau> carreaus) {
        this.carreaus = carreaus;
    }

    public int getScore() {
        return Score;
    }

    public void setScore(int score) {
        Score = score;
    }
}
