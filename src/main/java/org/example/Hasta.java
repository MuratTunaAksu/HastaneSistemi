package org.example;

public class Hasta extends Kisi {

    private String aciliyetDurumu; // Kırmızı, Sarı, Yeşil alan gibi

    public Hasta(String adSoyad, String tcKimlik, String aciliyetDurumu) {
        super(adSoyad, tcKimlik);
        this.aciliyetDurumu = aciliyetDurumu;
    }

    public String getAciliyetDurumu() {
        return aciliyetDurumu;
    }
}
