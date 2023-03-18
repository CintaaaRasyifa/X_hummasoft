import java.util.Scanner;

public class tugas11_Algoritma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama[] = {"Misbahul", "Andre", "Ivan", "Andika", "Riyan","Afrizal"};

        System.out.println("===Data Siswa===");
        for (int i = 0; i < nama.length;i++){
            System.out.println((i+1)+". "+nama[i]);
        }
        System.out.print("\nMasukkan Key yang dicari : ");
        String key = input.next();

        for(int i = 0; i < nama.length;i++){
            if (nama[i].equalsIgnoreCase(key)){
                System.out.println("\nNama "+key+" Ditemukan Pada Data Ke-"+(i+1));
                break;
            }
        }
        input.close();
    }
    
}
