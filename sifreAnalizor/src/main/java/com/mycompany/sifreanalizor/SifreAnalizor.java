/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.sifreanalizor;

/**
 *
 * @author Fazlı Aydemir
 */
import java.util.Scanner; // Girdi kısmı açmak için.
import java.io.FileWriter; // .txt dosyası oluşturmak ve yazmak için.
import java.io.PrintWriter; // .txt dosyası oluşturmak ve yazmak için.
import java.io.IOException; // Hataları yönetmek için.
import java.io.File; // Dosya kontrolü için.
import java.awt.Desktop; // Dosyayı açmak için.

public class SifreAnalizor {

    public static void main(String[] args) {

        // Girdi Kısmı Oluşturma
        Scanner girdi = new Scanner(System.in);

        System.out.print("Sifre Giriniz: ");
        String sifre = girdi.nextLine();

        // Girilen Şifrenin Şartları
        boolean uzunlukUygun = sifre.length() >= 8;
        boolean buyukHarfVar = false;
        boolean kucukHarfVar = false;
        boolean rakamVar = false;
        boolean ozelKarakterVar = false;

        // Girilen Şifrenin Karakterlerinin Analiz Edilmesi
        for (int i = 0; i < sifre.length(); i++) {
            char x = sifre.charAt(i);
            if (Character.isUpperCase(x)) {
                buyukHarfVar = true;
            } else if (Character.isLowerCase(x)) {
                kucukHarfVar = true;
            } else if (Character.isDigit(x)) {
                rakamVar = true;
            } else if (!Character.isLetterOrDigit(x)) {
                ozelKarakterVar = true;
            }
        }

        // Girilen Şifrenin Sağladığı Şart Sayısını Hesaplama
        int sartSayisi = 0;
        if (uzunlukUygun) {
            sartSayisi++;
        }
        if (buyukHarfVar) {
            sartSayisi++;
        }
        if (kucukHarfVar) {
            sartSayisi++;
        }
        if (rakamVar) {
            sartSayisi++;
        }
        if (ozelKarakterVar) {
            sartSayisi++;
        }

        // Sağlanan Şart Sayısına Göre Sınıflandırma
        String sifreGucu;
        if (sartSayisi == 5) {
            sifreGucu = "Guclu";
        } else if (sartSayisi > 2) {
            sifreGucu = "Orta";
        } else {
            sifreGucu = "Zayif";
        }

        // Şifre Analizi Çıktısı Oluşturma
        String analizSonucu = "\nSifre Analizi Baslatiliyor...\n"
                + "-------------\n"
                + "Uzunluk: " + (uzunlukUygun ? "Uygun" : "Yetersiz") + "\n"
                + "Buyuk Harf: " + (buyukHarfVar ? "Var" : "Yok") + "\n"
                + "Kucuk Harf: " + (kucukHarfVar ? "Var" : "Yok") + "\n"
                + "Rakam: " + (rakamVar ? "Var" : "Yok") + "\n"
                + "Ozel karakter: " + (ozelKarakterVar ? "Var" : "Yok") + "\n"
                + "-------------\n"
                + "Sifre Gucu: " + sifreGucu;

        // 1. Çıktıyı Konsola Yazdırma
        System.out.println(analizSonucu);

        // 2. Çıktıyı Dosyaya Yazdırma (analiz.txt)
        try {
            FileWriter dosyaYazici = new FileWriter("analiz.txt");
            PrintWriter kalem = new PrintWriter(dosyaYazici);

            kalem.print(analizSonucu);

            kalem.close();
            System.out.println("\nCikti sonucu 'analiz.txt' dosyasina basariyla kaydedildi.");
        } catch (IOException e) {
            System.out.println("Dosyaya yazilirken bir hata olustu: " + e.getMessage());
        }

        //  Güçlü Şifreyi Tebrik :)
        if (sifreGucu.equals("Guclu")) {
            System.out.println("Tebrikler! Guclu bir sifre. Inanmaya basliyorsun :)");
            try {
                // Videonun src/main/resources klasöründe olduğunu belirten göreceli yol.
                File medyaDosyasi = new File("src/main/resources/sifrecokguclu.mp4");

                if (medyaDosyasi.exists()) {
                    Desktop.getDesktop().open(medyaDosyasi);
                } else {
                    System.out.println("Hata: Video bulunamadı! Lutfen videoyu src/main/resources klasorune eklediginizden emin olun.");
                }
            } catch (Exception e) {
                System.out.println("Video acilirken bir sorun olustu: " + e.getMessage());
            }
        }

        girdi.close();
    }
}
