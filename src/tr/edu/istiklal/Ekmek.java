package tr.edu.istiklal;

public class Ekmek extends Urun{
    private String tur;
    private double gramaj;

    public Ekmek(String name, double fiyat,String tur,double gramaj) {
        super(name, fiyat);
        this.tur=tur;
        this.gramaj=gramaj;
        setKdv(0);
    }

    @Override
    public double kdvUygula() {
        return getFiyat();
    }

    @Override
    public String toString() {
        return "Ekmek : " + name + " Fiyat: " + fiyat + " Türü: " + tur + " Gramaj: " + gramaj;
    }
}
