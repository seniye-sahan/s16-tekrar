package org.example.company.sirin.maas;

public class MudurMaasi extends calisanMaasi {
    private int tecrubeYili;

    public MudurMaasi(double vergiOrani, double brutMaasi, int tecrubeYili) {
        super(vergiOrani, brutMaasi);
        this.tecrubeYili = tecrubeYili;
    }

    public int getTecrubeYili() {
        return tecrubeYili;
    }

    @Override
    public double hesapla(double bazMaas) {
        double netMaas = getBrutMaasi() - (getBrutMaasi() * getVergiOrani());
        return netMaas + (tecrubeYili * 1000);
    }
}