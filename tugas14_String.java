public class tugas14_String {
    public static void main(String[] args) {
        String kalimat = "Aksara Jawa Hanacaraka Padajayanya";
        String kata[] = kalimat.split("");
        for (int i = 0; i< kata.length;i++){
            if (kata[i].equals("a")){
                kata[i] = "o";

            } else if (kata[i].equals("A")){
                kata[i] = "O";
            }
        }
        for (int j = 0;j<kata.length;j++){
            System.out.print(kata[j]);
        }

    }
    
}
