import java.util.Scanner;

public class tugas9_Algoritma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka[] = {5,6,9,2,8,7,2};

        System.out.println("===Data Angka===");
        for ( int i = 0; i < angka.length;i++){
            System.out.print("\t"+angka[i]);
        }
        System.out.print("\nMasukkan angka yang dicari : ");
        int key = input.nextInt();

        for (int i = 0 ; i < angka.length; i++){
            if (angka[i] == key){
                System.out.println(" Angka "+key+" Ditemukan pada data ke-"+(i+1));
                break;
            }
        }
        input.close();
    }
}
