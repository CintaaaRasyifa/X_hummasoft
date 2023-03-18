public class tugas11_String {
    public static void main(String[] args) {
        String kalimat = "Saya pergi ke pasar";
        String kata[] = kalimat.split(" ");
        for (int i = 0; i < kata.length;i++){
            System.out.print(" "+kata[i].charAt(1));
        }
    }
}
