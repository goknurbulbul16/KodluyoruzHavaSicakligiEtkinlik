import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      //  Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
      //  Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
      //  Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
      //  Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.

        int sicaklik;
        Scanner input = new Scanner(System.in);

        System.out.print("Sıcaklık Değeri Giriniz: ");
        sicaklik = input.nextInt();
        if(sicaklik < 5){
            System.out.println("Hava soğuk Kayak yapabilirsin.");
        } else if (sicaklik >= 5 && sicaklik < 15) {
            System.out.println("Hava fazla sıcak değil Sinemaya gidebilirsin.");
        } else if (sicaklik >= 15 && sicaklik < 25) {
            System.out.println("Hava güzel Pikniğe gidebilirsin.");
        } else if (sicaklik >= 25) {
            System.out.println("Hava çok sıcak Yüzmeye gidebilirsin.");
        }else {
            System.out.println("Keyfine Bakkkk !");
        }
    }
}