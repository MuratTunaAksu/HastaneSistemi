package org.example;

// abstract (soyut) sınıf yapıyoruz çünkü hastaneye "Kişi" diye biri gelmez, ya "Hasta" gelir ya "Doktor". (Soyutlama Kuralı)
public abstract class Kisi {

    // Kapsülleme (Encapsulation) kuralı için verileri private (gizli) yapıyoruz
    private String adSoyad;
    private String tcKimlik;

    // Constructor (Kurucu Metot - Verileri ilk atadığımız yer)
    public Kisi(String adSoyad, String tcKimlik) {
        this.adSoyad = adSoyad;
        this.tcKimlik = tcKimlik;
    }

    // Gizli verilere başka dosyalardan ulaşabilmek için Getter metotları
    public String getAdSoyad() {
        return adSoyad;
    }

    public String getTcKimlik() {
        return tcKimlik;
    }
}
