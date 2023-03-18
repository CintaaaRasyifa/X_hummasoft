import java.util.Scanner;

public class tugas9_perulangan {

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Inputkan Nilai: ");
        int a = input.nextInt();
        long b = 1;
        while (a > 0){
            b = b*a;
            a--;     
        } 
          System.out.println("Faktorialnya = "+b); 
          input.close(); 
    }
    
}

