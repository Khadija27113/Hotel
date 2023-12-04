public class Adresse {

    private String nomRue;
    private int numeroImmeuble;
    private String nomCommune;
    private int codePostal;
    private String departementOuEtat;
    private String pays;
    private String numeroTelephone;
    private String adresseCourriel;
    private String adresseWeb;

    public String getNomRue() {
        return nomRue;
    }

    public void setNomRue(String nomRue) {
        this.nomRue = nomRue;
    }

    public int getNumeroImmeuble() {
        return numeroImmeuble;
    }

    public void setNumeroImmeuble(int numeroImmeuble) {
        this.numeroImmeuble = numeroImmeuble;
    }

    public String getNomCommune() {
        return nomCommune;
    }

    public void setNomCommune(String nomCommune) {
        this.nomCommune = nomCommune;
    }

    public int getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }

    public String getDepartementOuEtat() {
        return departementOuEtat;
    }

    public void setDepartementOuEtat(String departementOuEtat) {
        this.departementOuEtat = departementOuEtat;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getNumeroTelephone() {
        return numeroTelephone;
    }

    public void setNumeroTelephone(String numeroTelephone) {
        this.numeroTelephone = numeroTelephone;
    }

    public String getAdresseCourriel() {
        return adresseCourriel;
    }

    public void setAdresseCourriel(String adresseCourriel) {
        this.adresseCourriel = adresseCourriel;
    }

    public String getAdresseWeb() {
        return adresseWeb;
    }

    public void setAdresseWeb(String adresseWeb) {
        this.adresseWeb = adresseWeb;
    }

    public Adresse(String nomRue, int numeroImmeuble, String nomCommune, int codePostal,
                   String departementOuEtat, String pays, String numeroTelephone,
                   String adresseCourriel, String adresseWeb) {
        this.nomRue = nomRue;
        this.numeroImmeuble = numeroImmeuble;
        this.nomCommune = nomCommune;
        this.codePostal = codePostal;
        this.departementOuEtat = departementOuEtat;
        this.pays = pays;
        this.numeroTelephone = numeroTelephone;
        this.adresseCourriel = adresseCourriel;
        this.adresseWeb = adresseWeb;
    }
    public String[] getLignesEnveloppe() {
        return new String[]{
                nomRue + " " + numeroImmeuble,
                codePostal + " " + nomCommune,
                departementOuEtat,
                pays
        };
    }

    @Override
    public String toString() {
        return "Adresse{" +
                "nomRue='" + nomRue + '\'' +
                ", numeroImmeuble=" + numeroImmeuble +
                ", nomCommune='" + nomCommune + '\'' +
                ", codePostal=" + codePostal +
                ", departementOuEtat='" + departementOuEtat + '\'' +
                ", pays='" + pays + '\'' +
                ", numeroTelephone='" + numeroTelephone + '\'' +
                ", adresseCourriel='" + adresseCourriel + '\'' +
                ", adresseWeb='" + adresseWeb + '\'' +
                '}';
    }
}

