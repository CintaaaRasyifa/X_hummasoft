import java.util.*;

public class tugas11_Array {

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Inputkan Jumlah Data : ");
        int n = input.nextInt();

        String nama[] = new String[n];
        int nilai[][] = new int[n][3];
        int total[] = new int[n];
        int rata2[] = new int[n];

        for (int i = 0; i < nama.length;i++){
            System.out.print("Inputkan Nama Ke-"+ (i +1) + " : ");
            nama[i] = input.next();
        }
        System.out.print("\n\n");
        for (int i = 0; i < n;i++){
            total[i] = 0;
            for (int j = 0; j < nilai[i].length;j++){
                System.out.print("Inputkan Nilai Ke-" +(i+1)+"  "+nama[i]+" = ");
                nilai[i][j] = input.nextInt();
                total[i] = total[i] + nilai[i][j];
            }
            System.out.print("\n");
        }
        System.out.print("\n\n");
        System.out.println("=====Nilai Rata Rata Siswa=====");
        for ( int i = 0;i < n;i++){
            System.out.print(nama[i]);
            rata2[i] = total[i] / 3;
            System.out.print("  " + rata2[i]+" ==> ");
            if (rata2[i] >=81 && rata2[i]<=100){
                System.out.println(" Nilai A ");
            } else if (rata2[i] >=71 && rata2[i]<=80){
                System.out.println(" Nilai B ");
            } else if (rata2[i] >=51 && rata2[i]<=70){
                System.out.println(" Nilai C ");
            } else if (rata2[i] >=31 && rata2[i]<=50){
                System.out.println(" Nilai D ");
            } else if (rata2[i] >=0 && rata2[i]<=30){
                System.out.println(" Nilai E ");
            } 

        }
        input.close();

    }
    
}
