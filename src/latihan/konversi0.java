package Latihan;

public class konversi0 {
    public String[] huruf= {"","satu","dua","tiga","empat","lima","enam","tujuh","delapan","sembilan","sepuluh","sebelas"};
    public String[] angka= {"0","1","2","3","4","5","6","7","8","9","10","11"};
    
    String inputh;
    public konversi0(String inputh) {
        this.inputh = inputh;
    }
    public String convert(String a) {
        inputh =a;
        if (inputh.equals(huruf[1])) {
            return angka[1];
        } else if (inputh.equals(huruf[2])) {
            return angka[2];
        } else if (inputh.equals(huruf[3])) {
            return angka[3];
        } else if (inputh.equals(huruf[4])) {
            return angka[4];
        } else if (inputh.equals(huruf[5])) {
            return angka[5];
        } else if (inputh.equals(huruf[6])) {
            return angka[6];
        } else if (inputh.equals(huruf[7])) {
            return angka[7];
        } else if (inputh.equals(huruf[8])) {
            return angka[8];
        } else if (inputh.equals(huruf[9])) {
            return angka[9];
        } else if (inputh.equals(huruf[10])) {
            return angka[10];
        } else if (inputh.equals(huruf[11])) {
            return angka[11];
        }return a;
    }
    public String convert() {
        String finish = null, x, y;
        
        if (inputh.substring(0, 3).equals(huruf[2])) {
            y = inputh.substring(4, 9);
            if (y.equals("belas")) {
                finish = angka[1] + angka[2];
            } else if (y.equals("puluh")) {
                finish = angka[2] + angka[0];
            }    
        } else if (inputh.substring(0, 4).equals(huruf[3]) || inputh.substring(0, 4).equals(huruf[5]) || inputh.substring(0, 4).equals(huruf[6])) {
            y = inputh.substring(5, 10);
            if (y.equals("belas")) {
                finish = angka[1] + convert(inputh.substring(0, 4));
            } else if (y.equals("puluh")) {
                finish = convert(inputh.substring(0, 4)) + angka[0];
            }
        } else if (inputh.substring(0, 5).equals(huruf[4]) || inputh.substring(0, 5).equals(huruf[7])) {
            y = inputh.substring(6, 11);
            if (y.equals("belas")) {
                finish = angka[1] + convert(inputh.substring(0,5));
            } else if (y.equals("puluh")) {
                finish = convert(inputh.substring(0, 5)) + angka[0];
            }
        } else if (inputh.substring(0, 8).equals(huruf[9])) {
            finish = angka[1] + angka[9];
        } else if (inputh.substring(0, 7).equals(huruf[8]) || inputh.substring(0, 7).equals(huruf[10]) || inputh.substring(0, 7).equals(huruf[11])) {
            y = inputh.substring(8, 13);
            if (y.equals("belas")) {
                finish = angka[1] + convert(inputh.substring(0,7));
            } else if (y.equals("puluh")) {
                finish = convert(inputh.substring(0, 7)) + angka[0];
            }
        }    
        return finish;
    }
}
