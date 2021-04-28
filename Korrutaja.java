import java.util.Scanner;

public class Korrutaja {

    public static void main(String[] args) {
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print("Sisesta täisarv: ");
                String sisend = sc.nextLine();
                int sisendInt = Integer.parseInt(sisend);
                System.out.println("Korrutasin kahega: " + sisendInt * 2);
            } catch (NumberFormatException e) {
                System.out.println("Vale sisendi formaat: " + e + " Proovi uuesti!");

            }
        }
    }
}