public class tugas15_String {
    public static void main(String[] args) {
        String kalimat = "HUMMASOFT TECHNOLOGY";
        String kata[] = kalimat.split(" ");
        for (int i = 0;i<kata.length;i++){
            String huruf[] = kata[i].split("");
            for (int j = 0;j<huruf.length;j++){
                if (j == 0){
                    System.out.print(huruf[j]);
                } else {
                    System.out.print(huruf[j].toLowerCase());
                }
            }
        System.out.print(" ");
        }
    }
    
}
