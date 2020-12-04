/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if2.pkg10119058.carakamuhamadrahman.no1;

/**
 *
 * @author
 * NAMA     : Caraka Muhamad Rahman
 * KELAS    : PBOIF2
 * NIM      : 10119058
 * Deskripsi Program : Program ini berisi program untuk mengeteahui umur kita.
 */
public class Age {
     private int yearBirth;
    private int yearNow;
    private String red = "\033[0;31m";
    
    public Age(int yearNow) {
        this.yearNow = yearNow;
    }
    public int getYearBirth() {
      return this.yearBirth;
    }
        
    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }
    
    public int getYearNow() {
        return this.yearNow;
    }
    
    public int hitungUmur() {
        return yearNow - yearBirth;
    }
    
    public String tandanyaKamu(int umur) {
        String tandanyaKamu;
        
        if (umur >= 0 && umur <= 5) {
            tandanyaKamu = "LAGI LUCU-LUCU NYA";
        } else if (umur > 5 && umur <= 10) {
            tandanyaKamu = "MASIH ANAK-ANAK";
        } else if (umur > 10 && umur <= 13) {
            tandanyaKamu = "MASIH REMADJA";
        } else if (umur > 13 && umur <= 19) {
            tandanyaKamu = "ALAY";
        } else if (umur > 19 && umur <= 29) {
            tandanyaKamu = "LAGI GALAU NYARI JODOH";
        } else if (umur > 29 && umur <= 35) {
            tandanyaKamu = "LAGI SIBUK NYARI UANG";
        } else if (umur > 35 && umur <= 150) {
            tandanyaKamu = "SUDAH TUA";
        } else {
            tandanyaKamu = "TIDAK TERDETEKSI DI KEHIDUPAN";
        }
        String kapital = tandanyaKamu.toUpperCase();
        return red.concat(kapital);
       
    }
}

