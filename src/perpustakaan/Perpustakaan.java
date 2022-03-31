/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perpustakaan;

import java.util.Scanner;

/**
 *
 * @author rakar
 */
public class Perpustakaan {
    String cari;

    public static void main(String[] args) {
        Pelajar pelajar1 = new Pelajar ("Rahmat", "031", true);
        
        Buku buku1 = new Buku("biologi", "Gramedi4", 500, 3);
        
        System.out.println("1. Absensi Perpustakaan");
        System.out.println("2. Pencarian Buku");
        System.out.println("3. Peminjaman Buku");
        System.out.println("4. Pengajuan Surat Bebas Perpustakaan");
        System.out.println("5. Keluar");
        Scanner userInput = new Scanner(System.in);  
        System.out.println("Masukkan Pilihan :");
        int pilihan = userInput.nextInt();
        switch(pilihan){
            case 1:
                pelajar1.Absen();
                break;
            case 2:
                System.out.println("Masukkan Judul Buku Yang Dicari (Awalan judul huruf kecil, Tanpa Spasi dan menggunakan huruf kapital di awal kata berikutnya ) : ");
                buku1.pinjam();//ganti buku1 ke buku2 dst, pencarian masih manual
                break;
            case 3:
                System.out.println("Masukkan Judul Buku Yang Mau Dipinjam (Awalan judul huruf kecil, Tanpa Spasi dan menggunakan huruf kapital di awal kata berikutnya ) : ");
                buku1.pinjam();//ganti buku1 ke buku2 dst, masih manual
                break;
            case 4:
                pelajar1.Surat();
                break;
            default:
        
        }
           
    }
  }

