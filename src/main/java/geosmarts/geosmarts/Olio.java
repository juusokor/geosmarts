package geosmarts.geosmarts;

public class Olio {

    private String nimi;
    private String viestit;
    private String pvm;

    public Olio() {

    }

    public void setNimi(String n) {
        this.nimi = n;
    }

    public void setViestit(String n) {
        this.viestit = n;
    }

    public void setPvm(String n) {
        this.pvm = n;
    }

    public String getNimi() {
        return this.nimi;
    }

    public String getViestit() {
        return this.viestit;
    }

    public String getPvm() {
        return this.pvm;
    }
}
