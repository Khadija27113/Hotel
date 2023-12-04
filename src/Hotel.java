import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Hotel {

    private String nom;
    static ArrayList <String> noms = new ArrayList <String>();
    ArrayList <Reservation> reservations = new ArrayList <Reservation>();
    ArrayList <Service> services = new ArrayList <Service>();
    ArrayList<Client> clients=new ArrayList<>();
    private int categorie;
    private Date d_ouv;
    private Date d_fer;

    private int nb_cham;
    public Chambre[]tab;
    private double []prix=new double[4];
    private double iniprix;


    private String adresse;
    private int nb_etage;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
            this.nom = nom;}

    public int getCategorie() {
        return categorie;
    }

    public void setCategorie(int categorie) {
        this.categorie = categorie;
    }

    public Date getD_ouv() {
        return d_ouv;
    }

    public void setD_ouv(Date d_ouv) {
        this.d_ouv = d_ouv;
    }

    public Date getD_fer() {
        return d_fer;
    }

    public void setD_fer(Date d_fer) {
        this.d_fer = d_fer;
    }

    public double[] getPrix() {
        return prix;
    }

    public void setPrix(double p) {
        prix[0]=p;
        prix[1]=p+(p*0.1);
        prix[2]=p+(p*0.2);
        prix[3]=p+(p*0.3);
    }

    public int getNb_cham() {
        return nb_cham;
    }


    public void setNb_cham(int nb_cham) {
        this.nb_cham = nb_cham;
    }
    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public List<String> getL() {
        return noms;
    }

    public void setL(ArrayList<String> l) {
        this.noms = l;
    }

    public int getNb_etage() {
        return nb_etage;
    }

    public void setNb_etage(int nb_etage) {
        this.nb_etage = nb_etage;
    }

    public double getIniprix() {
        return iniprix;
    }

    public void setIniprix(double iniprix) {
        switch (categorie){
            case 1:this.iniprix = iniprix+iniprix*0.1;break;
            case 2:this.iniprix = iniprix+iniprix*0.2;break;
            case 3:this.iniprix = iniprix+iniprix*0.3;break;
            case 4:this.iniprix = iniprix+iniprix*0.4;break;
            case 5:this.iniprix = iniprix+iniprix*0.5;break;
        }

    }

    public Hotel(String nom, int categorie, Date d_ouv, Date d_fer, int nb_cham, double iniprix, String adresse, int nb_etage) {
        this.nom = nom;
        this.categorie = categorie;
        this.d_ouv = d_ouv;
        this.d_fer = d_fer;
        this.nb_cham = nb_cham;
        this.iniprix = iniprix;
        this.adresse = adresse;
        this.nb_etage = nb_etage;
        tab=new Chambre[nb_cham];
    }
    public void add_room(int w){
        String test;
        Scanner input=new Scanner(System.in);
        int num_etage;
        System.out.println("Chambe n°"+w+":");
        while(true){
            try{
                System.out.println("donner l'etage de cette chambre  ");
                test=input.next();
                if(test.matches("\\d+")){
                    num_etage=Integer.parseInt(test);
                }
                else {
                    throw new Error("num_et");
                }
                if(num_etage>this.getNb_etage()){
                    throw new Error("num_et");
                }
                break;
            }catch(Error r){
                System.out.println(r);
            }
        }
        int categorie=0;
        boolean bain=true;
        boolean douche=true;
        boolean televiseur=true;

        while(true){
            try{
                System.out.println("cette chambre contient un bain?  ");
                test=input.next().toUpperCase().strip();
                if (!test.equals("OUI")&&!test.equals("NON")){
                    throw new Error("reponse");}
                if(test.equals("OUI")){
                    bain=true;
                }
                else {
                    bain=false;
                }
                System.out.println("cette chambre contient un douche?  ");
                test=input.next().toUpperCase().strip();
                if (!test.equals("OUI")&&!test.equals("NON")){
                    throw new Error("reponse");
                }
                if(test.equals("OUI")){
                    douche=true;
                }
                else {
                    douche=false;
                }
                System.out.println("cette chambre contient un televiseur ?  ");
                test=input.next().toUpperCase().strip();

                if (!test.equals("OUI")&&!test.equals("NON")){
                    throw new Error("reponse");}
                if(test.equals("OUI")){
                    televiseur=true;
                }
                else {
                    televiseur=false;
                }
                if(!bain&&!douche&&!televiseur)
                    categorie=0;
                if((bain&&!douche&&!televiseur)||(!bain&&douche&&!televiseur)||(!bain&&!douche&&televiseur))
                    categorie=1;
                if((bain&&douche&&!televiseur)||(bain&&!douche&&televiseur)||(!bain&&douche&&televiseur))
                    categorie=2;
                if(bain&&douche&&televiseur)
                    categorie=3;

                break;
            }catch(Error r){
                System.out.println(r);
            }
        }
        double prix_ch = 0;
        while(true){
            if(categorie==1){
                prix_ch=this.getIniprix()+this.getIniprix()*0.1;
            }
            else if(categorie==2){
                prix_ch=this.getIniprix()+this.getIniprix()*0.2;
            } else if (categorie==3) {
                prix_ch=this.getIniprix()+this.getIniprix()*0.3;
            }
            else prix_ch=this.getIniprix();
            break;
        }
        System.out.println(categorie+"f");
        Chambre chr =new Chambre(num_etage,prix_ch,categorie);
        chr.type_deslits();
        tab[w]=chr;

    }
    void les_prix(){

        int i=0;
        while(i<this.nb_cham){
            if (tab[i].getCategorie()==0){
                prix[0]=tab[i].getPrix();
            }
            else if (tab[i].getCategorie()==1){
                prix[1]=tab[i].getPrix();
            }
            else if (tab[i].getCategorie()==2){
                prix[2]=tab[i].getPrix();
            }
            else if (tab[i].getCategorie()==3){
                prix[3]=tab[i].getPrix();
            }
            i++;

        }
    }
    public String toString() {
        String msg;
        msg="---------------NouveauHotel----------\n";
        msg+="Nom: "+nom+"\n";
        msg+="Nombre d'etoiles: "+categorie+" etoiles\n";
        msg+="Date d'ouverture: "+d_ouv+" \n";
        msg+="Date de fermeture: "+d_fer+" \n";
        msg+="Le nombre de chambre: "+nb_cham+" chambres \n";
        msg+="Le prix des chambres disponible  \n";
        for (int i=0;i<4;i++){
            if(prix[i]!=0){
                msg+="le prix de chambre de categorie "+i+" est: "+prix[i]+"DT \n";
            }

        }
        msg+="L'adresse de l'hotel est: "+adresse+"\n";
        msg+="Nombre des etages de l'hotel est: "+nb_etage+"\n";


            return msg;
    }
}

