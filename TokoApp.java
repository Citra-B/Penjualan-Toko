/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas7;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author citra
 */
public class TokoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var toko = new Toko(3);
        
        scanner.useDelimiter("\n");
        
        String kode, nb;
        int harga, jb, bayar, nomor;
        
        System.out.print("Masukan Item Barang : ");
        int jum = scanner.nextInt();
        toko.setnData(jum);
        System.out.println(" ");
        
        for (int i = 0; i < toko.getnData(); i++) {
            System.out.println("Data ke\t" + (i + 1) + "");
            System.out.print("Masukkan Kode\t\t: ");
            kode = scanner.next();
            
            System.out.print("Masukkan jumlah Beli\t: ");
            jb = scanner.nextInt();
         
            toko.setKode(kode, i);
            toko.setJb(jb, i);           
                  
            switch (kode){
                  case "a001" -> {
                      nb = "Buku  ";
                      harga = 3000;
                      bayar = harga* jb;
                      toko.setNb(nb, i);
                      toko.setHarga(harga, i);
                      toko.setBayar(bayar, i);
                      }
                  case "a002" -> {
                      nb = "Pensil  ";
                      harga = 4000;
                      bayar = harga* jb;
                      toko.setNb(nb, i);
                      toko.setHarga(harga, i);
                      toko.setBayar(bayar, i);
                      }
                  case "a003" -> {
                      nb = "Pulpen  ";
                      harga = 5000;
                      bayar = harga* jb;
                      toko.setNb(nb, i);
                      toko.setHarga(harga, i);
                      toko.setBayar(bayar, i);
                      }
                  default -> System.out.println("Kode Barang Tidak Tersedia");
            }   
        }
              
        System.out.println("\nTOKO SERBA ADA");
        System.out.println("*************************");
        System.out.println("============================================================================");  
        System.out.printf("%3s %7s %12s %8s %12s %17s", "No", "Kode Barang", "Nama Barang", "Harga", 
                "Jumlah Beli", "Jumlah Bayar\n");
        System.out.println("============================================================================");
        int sumTotalBayar = 0;
        for (int i = 0; i < toko.getnData(); i++) {
            nomor = i + 1;
            System.out.format("%2s %7s %15s %10s %10s %17s", nomor, toko.getKode(i), toko.getNb(i), 
                    toko.getHarga(i), toko.getJb(i), toko.getBayar(i));  
            System.out.println();
            sumTotalBayar = sumTotalBayar + toko.getBayar(i);
        }
        
        System.out.println();       
        System.out.println("============================================================================");
        System.out.println("Total Bayar\t\t\t\t" + sumTotalBayar);       
        System.out.println("============================================================================");
    }     
}
