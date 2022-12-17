import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // değişkenleri olusturalım.
        int uzunKenar, kisaKenar ;
        double hipotenus, yukseklik, alan ;


        // Kullanıcıdan verileri alalım
        Scanner girdi = new Scanner(System.in);
        System.out.print("1.Kenarı Girin : ");
        uzunKenar= girdi.nextInt();
        System.out.print("2.Kenarı Girin : ");
        kisaKenar = girdi.nextInt();

        hipotenus= Math.sqrt( (uzunKenar* uzunKenar) + (kisaKenar* kisaKenar) );
        yukseklik = ( uzunKenar+ kisaKenar+ hipotenus)/ 2 ;
        alan = ( uzunKenar*yukseklik)/ 2 ;
        System.out.println("Hipotenüs :" + hipotenus);
        System.out.println("Üçgenin Yüksekliği : " + yukseklik);
        System.out.println("Üçgenin Alanı : " + alan);



    }
}