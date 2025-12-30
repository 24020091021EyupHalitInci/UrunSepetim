package tr.edu.istiklal;

public abstract class Urun {
    public String name;
    public double fiyat;
    public double kdv=20;

    public Urun(String name, double fiyat) {
        this.name = name;
        this.fiyat = fiyat;
    }

    public double getFiyat() {
        return fiyat;
    }

    public double getKdv() {
        return kdv;
    }

    public void setKdv(double kdv) {
        this.kdv = kdv;
    }

    public abstract double kdvUygula();
}
