package tugas1;

public class pustaka {
    private int id;
    private String judul;
    private int jumblah;
    public pustaka(int id,String judul,int jumblah){
        this.id = id;
        this.judul = judul;
        this.jumblah = jumblah;
    }
    public int getID(){
        return this.id;
    }
    public void setID(int id){
        this.id = id;
    }
    public String getJudul(){
        return this.judul;
    }
    public void setJudul(String judul){
        this.judul = judul;
    }
    public int getJumblah(){
        return this.jumblah;
    }
    public void setJumblah(int jumblah){
        this.jumblah = jumblah;
    }
    public static void main(String[] args) {
        pustaka a = new pustaka(101,"Habis Gelap Terbitlah Terang", 10);
        System.out.println("ID Pustaka : "+a.getID());
        System.out.println("Judul Pustaka : "+a.getJudul());
        System.out.println("Jumblah Pustaka : "+a.getJumblah());
        
    }
}

