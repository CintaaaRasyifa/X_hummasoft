import java.util.*;

public class tugas13_Array {

    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        int mA[][] = new int[3][2];
        int mB[][] = new int[3][2];
        int ab[][] = new int[3][2];

        for (int i =0; i < mA.length;i++){
            for (int j =0; j < mA[i].length;j++){
                System.out.print("Inputkan Nilai Matriks A Baris "+i+" Kolom "+j+" = ");
                mA[i][j] = input.nextInt();
            }
        }
        System.out.println("");
        for (int i =0; i < mB.length;i++){
            for (int j =0; j < mB[i].length;j++){
                System.out.print("Inputkan Nilai Matriks B Baris "+i+" Kolom "+j+" = ");
                mB[i][j] = input.nextInt();
            }
        }
        System.out.println("");
        System.out.println("==Matriks A==");
        for ( int i = 0; i < mA.length;i++){
            for (int j = 0; j< mA[i].length;j++){
                System.out.print(mA[i][j]+"\t");
            }
            System.out.println("");
        }

        
        System.out.println("==Matriks B==");
        for ( int i = 0; i < mB.length;i++){
            for (int j = 0; j< mB[i].length;j++){
                System.out.print(mB[i][j]+"\t");
            }
            System.out.println("");
        }

        
        System.out.println("==Hasil Pemjumblahan==");
        for ( int i = 0; i < mA.length;i++){
            for (int j = 0; j< mA[i].length;j++){
                ab[i][j] = mA[i][j] + mB[i][j];
                System.out.print(ab[i][j]+"\t");
            }
            System.out.println("");
        }
        input.close();
    }
    
}
