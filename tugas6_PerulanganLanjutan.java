import java.util.*;

public class tugas6_PerulanganLanjutan {

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int nama = 0;
        int start = 0;
        for (int i = 1;i <=5;i++){
            System.out.print("Inputkan Angka ke-"+ i + ": ");
            nama = input.nextInt();
            if ( nama % 5 == 0){
                start = nama+start;
            } else {
                continue;
            }

        }
        System.out.print( "total "+ start );
        input.close();
    }
    
}
