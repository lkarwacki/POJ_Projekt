package projekt.artykuly;

public interface Produkt {
    double pobierzCene();    
    String pobierzOpis();
    double pobierzStan();
    double zdejmijZeStanu(double ile);
    void przyjmijNaStan(double stan);
    
}