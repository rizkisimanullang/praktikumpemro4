package praktikum4.soal1;
import java.util.Scanner;

public class Soal1main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("====INPUT====");
        System.out.println("Judul :");
        String Judul = input.nextLine();
        System.out.println("Penulis : ");
        String Penulis = input.nextLine();
        System.out.println("Tahun Terbit : ");
        int Tahun = input.nextInt();
        
        //inisiasi
        Book books = new Book(Judul, Penulis, Tahun);
       
        System.out.println();
        System.out.println("====OUTPUT====");
        books.Display();
             
    }
}
