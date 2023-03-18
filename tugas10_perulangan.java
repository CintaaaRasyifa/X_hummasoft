import java.util.Scanner;

public class tugas10_perulangan {

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Apakah Anda Yakin Ingin Keluar? (ya/tidak):");
        String iya = input.nextLine();

        while (!iya.equalsIgnoreCase("ya")){
            System.out.print("Apakah Anda Yakin Ingin Keluar? (ya/tidak):");
               iya = input.nextLine();    
        }
        input.close();
    }
    
}
