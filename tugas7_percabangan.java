import java.util.Scanner;

public class tugas7_percabangan {

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

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
        input.close();
    }
    
}
