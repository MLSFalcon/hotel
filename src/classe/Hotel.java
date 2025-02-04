package classe;

import java.time.LocalDate;
import java.util.ArrayList;

public class Hotel {
    private String nom;
    private String adresse;
    private String region;
    private ArrayList<Chambre> chambres;
    private ArrayList<Client> clients ;
    private ArrayList<Reservation> reservations;
    public Hotel(String nom, String adresse, String region) {
        this.nom = nom;
        this.adresse = adresse;
        this.region = region;
        this.chambres = new ArrayList<Chambre>();
        this.clients = new ArrayList<Client>();
        this.reservations = new ArrayList<Reservation>();
    }

    public void ajouterChambre(Chambre nouvelleChambre){
        if (!this.chambres.contains(nouvelleChambre)) {
            this.chambres.add(nouvelleChambre);
        }
    }
    public void afficherChambresDisponibles(){
        for (Chambre chambre : chambres){
            if (chambre.getDispo()){
                System.out.println("Chambre dispo : "+chambre.getNumeroChambre());
                System.out.println("Chambre dispo : "+chambre.getType());
                System.out.println("Chambre dispo : "+chambre.getDispo());
            }
        }
    }
    public void reserverChambre(Client client, Chambre chambre, LocalDate debut,LocalDate fin){
        Reservation reservation = new Reservation(client,chambre,debut,fin);
        reservations.add(reservation);
        chambre.setDispo(false);
    }
    public void afficherReservations(){
        for (Reservation reservation : reservations) {
            System.out.println("Reservation: "+reservation.getClient().getNom()+" - "+reservation.getChambre().getNumeroChambre()+" - "+reservation.getDebut()+" - "+reservation.getFin());
        }
    }
    public void changerAffectation(Client client,Chambre chambre,Chambre chambre2){
        chambre.setDispo(true);
        for (Reservation reservation : reservations){
            if (reservation.getClient().equals(client) && reservation.getChambre().equals(chambre)){
                reservation.setChambre(chambre2);
            }
        }
    }
    public void supressionReservation(Client client, Chambre chambre){
        chambre.setDispo(true);
        for (Reservation reservation : reservations){
            if (reservation.getClient().equals(client) && reservation.getChambre().equals(chambre)){
                reservations.remove(reservation);
            }
        }
    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
