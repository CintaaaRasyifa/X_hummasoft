import java.util.*;

public class tugas14_PerulanganLanjutan {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Inputkan Tinggi Piramida : ");
        int n = input.nextInt();
        for ( int i = 1; i <=n; i++) {
            //outerloop
            for ( int j = n-1; j >= i; j--) {
                System.out.print("   ");
            }
            
            for ( int k = 1; k <=i; k++) {
                System.out.print(" * ");
            }
            
            for ( int l = 1; l <= i-1; l++) {
                System.out.print(" * ");  
            }
            System.out.println();
        }
        input.close();
    }
}