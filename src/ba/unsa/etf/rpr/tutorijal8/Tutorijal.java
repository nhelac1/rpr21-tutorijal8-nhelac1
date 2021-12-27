package ba.unsa.etf.rpr.tutorijal8;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Tutorijal {

    public static UN ucitajXml(ArrayList<Grad> gradovi) throws IOException {
    }
    public static void ucitajGradove() {
        Scanner ulaz = null;
        ArrayList<Grad> gradovi = new ArrayList<>();
        try {
            ulaz = new Scanner(new FileReader("mjerenja.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("Datoteka mjerenja.txt ne postoji ili se ne može otvoriti");
        }
        while (ulaz.hasNext()) {
            String grad = ulaz.next();
            Double[] niz = new Double[1000];
            int pomocna = 0;
            while (ulaz.hasNextDouble()) {
                niz[pomocna] = ulaz.nextDouble();
                pomocna++;
            }
            gradovi.add(new Grad(grad, niz));
        }
    }
    public static void main(String[] args) throws IOException {
        UN un = ucitajXml(new ArrayList<Grad>());
    }
}
