public class tugas13_String {
    public static void main(String[] args) {
        String kata = "hummasoft ";
        String huruf[] = kata.split("");
        for (int i = huruf.length; i >=1;i--){
            System.out.print(huruf[i-1]+" ");
        }
    }
    
}
