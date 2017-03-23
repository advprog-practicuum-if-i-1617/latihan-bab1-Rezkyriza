package Latihan;
import java.util.Scanner;
public class konversi1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        konversi kv = new konversi();

        System.out.print("Masukkan angka yang akan di konversi: ");
        int angka = in.nextInt();
        if(angka == 0)
            System.out.println("Hasil konversi: nol");
        else
            System.out.println("Hasil konversi: "+ kv.konversi2(angka));
        System.out.println("===========================================");
        System.out.print("Masukkan huruf yang akan dikonversi: ");
        in.nextLine();
        String huruf = in.nextLine();
        konversi0 kv2 = new konversi0(huruf);
        if(huruf.equals("nol"))
            System.out.println("Hasil konversi: 0");
        else
            System.out.println("Hasil konversi: "+ kv2.convert());
        
        }    
}
