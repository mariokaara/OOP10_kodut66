import java.time.LocalDate;

public class KoduneÜlesanne {
    private LocalDate tähtaeg;

    public KoduneÜlesanne(LocalDate tähtaeg) {
        String nädalapäev = tähtaeg.getDayOfWeek().toString();
        String[] osad = tähtaeg.toString().split("-");
        if (nädalapäev.equals("SUNDAY") || nädalapäev.equals("SATURDAY")) {
            throw new IllegalArgumentException("Sisestasid: " + osad[2] + "." + osad[1]+"." + osad[0] + ". Mis on nädalavahetuse päev ja nädalavahetuse päevad ei ole lubatud.");
        }
        this.tähtaeg = tähtaeg;
    }

    public LocalDate getTähtaeg() {
        return tähtaeg;
    }

    public void setTähtaeg(LocalDate tähtaeg) {
        this.tähtaeg = tähtaeg;
    }
}
