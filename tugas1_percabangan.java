import java.util.Scanner;

public class tugas1_percabangan {

    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        int belanja;

        System.out.print("Inputkan Total Belanja Anda : ");
         belanja = input.nextInt();

         if (belanja >= 500000){
             System.out.println("Selamat! Anda mendapat hadiah gantungan kunci");
         }
         input.close();
    }
}