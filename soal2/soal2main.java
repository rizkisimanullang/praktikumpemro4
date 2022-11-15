package praktikum4.soal2;
import java.util.Scanner;

public class soal2main {
    public static void main(String[] args) {

        Scanner forPerson = new Scanner(System.in);
        String judul, penulis, tahun, genre, sinopsis;
        int pilih, volume;
        
        System.out.print("Pilih buku yang ingin diinputkan: \n1 = Novel \n2 = Komik \nMasukkan pilihan: ");
        pilih = forPerson.nextInt();
        forPerson.nextLine();
        
        if(pilih == 1){
            System.out.print("Judul: ");
            judul = forPerson.nextLine();
            System.out.print("Penulis: ");
            penulis = forPerson.nextLine();
            System.out.print("Tahun Terbit: ");
            tahun = forPerson.nextLine();
            System.out.print("Genre: ");
            genre = forPerson.nextLine();
            System.out.print("Sinopsis: ");
            sinopsis = forPerson.nextLine();
            BagianNovel dataNovel = new BagianNovel (judul, penulis, tahun, genre, sinopsis);
            System.out.println(dataNovel.getNovelDetail());
        } else if (pilih == 2){
            System.out.print("Judul: ");
            judul = forPerson.nextLine();
            System.out.print("Penulis: ");
            penulis = forPerson.nextLine();
            System.out.print("Tahun Terbit: ");
            tahun = forPerson.nextLine();
            System.out.print("Volume: ");
            volume = forPerson.nextInt();
            forPerson.nextLine();
            System.out.print("Sinopsis: ");
            sinopsis = forPerson.nextLine();
            BagianKomik dataKomik = new BagianKomik (judul, penulis, tahun, volume, sinopsis);
            System.out.println(dataKomik.getKomikDetail());
        } else {
            System.out.print("Mohon maaf, data yang Anda cari tidak terdapat dalam pilihan.");
        }

    }
    
}