public class tugas16_String {
    public static void main(String[] args) {
        String kalimat = "Siswa kelas industri sangat antusias untuk belajar di hari sabtu";
        String huruf[] = kalimat.split("");
        int hurufS = 0;
        System.out.println("Kalimat : "+kalimat);
        for (int i = 0;i<huruf.length;i++){
            if (huruf[i].equalsIgnoreCase("s")){
                hurufS++;
            }
        }
        System.out.println("Terdapat Semjumblah : "+hurufS+" hurus s pada kalimat diatas");
    }
    
}
