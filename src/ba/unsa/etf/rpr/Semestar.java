package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Semestar {
    private int semestar;
    private ArrayList<Predmet> predmeti;
    private int maxIzbornih;

    public Semestar(int semestar, ArrayList<Predmet> predmeti, int maxIzbornih) {
        this.semestar = semestar;
        this.predmeti = predmeti;
        this.maxIzbornih = maxIzbornih;
    }

    public void dodajPredmet(Predmet p) {
        predmeti.add(p);
    }

    public int getSemestar() {
        return semestar;
    }

    public ArrayList<Predmet> getObavezni() {
        return predmeti;
    }

    public int getMaxIzbornih() {
        return maxIzbornih;
    }
}
