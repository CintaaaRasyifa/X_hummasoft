public class tugas6_String {

    public static void main(String[] args) {

        String kalimat[] = {"Hummasoft Tegnology","Software House asal Malang","Yang Membangun Kelas Industri"}; 
        String angka[] = {"1. ","2. ","3. "};
        
        for (int i = 0; i< kalimat.length;i++){
            System.out.println(angka[i].concat(kalimat[i]));
        }
    }
    
}
