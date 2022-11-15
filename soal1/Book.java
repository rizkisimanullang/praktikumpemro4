package praktikum4.soal1;
//Class parent buku
public class Book {
    private String Judul;
    private String Penulis;
    private int Tahun;
    
    //set get
    public String getJudul(){return Judul;}
    public void setJudul(String Judul){Judul = Judul;}
    public String getPenulis(){return Penulis;}
    public void setPenulis(String Penulis){Penulis = Penulis;}
    public int getTahun(){return Tahun;}
    public void setTahun(){Tahun = Tahun;}
    public Book(String j, String p, int t){
        Judul =j;
        Penulis=p;
        Tahun =t;
    }
    //method buat output
    public void Display(){
        System.out.printf("""
                          Detail buku :
                          Judul adalah %s
                          Penulis adalah  %s
                          Tahun terbit adalah %d
                          """, Judul,Penulis,Tahun);
    }
   
}
