import java.util.Scanner;

public class tugas13_perulangan {

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Inputkan Deret :");
        int d = input.nextInt();
        int a = 1;
        int b = 0;
        int c = 1;
        int m = 1;
        do {
            System.out.print(c + " ");
            c = a + b;
            b = a;
            a= c;
            m++;
        } while ( m <=d);
        input.close();
    } 
    
}
