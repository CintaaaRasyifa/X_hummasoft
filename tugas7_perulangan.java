import java.util.Scanner;

public class tugas7_perulangan {

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Inputkan Jumblah Deret : ");
        int a = input.nextInt();
        int b = 2;
        

        for (int i = 1; i <= a; i++){
             b += i;
            System.out.print(b +" ");
        }
        input.close();
    }
    
}
