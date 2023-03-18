import java.util.*;

public class tugas3_percabangan {

    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Inputkan Score Anda : ");
        int nilai = input.nextInt();
        String nilaih;

        if (nilai >= 80 && nilai <=100) {
            nilaih = "A";
        }   else if (nilai >=71 && nilai <=80){
            nilaih = "B";
        }   else if (nilai >=51 && nilai <=70){
            nilaih = "C";
        }   else if (nilai >=31 && nilai <=50){
            nilaih = "D";
        }   else {
            nilaih = "E";
        }
            System.out.println("Nilai Anda Adalah :"+nilaih);
        input.close(); 
    }
}
