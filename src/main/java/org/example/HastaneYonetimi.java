package org.example;

public class HastaneYonetimi {

    // Singleton Kalıbı: Sistemin tek bir kopyasını burada tutuyoruz
    private static HastaneYonetimi tekSistem;

    // Kurucu metodu "private" (gizli) yaptık. Dışarıdan rastgele yeni yönetim oluşturulamaz.
    private HastaneYonetimi() {
        System.out.println("Hastane Merkez Sistemi Devrede.");
    }

    // Sisteme ulaşmak için kullanılacak tek yöntem budur
    public static HastaneYonetimi getInstance() {
        if (tekSistem == null) {
            tekSistem = new HastaneYonetimi();
        }
        return tekSistem;
    }
}
