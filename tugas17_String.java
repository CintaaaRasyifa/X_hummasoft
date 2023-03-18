import java.util.Scanner;

public class tugas17_String {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Inputkan nama depan : ");
        String depan = input.nextLine();
        System.out.print("Inputkan nama belakang : ");
        String belakang = input.nextLine();
        System.out.print("Inputkan alamat : ");
        String alamat = input.nextLine();
        String namaLengkap = depan + " " + belakang;
        String alamatLengkap = namaLengkap+" " +alamat;
        System.out.println("Nama Lengkap Saya : "+namaLengkap);
        System.out.println("alamat "+namaLengkap+" di "+alamat);
        String huruf[] = alamatLengkap.split("");
        for (int i = 0; i < huruf.length;i++){
            if (i % 2 == 0){
                System.out.print(huruf[i].toUpperCase());
            } else if ( i % 2 == 1){
                System.out.print(huruf[i].toLowerCase());
            }
        }
    input.close();
    }
    
}
