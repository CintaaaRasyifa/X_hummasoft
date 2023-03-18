import java.util.*;

public class tugas2_PerulanganLanjutan {
    
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int angka;

        do {
            System.out.print("Masukkan angka berapapun kecuali (0) : ");
            angka = input.nextInt();            

        } while ( angka != 0);

        input.close();
    }
}
