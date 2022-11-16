/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quis1_a_3103;

/**
 *
 * @author ACER
 * Eltor Fergus A.R
 * 21103103
 */
public class Dosen_3103 extends Penduduk_3103 {
    String NIDN,gol;
    int gajiPokok,tunjangan;
    double gajitotal;
    
    public double totalPendapatan(){
        switch(gol){
            case "IIIA":
                tunjangan = 300000;
            break;
            case "IIIB":
                tunjangan = 500000;
            break;
            case "IIIC":
                tunjangan = 700000;
            break;
        }
        gajitotal = gajiPokok + tunjangan;
        return gajitotal;
    }
    public void tampilDataDosen(){
        tampilDataPenduduk();
        System.out.println("NIDN         : "+NIDN);
        System.out.println("Golongan     : "+gol);
        System.out.println("Gaji Pokok   : "+gajiPokok);
    }
}
