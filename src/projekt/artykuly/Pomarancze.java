package projekt.artykuly;

public class Pomarancze extends Owoce {

    public Pomarancze(double cena, double stan) {
        super(cena, stan);
    }

    @Override
    public String pobierzOpis() {
        return "Pomarańcze";
    }
    
}