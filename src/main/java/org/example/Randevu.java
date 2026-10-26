package org.example;

public class Randevu {

    // Randevunun içinde bir doktor, bir hasta ve bir tarih bilgisi olacak
    private Doktor doktor;
    private Hasta hasta;
    private String tarih; // Başlangıç seviyesi olduğu için tarihi basit bir metin (String) olarak tutuyoruz

    // Randevu oluşturulurken çalışacak kurucu (constructor) metot
    public Randevu(Doktor doktor, Hasta hasta, String tarih) {
        this.doktor = doktor;
        this.hasta = hasta;
        this.tarih = tarih;
    }

    // Ekrana randevu detaylarını alt alta yazdıran çok basit bir metot
    public void randevuBilgisiYazdir() {
        System.out.println("--- YENİ RANDEVU ---");
        System.out.println("Tarih: " + tarih);
        System.out.println("Doktor: " + doktor.getAdSoyad() + " (" + doktor.getUzmanlikAlani() + ")");
        System.out.println("Hasta: " + hasta.getAdSoyad() + " - Durum: " + hasta.getAciliyetDurumu());
        System.out.println("--------------------");
    }
}
