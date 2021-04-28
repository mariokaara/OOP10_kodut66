import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {

     public static int synnikuu(String isikukood) {
        if (isikukood == null || isikukood.length() != 11) {
            throw new RuntimeException("Isikukood ei vasta nõuetele");
        }
        return Integer.parseInt(isikukood.substring(3,5));
    }

    public static void main(String[] args) {
        System.out.println(synnikuu("38409236025"));

        LocalDate kuupäev = LocalDate.of(2021, 4, 18);
        KoduneÜlesanne ky = new KoduneÜlesanne(kuupäev);
    }
}
