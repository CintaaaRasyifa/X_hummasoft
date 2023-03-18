import java.util.Scanner;

public class tugas1_Algoritma {
    public static int hitungPangkat(int x,int y){
        if (y == 0){
            return 1;
        } else {
            return x * hitungPangkat(x, y - 1);
        }
        
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Inputkan angka yang dipangkatnya (x) : ");
        int x = input.nextInt();
        System.out.print("Inputkan Nilai Pangkatnya (y) : ");
        int y = input.nextInt();
        System.out.println("Hasilnya Pangkatnya Adalah : "+hitungPangkat(x, y));
        input.close();
    }
    
}
