# Şifre Güvenlik Analizörü

Bu proje, kullanıcının girdiği şifreyi belirli güvenlik kriterlerine (uzunluk, büyük/küçük harf, rakam, özel karakter) göre analiz eden, sonuçları konsola yazdıran, `analiz.txt` dosyasına kaydeden ve şifre **"Güçlü"** kriterini sağladığında otomatik bir tebrik videosu oynatan nesne yönelimli bir Java konsol uygulamasıdır.

---

## 🚀 Özellikler

* **Kapsamlı Şifre Analizi:** En az 8 karakter, büyük harf, küçük harf, rakam ve özel karakter varlığını denetler.
* **Güvenlik Sınıflandırması:** Şifreyi kriter puanına göre **Güçlü**, **Orta** veya **Zayıf** olarak sınıflandırır.
* **Dosyalama (`analiz.txt`):** Yapılan analizin ayrıntılı dökümünü otomatik olarak bir metin dosyasına kaydeder.
* **Medya Tetikleyici:** Güçlü şifre girildiğinde projeye gömülü kutlama videosunu (`sifrecokguclu.mp4`) sistemin varsayılan medya oynatıcı ile otomatik olarak açar.
* **Maven Desteği:** Maven altyapısı ile yapılandırılmıştır.

---

## 🛠️ Kullanılan Teknolojiler ve Kütüphaneler

* **Java (JDK)**
* **Apache Maven** (Proje yönetim ve yapılandırma aracı)
* **Java I/O & Desktop API** (`FileWriter`, `PrintWriter`, `File`, `Desktop`)

---

## 📂 Proje Yapısı
```
Sifre-Guvenlik-Analizoru/
│
├── .git/
├── sifreAnalizor/
│   ├── src/
│   │   └── main/
│   │       ├── java/
│   │       │   └── com/mycompany/sifreanalizor/
│   │       │       └── SifreAnalizor.java
│   │       └── resources/
│   │           └── sifrecokguclu.mp4
│   └── pom.xml
│
├── .gitattributes
├── .gitignore
└── README.md
```
---

## ⚙️ Kurulum ve Çalıştırma

1. Projeyi bilgisayarınıza klonlayın veya indirin.

2. Projeyi Apache NetBeans (veya benzeri bir IDE) üzerinde açın.

3. src/main/resources/ klasörünün içinde sifrecokguclu.mp4 video dosyasının olduğundan emin olun.

4. SifreAnalizor.java dosyasını çalıştırın ve ekrandaki talimatları takip edin.

---
## 💻 Kullanım Örneği
```
Sifre Giriniz: GucluSifre1234?!
Sifre Analizi Baslatiliyor...
-------------
Uzunluk: Uygun
Buyuk Harf: Var
Kucuk Harf: Var
Rakam: Var
Ozel karakter: Var
-------------
```
Sifre Gucu: Guclu

Cikti sonucu 'analiz.txt' dosyasina basariyla kaydedildi.
Tebrikler! Guclu bir sifre. Inanmaya basliyorsun :)
*(Video otomatik olarak açılır)*
