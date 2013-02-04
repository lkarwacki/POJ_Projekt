package projekt;

import projekt.Sklep.*;

public class Projekt {

    public static void main(String[] args) {

        int nrKosza = 1;
        Sklep warzywniak = new Sklep();
        
        Koszyk kowalski = new Koszyk("Kowalski", nrKosza);
        nrKosza++;
        kowalski.dodajProdukt(warzywniak.truskawki, 2.4);
        kowalski.dodajProdukt(warzywniak.gruszki, 1.45);
        kowalski.dodajProdukt(warzywniak.gruszki, .45);
        kowalski.dodajProdukt(warzywniak.jablka, 1.45);
        
        kowalski.zawartoscKosza();
        warzywniak.kasa.wystawParagon(kowalski);
        
        Koszyk iksinski = new Koszyk("Iksiński", nrKosza);
        nrKosza++;
        
        iksinski.dodajProdukt(warzywniak.truskawki, .77);
        iksinski.dodajProdukt(warzywniak.gruszki, .78);
        iksinski.dodajProdukt(warzywniak.jablka, 1.2);
        
        iksinski.zawartoscKosza();
        warzywniak.kasa.wystawParagon(iksinski);
    }
}