package praktikum4.soal2;
class BagianNovel extends BagianBuku{
    private final String genre, sinopsis;
    
    public BagianNovel(String j, String p, String t, String g, String s){
        super.judul = j;
        super.penulis = p;
        super.tahun = Integer.valueOf(t);
        genre = g;
        sinopsis = s;  
    }
    
    public String getNovelDetail(){
        return "\nData yang baru diinputkan adalah \nSebuah novel bergenre "+genre+" dengan judul \""+judul+"\". Novel tersebut ditulis oleh "+penulis+" dan diterbitkan pada tahun "+tahun+". \nSinopsis: "+sinopsis;
    }

}