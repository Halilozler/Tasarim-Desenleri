package Builder.Ev;

public class Ev {
    private String EvTipi;
    private int KapıSayısı;
    private boolean Bahce;
    private int PencereSayısı;

    public Ev(String tip){
        EvTipi = tip;
    }

    public String getEvTipi() {
        return EvTipi;
    }

    public void setEvTipi(String evTipi) {
        EvTipi = evTipi;
    }

    public int getKapıSayısı() {
        return KapıSayısı;
    }

    public void setKapıSayısı(int kapıSayısı) {
        KapıSayısı = kapıSayısı;
    }

    public String getBahce() {
        if(Bahce == true)
            return "Bahçeli";
        return "Bahçe yok";
    }

    public void setBahceVar() {
        Bahce = true;
    }

    public void setBahceYok() {
        Bahce = false;
    }

    public int getPencereSayısı() {
        return PencereSayısı;
    }

    public void setPencereSayısı(int pencereSayısı) {
        PencereSayısı = pencereSayısı;
    }

    public void ozellikler(){
        System.out.println(getEvTipi() + " " + getBahce() + " " + getPencereSayısı() + " " + getKapıSayısı());
    }
}
