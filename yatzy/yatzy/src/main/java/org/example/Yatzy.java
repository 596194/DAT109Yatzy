package org.example;

public class Yatzy {
    public static void main(String[] args) {
        Kast kast;
        System.out.println("Hello world!");
        int runde =1;
        while(runde<=1){
            kast = new Kast(4);
            kast.trillAlle();
            System.out.println("kaster terning med index 2 på nytt");
            kast.trillEn(2);
            Regler.enere(kast);
            System.out.println("sum toere " +Regler.toere(kast));
            System.out.println("sum seksere " +Regler.seksere(kast));
            System.out.println("sum par " + Regler.ettPar(kast));
            //System.out.println("to par " +Regler.toPar(kast));
            runde++;
        }




    }
}