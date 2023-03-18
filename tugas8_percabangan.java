import java.util.Scanner;

public class tugas8_percabangan {

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Inputkan Angka Pertama : ");
        int a = input.nextInt();
        System.out.print("Inputkan Angka Kedua : ");
        int b = input.nextInt();

        if ( a % 2 == 0){
            System.out.println( a +" Adalah Bilangan Genap");
        } else 
            System.out.println( a +" Adalah Bilangan Ganjil");

        if ( b % 2 == 0){
            System.out.println( b +" Adalah Bilangan Genap");
        } else 
            System.out.println( b +" Adalah Bilangan Ganjil");
        input.close();
    }
    
}

