import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Kuupäev {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            while (true) {
                try {
                    System.out.print("Sisesta kuupäev kujul pp. kuu_nimi aaaa (nt. 3. mai 2015): ");
                    LocalDate kp = annaKuupäev(in.nextLine().trim());
                    long erinevus = ChronoUnit.DAYS.between(kp, LocalDate.now());
                    System.out.println("Sellest kuupäevast on möödunud " + erinevus + " päeva");
                    break;
                }
                catch (KuupäevaFormaadiErind e) {
                    System.out.println("Sisestatud kuupäev pole õige formaadiga!");
                    if (e.viganeKomponent() != null) {
                        System.out.println("Arusaamatust tekitas: '" + e.viganeKomponent() + "'");
                    }
                    System.out.println("Proovi uuesti!");
                }
            }
        }
    }

    public static LocalDate annaKuupäev(String kuupäevSõnena) {
        String[] osad = kuupäevSõnena.split(" ");

        String päevStr = osad[0];
        String kuuStr = osad[1];
        String aastaStr = osad[2];

        int päev = Integer.parseInt(päevStr.replace(".", "")); // replace'iga eemaldame päeva punkti
        int kuu = kuuNumber(kuuStr);
        int aasta = Integer.parseInt(aastaStr);

        return LocalDate.of(aasta, kuu, päev);
    }

    private static int kuuNumber(String kuuNimi) {
        String[] kuud = {
                "jaanuar", "veebruar", "märts", "aprill",
                "mai", "juuni", "juuli", "august",
                "september", "oktoober", "november", "detsember"
        };
        for (int i = 0; i < kuud.length; i++) {
            if (kuud[i].equalsIgnoreCase(kuuNimi))
                return i + 1;
        }
        throw new RuntimeException("Vigane kuu nimi: " + kuuNimi);
    }
}