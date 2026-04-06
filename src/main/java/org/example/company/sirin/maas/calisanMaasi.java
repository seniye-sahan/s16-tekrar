package org.example.company.sirin.maas;

import org.example.company.MaasHesaplayici;

public class calisanMaasi implements MaasHesaplayici {

    private double vergiOrani;
    private double brutMaasi;

    public calisanMaasi(double vergiOrani, double brutMaasi) {
        this.vergiOrani = vergiOrani;
        this.brutMaasi = brutMaasi;
    }

    public double getVergiOrani() {
        return vergiOrani;
    }

    public double getBrutMaasi() {
        return brutMaasi;
    }

    @Override
    public double hesapla(double bazMaas) {
        double netMaasi = brutMaasi - (brutMaasi * vergiOrani);
        return netMaasi;
    }
}