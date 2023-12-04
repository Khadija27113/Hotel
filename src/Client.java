import java.util.ArrayList;

public class Client {
    private static int m;
    private int num_client;
    private String nom,prenom;
    private Adresse adress;
    public Reservation reservation;
    public ArrayList<Chambre> chambres = new ArrayList <Chambre>();


    public int getNum_client() {
        return num_client;
    }

    public void setNum_client(int num_client) {
        this.num_client = num_client;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Adresse getAdress() {
        return adress;
    }

    public void setAdress(Adresse adress) {
        this.adress = adress;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    public Client(int num_client, String nom, String prenom, Adresse adress) {
        this.num_client=num_client;
        this.nom = nom;
        this.prenom = prenom;
        this.adress = adress;
    }

}
