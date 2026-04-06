package org.example.company.sirin;

import org.example.company.insanInterface;

public class insan implements insanInterface {
    private String isim;
    private String cinsiyet;
    private int telefonNo;
    private String tcNo;
    private String adres;
    private int yas;

    public insan(String isim, int yas) {
        this.isim = isim;
        this.yas = yas;
    }

    public insan(String isim, String cinsiyet, int telefonNo, String tcNo, String adres, int yas) {
        this.isim = isim;
        this.cinsiyet = cinsiyet;
        this.telefonNo = telefonNo;
        this.tcNo = tcNo;
        this.adres = adres;
        this.yas = yas;
    }

    @Override
    public void live() {
        System.out.println("Çalışan hayatta.");
    }

    @Override
    public int move(int meter) {
        return meter;
    }

    @Override
    public void breath() {
        System.out.println("Çalışan nefes alabiliyor.");
    }

    public String getIsim() {
        return isim;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public int getTelefonNo() {
        return telefonNo;
    }

    public String getTcNo() {
        return tcNo;
    }

    public String getAdres() {
        return adres;
    }

    public int getYas() {
        return yas;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public void setTelefonNo(int telefonNo) {
        this.telefonNo = telefonNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }
}