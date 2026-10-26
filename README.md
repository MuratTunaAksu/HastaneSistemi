# Hastane Planlama Sistemi - OOP Projesi

Bu proje, Nesneye Yönelik Programlama (NYP) dersi kapsamında geliştirilmiş bir Hastane Randevu ve Ameliyathane yönetim sistemidir.

## Geliştirici
* Murat Tuna Aksu - 1250505041

## Projenin Amacı ve Çalışma Mantığı
Sistem konsol üzerinden çalışır. Hastaların aciliyet durumlarına göre önceliklendirilmesi ve doktorların randevu sistemlerinin yönetilmesi amaçlanmıştır. Sistem üzerindeki kayıtlar kalıcı olarak `.txt` dosyasına kaydedilmektedir. 8 adet birim testi ile tüm sınıfların doğru çalıştığı doğrulanmıştır.

## Kullanılan OOP Prensipleri
* **Kalıtım (Inheritance):** `Doktor` ve `Hasta` sınıfları, ortak özellikleri barındıran `Kisi` sınıfından türetilmiştir.
* **Soyutlama (Abstraction):** `Kisi` sınıfı `abstract` olarak tanımlanmış, temel şablon oluşturulmuştur.
* **Kapsülleme (Encapsulation):** Tüm sınıflardaki özellikler (ad, tc, uzmanlık) `private` yapılmış ve dış erişim `getter/setter` metotlarıyla sağlanmıştır.
* **Çok Biçimlilik (Polymorphism):** Veri kaydetme işlemleri arayüz (interface) üzerinden uygulanmıştır.

## Uygulanan Tasarım Kalıpları (Design Patterns)
1. **Singleton Pattern:** `HastaneYonetimi` sınıfı ile sistemde sadece tek bir hastane merkez nesnesi olması garanti altına alınmıştır.
2. **Strategy Pattern:** `VeriKayitStratejisi` arayüzü ile verilerin `.txt` dosyasına (`TxtDosyaKayit`) veya gelecekte eklenebilecek farklı formatlara esnekçe kaydedilebilmesi sağlanmıştır.

## Uygulanan SOLID Prensipleri
* **Single Responsibility:** Sınıflar tek bir amaca hizmet eder (Örn: Veri kaydetme işi sadece `TxtDosyaKayit` sınıfına verilmiştir).
* **Open/Closed:** Yeni bir kayıt türü (örneğin veritabanı kaydı) ekleneceği zaman mevcut kodlar değiştirilmeden sisteme entegre edilebilir.
* **Dependency Inversion:** Uygulama, somut bir dosya sınıfına değil, `VeriKayitStratejisi` soyutlamasına (interface) bağlıdır.