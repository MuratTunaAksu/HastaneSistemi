package org.example;

public class Main {
    public static void main(String[] args) {

        // 1. Sistemimizi başlatıyoruz (Singleton Tasarım Kalıbı çalışıyor)
        HastaneYonetimi yonetim = HastaneYonetimi.getInstance();

        // 2. Doktor ve Hasta nesnelerimizi oluşturuyoruz
        Doktor doktor1 = new Doktor("Ahmet Yılmaz", "11111111111", "Kardiyoloji");
        Hasta hasta1 = new Hasta("Ayşe Demir", "22222222222", "Kırmızı Alan (Acil)");

        // 3. Randevumuzu oluşturup ekrana yazdırıyoruz
        Randevu randevu1 = new Randevu(doktor1, hasta1, "30.10.2026 - 14:30");
        randevu1.randevuBilgisiYazdir();

        // 4. Randevu bilgisini metin dosyasına kalıcı olarak kaydediyoruz (Strategy Tasarım Kalıbı çalışıyor)
        String kaydedilecekVeri = "Tarih: 30.10.2026 | Doktor: " + doktor1.getAdSoyad() + " | Hasta: " + hasta1.getAdSoyad();

        VeriKayitStratejisi dosyaKayit = new TxtDosyaKayit();
        dosyaKayit.kaydet(kaydedilecekVeri);
    }
}

