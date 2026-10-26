package org.example;
import java.io.FileWriter;
import java.io.IOException;

// Verilerin kalıcı olarak saklanması kuralını burada çözüyoruz (SOLID - Tek Sorumluluk Prensibi).
public class TxtDosyaKayit implements VeriKayitStratejisi {

    @Override
    public void kaydet(String veri) {
        try {
            // Veriyi "kayitlar.txt" adında bir dosyaya yazar
            FileWriter yazar = new FileWriter("kayitlar.txt", true);
            yazar.write(veri + "\n");
            yazar.close();
            System.out.println("Bilgi başarıyla dosyaya kaydedildi!");
        } catch (IOException e) {
            System.out.println("Dosya kaydedilirken bir hata oluştu.");
        }
    }
}
