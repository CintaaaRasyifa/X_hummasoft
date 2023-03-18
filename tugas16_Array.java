import java.util.*;

public class tugas16_Array {

    public static void main(String [] args){
        ArrayList<Object> namaUsia = new ArrayList<>();

        namaUsia.add("Heru Hermawan");
        namaUsia.add(17);

        namaUsia.add("Angga Ariyanto");
        namaUsia.add(16);

        namaUsia.add("Ratih Isabela");
        namaUsia.add(15);

        System.out.println("Daftar Nama Dan Usia : ");
        for(int i = 0; i < namaUsia.size();i++){
            if ( namaUsia.get(i) instanceof String) {
                System.out.print("Nama : " + namaUsia.get(i));
            } else if ( namaUsia.get(i) instanceof Integer) {
                System.out.println(" | Usia : "+namaUsia.get(i));
            }
        }
    }
}
