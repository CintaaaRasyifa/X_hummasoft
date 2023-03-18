public class tugas3_String {

    public static void main(String[] args) {
        String data[] = {"Saya","","Suka","Travelling",""};

        for(int i = 0; i <data.length;i++){
            if ( data[i].isEmpty() == true){
                System.out.println(" Array Ke-"+i+" Kosong");
            } else {
                System.out.println(" Array Ke-"+i+" Terisi : "+data[i]);
            }
        }
    }
}