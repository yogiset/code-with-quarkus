package id.shellrean.dto;

import java.time.LocalDate;



public class Karyawan {
    private String kodekaryawan;
    private String nama;
    private LocalDate tanggallahir;
    private Integer umur;
    private String alamat;
    private String no_hp;
    private byte[] imageurl;


    public Karyawan(String kodekaryawan, String nama, LocalDate tanggallahir, Integer umur, String alamat, String no_hp, byte[] imageurl) {
        this.kodekaryawan = kodekaryawan;
        this.nama = nama;
        this.tanggallahir = tanggallahir;
        this.umur = umur;
        this.alamat = alamat;
        this.no_hp = no_hp;
        this.imageurl = imageurl;
    }

    public String getKodekaryawan() {
        return kodekaryawan;
    }

    public void setKodekaryawan(String kodekaryawan) {
        this.kodekaryawan = kodekaryawan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public LocalDate getTanggallahir() {
        return tanggallahir;
    }

    public void setTanggallahir(LocalDate tanggallahir) {
        this.tanggallahir = tanggallahir;
    }

    public Integer getUmur() {
        return umur;
    }

    public void setUmur(Integer umur) {
        this.umur = umur;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNo_hp() {
        return no_hp;
    }

    public void setNo_hp(String no_hp) {
        this.no_hp = no_hp;
    }

    public byte[] getImageurl() {
        return imageurl;
    }

    public void setImageurl(byte[] imageurl) {
        this.imageurl = imageurl;
    }
}
