import java.util.*;

public class tugas9_PerulanganLanjutan {

    public static void main(String []  args){
        Scanner input = new Scanner(System.in);
        System.out.print("Input : ");
        int n = input.nextInt();
        for (int i = 1; i <=n;i++){
            for(int j = 1;j <=n;j++){
                System.out.print(" * ");
            }
            System.out.println("");
        }
        input.close();
    }
    
}
