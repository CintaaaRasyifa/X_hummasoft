import java.util.Scanner;

public class tugas2_Algoritma {
    public static int faktorial(int x){
        if ( x == 0){
            return 1;
        } else {
            return x * faktorial(x-1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Inputkan Angka Faktorial : ");
        int x = input.nextInt();
        System.out.println("Hasil Faktorialnya = "+faktorial(x));
        input.close();
    }
    
}
