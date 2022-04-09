/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas7;

/**
 *
 * @author citra
 */
public class Toko {
    
    public Toko(int nData) {
        this.setnData(nData);
        this.kode = new String[this.getnData()];
        this.nb = new String[this.getnData()];
        this.harga = new int[this.getnData()];
        this.jb = new int[this.getnData()];
        this.bayar = new int[this.getnData()];
        this.nomor = new int[this.getnData()];
    }
    
    int nData;
    private String[] kode, nb;
    private int[] harga, jb, bayar, nomor;
    
    public int getnData() {
        return nData;
    }
    
    public void setnData(int nData) {
        if (nData >= 0) {
            this.nData = nData;
        } else {
            this.nData = 0;
        }
    }

    public String[] getKode() {
        return kode;
    }
    
    public String getKode(int index) {
        if (index >= 0 && index < this.getnData()) {
            return this.kode[index];
        } else {
            return "[!!] No Data";
        }
    }

    public void setKode(String[] kode) {
        this.kode = kode;
    }
    
    public void setKode(String kode, int index) {
        this.kode[index] = kode;
    }

    public String[] getNb() {
        return nb;
    }
    
     public String getNb(int index) {
        if (index >= 0 && index < this.getnData()) {
            return this.nb[index];
        } else {
            return "[!!] No Data";
        }
    }

    public void setNb(String[] nb) {
        this.nb = nb;
    }
    
    public void setNb(String nb, int index) {
        this.nb[index] = nb;
    }

    public int[] getHarga() {
        return harga;
    }
    
    public int getHarga(int index) {
        if (index >= 0 && index < this.getnData()) {
            return this.harga[index];
        } else {
            return -1;
        }
    }

    public void setHarga(int[] harga) {
        this.harga = harga;
    }
    
    public void setHarga(int harga, int index) {
        this.harga[index] = harga;
        
    }

    public int[] getJb() {
        return jb;
    }
    
    public int getJb(int index) {
        if (index >= 0 && index < this.getnData()) {
            return this.jb[index];
        } else {
            return -1;
        }
    }

    public void setJb(int[] jb) {
        this.jb = jb;
    }
    
    public void setJb(int jb, int index) {
        this.jb[index] = jb;  
    }

    public int[] getBayar() {
        return bayar;
    }
    
    public int getBayar(int index) {
        if (index >= 0 && index < this.getnData()) {
            return this.bayar[index];
        } else {
            return -1;
        }
    }

    public void setBayar(int[] bayar) {
        this.bayar = bayar;
    }
    public void setBayar(int bayar, int index) {
        this.bayar[index] = bayar;  
    }

    public int[] getNomor() {
        return nomor;
    }

    public void setNomor(int[] nomor) {
        this.nomor = nomor;
    }
}
