import java.io.*;

public class tugas3_Array {

    public static void main(String [] args) throws IOException{
        BufferedReader input = new BufferedReader( new InputStreamReader(System.in));

        String hp[] = new String[3];
        String laptop[] = new String[3];

        for (int i = 0;i < hp.length;i++){
            System.out.print("Inputkan Merek Hp : ");
            hp[i] = input.readLine();
        }
        for (int j = 0;j < laptop.length;j++){
            System.out.print("Inputkan Merek Laptop : ");
            laptop[j] = input.readLine();
        }
        System.out.println("---------Data Hp--------");
        for (int k = 0;k < hp.length;k++){
            System.out.println((k + 1)+". "+hp[k]);
        }
        System.out.println("--------Data Laptop--------");
        for (int l = 0;l < laptop.length;l++){
            System.out.println((l + 1)+". "+laptop[l]);
        }
    }
    
}
