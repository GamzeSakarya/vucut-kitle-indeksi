import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu giriniz : ");
        double boy = inp.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");
        double kilo = inp.nextDouble();

        // Vücut kitle indeksi hesaplama
        double vucutKitleIndeksi = kilo / (boy * boy);

        System.out.println("Vücut kitle indeksiniz : " + vucutKitleIndeksi);



    }
}
