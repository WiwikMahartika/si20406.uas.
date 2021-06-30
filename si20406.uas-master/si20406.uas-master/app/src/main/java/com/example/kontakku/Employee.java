package com.example.kontakku;

public class Employee
{
    private String nama;
    private String nohp;
    public Employee(){}
    public Employee(String nama, String nohp) {
        this.nama = nama;
        this.nohp = nohp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNohp() {
        return nohp;
    }

    public void setNohp(String nohp) {
        this.nohp = nohp;
    }
}
