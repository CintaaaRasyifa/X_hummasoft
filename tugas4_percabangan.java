import java.io.*;

public class tugas4_percabangan {

    public static void main(String [] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Mereknya Apa? : ");
        String merk = input.readLine();

        int ukuran = 0;
        int harga = 0;

        if (merk.equals("ABC")){
            System.out.print("Masukkan ukuran : ");
            ukuran = Integer.parseInt(input.readLine());

            if ( ukuran >=26 && ukuran <=30){
                harga = 160000;
            } else if ( ukuran >=31 && ukuran <=34){
                harga = 180000;
            }

            System.out.println("Merk = "+merk);
            System.out.println("Ukuran = "+ukuran);
            System.out.println("Harga = "+harga);

        } else if (merk.equals("DEF")){
        System.out.print("Ukurannya Apa : ");
        ukuran = Integer.parseInt(input.readLine());

        if ( ukuran >=26 && ukuran <=30){
            harga = 210000;
        } else if ( ukuran >=31 && ukuran <=34){
            harga = 220000;
        }

            System.out.println("Merk = "+merk);
            System.out.println("Ukuran = "+ukuran);
            System.out.println("Harga = "+harga);

        }  else {
            System.out.print("Merk yg anda masukkan tidak ada");
        }

    }
} 
