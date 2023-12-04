class Service {
    private String nom;
    private double tarif;
    private boolean forfaitaire;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getTarif() {
        return tarif;
    }

    public void setTarif(double tarif) {
        this.tarif = tarif;
    }

    public boolean isForfaitaire() {
        return forfaitaire;
    }

    public void setForfaitaire(boolean forfaitaire) {
        this.forfaitaire = forfaitaire;
    }
    public Service(String nom, double tarif, boolean forfaitaire) {
        this.nom = nom;
        this.tarif = tarif;
        this.forfaitaire = forfaitaire;
    }
    @Override
    public String toString() {
        return "Service{" +
                "nom='" + nom + '\'' +
                ", tarif=" + tarif +
                ", forfaitaire=" + forfaitaire +
                '}';
    }
}

