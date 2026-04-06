package org.example.company.sirin.maas;

public class CEOMaasi extends calisanMaasi {

    public CEOMaasi(double vergiOrani, double brutMaasi) {
        super(vergiOrani, brutMaasi);
    }

    @Override
    public double hesapla(double bazMaas) {
        double brut = getBrutMaasi();
        double vergi = getVergiOrani();

        double netMaasi = brut - (brut * vergi);

        return netMaasi + 20000;
    }
}