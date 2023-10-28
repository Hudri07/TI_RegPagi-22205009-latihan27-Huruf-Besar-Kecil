/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TIRegPagi22205009latihan27HurufBesarKecil;
import java.util.Scanner;
/**
 *
 * @author Axioo
 * NAMA     : Asmalik Hudri
 * Prodi    : Teknik Informatika
 * NIM      : 22205009
 * Deskripsi Program    : Program ini berisi program untuk menampilkan
 * formatting kalimat menjadi huruf besar dan kecil dimana user 
 * menginputkan sendiri kalimatnya
 * 
 */
public class TIRegPagi22205009latihan27HurufBesarKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Kalimat : ");
        String kalimat = scanner.nextLine();
        
        String kalimatBesar = kalimat.toUpperCase();
        String kalimatKecil = kalimat.toLowerCase();
        
        System.out.println("\n=====Hasil Formatting=====");
        System.out.println("Huruf Besar : " +kalimatBesar);
        System.out.println("Huruf Kecil : " +kalimatKecil);
    }
    
}
