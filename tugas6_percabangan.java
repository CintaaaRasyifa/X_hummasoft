import javax.swing.JOptionPane;

public class tugas6_percabangan {

    public static void main(String []  args){

        String plat = JOptionPane.showInputDialog("Inputkan kode plat nomor kendaraan");

        switch (plat){
            case "P":
            System.out.println("Jember,Banyuwangi,Bondowoso,Situbondo");
            break;
            default:
            System.out.println("Yang Anda Inputkan Tidak tersedia dalam data kami");

        }
    }
    
}
