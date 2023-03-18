import java.util.Scanner;

public class tugas1_String {

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Inputkan Kalimat : ");
        String kalimat = input.next();
        System.out.println("Jumlah Karakter : "+kalimat.length());

        if (kalimat.length() < 10 ){
            System.out.println("LOW");
        } else if ( kalimat.length()>=10 && kalimat.length()<50){
            System.out.println("MEDIUM");
        } else if ( kalimat.length() >=50){
            System.out.println("HIGH");
        }
        input.close();
        
    }
}