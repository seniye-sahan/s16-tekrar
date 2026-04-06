package org.example.company.sirin;

public class departman {
    private String isim;
    private calisan[] calisanlar;
    private mudur[] mudurler;
    private director[] directors;
    private takimLideri[] takimLiderleri;

    public departman(String isim, calisan[] calisanlar, mudur[] mudurler,
                     director[] directors, takimLideri[] takimLiderleri) {
        this.isim = isim;
        this.calisanlar = calisanlar;
        this.mudurler = mudurler;
        this.directors = directors;
        this.takimLiderleri = takimLiderleri;
    }

    public String getIsim() {
        return isim;
    }

    public calisan[] getCalisanlar() {
        return calisanlar;
    }

    public mudur[] getMudurler() {
        return mudurler;
    }

    public director[] getDirectors() {
        return directors;
    }

    public takimLideri[] getTakimLiderleri() {
        return takimLiderleri;
    }
}