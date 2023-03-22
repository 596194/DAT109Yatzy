package org.example;

import java.util.Random;


public class Terning {
    private int verdi;
    private int terningNr;
    private static Random random = new Random();
    public Terning(int verdi, int terningNr) {
        this.verdi = verdi;
        this.terningNr = terningNr;
    }

    public void trill() {
        verdi = random.nextInt(6) + 1;
    }

    public int getVerdi() {
        return verdi;
    }

    public int getTerningNr() {
        return terningNr;
    }
}

