public class Facture {
     private static int n=0;
     private int num_fact;
     private Date date_fact;

    public static int getN() {
        return n;
    }

    public static void setN(int n) {
        Facture.n = n;
    }

    public int getNum_fact() {
        return num_fact;
    }

    public void setNum_fact(int num_fact) {
        this.num_fact = num_fact;
    }

    public Date getDate_fact() {
        return date_fact;
    }

    public void setDate_fact(Date date_fact) {
        this.date_fact = date_fact;
    }

    public Facture( Date date_fact) {
        this.num_fact = n;
        n++;
        this.date_fact = date_fact;
    }

    public String toString(Client c) {
        String msg;
        msg="-----------Facture n°"+num_fact+"-----------\n";
        msg+="la date: "+date_fact+"\n";
        msg+="le nom de client "+c.getNom()+"  "+c.getPrenom()+"\n";
        msg+="Mr(mme) "+c.getNom()+" a reserve "+c.getReservation().getNb_chambre()+" chambre(s) pour une duree "+c.getReservation().getDure()+" jours \n";
        double totale=0;
        for(int i=0;i<c.getReservation().getNb_chambre();i++) {
            msg +="La chambre n°"+c.getReservation().num_ch[i]+" le prix de nuitee de cette chambre est "+c.chambres.get(i).getPrix()+"DT\n";
            totale+=c.chambres.get(i).getPrix()*c.getReservation().getDure();
            msg+="La liste des services de cette chambra est : \n";
            for(int j=0;j<c.getReservation().listeDeListes.get(i).size();j++){
                msg+=c.getReservation().listeDeListes.get(i).get(j).getService().getNom()+" le tarif de ce service est: "+c.getReservation().listeDeListes.get(i).get(j).calculerPrix()+"DT\n";
                totale+=c.getReservation().listeDeListes.get(i).get(j).calculerPrix();
            }
        }
        msg+="le prix totale a paye est: "+totale;
        msg+="DT\nEnvoyer a: "+c.getAdress();

        return msg;
    }
}
