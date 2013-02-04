package projekt;

import java.util.ArrayList;
import projekt.artykuly.Produkt;

public class Koszyk {
    String nazwisko="";
    int index = 0;
    
    public ArrayList<Produkt> co = new ArrayList<>();
    public ArrayList<Double> ile = new ArrayList<>();
    
    public Koszyk(String nazwisko, int nrKosza) {
        this.nazwisko = nazwisko;
        System.out.println(nazwisko+ " bierze koszyk nr " +nrKosza++);
    }
    
    String pobierzNazwisko() {
        return nazwisko;
    }
        
    void dodajProdukt(Produkt produkt, double ile) {
        this.co.add(index, produkt);
        this.ile.add(index, ile);
        produkt.zdejmijZeStanu(ile);
        this.index++;
    }
    
    void zawartoscKosza() {
        System.out.println(nazwisko + " ma w koszyku:");
        for (int i = 0; i < co.size(); i++) {
            System.out.print(co.get(i).pobierzOpis() + " " + ile.get(i) + " kg , ");            
        }
        System.out.println();
    }
}