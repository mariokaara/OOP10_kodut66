public class Pilt {

    private int laius;
    private int kõrgus;
    private int[] pikslid;


    public Pilt(int laius, int kõrgus) {
        this.laius=laius;
        this.kõrgus=kõrgus;
        this.pikslid = new int[laius*kõrgus];

    }

    public void määraPiksel(int x, int y, int uusPiksel) {
            if ((x * y) > (laius * kõrgus)) {
                throw new VigaseKoordinaadiErind("Koordinaat asub pildi mõõtudest väljaspool. Pildi laius on " + laius + " ja pildi kõrgus on " + kõrgus) ;
            }
            if (uusPiksel > 255 || uusPiksel < 0) {
                throw new VigaseVärviErind("Värv asub vahemikust 0...255 väljaspool");
            }
            pikslid[x * y-1] = uusPiksel;
        }


    public int annaPiksel(int x, int y) {
        if ((x*y) > (laius*kõrgus)) {
            throw new VigaseKoordinaadiErind("Koordinaat asub pildi mõõtudest väljaspool. Pildi laius on " + laius + " ja pildi kõrgus on " + kõrgus);
        }
        return this.pikslid[x*y-1];
    }

    public int getLaius() {
        return laius;
    }

    public int getKõrgus() {
        return kõrgus;
    }
}
