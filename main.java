import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        int matematik, fizik, turkce, kimya, muzik;
        int i = 0;
        double ortalama = 0.0;
        Scanner input = new Scanner(System.in);
        System.out.print("Matematik notunuzu giriniz: ");
        matematik = input.nextInt();
        System.out.print("Fizik notunuzu giriniz: ");
        fizik = input.nextInt();
        System.out.print("Turkce notunuzu giriniz: ");
        turkce = input.nextInt();
        System.out.print("Kimya notunuzu giriniz: ");
        kimya = input.nextInt();
        System.out.print("Muzik notunuzu giriniz: ");
        muzik = input.nextInt();

        if(matematik <= 100 && matematik >= 0){
            if (matematik < 55) System.out.println("Matematik dersinden gecemediniz! Gecme notu 55 ve ustu.");
            ortalama += matematik;
            i++;
        }
        if(fizik <= 100 && fizik >= 0){
            if (fizik < 55) System.out.println("Fizik dersinden gecemediniz! Gecme notu 55 ve ustu.");
            ortalama += fizik;
            i++;
        }
        if(turkce <= 100 && turkce >= 0){
            if (turkce < 55) System.out.println("Turkce dersinden gecemediniz! Gecme notu 55 ve ustu.");
            ortalama += turkce;
            i++;
        }
        if(kimya <= 100 && kimya >= 0){
            if (kimya < 55) System.out.println("Kimya dersinden gecemediniz! Gecme notu 55 ve ustu.");
            ortalama += kimya;
            i++;
        }
        if(muzik <= 100 && muzik >= 0){
            if (muzik < 55) System.out.println("Muzik dersinden gecemediniz! Gecme notu 55 ve ustu.");
            ortalama += muzik;
            i++;
        }
        ortalama /= i;
        System.out.println("Ortalama = " + ortalama);



    }
}
