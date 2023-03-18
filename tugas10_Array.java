public class tugas10_Array {

    public static void main(String [] args){
        String nama[] = {"Kenzo Ismail ","Desmon Daffa ","Kayla Isabela","Khansa Zakira"};
        int nilai[][] = {
            {80,91,62},
            {60,82,87},
            {89,59,65},
            {77,75,60},
        };
        int rata2;
        System.out.print("| No.  ");
        System.out.print("| Nama         ");
        System.out.print("| Nilai1  ");
        System.out.print("| Nilai2  ");
        System.out.print("| Nilai3  ");
        System.out.println("| ");
        for (int i = 0; i < nama.length;i++){
            System.out.print("| "+ (i + 1) +"    ");
            System.out.print("| " + nama[i]);
            for ( int j = 0; j < nilai[i].length;j++){
                    System.out.print("| "+nilai[i][j]+"      ");
            }
            System.out.println("| ");
        }
        System.out.print("\n\n");
        System.out.println("=====-Nilai Rata Rata======");
        for (int i = 0; i < nama.length;i++){
            System.out.print((i + 1) +". ");
            System.out.print(nama[i]);
            rata2 = 0;
            for ( int j = 0; j < nilai[i].length;j++){
                rata2 = rata2 + nilai[i][j];
            }
            System.out.println(" = " + rata2 / 3);
        }
    }
    
}
