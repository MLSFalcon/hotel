package application;
import classe.Chambre;
import classe.Client;
import classe.Hotel;

import java.time.LocalDate;

public class Application {

    public static void main(String[] args) {
        // Création de clients
        Client client1 = new Client("Alice Dupont", "alice@mail.com");
        Client client2 = new Client("Bob Martin", "bob@mail.com");

        // Création de chambres
        Chambre chambre1 = new Chambre(101, "simple");
        Chambre chambre2 = new Chambre(102, "double");
        Chambre chambre3 = new Chambre(103, "suite");

        // Création d'un hôtel
        Hotel hotel = new Hotel("L'hotel du Père Noël","Avenue des Rennes","Laponie");

        // Ajouter des chambres à l'hôtel
        hotel.ajouterChambre(chambre1);
        hotel.ajouterChambre(chambre2);
        hotel.ajouterChambre(chambre3);

        // Affichage des chambres disponibles
        hotel.afficherChambresDisponibles();

        // Réservation d'une chambre
        LocalDate dateDebut = LocalDate.of(2024,12,21);
        LocalDate dateFin = LocalDate.of(2024,12,28);

        hotel.reserverChambre(client1, chambre1, dateDebut, dateFin);

        // Affichage des réservations
        hotel.afficherReservations();

        // Changement de la réservation du client 1 et de la chamble 1 à la chambre 2
        hotel.changerAffectation(client1,chambre1,chambre2);

        // Réservation d'une chambre
        hotel.reserverChambre(client2, chambre1, dateDebut, dateFin);

        hotel.afficherReservations();
        hotel.afficherChambresDisponibles();

        // Supression d'une réservation
        hotel.supressionReservation(client1,chambre2);

        hotel.afficherReservations();
        hotel.afficherChambresDisponibles();

    }
}

