import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int yil;

        Scanner inp = new Scanner(System.in);


        System.out.println("Lütfen Yili Giriniz : ");
        yil = inp.nextInt();

        if (yil % 4 == 0 && yil % 100 != 0 || (yil % 400 == 0)) {
            System.out.println(yil + ("Artık yildir. "));
        }else {
            System.out.println(yil + ("Artık yil Değildir. "));
        }
    }
}
