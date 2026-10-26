package org.example;

// "extends Kisi" diyerek Doktorun da bir Kişi olduğunu belirtiyor ve özelliklerini miras alıyoruz
public class Doktor extends Kisi {

    private String uzmanlikAlani;

    public Doktor(String adSoyad, String tcKimlik, String uzmanlikAlani) {
        super(adSoyad, tcKimlik); // super() komutuyla ad ve TC bilgilerini üst sınıf olan Kisi'ye gönderiyoruz
        this.uzmanlikAlani = uzmanlikAlani;
    }

    public String getUzmanlikAlani() {
        return uzmanlikAlani;
    }
}
