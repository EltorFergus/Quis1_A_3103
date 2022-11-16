/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.quis1_a_3103;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author ACER
 * Eltor Fergus A.R
 * 21103103
 */
public class Quis1_A_3103 {

    public static void main(String[] args) {
        Mahasiswa_3103 x = new Mahasiswa_3103();
        Mahasiswa_3103 y = new Mahasiswa_3103();
        Dosen_3103 f = new Dosen_3103();
        Dosen_3103 g = new Dosen_3103();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("NIK     : ");
            x.NIK = br.readLine();
            System.out.println("Nama    : ");
            x.nama = br.readLine();
            System.out.println("Umur    : ");
            x.umur = Integer.parseInt(br.readLine());
            System.out.println("Alamat  : ");
            x.alamat = br.readLine();
            System.out.println("NIM     : ");
            x.nim = br.readLine();
            System.out.println("IPK     : ");
            x.ipk = Float.parseFloat(br.readLine());
            System.out.println();
            
            System.out.println("NIK     : ");
            y.NIK = br.readLine();
            System.out.println("Nama    : ");
            y.nama = br.readLine();
            System.out.println("Umur    : ");
            y.umur = Integer.parseInt(br.readLine());
            System.out.println("Alamat  : ");
            y.alamat = br.readLine();
            System.out.println("NIM     : ");
            y.nim = br.readLine();
            System.out.println("IPK     : ");
            y.ipk = Float.parseFloat(br.readLine());
            System.out.println();
            
            System.out.println("NIK             : ");
            f.NIK = br.readLine();
            System.out.println("Nama            : ");
            f.nama = br.readLine();
            System.out.println("Umur            : ");
            f.umur = Integer.parseInt(br.readLine());
            System.out.println("Alamat          : ");
            f.alamat = br.readLine();
            System.out.println("NIDN            : ");
            f.NIDN = br.readLine();
            System.out.println("Golongan        : ");
            f.gol = br.readLine();
            System.out.println("Gaji Pokok      : ");
            f.gajiPokok = Integer.parseInt(br.readLine());
            System.out.println("");
            
            System.out.println("NIK             : ");
            g.NIK = br.readLine();
            System.out.println("Nama            : ");
            g.nama = br.readLine();
            System.out.println("Umur            : ");
            g.umur = Integer.parseInt(br.readLine());
            System.out.println("Alamat          : ");
            g.alamat = br.readLine();
            System.out.println("NIDN            : ");
            g.NIDN = br.readLine();
            System.out.println("Golongan        : ");
            g.gol = br.readLine();
            System.out.println("Gaji Pokok      : ");
            g.gajiPokok = Integer.parseInt(br.readLine());
            System.out.println("");
            
            System.out.println("==== DATA MAHASISWA ====");
            x.tampilDataMahasiswa_3103();
            x.tampilDataBeasiswa();
            System.out.println("");
            y.tampilDataMahasiswa_3103();
            y.tampilDataBeasiswa();
            System.out.println("====== DATA DOSEN ======");
            f.tampilDataDosen();
            System.out.println("Total Pendapatan    : Rp "+f.totalPendapatan());
            System.out.println("");
            g.tampilDataDosen();
            System.out.println("Total Pendapatan    : Rp "+g.totalPendapatan());
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }
}
