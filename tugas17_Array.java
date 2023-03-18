import java.util.ArrayList;
import java.util.Scanner;

public class tugas17_Array {

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        String merkadd;
        ArrayList<String> merk = new ArrayList<String>();
        
        System.out.println("Pilihan Menu : ");
            System.out.println("1. Menambah data nama merk laptop ");
            System.out.println("2. Melihat daftar nama merk laptop  ");
            System.out.println("0. Keluar ");
            System.out.print("Pilihan Anda : ");
            int pilih = input.nextInt();

         do {
             if ( pilih == 1){
                System.out.print("Inputkan Data Merk Laptop : ");
                merkadd = input.next();
                merk.add(merkadd); 
             } else if ( pilih == 2){
                for ( int j = 0;j < merk.size();j++){
                    System.out.println((j+1)+". "+merk.get(j));
                }

             }
            
            System.out.println("Pilihan Menu : ");
            System.out.println("1. Menambah data nama merk laptop ");
            System.out.println("2. Melihat daftar nama merk laptop  ");
            System.out.println("0. Keluar ");
            System.out.print("Pilihan Anda : ");
            pilih = input.nextInt();


            }  while (pilih != 0);
        input.close();
    }
}