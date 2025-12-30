package tr.edu.istiklal;

public class Telefon extends Urun{
    private String ozellik;
    private String marka;
    public Telefon(String name,double fiyat,String ozellik,String marka) {
        super(name,fiyat);
        this.ozellik=ozellik;
        this.marka=marka;
        setKdv(18);
    }
    @Override
    public double kdvUygula() {
        return (getFiyat()*kdv)/100+getFiyat();
    }

    @Override
    public String toString() {
        return "Telefon: " + name + " Fiyat: " + fiyat + " Ozellik: " + ozellik + " Marka: " + marka;
    }
}
