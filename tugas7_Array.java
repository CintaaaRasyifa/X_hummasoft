public class tugas7_Array {

    public static void main(String []  args){
        String data[][] = {
            {" Xiaomi ", " Poco M3 ", " 1850000 "},
            {" Oppo ", " Reno 6 ", " 4299000 "},
            {" Vivo ", " Y2 ", " 1635000"},
            {" Oppo ", " A15 ", " 1618500 "},
            {" Samsung ", " Galaxy A2 ", " 1990000 "},
        };
        for (int i = 0;i < data.length;i++){
            System.out.println("");
            System.out.println("Data Handphone Ke-"+ (i + 1));
            for(int j = 0;j < data[i].length;j++){
                if (j == 0){
                    System.out.println("Merk = "+data[i][j]);
                } else if (j == 1){
                    System.out.println("Tipe = "+data[i][j]);
                } else if (j == 2){
                    System.out.println("Harga = "+data[i][j]);
                }
                
            }
        }
    }
    
}
