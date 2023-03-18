public class tugas12_Array {

    public static void main(String [] args){
        int matriksA[][] = {{4,5},{3,2}};
        int matriksB[][] = {{6,2},{8,4}};

        int pemjumlahMatriks[][] = new int[2][2];

        System.out.println("==Matriks A==");
        for ( int i = 0; i < matriksA.length;i++){
            for (int j = 0; j< matriksA[i].length;j++){
                System.out.print(matriksA[i][j]+"\t");
            }
            System.out.println("");
        }

        
        System.out.println("==Matriks B==");
        for ( int i = 0; i < matriksB.length;i++){
            for (int j = 0; j< matriksB[i].length;j++){
                System.out.print(matriksB[i][j]+"\t");
            }
            System.out.println("");
        }
        System.out.println("==Hasil Pemjumlahan==");
        for ( int i = 0; i < matriksA.length;i++){
            for (int j = 0; j< matriksA[i].length;j++){
                pemjumlahMatriks[i][j] = matriksA[i][j] + matriksB[i][j];
                System.out.print(pemjumlahMatriks[i][j]+"\t");
            }
            System.out.println("");
        }
    }
    
}
