package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Regler {
    public static int vanligeTall(Kast kast, int tall){
        int sum = (int) kast.getTerninger().stream()
                .filter(terning -> terning.getVerdi() == tall)
                .count();
        return sum*tall;
    }
    public static int enere(Kast kast){
        return vanligeTall(kast,1);
    }
    public static int toere(Kast kast){
        return vanligeTall(kast,2);
    }
    public static int treere(Kast kast){
        return vanligeTall(kast,3);
    }
    public static int firere(Kast kast){
        return vanligeTall(kast,4);
    }
    public static int femere(Kast kast){
        return vanligeTall(kast,5);
    }
    public static int seksere(Kast kast){
        return vanligeTall(kast,6);
    }
    public static int ettPar(Kast kast){
        int par =0;

        List<Terning> terninger =kast.getTerninger();
        Map<Integer, Long> antallAvHverVerdi = terninger.stream()
                .collect(Collectors.groupingBy(Terning::getVerdi, Collectors.counting()));

        for (int verdi = 6; verdi >= 1; verdi--) {
            long antall = antallAvHverVerdi.getOrDefault(verdi, 0L);
            if (antall >= 2) {
                par = verdi * 2;
                break;
            }
        }
        return par;
    }
    /*
    public static int toPar(Kast kast){

        //TODO
        return;
    }
    public static int treLike(Kast kast){
        //TODO

    }
    public static int fireLike(Kast kast){
        //TODO

    }
    public static int litenStraight(Kast kast){
        //TODO

    }
    public static int storStraight(Kast kast){
        //TODO

    }
    public static int hus(Kast kast){
        //TODO

    }
    public static int sjanse(Kast kast){
        //TODO

    }
    public static int yatzy(Kast kast){
        //TODO

    }
*/
}
