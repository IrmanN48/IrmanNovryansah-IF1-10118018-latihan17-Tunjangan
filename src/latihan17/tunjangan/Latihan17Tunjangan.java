/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan17.tunjangan;

import java.util.Scanner;

/**
 *
 * @author Aero
 * NAMA  : IRMAN NOVRYANSAH
 * KELAS : IF 1
 * NIM   : 10118018
 * Deskripsi Program : Program ini untuk menampilkan gaji akhir karyawan yang 
 *                     disertai tunjangan.
 */
public class Latihan17Tunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Deklarasi variable
        double gajiAwal;
        double tunjangan;
        double gajiAkhir;
        String status = null;
        
        //input data
        Scanner scanner = new Scanner (System.in);
        System.out.println("=========Program Tunjangan========");
        System.out.print("Berapa gaji pokok anda perbulan? : Rp.");
        gajiAwal = scanner.nextDouble();
        System.out.print("Status anda? (Menikah/Belum) : ");
        status = scanner.next();
        
        
        //proses
        if ("Menikah".equals(status) || "menikah".equals(status))
        tunjangan = gajiAwal * 0.35;
        else 
        tunjangan = 0;
        
        gajiAkhir = tunjangan + gajiAwal;
        
        //output data
        System.out.println("======Hasil Perhitungan Gaji Anda======");
        System.out.println("Gaji Pokok\t\t : "+gajiAwal);
        System.out.println("Tunjangan\t\t  : "+tunjangan);
        System.out.println("Total Gaji\t\t : "+gajiAkhir);
    }
    
}
