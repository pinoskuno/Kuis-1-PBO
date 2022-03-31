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
public class Buku {
     String judul;
    String pengarang;
    int jmlHalaman;
    int stok;
    String peminjam;
   
    //Constructor
    Buku (String judul, String pengarang, int jmlHalaman, int stok){
        this.judul = judul ;
        this.pengarang = pengarang ;
        this.jmlHalaman = jmlHalaman ;
        this.stok = stok;
    }

    //Methode
    void tampilkan() {
    System.out.println("Judul : "+judul);
    System.out.println("Pengarang : " +pengarang);
    System.out.println("Jumlah Halaman "+jmlHalaman);
    System.out.println("Stok : "+stok);
    }
    void pinjam(){
        Scanner userInput = new Scanner(System.in);
        String cari = userInput.next();
        if(cari.equals(this.judul)){
            tampilkan();
            if(stok>=1){
                System.out.println("Apakah Ingin Meminjam Buku ?(y/t)");
                String meminjam = userInput.next();
                if ("y".equals(meminjam)||"Y".equals(meminjam)){
                    System.out.println("Masukkan ID Pengguna Anda :");
                    this.peminjam = userInput.next();
                    stok--;
                    tampilkan();
                    System.out.println("ID Peminjam "+this.peminjam);
                }
                else{
                
                }
            }
            else{
                System.out.println("Stok Buku 0 Tidak Dapat Meminjam");
            }
        }
        else {
            System.out.println("Maaf Buku Yang Anda Cari Tidak Tersedia");
        }
    }
    
    
}

