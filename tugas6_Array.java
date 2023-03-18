import java.util.*;

public class tugas6_Array {

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Inputkan Banyak Angka : ");
        int n = input.nextInt();
        int angka[] = new int[n];
        int besar = 0;

        for (int i = 0;i < angka.length;i++){
            System.out.print("Inputkan Angka Ke-" +( i + 1) + " : ");
            angka[i] = input.nextInt();
            if ( angka[i] > besar){
            besar = angka[i];   
            } 
        }
        System.out.print("Total Angkanya Adalah : "+besar);
        input.close();
    }
    
}
