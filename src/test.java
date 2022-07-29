import java.util.Scanner;
public class test {
    public static void main(String[] args) {
      //değişkenler tanımlandı
      double by, vu, kl;

      Scanner inp = new Scanner(System.in);
      //değer gir - yarıçap

      System.out.print("Lutfen boyunuzu (metre cinsinde) giriniz : ");
      by= inp.nextDouble();

      System.out.print("Lutfen kilonuzu giriniz : ");
      kl = inp.nextInt();
      // formül
      vu = kl / (by * by);

      System.out.println("Vucut Kitle Indeksiniz : " + vu);
    }
}
