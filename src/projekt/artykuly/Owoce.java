package projekt.artykuly;

/**
 *
 * @author lesergd
 */
public abstract class Owoce implements Produkt {
    double cena;
    double stan;

    /**
     *
     * @param cena
     * @param stan
     */
    public Owoce(double cena, double stan) {
        this.cena=cena;
        this.stan=stan;
    }

    /**
     *
     * @return
     */
    public abstract String pobierzOpis();
    
    /**
     *
     * @return
     */
    public double pobierzStan() {
        return stan;
    }

    /**
     *
     * @param ile
     * @return
     */
    public double zdejmijZeStanu(double ile) {
        this.stan-=ile;
        return stan;
    }

    
    /**
     *
     * @return
     */
    public double pobierzCene() {
        return cena;
    }
    
    /**
     *
     * @param stan
     */
    public void przyjmijNaStan(double stan) {
        this.stan+=stan;
    }
    
}