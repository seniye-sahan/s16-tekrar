package org.example.company.sirin;

public class director extends calisan {

    private departman[] departmans;

    public director(String isim, String cinsiyet, int telefonNo, String tcNo, String adres, int yas,
                    long id, String departman, String iseGiris, int maas,
                    departman[] departmans) {

        super(isim, cinsiyet, telefonNo, tcNo, adres, yas, id, departman, iseGiris, maas);

        this.departmans = departmans;
    }

    public departman[] getDepartmans() {
        return departmans;
    }

    public void departmanlariYonet() {
        System.out.println(getIsim() + " birden fazla departmanı yönetiyor.");
    }
}