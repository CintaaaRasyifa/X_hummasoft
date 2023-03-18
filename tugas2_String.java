import java.util.*;

public class tugas2_String {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ketikkan Kalimat");
        String kalimat = input.next();
        int gaji = 0;
        int bonus = 0;

        System.out.println("Karakter = "+kalimat.length());
        if ( kalimat.length()  >= 100 ){
            gaji = (kalimat.length() / 100 * 10000);
            if (kalimat.length() % 100  >=50 ){
                gaji += 5000;
            }
        } else if ( kalimat.length() >=50 ){
            gaji = 5000;
        } else if ( kalimat.length() < 50 ){
            gaji = 2000;
        }

        System.out.println("Gaji Pokok = Rp."+gaji);
        if ( kalimat.length() >= 1000){
            bonus = gaji / 10;
        System.out.println("Gaji Bonus = Rp."+bonus);
        }
        System.out.println("Total Gaji Penulis = Rp."+(gaji+bonus));
        input.close();
    }
    
}
