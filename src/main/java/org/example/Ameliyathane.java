package org.example;

public class Ameliyathane {
    private int odaNumarasi;
    private boolean musaitMi;

    public Ameliyathane(int odaNumarasi) {
        this.odaNumarasi = odaNumarasi;
        this.musaitMi = true; // Oda ilk eklendiğinde boş (müsait) kabul ediyoruz
    }

    public int getOdaNumarasi() {
        return odaNumarasi;
    }

    public boolean isMusaitMi() {
        return musaitMi;
    }
}