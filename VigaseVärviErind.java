public class VigaseVärviErind extends RuntimeException{

    public VigaseVärviErind (String s) {
        super("Vigane värvivahemik: "+ s);
    }
}
