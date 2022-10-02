package Nusput.P2;

public class HandPhone {
    String jenis_hp;
    int tahun_pembuatan;
    public void setDataHP(String jenis_hp, int tahun_pembuatan){
        this.jenis_hp=jenis_hp;
        this.tahun_pembuatan=tahun_pembuatan;
    }

    String getJenisHp(){
        return this.jenis_hp;
    }

    int getTahunPembuatan(){
        return this.tahun_pembuatan;
    }

    public static void main(String[] args) {
        HandPhone hp=new HandPhone();
        hp.setDataHP("Redmi 10", 2021);
        System.out.println(hp.getJenisHp());
        System.out.println(hp.getTahunPembuatan());
    }
}


