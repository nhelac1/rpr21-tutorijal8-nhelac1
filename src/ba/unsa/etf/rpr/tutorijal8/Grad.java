package ba.unsa.etf.rpr.tutorijal8;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Grad {
    private SimpleStringProperty naziv;
    private SimpleIntegerProperty brojStanovnika;
    private SimpleDoubleProperty temperature[] = new SimpleDoubleProperty[1000];

    public Grad() {
    }

    public Grad(String naziv, Double[] temperature) {
        this.naziv = new SimpleStringProperty(naziv);
        this.temperature = new SimpleDoubleProperty[temperature.length];
        this.brojStanovnika = new SimpleIntegerProperty(0);
    }

    public String getNaziv() {
        return naziv.get();
    }

    public SimpleStringProperty nazivProperty() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv.set(naziv);
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

    public SimpleDoubleProperty[] getTemperature() {
        return temperature;
    }

    public void setTemperature(SimpleDoubleProperty[] temperature) {
        this.temperature = temperature;
    }
}
