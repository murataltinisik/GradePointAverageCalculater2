import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // VARIABLES
        int math, physics, chemical, turkish, music;

        // SCANNER
        Scanner sc = new Scanner(System.in);

        // USER'S VALUES
        System.out.print("Matematik Not: ");
        math = sc.nextInt();

        System.out.print("Fizik Not: ");
        physics = sc.nextInt();

        System.out.print("Kimya Not: ");
        chemical = sc.nextInt();

        System.out.print("Türkçe Not: ");
        turkish = sc.nextInt();

        System.out.print("Müzik Not: ");
        music = sc.nextInt();

        double average = (math + physics + chemical + turkish + music) / 5;

        if(!(math > 0 && math <= 100)){
            average = (physics + chemical + turkish + music) / 4;
        }else if(!(physics > 0 && physics <= 100)){
            average = (math + chemical + turkish + music) / 4;
        }else if(!(chemical > 0 && chemical <= 100)){
            average = (math + physics + turkish + music) / 4;
        }else if(!(turkish > 0 && turkish <= 100)){
            average = (math + physics + chemical + music) / 4;
        }else if(!(music > 0 && music <= 100)){
            average = (math + physics + chemical + turkish) / 4;
        }else{
            System.out.println("Notlarınız Hesaplanamadı");
        }

        if(average <= 55){
            System.out.println("Sınıfta Kaldınız... Ortalamanız: " + average);
        }else{
            System.out.println("Tebrikler, Sınıfı Geçtiniz Ortalamanız: " + average);
        }

    }
}
