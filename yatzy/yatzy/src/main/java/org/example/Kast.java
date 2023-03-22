package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Kast {

    private List<Terning> terninger = new ArrayList<>();

//    private static Random random = new Random();

    public Kast(int antallTerninger) {
        for (int i = 0; i <= antallTerninger; i++) {
            terninger.add(new Terning(0, i+1));
        }
    }
    public void trillAlle() {
        for (Terning terning : terninger) {
            terning.trill();
            System.out.println("Terning " + terning.getTerningNr() + ": " + terning.getVerdi());
        }
    }
    public List<Terning> getTerninger() {
        return terninger;
    }
    public void setTerninger(List<Terning> terninger) {
        this.terninger = terninger;
    }
    public void trillEn(int indeks) {
        Terning terning = terninger.get(indeks);
        terning.trill();
        System.out.println("Terning " + terning.getTerningNr() + ": " + terning.getVerdi());
    }


}
