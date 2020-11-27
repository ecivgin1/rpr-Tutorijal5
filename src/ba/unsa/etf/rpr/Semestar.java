package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Semestar {
    private int semestar;
    private ArrayList<ObavezniPredmet> obavezni;
    private ArrayList<IzborniPredmet> izborni;
    private int maxIzbornih;

    public Semestar(int semestar, ArrayList<ObavezniPredmet> obavezni, ArrayList<IzborniPredmet> izborni, int maxIzbornih) {
        this.semestar = semestar;
        this.obavezni = obavezni;
        this.izborni = izborni;
        this.maxIzbornih = maxIzbornih;
    }

    public int getSemestar() {
        return semestar;
    }

    public ArrayList<ObavezniPredmet> getObavezni() {
        return obavezni;
    }

    public ArrayList<IzborniPredmet> getIzborni() {
        return izborni;
    }

    public int getMaxIzbornih() {
        return maxIzbornih;
    }
}
