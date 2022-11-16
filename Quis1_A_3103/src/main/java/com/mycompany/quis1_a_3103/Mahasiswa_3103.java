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
public class Mahasiswa_3103 extends Penduduk_3103 {
    String nim;
    float ipk;
    
    public void tampilDataMahasiswa_3103(){
        tampilDataPenduduk();
        System.out.println("NIM         : "+nim);
        System.out.println("IPK         : "+ipk);
    }
    public void tampilDataBeasiswa(){
        if(ipk > 3.5){
            System.out.println("Mahasiswa bernama "+nama+" berhak mendapatkan beasiswa");
        }else{
            System.out.println("Mahasiswa bernama "+nama+" tidak berhak mendapatkan beasiswa");
        }
    }
}
