public class bus extends vehicle{

    private long kms;
    private boolean isGas;

    public bus(String m, String t) {
        super(m, t);
    }

    public long getKms() {
        return kms;
    }
    public void setKms(long km) {
        this.kms = km;
    }
    public boolean isGas(boolean gas) {
        return isGas;
    }
    public void setGas(boolean g) {
        isGas = g;
    }

    @Override
    public void move(String road1, String road2) {

    }
}
