public class tugas9_String {

    public static void main(String[] args) {
        String kalimat = "hummasoft technology adalah software house asal malang";
        String kata[] = kalimat.split(" ");

        for (int i = 0; i < kata.length;i++){
            System.out.println(" kata "+kata[i].toUpperCase()+" Berjumblah "+kata[i].length()+" Huruf");
        }
    }
    
}
