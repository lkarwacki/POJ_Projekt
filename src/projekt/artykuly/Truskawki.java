package projekt.artykuly;

public class Truskawki extends Owoce {
    String opis;

    public Truskawki(double cena, double stan) {
        super(cena, stan);
    }

    @Override
    public String pobierzOpis() {
        return "Truskawki";
    }
    
}