package com.google.bt5_createlist;

public class MonAn {
    private String tenmon;
    private String nota;
    private int hinh;

    public MonAn(String tenmon, String nota, int hinh) {
        this.tenmon = tenmon;
        this.nota = nota;
        this.hinh = hinh;
    }

    public String getTenmon() {

        return tenmon;
    }

    public void setTenmon(String tenmon) {

        this.tenmon = tenmon;
    }

    public String getNota() {

        return nota;
    }

    public void setNota(String nota) {

        this.nota = nota;
    }

    public int getHinh() {

        return hinh;
    }

    public void setHinh(int hinh) {

        this.hinh = hinh;
    }
}
