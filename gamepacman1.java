package pacman;

import java.util.Scanner;

public class gamepacman1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        pacman pm = new pacman();
        String tombol;
        int[][] kotak = new int[10][10];
        kotak[2][8] = 3;
        kotak[3][2] = 3;
        kotak[4][1] = 3;
        kotak[7][1] = 3;
        int point = 0, langkah = 20, makanan = 0;
        pm.setAwal();
        System.out.println("GAME PAC-R");
        do {
            for (int baris = 0; baris < 10; baris++) {
                for (int kolom = 0; kolom < 10; kolom++) {
                    if (kotak[kolom][baris] != 3) {
                        kotak[kolom][baris] = 0;
                        if (baris == 0 || baris == 9 || kolom == 0 || kolom == 9 || baris == 2 && kolom == 1 || baris == 2 && kolom == 2 || baris == 6 && kolom == 8 || baris == 6 && kolom == 7 || baris == 6 && kolom == 6 || baris == 6 && kolom == 5) {
                            kotak[kolom][baris] = 2;
                        }
                    }
                }
            }

            kotak[pm.getX()][pm.getY()] = 1;
            for (int baris = 0; baris < 10; baris++) {
                for (int kolom = 0; kolom < 10; kolom++) {
                    if (kotak[kolom][baris] == 3) {
                        System.out.print("*");
                    }
                    if (kotak[kolom][baris] == 2) {
                        System.out.print("#");
                    }
                    if (kotak[kolom][baris] == 1) {
                        System.out.print("R");
                        
                        if (baris == 8 && kolom == 2 || baris == 2 && kolom == 3 || baris == 1 && kolom == 4 || baris == 1 && kolom == 7) {
                            point++;
                        }
                    }
                    if (kotak[kolom][baris] == 0) {
                        System.out.print(" ");
                    }
                }
                System.out.println(" ");
            }
            System.out.print("Gerakan  :");
            tombol = in.nextLine();
//            if (null != tombol) {
            switch (tombol) {
                case "d":
                    pm.setKanan();
                    break;
                case "s":
                    pm.setTurun();
                    break;
                case "a":
                    pm.setKiri();
                    break;
                case "w":
                    pm.setNaik();
                    break;
                default:
                    break;
            }
            System.out.println("Langkah :" + (20 - pm.getCounter()));
            System.out.println("Point :" + point);
            System.out.println(" ");

            if (point == 4) {
                System.out.println("Selamat! Anda Memenangkan Game Seru Ini");
                System.exit(0);
            }
        } while (pm.getCounter() < 20);
        if (point == 4) {
            System.out.println("Selamat! Anda Memenangkan Game Seru Ini");
        }
        else {
            System.out.println("Maaf! Anda Kalah");
        }
    }
}
