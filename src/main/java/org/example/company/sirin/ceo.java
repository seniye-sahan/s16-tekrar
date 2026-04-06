package org.example.company.sirin;

public class ceo extends calisan {

    public ceo(String isim, String cinsiyet, int telefonNo, String tcNo, String adres, int yas,
               long id, String departman, String iseGiris, int maas) {

        super(isim, cinsiyet, telefonNo, tcNo, adres, yas, id, departman, iseGiris, maas);
    }

    public void sirketiYonet() {
        System.out.println(getIsim() + " şirketi yönetiyor.");
    }
}