import java.util.Scanner;

public class tugas9_percabangan {

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.println("====Pilihan Menu====");
        System.out.println("1. Penentuan Angka Terbesar");
        System.out.println("2. Penentuan Bilangan Ganjil dan Genap");
        System.out.println("====================");
        System.out.print("Masukkan Pilihan Anda : ");
        int pilih = input.nextInt();
        
        switch (pilih){
            case 1:
                System.out.print("Inputkan Angka Pertama : ");
            int a = input.nextInt();
                System.out.print("Inputkan Angka Kedua : ");
            int b = input.nextInt();

            if ( a > b){
                System.out.println("Angka yang lebih besar adalah = "+a);
            } else if ( a < b){
                System.out.println("Angka yang lebih besar adalah = "+b);
            } else if ( a == b){
                System.out.println("Angka Yang Anda inputkan Besarnya Sama");
            }
            break;
            case 2: 
            System.out.print("Inputkan Angka Pertama : ");
            int c = input.nextInt();
                System.out.print("Inputkan Angka Kedua : ");
            int d = input.nextInt();

            if ( c % 2 == 0){
                System.out.println( c +" Adalah Bilangan Genap");
            } else 
                System.out.println( c +" Adalah Bilangan Ganjil");

            if ( d % 2 == 0){
                System.out.println( d +" Adalah Bilangan Genap");
            } else 
                System.out.println( d +" Adalah Bilangan Ganjil");          
        }
        input.close();
    }
    
}
