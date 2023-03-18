import java.util.Scanner;

public class tugas12_perulangan {

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.println("=========MENU========");
        System.out.println("1.Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Keluar");
        System.out.println("=====================");
        System.out.print("Masukkan menu pilihan anda : ");
        String menu = input.nextLine();

        do {
            if (menu.equals("1")){
            System.out.println("Anda Memilih Menu penjumlahan");
            System.out.println("=========MENU========");
        System.out.println("1.Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Keluar");
        System.out.println("=====================");
        System.out.print("Masukkan menu pilihan anda : ");
         menu = input.nextLine();
        } else if (menu.equals("2")){
            System.out.println("Anda Memilih Menu Penjumlahan");
            System.out.println("=========MENU========");
        System.out.println("1.Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Keluar");
        System.out.println("=====================");
        System.out.print("Masukkan menu pilihan anda : ");
         menu = input.nextLine();
        }
        } while (!menu.equalsIgnoreCase("3"));
            System.out.println("Program Berhenti!");
            input.close();
  }
}