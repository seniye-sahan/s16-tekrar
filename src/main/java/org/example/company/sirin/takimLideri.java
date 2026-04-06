package org.example.company.sirin;

public class takimLideri extends calisan {

    public takimLideri(String isim, String cinsiyet, int telefonNo, String tcNo, String adres, int yas,
                       long id, String departman, String iseGiris, int maas) {

        super(isim, cinsiyet, telefonNo, tcNo, adres, yas, id, departman, iseGiris, maas);
    }

    public void takimYonet() {
        System.out.println(getIsim() + " takımı yönetiyor.");
    }
}