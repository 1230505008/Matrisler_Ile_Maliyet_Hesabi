# Matrisler İle Maliyet Hesaplama Algoritması

Bu proje, işlerin ve makinelerin her biri için belirli işlem süreleri ve geçiş maliyetleri verilen bir makine planlama problemini çözmek için yazılmıştır. Amaç, verilen makinelerdeki işler arasında geçiş yaparken toplam maliyeti (işlem süresi + geçiş maliyeti) minimize etmektir.

## İçerik

1. **MakinePlanlayici.java**  
   Makinelerdeki işleri en düşük maliyetle sıralamak ve gerçekleştirmek için gerekli hesaplamaları içeren sınıf.

2. **Main.java**  
   İşlem süreleri ve geçiş maliyetleri matrisi ile sınıfı kullanarak en düşük toplam maliyeti hesaplayan ana sınıf.

## Problem Tanımı

Bu problemde, her işin her makinede farklı bir işlem süresi ve makineler arasında geçiş yaparken farklı maliyetler bulunmaktadır. Amacımız, her işi en uygun makineye atamak ve makineler arasındaki geçiş maliyetlerini minimize ederek toplam maliyeti bulmaktır.

## Nasıl Çalışır?

 **MakinePlanlayici Sınıfı**:
   `MakinePlanlayici` sınıfı, verilen işlem süreleri ve geçiş maliyetlerine göre makineler arasındaki en düşük toplam maliyeti hesaplar.

 **Hesaplama**:
   `minimumToplamMaliyetBul()` metodu, işlem süreleri ve geçiş maliyetleri matrisi üzerinden bir maliyet tablosu oluşturur ve en düşük maliyeti hesaplar. Bu maliyet tablosu sonucu en düşük toplam maliyet olarak döndürür. 
