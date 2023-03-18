import java.util.Scanner;

public class tugas7_Algoritma {

    public static void selectionSortAscendingKiri(int arr[]){
        int min,temp;
        for (int i = 0; i < arr.length-1;i++){
            min = i;
            for (int j = (i + 1);j < arr.length;j++){
                if ( arr[j] < arr[min]){
                    min = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        for (int i = 0; i < arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Jumblah Data : ");
        int n = input.nextInt();
        int arr[] = new int[n];
        System.out.println("===Inputkan Nilai===");

        for (int i = 0; i < arr.length ; i++){
            System.out.print("Inputkan Nilai Ke "+(i+1)+" : ");
            arr[i] = input.nextInt();
        }
        System.out.println("===Angka Sebelum Diurutkan===");
        for ( int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println("");
        System.out.println("===Angka Setelah Diurutkan===");
        selectionSortAscendingKiri(arr);
        input.close();
    }
    
}
