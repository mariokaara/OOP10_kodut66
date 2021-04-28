public class KuupäevaFormaadiErind extends RuntimeException{

    public KuupäevaFormaadiErind(String s) {
        super("midagi" + s);
    }
    public String viganeKomponent() throws RuntimeException{
     return "sõne";
    }
}
