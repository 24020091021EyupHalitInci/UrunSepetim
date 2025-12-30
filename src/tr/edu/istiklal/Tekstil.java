package tr.edu.istiklal;

public class Tekstil extends Urun{
    private String kumasTuru;
    private String beden;
    private String ureticiFirma;

    public Tekstil(String name, double fiyat, String kumasTuru, String beden, String ureticiFirma) {
        super(name, fiyat);
        this.kumasTuru = kumasTuru;
        this.beden = beden;
        this.ureticiFirma = ureticiFirma;
        setKdv(10);
    }

    @Override
    public double kdvUygula() {
        return (getFiyat()*kdv)/100+getFiyat();
    }

    @Override
    public String toString() {
        return "Tekstil: " + name + " Fiyat: " + fiyat + " Kumaş Türü: " + kumasTuru + " Beden: " + beden + " Marka: " + ureticiFirma;
    }
}
