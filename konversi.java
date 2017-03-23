package Latihan;

public class konversi {
    public String[] huruf= {"","satu","dua","tiga","empat","lima","enam","tujuh","delapan","sembilan","sepuluh","sebelas"};
    public String[] angka= {"0","1","2","3","4","5","6","7","8","9","10","11"};
    
//    String inputh;
//    public konversi(String inputh) {
//        this.inputh = inputh;
//    }
        public String konversi2 (int angka) {
        String konversi = ""; 
        if (angka < 12 ) 
            konversi+=huruf[angka];
        else if(angka < 20)
            konversi+=(konversi2(angka-10))+" belas ";
        else if(angka < 100)
            konversi+=(konversi2(angka/10))+" puluh "+(konversi2(angka%10));
        else if(angka < 200)
            konversi+=" seratus "+((konversi2((angka-100))));
        else if (angka < 1000)
            konversi+=(konversi2(angka/100))+" ratus "+(konversi2(angka%100));
        return konversi;
        }
    
}
    

