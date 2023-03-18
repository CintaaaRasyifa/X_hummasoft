public class tugas5_String {

    public static void main(String[] args) {
        String data[] = {"  Saya Suka Mengerjakan Tugas Pemrograman ","","    setiap malam saya tidur","      Kelas industri Hummasoft",""};

        System.out.println("===Sebelum Dirapikan===");
        for (int i = 0; i < data.length;i++){
            System.out.println(data[i]);
        }
        System.out.print("\n\n");
        System.out.println("===Setelah Dirapikan===");
        for (int i = 0; i< data.length;i++){
            if (data[i].isEmpty() == true){
                System.out.println("-");
            } else {
                System.out.println(data[i].trim());
            }
        }
    }
    
    
}
