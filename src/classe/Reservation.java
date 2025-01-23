package classe;

import java.time.LocalDate;
import java.util.ArrayList;

public class Reservation {
    private Client client;
    private Chambre chambre;
    private LocalDate debut;
    private LocalDate fin;

    public Reservation(Client client, Chambre chambre, LocalDate debut, LocalDate fin) {
        this.client = client;
        this.chambre = chambre;
        this.debut = debut;
        this.fin = fin;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Chambre getChambre() {
        return chambre;
    }

    public void setChambre(Chambre chambre) {
        this.chambre = chambre;
    }

    public LocalDate getDebut() {
        return debut;
    }

    public void setDebut(LocalDate debut) {
        this.debut = debut;
    }

    public LocalDate getFin() {
        return fin;
    }

    public void setFin(LocalDate fin) {
        this.fin = fin;
    }
}
