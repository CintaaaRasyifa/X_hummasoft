import javax.swing.JOptionPane;

public class tugas2_Array {

    public static void main(String [] args){
        String nama[] = new String[5];
        for (int i = 0;i < nama.length;i++){
            nama[i] = JOptionPane.showInputDialog("Inputkan Nama Teman Anda");
        }
        for (int j = 0;j < nama.length;j++){
            System.out.println((j + 1) + ". " +nama[j]);
        }
    }
    
}
