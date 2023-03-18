public class tugas7_String {

    public static void main(String[] args) {
        String kata = "Di Kantor Hummasoft Saat Ini Sedang Memelihara dua hewan lucu, Tapi suka menghancurkan tangkai tanaman yang ada di halaman kantor";
        String c = "tumbuhan";
        System.out.println("===Kalimat sebelum di Replace===");
        System.out.println(kata);
        System.out.println("===Kalimat sesudah di Replace===");
        System.out.println(kata.replace("tanaman",c));
    }
    
}
