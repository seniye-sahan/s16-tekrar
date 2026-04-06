package org.example.company.sirin;

import org.example.company.MaasHesaplayici;
import org.example.company.sirin.maas.CEOMaasi;
import org.example.company.sirin.maas.MudurMaasi;
import org.example.company.sirin.maas.calisanMaasi;

public class Main {
    public static void main(String[] args) {

        calisan calisan1 = new calisan(
                "Ali Yılmaz",
                "Erkek",
                555111223,
                "12345678901",
                "İstanbul",
                25,
                1001,
                "Yazılım",
                "2024-01-10",
                30000
        );

        mudur mudur1 = new mudur(
                "Ayşe Demir",
                "Kadın",
                555222334,
                "12345678902",
                "Ankara",
                38,
                2001,
                "Yazılım",
                "2020-03-15",
                50000
        );

        takimLideri takimLideri1 = new takimLideri(
                "Mehmet Kaya",
                "Erkek",
                555333445,
                "12345678903",
                "İzmir",
                32,
                3001,
                "Yazılım",
                "2021-06-01",
                40000
        );

        director director1 = new director(
                "Zeynep Arslan",
                "Kadın",
                555444556,
                "12345678904",
                "Bursa",
                45,
                4001,
                "Yönetim",
                "2018-09-20",
                70000,
                null
        );

        ceo ceo1 = new ceo(
                "Can Özkan",
                "Erkek",
                555555667,
                "12345678905",
                "İstanbul",
                50,
                5001,
                "Genel Müdürlük",
                "2015-01-05",
                100000
        );

        calisan[] calisanlar = {calisan1};
        mudur[] mudurler = {mudur1};
        director[] directors = {director1};
        takimLideri[] takimLiderleri = {takimLideri1};

        departman departman1 = new departman(
                "Yazılım Departmanı",
                calisanlar,
                mudurler,
                directors,
                takimLiderleri
        );

        System.out.println("===== ÇALIŞAN BİLGİLERİ =====");
        System.out.println("Çalışan adı: " + calisan1.getIsim());
        System.out.println("Departman: " + calisan1.getDepartman());
        System.out.println("Maaş: " + calisan1.getMaas());

        System.out.println("\n===== MÜDÜR BİLGİLERİ =====");
        System.out.println("Müdür adı: " + mudur1.getIsim());
        mudur1.departmanYonet();

        System.out.println("\n===== TAKIM LİDERİ BİLGİLERİ =====");
        System.out.println("Takım Lideri adı: " + takimLideri1.getIsim());
        takimLideri1.takimYonet();

        System.out.println("\n===== DİRECTOR BİLGİLERİ =====");
        System.out.println("Director adı: " + director1.getIsim());
        director1.departmanlariYonet();

        System.out.println("\n===== CEO BİLGİLERİ =====");
        System.out.println("CEO adı: " + ceo1.getIsim());
        ceo1.sirketiYonet();

        System.out.println("\n===== DEPARTMAN BİLGİLERİ =====");
        System.out.println("Departman adı: " + departman1.getIsim());
        System.out.println("Çalışan sayısı: " + departman1.getCalisanlar().length);
        System.out.println("Müdür sayısı: " + departman1.getMudurler().length);
        System.out.println("Director sayısı: " + departman1.getDirectors().length);
        System.out.println("Takım lideri sayısı: " + departman1.getTakimLiderleri().length);

        System.out.println("\n===== MAAŞ HESAPLARI =====");
        MaasHesaplayici calisanMaas = new calisanMaasi(0.20, 30000);
        MaasHesaplayici mudurMaas = new MudurMaasi(0.25, 50000, 5);
        MaasHesaplayici ceoMaas = new CEOMaasi(0.30, 100000);

        System.out.println("Çalışan net maaşı: " + calisanMaas.hesapla(30000));
        System.out.println("Müdür net maaşı: " + mudurMaas.hesapla(50000));
        System.out.println("CEO net maaşı: " + ceoMaas.hesapla(100000));

        System.out.println("\n===== POLYMORPHISM ÖRNEĞİ =====");
        MaasHesaplayici[] maaslar = {
                new calisanMaasi(0.20, 30000),
                new MudurMaasi(0.25, 50000, 5),
                new CEOMaasi(0.30, 100000)
        };

        for (MaasHesaplayici maas : maaslar) {
            System.out.println("Hesaplanan maaş: " + maas.hesapla(0));
        }

        System.out.println("\n===== KALITIM ÖRNEĞİ =====");
        calisan[] ekip = {calisan1, mudur1, takimLideri1, ceo1};

        for (calisan kisi : ekip) {
            System.out.println(kisi.getIsim() + " şirket çalışanıdır.");
        }
    }


    }
