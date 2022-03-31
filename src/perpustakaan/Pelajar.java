/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaan;

import java.util.Scanner;

/**
 *
 * @author rakar
 */
public class Pelajar {
    String nama;
    String idPelajar;
    Boolean kehadiran;
    //Constructor
    Pelajar (String nama, String idPelajar, Boolean kehadiran){
        this.nama = nama ;
        this.idPelajar = idPelajar ;
        this.kehadiran = kehadiran ;
    }
    //methode
    void Absen(){
    Scanner userInput = new Scanner(System.in);
    System.out.println("Masukkan Nama :");
    this.nama = userInput.next();
    System.out.println("Masukkan ID Pelajar :");
    this.idPelajar = userInput.next();
    System.out.println("Kehadiran (true/false):");
    this.kehadiran = userInput.nextBoolean();
    }
    
    void Surat(){
    System.out.println("Pengajuan Surat Bebas Perpustakaan");
    Scanner userInput = new Scanner(System.in);
    System.out.println("Masukkan Nama :");
    this.nama = userInput.next();
    System.out.println("Masukkan ID Pelajar :");
    this.idPelajar = userInput.next();
    System.out.println("Pengajuan Surat Bebas Perpustakaan Atas Nama "+this.nama+" Telah Berhasil Dilakukan");
    } 
}

