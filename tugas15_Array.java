import java.util.*;

public class tugas15_Array {
    
    public static void main(String [] args){
        ArrayList<Integer> angka = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));

        System.out.println("Daftar Angka : "+"\n");
        for ( int i = 0;i < angka.size();i++){
            System.out.print("   "+angka.get(i));
       }
       System.out.print("\n\n");
       System.out.println("Manambahkan Angka 60 S/d 80 "+"\n");
        angka.add(60);
        angka.add(70);
        angka.add(80);
        System.out.print("Daftar Angka Setelah Ditambahkan : "+"\n\n");
        for ( int i = 0;i < angka.size();i++){
            System.out.print("   "+angka.get(i));
        }
    }
}
