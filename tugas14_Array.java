import java.util.ArrayList;

public class tugas14_Array {
    
    public static void main(String []  args){
        ArrayList<String> nama = new ArrayList<String>();
        nama.add("Steve Jobs");
        nama.add("Bill Gates");
        nama.add("Mark Zuckerberk");
        nama.add("Elon Musk");


        System.out.println("Daftar Nama Tokok Teknologi Dunia");
        for ( int i = 0;i < nama.size();i++){
            System.out.println((i+1)+". "+nama.get(i));
        }

        nama.remove(2);
        System.out.println("");

        System.out.println("Daftar Nama Tokoh Teknologi Dunia Setelah Dihapus");
        for ( int i = 0;i < nama.size();i++){//cintaxrpl1
            System.out.println((i+1)+". "+nama.get(i));
        }

    }
}
