package ba.unsa.etf.rpr;

import java.util.Set;

public class PlanStudija {
    private Set<Semestar> fax;

    public PlanStudija(Set<Semestar> fax) {
        this.fax = fax;
    }

    public void dodajSemestar(Semestar s) {
        fax.add(s);
    }

    public void izbaciSemestar(Semestar s) {
        fax.remove(s);
    }

    public Set<Semestar> getFax() {
        return fax;
    }
}
