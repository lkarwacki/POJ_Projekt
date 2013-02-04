package projekt.artykuly;

public class Gruszki extends Owoce {

    public Gruszki(double cena, double stan) {
        super(cena, stan);
    }

    @Override
    public String pobierzOpis() {
        return "Gruszki";
    }
    
}