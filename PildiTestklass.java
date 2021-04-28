import java.util.Scanner;

public class PildiTestklass {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            while (true) {
                try {
                    Pilt pilt = new Pilt(10, 10);
                    System.out.println(("Sisesta x koordinaat: "));
                    int x = Integer.parseInt(sc.nextLine());
                    System.out.println("Sisesta y koordinaat: ");
                    int y = Integer.parseInt(sc.nextLine());
                    System.out.println("Sisesta värvitoon 0...255: ");
                    int toon = Integer.parseInt(sc.nextLine());
                    System.out.println("Valisid " + x*y + ". piksli ja tema väärtus on hetkel " + pilt.annaPiksel(x,y));
                    pilt.määraPiksel(x, y, toon);
                    System.out.println("Määrasid pikslile kohal " + x*y + ". väärtuseks " + toon);
                    System.out.println("Uueks piksli " + x*y + " väärtuseks on " + pilt.annaPiksel(x, y));
                } catch (NumberFormatException e) {
                    System.out.println("Vales formaadis sisend");
                }
            }

        }
    }
}
