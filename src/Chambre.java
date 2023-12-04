import java.util.ArrayList;
import java.util.Scanner;

public class Chambre {
    private static int n=0;
    private int num_ch;

    private int []nb_lits=new int[2];
    private int num_etage;
    private double prix;
    private int categorie;
    private boolean occupee;
    public ArrayList<Consommation> l_com=new ArrayList<Consommation>();



    public int getNum_ch() {
        return num_ch;
    }

    public void setNum_ch(int num_ch) {
        this.num_ch = num_ch;
    }

    public int[] getNb_lits() {
        return nb_lits;
    }

    public void setNb_lits(int[] nb_lits) {
        this.nb_lits = nb_lits;
    }

    public int getNum_etage() {
        return num_etage;
    }

    public void setNum_etage(int num_etage) {
        this.num_etage = num_etage;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getCategorie() {
        return categorie;
    }
    public void setCategorie(int categorie) {
        this.categorie = categorie;
    }

    public Chambre( int num_etage, double prix, int categorie) {
        this.num_ch=n;
        this.n ++;
        this.num_etage = num_etage;
        this.prix = prix;
        this.categorie = categorie;
    }


    void type_deslits(){
        int nbd,nbs;
        String test;
        Scanner input=new Scanner(System.in);
        while(true){
            try {
                System.out.println("donnez le nombre des lits double que vous voulez");
                test = input.next();
                if (test.matches("\\d+")) {
                    nbd = Integer.parseInt(test);
                } else {
                    throw new Error("nb_lit");
                }
                System.out.println("donnez le nombre des lits single que vous voulez");
                test = input.next();
                if (test.matches("\\d+")) {
                    nbs= Integer.parseInt(test);
                } else {
                    throw new Error("nb_lit");
                }
                if ((nbs>2||nbs<1)||(nbd!=1)){
                    throw new Error("nb_lit");
                }
                nb_lits[0]=nbs;
                nb_lits[1]=nbd;

                break;
            }catch(Error r){
                System.out.println(r);
            }
        }
    }
}
