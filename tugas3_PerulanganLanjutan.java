public class tugas3_PerulanganLanjutan {

    public static void main(String [] args){
        int a = 1;
        int b = 0;
        int c = 1;
        for (int i = 1; i <=100;i++){
            System.out.print(c + " ");
            c = a + b;
            b = a;
            a= c;
            if ( c >=200 ){
                break;
            }
        }
    }
}