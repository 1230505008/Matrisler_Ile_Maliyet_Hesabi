package org.example;


public class Main {
    public static void main(String[] args) {
        // İşlem süreleri ve geçiş maliyetleri matrislerini tanımlıyoruz
        int[][] islemSureleri = {
                {7, 5, 9, 6, 8},
                {8, 6, 5, 7, 9},
                {6, 7, 8, 5, 7}
        };

        int[][] gecisMaliyetleri = {
                {0, 2, 3, 4, 8},
                {2, 0, 1, 3, 2},
                {3, 8, 0, 2, 3},
                {4, 2, 2, 0, 1},
                {5, 2, 3, 1, 0}
        };

        // MakinePlanlayici sınıfını başlatıyoruz ve matrisleri ona gönderiyoruz
        MakinePlanlayici planlayici = new MakinePlanlayici(islemSureleri, gecisMaliyetleri);

        // Minimum toplam maliyeti hesaplıyoruz ve ekrana yazdırıyoruz
        int minimumMaliyet = planlayici.minimumToplamMaliyetBul();
        System.out.println("\nMinimum toplam süre (maliyet): " + minimumMaliyet);
    }
}
