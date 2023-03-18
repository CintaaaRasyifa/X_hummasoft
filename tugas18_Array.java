import java.util.ArrayList;
import java.util.Scanner;

public class tugas18_Array {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("inputkan Jumlah Angka Yang Diinginkan : ");
        int n = input.nextInt();
        double total = 0.0;
        int nomer;
        ArrayList<Integer> angka = new ArrayList<Integer>();

        for (int i = 0; i < n;i++){
            System.out.print("Inputkan Angka ke-"+(i+1)+" : ");
            nomer = input.nextInt();
            angka.add(nomer);
        }

        for ( int i = 0; i < angka.size();i++){
            total += angka.get(i);
        }
       
        System.out.println("Totalnya = "+total);
        double p = 0;
        p = total;
        double rata2 = p / n; 
        System.out.println("Rata Ratanya = "+rata2);
        input.close();
    }


    
}
