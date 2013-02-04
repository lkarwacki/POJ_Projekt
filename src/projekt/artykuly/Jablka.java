package projekt.artykuly;

public class Jablka extends Owoce {

    public Jablka(double cena, double stan) {
        super(cena, stan);
    }

    @Override
    public String pobierzOpis() {
        return "Jabłka";
    }
    
}