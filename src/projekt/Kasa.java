package projekt;

import java.text.NumberFormat;

public class Kasa {
    double wartosc;
    double cena;
    void wystawParagon(Koszyk koszyk) {
        wartosc = 0;
        NumberFormat walutowo = NumberFormat.getCurrencyInstance();
        walutowo.setMinimumFractionDigits(2);
        
        System.out.println(koszyk.pobierzNazwisko() + " - podsumowanie zakupów: ");
        for (int i = 0; i < koszyk.co.size(); i++) {
            System.out.println(koszyk.co.get(i).pobierzOpis() + " " + koszyk.ile.get(i) 
                               + " kg * " + walutowo.format(koszyk.co.get(i).pobierzCene()) + "/kg");
            wartosc += koszyk.co.get(i).pobierzCene() * koszyk.ile.get(i);            
        }
        System.out.println("Razem : " + walutowo.format(wartosc));
    }
    
}