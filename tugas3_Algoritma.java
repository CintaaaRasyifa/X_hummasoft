import java.util.Scanner;

public class tugas3_Algoritma {
    public static int fibonacci(int x){
        if ( x==0 || x == 1){
            return 1;
        } else {
            return fibonacci(x-1) + fibonacci(x-2);
        }
        
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Inputkan deret (x) : ");
        int x = input.nextInt();
        System.out.print("Hasilnya = ");
        for (int i = 0; i < x;i++){
            System.out.print(fibonacci(i)+"  ");
        }
        input.close();
    }
    
}
