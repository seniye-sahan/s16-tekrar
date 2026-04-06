package org.example.company.sirin;

public class mudur extends calisan {

    public mudur(String isim, String cinsiyet, int telefonNo, String tcNo, String adres, int yas,
                 long id, String departman, String iseGiris, int maas) {

        super(isim, cinsiyet, telefonNo, tcNo, adres, yas, id, departman, iseGiris, maas);
    }

    public void departmanYonet() {
        System.out.println(getIsim() + " departmanı yönetiyor.");
    }
}