import java.util.ArrayList;
import java.util.Arrays;

public class Reservation {
    private static int n;
    private int num_res;
    private Date date_res;
    private int nb_chambre;
    private int dure ;
    public int []num_ch;
    ArrayList<Consommation> consommations = new ArrayList <Consommation>();
    ArrayList<ArrayList<Consommation>> listeDeListes = new ArrayList<>();


    public Date getDate_res() {
        return date_res;
    }

    public void setDate_res(Date date_res) {
        this.date_res = date_res;
    }

    public int getNb_chambre() {
        return nb_chambre;
    }

    public void setNb_chambre(int nb_chambre) {
        this.nb_chambre = nb_chambre;
    }

    public int getDure() {
        return dure;
    }

    public void setDure(int dure) {
        this.dure = dure;
    }

    public int getNum_res() {
        return num_res;
    }

    public void setNum_res(int num_res) {
        this.num_res = num_res;
    }

    public Reservation(Date date_res, int nb_chambre, int dure) {
        this.num_res = n;
        n++;
        this.dure=dure;
        this.date_res = date_res;
        this.nb_chambre = nb_chambre;
        num_ch=new int[nb_chambre];
    }
    @Override
    public String toString() {
        String msg;
        msg="-------Votre reservation-------\n";
        msg+="Numero de reservation: "+num_res+"\n";
        msg+="Date de reservation: "+date_res+"\n";
        msg+="Duree de la reservation: "+dure+"\n";
        msg+="le nombre de chambres reserve:"+nb_chambre+"\n";
        for(int i:num_ch){
            msg+="la chambre numero :"+i+"\n";
        }
        return msg;
    }
}
