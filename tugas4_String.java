import java.util.*;

public class tugas4_String {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String data[] = new String[3];

        System.out.println("Masukkan Inputan :");
        System.out.print("Nama   : ");
        data[0] = input.nextLine();
        System.out.print("Alamat : ");
        data[1] = input.nextLine();
        System.out.print("Email  : ");
        data[2] = input.nextLine();
        System.out.print("");

        for (int i = 1; i > 0;i++){
            if (data[0].isEmpty() == false){
                if (data[1].isEmpty() == false){
                    if (data[2].isEmpty() == false){
                        System.out.println("Nama Anda   : "+data[0]);
                        System.out.println("Alamat Anda : "+data[1]);
                        System.out.println("Email Anda  : "+data[2]);
                        break;
                    } else {
                        System.out.println("Email Tidak Boleh Kosong! ");
                        System.out.print("Nama   : ");
                        data[0] = input.nextLine();
                        System.out.print("Alamat : ");
                        data[1] = input.nextLine();
                        System.out.print("Email  : ");
                        data[2] = input.nextLine();
                        System.out.println("");
                    }

                } else {
                    System.out.println("Alamat Tidak Boleh Kosong! ");
                    System.out.print("Nama   : ");
                    data[0] = input.nextLine();
                    System.out.print("Alamat : ");
                    data[1] = input.nextLine();
                    System.out.print("Email  : ");
                    data[2] = input.nextLine();
                    System.out.println("");
                }
            } else {
                System.out.println("Nama Tidak Boleh Kosong! ");
                System.out.print("Nama   : ");
                data[0] = input.nextLine();
                System.out.print("Alamat : ");
                data[1] = input.nextLine();
                System.out.print("Email  : ");
                data[2] = input.nextLine();
                System.out.println("");
               
            }
        }
        input.close();
    }
    
}
