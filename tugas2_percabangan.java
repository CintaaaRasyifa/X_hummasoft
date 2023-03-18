import java.util.Scanner;

public class tugas2_percabangan {

    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        int belanja;

        System.out.print("Inputkan Total Belanja Anda : ");
         belanja = input.nextInt();

         if (belanja >= 500000){
             System.out.println("Selamat! Anda mendapat hadiah gantungan kunci");
         } else {
             int selisih = 500000 - belanja;
             System.out.println("Total Belanja Anda Kurang Dari Rp.500000");
             System.out.println("Silakan Tambah Total Belanja Senilai Rp."+selisih);
             System.out.println("Agar Bisa Mendapatkan hadiah kunci");
         }
         
         input.close();
        
    }
}