class Consommation {
    private Service service;
    private Date dateHeure;
    private int quantite;
    private int categorie;
    private double distance;
    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public Date getDateHeure() {
        return dateHeure;
    }

    public void setDateHeure(Date dateHeure) {
        this.dateHeure = dateHeure;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public int getCategorie() {
        return categorie;
    }

    public void setCategorie(int categorie) {
        this.categorie = categorie;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public Consommation(Service service, int categorie, Date dateHeure, int quantite, double distance) {
        this.service = service;
        this.dateHeure = dateHeure;
        this.quantite = quantite;
        this.categorie=categorie;
        this.distance=distance;
    }
    public double calculerPrix() {
        if (service.isForfaitaire()) {
            return service.getTarif();
        } else if (service.getNom() == "petit_dej") {
            return service.getTarif() * categorie;
        } else if (service.getNom() == "communication_tele") {
            if (distance > 10000)
                return service.getTarif() + service.getTarif() * 0.5;
        } else {
            return service.getTarif() * quantite;
        }
        return 0;

    }
    @Override
    public String toString() {
        return "Consommation{" +
                "service=" + service +
                ", dateHeure=" + dateHeure +
                ", quantite=" + quantite +
                ", categorie=" + categorie +
                ", distance=" + distance +
                '}';
    }
}

