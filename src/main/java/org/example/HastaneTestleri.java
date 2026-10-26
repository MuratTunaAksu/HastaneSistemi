package org.example;

public class HastaneTestleri {

    public static void main(String[] args) {
        System.out.println("--- BİRİM TESTLERİ BAŞLIYOR ---");

        test1_DoktorOlusturma();
        test2_HastaOlusturma();
        test3_AmeliyathaneMusaitlik();
        test4_SingletonTesti();
        test5_DoktorUzmanlik();
        test6_HastaAciliyet();
        test7_AmeliyathaneOdaNo();
        test8_KalitimTesti();

        System.out.println("--- TÜM TESTLER TAMAMLANDI ---");
    }

    // Test 1: Doktor nesnesi doğru verilerle oluşuyor mu?
    public static void test1_DoktorOlusturma() {
        Doktor d = new Doktor("Ali Veli", "123456", "Göz");
        if (d.getAdSoyad().equals("Ali Veli")) System.out.println("Test 1 Başarılı: Doktor adı doğru.");
        else System.out.println("Test 1 Başarısız!");
    }

    // Test 2: Hasta nesnesi doğru oluşuyor mu?
    public static void test2_HastaOlusturma() {
        Hasta h = new Hasta("Ayşe Yılmaz", "987654", "Sarı Alan");
        if (h.getTcKimlik().equals("987654")) System.out.println("Test 2 Başarılı: Hasta TC doğru.");
        else System.out.println("Test 2 Başarısız!");
    }

    // Test 3: Ameliyathane ilk açıldığında otomatik olarak müsait oluyor mu?
    public static void test3_AmeliyathaneMusaitlik() {
        Ameliyathane a = new Ameliyathane(101);
        if (a.isMusaitMi()) System.out.println("Test 3 Başarılı: Ameliyathane müsait durumda.");
        else System.out.println("Test 3 Başarısız!");
    }

    // Test 4: Singleton Kalıbı sadece tek bir yönetim nesnesi mi üretiyor?
    public static void test4_SingletonTesti() {
        HastaneYonetimi h1 = HastaneYonetimi.getInstance();
        HastaneYonetimi h2 = HastaneYonetimi.getInstance();
        if (h1 == h2) System.out.println("Test 4 Başarılı: Singleton (Tekillik) doğru çalışıyor.");
        else System.out.println("Test 4 Başarısız!");
    }

    // Test 5: Doktor uzmanlık alanı kapsülleme (getter) ile doğru alınıyor mu?
    public static void test5_DoktorUzmanlik() {
        Doktor d = new Doktor("Mehmet", "111", "Cerrahi");
        if (d.getUzmanlikAlani().equals("Cerrahi")) System.out.println("Test 5 Başarılı: Uzmanlık bilgisi doğru.");
        else System.out.println("Test 5 Başarısız!");
    }

    // Test 6: Hasta aciliyet durumu kapsülleme ile doğru alınıyor mu?
    public static void test6_HastaAciliyet() {
        Hasta h = new Hasta("Fatma", "222", "Kırmızı Alan");
        if (h.getAciliyetDurumu().equals("Kırmızı Alan")) System.out.println("Test 6 Başarılı: Aciliyet bilgisi doğru.");
        else System.out.println("Test 6 Başarısız!");
    }

    // Test 7: Ameliyathane oda numarası doğru atanıyor mu?
    public static void test7_AmeliyathaneOdaNo() {
        Ameliyathane a = new Ameliyathane(505);
        if (a.getOdaNumarasi() == 505) System.out.println("Test 7 Başarılı: Oda numarası doğru.");
        else System.out.println("Test 7 Başarısız!");
    }

    // Test 8: Doktor sınıfı Kisi sınıfından doğru bir şekilde miras alıyor mu (Kalıtım)?
    public static void test8_KalitimTesti() {
        Doktor d = new Doktor("Zeynep", "333", "KBB");
        if (d instanceof Kisi) System.out.println("Test 8 Başarılı: Kalıtım (Inheritance) mantığı çalışıyor.");
        else System.out.println("Test 8 Başarısız!");
    }
}
