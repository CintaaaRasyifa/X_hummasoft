public class tugas9_Array {

    public static void main(String []  args){
        int angka[][] = {     
            { 1, 2, 3, 4, 5 },
            { 6, 7, 8, 9, 10 },
            { 11, 12, 13, 14, 15 },
        }; //CINTAXRPL1
        int total = 0;
        for ( int i = 0;i < angka.length;i++){
            System.out.print("Total Pemjumlahan = ");
            for ( int j = 0; j < angka[i].length;j++){
                System.out.print(angka[i][j] + "  ");
                total = total + angka[i][j];
            }
        System.out.println(" = "+total);
        total = 0;
        }
 
    }
    
}
