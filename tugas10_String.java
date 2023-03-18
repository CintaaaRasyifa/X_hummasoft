public class tugas10_String {
    public static void main(String[] args) {
        String kalimat = "saya memancing ikan di sungai menggunakan pancingan yang panjang bersama teman saya yang berasal dari malang";
        String kata[] = kalimat.split(" ");

        for ( int i = 0; i < kata.length;i++){
            System.out.println(kata[i]);
            if (kata[i].equals("memancing")){
                kata[i] = "menjaring";
            } else if (kata[i].equals("sungai")){
                kata[i] = "laut";
            } else if (kata[i].equals("teman")){
                kata[i] = "saudara";
            } else if (kata[i].equals("malang")){
                kata[i] = "surabaya";
            }
        }
        for (int i = 0; i < kata.length;i++){
            System.out.print(kata[i]+" ");
        }
    }
}
