package classe;

public class Chambre {
    private int numeroChambre;
    private String type;

    private Boolean dispo;

    public Boolean getDispo() {
        return dispo;
    }

    public void setDispo(Boolean dispo) {
        this.dispo = dispo;
    }

    public Chambre(int numeroChambre, String type) {
        this.numeroChambre = numeroChambre;
        this.type = type;
        this.dispo = true;
    }

    public int getNumeroChambre() {
        return numeroChambre;
    }

    public void setNumeroChambre(int numeroChambre) {
        this.numeroChambre = numeroChambre;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
