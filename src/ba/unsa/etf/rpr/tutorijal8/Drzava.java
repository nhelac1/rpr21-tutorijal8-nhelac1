package ba.unsa.etf.rpr.tutorijal8;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Drzava {
    private SimpleStringProperty naziv, jedinicaPovrsine;
    private SimpleIntegerProperty brojStanovnika;
    private SimpleDoubleProperty povrsinaDrzave;
    Grad glavniGrad = new Grad();

    public String getNaziv() {
        return naziv.get();
    }

    public SimpleStringProperty nazivProperty() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv.set(naziv);
    }

    public String getJedinicaPovrsine() {
        return jedinicaPovrsine.get();
    }

    public SimpleStringProperty jedinicaPovrsineProperty() {
        return jedinicaPovrsine;
    }

    public void setJedinicaPovrsine(String jedinicaPovrsine) {
        this.jedinicaPovrsine.set(jedinicaPovrsine);
    }

    public int getBrojStanovnika() {
        return brojStanovnika.get();
    }

    public SimpleIntegerProperty brojStanovnikaProperty() {
        return brojStanovnika;
    }

    public void setBrojStanovnika(int brojStanovnika) {
        this.brojStanovnika.set(brojStanovnika);
    }

    public double getPovrsinaDrzave() {
        return povrsinaDrzave.get();
    }

    public SimpleDoubleProperty povrsinaDrzaveProperty() {
        return povrsinaDrzave;
    }

    public void setPovrsinaDrzave(double povrsinaDrzave) {
        this.povrsinaDrzave.set(povrsinaDrzave);
    }

    public Grad getGlavniGrad() {
        return glavniGrad;
    }

    public void setGlavniGrad(Grad glavniGrad) {
        this.glavniGrad = glavniGrad;
    }
}
