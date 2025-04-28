package org.example;




public class MakinePlanlayici {
    private int[][] islemSureleri;
    private int[][] gecisMaliyetleri;
    private int isSayisi;
    private int makineSayisi;

    // Yapıcı metod: İşlem süreleri ve geçiş maliyetlerini alır
    public MakinePlanlayici(int[][] islemSureleri, int[][] gecisMaliyetleri) {
        this.islemSureleri = islemSureleri;
        this.gecisMaliyetleri = gecisMaliyetleri;
        this.isSayisi = islemSureleri.length; // İş sayısını alır
        this.makineSayisi = islemSureleri[0].length; // Makine sayısını alır
    }




    // Minimum toplam maliyeti hesaplayan metod
    public int minimumToplamMaliyetBul() {
        int[][] Maliyet = new int[isSayisi][makineSayisi]; // Maliyet matrisini oluşturuyoruz

        // İşlem süreleri ve geçiş maliyetlerini yazdırıyoruz
        System.out.println("İşlem Süreleri Matrisi (islemSureleri):");
        matrisYazdir(islemSureleri);

        System.out.println("\nGeçiş Maliyetleri Matrisi (gecisMaliyetleri):");
        matrisYazdir(gecisMaliyetleri);

        // İlk iş için her makineye ait maliyetleri belirliyoruz
        for (int m = 0; m < makineSayisi; m++) {
            Maliyet[0][m] = islemSureleri[0][m];
        }

        // Diğer işler için minimum maliyeti hesaplıyoruz
        for (int i = 1; i < isSayisi; i++) {
            for (int m = 0; m < makineSayisi; m++) {
                Maliyet[i][m] = Integer.MAX_VALUE; // Başlangıç değeri olarak çok büyük bir sayı

                // Makineler arasında geçiş maliyetlerini hesaplıyoruz
                for (int oncekiMakine = 0; oncekiMakine < makineSayisi; oncekiMakine++) {
                    int maliyet = Maliyet[i - 1][oncekiMakine] + gecisMaliyetleri[oncekiMakine][m] + islemSureleri[i][m];

                    // En küçük maliyeti buluyoruz
                    if (maliyet < Maliyet[i][m]) {
                        Maliyet[i][m] = maliyet;
                    }
                }
            }
        }

        // Son maliyet tablosunu yazdırıyoruz
        System.out.println("\nSon Maliyet Tablosu:");
        matrisYazdir(Maliyet);

        // En düşük toplam maliyeti buluyoruz
        int minimumMaliyet = Integer.MAX_VALUE;
        for (int m = 0; m < makineSayisi; m++) {
            minimumMaliyet = Math.min(minimumMaliyet, Maliyet[isSayisi - 1][m]);
        }

        return minimumMaliyet;
    }




    // Matrisin her satırını yazdıran yardımcı metod
    private void matrisYazdir(int[][] matris) {
        for (int[] satir : matris) {
            System.out.print("[ ");
            for (int deger : satir) {
                System.out.print(deger + " ");
            }
            System.out.println("]");
        }
    }
}
