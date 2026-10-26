package org.example;

// 2. Tasarım Kalıbımız (Strategy) ve SOLID prensipleri için kullandığımız temel arayüz.
public interface VeriKayitStratejisi {

    // Sadece bir şablon oluşturuyoruz, gövdesi yok.
    void kaydet(String veri);

}