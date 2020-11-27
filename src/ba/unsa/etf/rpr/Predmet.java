package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Predmet {
    private int ects;
    private String nazivP;
    private ArrayList<Student> upisani;

    public Predmet(int ects, String nazivP, ArrayList<Student> upisani) {
        this.ects = ects;
        this.nazivP = nazivP;
        this.upisani = upisani;
    }

    public void upisiStudenta(Student s) {
        upisani.add(s);
    }

    public void ispisiStudenta(Student s) {
        upisani.remove(s);
    }

    public int getEcts() {
        return ects;
    }

    public String getNazivP() {
        return nazivP;
    }

    public ArrayList<Student> getUpisani() {
        return upisani;
    }
}
