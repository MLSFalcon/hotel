package classe;

import java.time.LocalDate;
import java.util.ArrayList;

public class Hotel {
    private String nom;
    private String adresse;
    private String region;
    private ArrayList<Chambre> chambres = new ArrayList<Chambre>();
    private ArrayList<Client> clients = new ArrayList<Client>();
    private ArrayList<Reservation> reservations = new ArrayList<Reservation>();
    public Hotel(String nom, String adresse, String region) {
        this.nom = nom;
        this.adresse = adresse;
        this.region = region;
    }

    public void ajouterChambre(Chambre nouvelleChambre){
        this.chambres.add(nouvelleChambre);
    }
    public void afficherChambresDisponibles(){
        for (int i = 0;i < chambres.size();i++){
            if (chambres.get(i).getDispo()){
                System.out.println("Chambre dispo : "+chambres.get(i).getNumeroChambre());
                System.out.println("Chambre dispo : "+chambres.get(i).getType());
                System.out.println("Chambre dispo : "+chambres.get(i).getDispo());
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
