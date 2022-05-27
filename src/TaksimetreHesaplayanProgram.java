import java.util.Scanner;


public class TaksimetreHesaplayanProgram {
    public static void main(String[] args) {
        double km, kmUcreti, acilisUcreti, toplam;
        boolean minTutar;


        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi Giriniz:");
        km = input.nextDouble();
        kmUcreti = 2.20;
        acilisUcreti = 10;
        toplam = (km*kmUcreti)+acilisUcreti;
        toplam = (toplam<20) ? 20:toplam;

        System.out.println("Toplam Tutar:" + toplam);


    }
}
