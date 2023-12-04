import java.util.ArrayList;
import java.util.Scanner;

public class Enregistrer {
    static ArrayList<Hotel> hotels = new ArrayList <Hotel>();
    public void add_hotel(){
        String nom,test;
        Scanner input=new Scanner(System.in);
        do{
            try {
                System.out.println("donner le nom de votre hotel");
                nom = input.next().toUpperCase().strip();
                if (Hotel.noms.contains(nom)) {
                    throw new Error("nom");
                }
                else {
                    break;
                }
            }catch (Error r){
                System.out.println(r);
            }
        }while(true);
        int cat;
        while(true){
            try{
                System.out.println("donner le nombre d'etoiles de votre hotel ");
                test=input.next();
                if(test.matches("\\d+")){
                    cat=Integer.parseInt(test);
                }
                else{
                    throw new Error("cat");
                }
                if(cat<1||cat>5){
                    throw new Error("cat");
                }
                else{
                    break;
                }

            }catch(Error r){
                System.out.println(r);
            }
        }
        Date ouv;
        int j;
        int m;
        while(true){
            try{
                System.out.print("donner le jour d'ouverture: ");
                test=input.next();
                if(test.matches("\\d+")){
                    j=Integer.parseInt(test);}
                else{
                    throw new Error("jour");
                }

                System.out.print("donner le mois d'ouverture: ");
                test=input.next();
                if(test.matches("\\d+")){
                    m=Integer.parseInt(test);}
                else{
                    throw new Error("mois"); }
                ouv=new Date(j,m);
                break;



            }catch (Error r){
                System.out.println(r);
            }
        }
        Date fer;
        int j1;
        int m1;
        while(true){
            try{
                System.out.print("donner le jour d'fermeture: ");
                test=input.next();
                if(test.matches("\\d+")){
                    j1=Integer.parseInt(test);}
                else{
                    throw new Error("jour");
                }

                System.out.print("donner le mois d'fermeture: ");
                test=input.next();
                if(test.matches("\\d+")){
                    m1=Integer.parseInt(test);}
                else{
                    throw new Error("mois"); }
                fer=new Date (j1,m1);
                break;
            }catch (Error r){
                System.out.println(r);
            }
        }
        double prix;
        while(true){
            try{
                System.out.println("donner le prix initial de la nuite ");
                test=input.next();
                if(test.matches("\\d+.\\d+")||test.matches("\\d+")){
                    prix=Integer.parseInt(test);
                }
                else{
                    throw new Error("prix");
                }
                break;
            }catch(Error r){
                System.out.println(r);
            }
        }
        int nb;
        while(true){
            try{
                System.out.println("donner le nombre de chambres de votre hotel ");
                test=input.next();
                if(test.matches("\\d+")){
                    nb=Integer.parseInt(test);
                }
                else{
                    throw new Error("nb");
                }
                break;
            }catch(Error r){
                System.out.println(r);
            }
        }
        int nb_etage;
        while(true){
            try{
                System.out.println("donner le nombre d'etages de votre hotel ");
                test=input.next();
                if(test.matches("\\d+")){
                    nb_etage=Integer.parseInt(test);
                }
                else{
                    throw new Error("nb_etage");
                }
                break;
            }catch(Error r){
                System.out.println(r);
            }
        }
        String adresse;
        while (true){
            try{
                System.out.print("donner l'adresse de votre hotel");
                adresse=input.next();
                if (adresse==""){
                    throw new Error("adresse");
                }
                break;
            }catch(Error r){
                System.out.println(r);
            }

        }
        Hotel h=new Hotel(nom,cat,ouv,fer,nb,prix,adresse,nb_etage);
        hotels.add(h);
        h.setIniprix(prix);
        Hotel.noms.add(nom);
        for(int i=0;i<nb;i++){
            h.add_room(i);
        }
        h.les_prix();
        System.out.println("maintenant vous devez implementer tous les services des votre hotel");
        System.out.println("voulez vous avoir le blanchisserie comme un service dans votre hotel?");
        test=input.next().toUpperCase().strip();
        String blanchisserie;
        while (true) {
            try {
                if (!test.equals("OUI") && !test.equals("NON")) {
                    throw new Error("reponse");
                }
                if (test.equals("OUI")) {
                    blanchisserie = "Blanchisserie";
                    double tarif_b;
                    while (true) {
                        try {
                            System.out.println("donner le tarif de ce service");
                            test = input.next();
                            if (test.matches("\\d+") || test.matches("\\d+" + "." + "\\d+")) {
                                tarif_b = Integer.parseInt(test);
                            } else {
                                throw new Error("tarif");
                            }
                            break;
                        } catch (Error r) {
                            System.out.println(r);
                        }
                    }
                    Service s1 = new Service(blanchisserie, tarif_b, false);
                    h.services.add(s1);


                }
                break;
            } catch (Error r) {
                System.out.println(r);
            }
        }
        System.out.println("voulez vous avoir sauna comme un service dans votre hotel?");
        test=input.next().toUpperCase().strip();
        String sauna;
        while (true) {
            try {
                if (!test.equals("OUI") && !test.equals("NON")) {
                    throw new Error("reponse");
                }
                if (test.equals("OUI")) {
                    sauna = "sauna";
                    double tarif_s;
                    while (true) {
                        try {
                            System.out.println("donner le tarif de ce service");
                            test = input.next();
                            if (test.matches("\\d+") || test.matches("\\d+" + "." + "\\d+")) {
                                tarif_s = Integer.parseInt(test);
                            } else {
                                throw new Error("tarif");
                            }
                            break;
                        } catch (Error r) {
                            System.out.println(r);
                        }
                    }

                    Service s2 = new Service(sauna, tarif_s, false);
                    h.services.add(s2);

                }
                break;
            } catch (Error r) {
                System.out.println(r);
            }
        }
        System.out.println("voulez vous avoir sauna comme un service dans votre hotel?");
        test=input.next().toUpperCase().strip();
        String soin;
        while(true) {
            try {
                if (!test.equals("OUI") && !test.equals("NON")) {
                    throw new Error("reponse");
                }
                if (test.equals("OUI")) {
                    soin = "soin";
                    double tarif_s;
                    while (true) {
                        try {
                            System.out.println("donner le tarif de ce service");
                            test = input.next();
                            if (test.matches("\\d+") || test.matches("\\d+" + "." + "\\d+")) {
                                tarif_s = Integer.parseInt(test);
                            } else {
                                throw new Error("tarif");
                            }
                            break;
                        } catch (Error r) {
                            System.out.println(r);
                        }
                    }
                    Service s3 = new Service(soin, tarif_s, false);
                    h.services.add(s3);

                }
                break;
            } catch (Error r) {
                System.out.println(r);
            }
        }
        System.out.println("voulez vous avoir room_service comme un service dans votre hotel?");
        test=input.next().toUpperCase().strip();
        String roomservice;
        while(true) {
            try {
                if (!test.equals("OUI") && !test.equals("NON")) {
                    throw new Error("reponse");
                }
                if (test.equals("OUI")) {
                    roomservice = "roomservice";
                    double tarif_s;
                    while (true) {
                        try {
                            System.out.println("donner le tarif de ce service");
                            test = input.next();
                            if (test.matches("\\d+") || test.matches("\\d+" + "." + "\\d+")) {
                                tarif_s = Integer.parseInt(test);
                            } else {
                                throw new Error("tarif");
                            }
                            break;
                        } catch (Error r) {
                            System.out.println(r);
                        }
                    }
                    Service s4 = new Service(roomservice, tarif_s, true);
                    h.services.add(s4);


                }
                break;
            } catch (Error r) {
                System.out.println(r);
            }
        }
        System.out.println("voulez vous avoir le petit dejeuner comme un service dans votre hotel?");
        test=input.next().toUpperCase().strip();
        String petit_dej;
        while(true) {
            try {
                if (!test.equals("OUI") && !test.equals("NON")) {
                    throw new Error("reponse");
                }
                if (test.equals("OUI")) {
                    petit_dej = "petit_dej";
                    double tarif_s;
                    while (true) {
                        try {
                            System.out.println("donner le tarif de ce service");
                            test = input.next();
                            if (test.matches("\\d+") || test.matches("\\d+" + "." + "\\d+")) {
                                tarif_s = Integer.parseInt(test);
                            } else {
                                throw new Error("tarif");
                            }
                            break;
                        } catch (Error r) {
                            System.out.println(r);
                        }
                    }
                    Service s3 = new Service(petit_dej, tarif_s, true);
                    h.services.add(s3);

                }
                break;
            } catch (Error r) {
                System.out.println(r);
            }
        }

        System.out.println("voulez vous avoir les articles minibar comme un service dans votre hotel?");
        test=input.next().toUpperCase().strip();
        String minibar;
        while(true) {
            try {
                if (!test.equals("OUI") && !test.equals("NON")) {
                    throw new Error("reponse");
                }
                if (test.equals("OUI")) {
                    minibar = "minibar";
                    double tarif_s;
                    while (true) {
                        try {
                            System.out.println("donner le tarif de ce service");
                            test = input.next();
                            if (test.matches("\\d+") || test.matches("\\d+" + "." + "\\d+")) {
                                tarif_s = Integer.parseInt(test);
                            } else {
                                throw new Error("tarif");
                            }
                            break;
                        } catch (Error r) {
                            System.out.println(r);
                        }
                    }
                    Service s3 = new Service(minibar, tarif_s, true);
                    h.services.add(s3);

                }
                break;
            } catch (Error r) {
                System.out.println(r);
            }
        }
        System.out.println("voulez vous avoir la communication telephonique comme un service dans votre hotel?");
        test=input.next().toUpperCase().strip();
        String communication_tele;
        while (true) {
            try {
                if (!test.equals("OUI") && !test.equals("NON")) {
                    throw new Error("reponse");
                }
                if (test.equals("OUI")) {
                    communication_tele = "communication_tele";
                    double tarif_s;
                    while (true) {
                        try {
                            System.out.println("donner le tarif de ce service");
                            test = input.next();
                            if (test.matches("\\d+") || test.matches("\\d+" + "." + "\\d+")) {
                                tarif_s = Integer.parseInt(test);
                            } else {
                                throw new Error("tarif");
                            }
                            break;
                        } catch (Error r) {
                            System.out.println(r);
                        }
                    }
                    Service s3 = new Service(communication_tele, tarif_s, true);
                    h.services.add(s3);
                }
                break;
            } catch (Error r) {
                System.out.println(r);
            }
        }



        System.out.println(h);
    }
    public void add_reservation(){
        String test;
        String nom_hotel;
        Scanner input =new Scanner(System.in);
        while(true){
            try{
                System.out.println("donner le nom de l'hotel :  ");
                nom_hotel = input.next().toUpperCase().strip();
                if (!Hotel.noms.contains(nom_hotel)) {
                    throw new Error("nom_h");
                }
                else{
                    break;
                }
            }catch(Error r){
                System.out.println(r);
            }
        }
        Date date_res;
        int j;
        int m;
        while(true){
            try{
                System.out.print("donner le jour de la reservation: ");
                test=input.next();
                if(test.matches("\\d+")){
                    j=Integer.parseInt(test);}
                else{
                    throw new Error("jour");
                }

                System.out.print("donner le mois de la reservation : ");
                test=input.next();
                if(test.matches("\\d+")){
                    m=Integer.parseInt(test);}
                else{
                    throw new Error("mois"); }
                date_res=new Date (j,m);
                break;
            }catch (Error r){
                System.out.println(r);
            }
        }
        int nb_ch;
        while(true){
            try{
                System.out.println("donner le nombre de chambres que vous voulez reserver:  ");
                test=input.next();
                if(test.matches("\\d+")){
                    nb_ch=Integer.parseInt(test);
                }
                else {
                    throw new Error("nb");
                }
                if(nb_ch>5||nb_ch<1){
                    throw new Error("nb");
                }
                break;
            }catch(Error r){
                System.out.println(r);
            }
        }
        int duree;
        while(true){
            try{
                System.out.println("donner la duree de reservation :  ");
                test=input.next();
                if(test.matches("\\d+")){
                    duree=Integer.parseInt(test);
                }
                else {
                    throw new Error("duree");
                }
                if(duree>7||duree<1){
                    throw new Error("duree");
                }
                break;
            }catch(Error r){
                System.out.println(r);
            }
        }
        Reservation res=new Reservation(date_res,nb_ch,duree);
        String finalNom_hotel = nom_hotel;
        Hotel h=hotels.stream().filter(Hotel-> finalNom_hotel.equals(Hotel.getNom())).findAny().orElse(null);
        try {
            if (h == null) {
                throw new Error("nom_h" );
            }
        }catch (Error r){
            System.out.println(r);
        }
        for(int k=0;k<nb_ch;k++){
            while(true) {
                System.out.println("voulez vous reserver par numero de chambre ?");
                test = input.next().toUpperCase().strip();
                try {
                    if (!test.equals("OUI") && !test.equals("NON")&&!test.equals("QUITTER")) {
                        throw new Error("reponse");
                    }
                } catch (Error r) {
                    System.out.println(r);
                }
                if (test.equals("OUI")) {
                    int num;
                    while (true) {
                        try {
                            System.out.println("donner le numero de cette chambre:  ");
                            test = input.next();
                            if(test.equals("quitter")){
                                break;
                            }
                            if (test.matches("\\d+")) {
                                num = Integer.parseInt(test);
                            } else {
                                throw new Error("num_ch");
                            }

                            for (Reservation s : h.reservations) {
                                for (int a : s.num_ch) {
                                    if (a == num) {
                                        Date d1 = date_res.clone();
                                        Date d2 = s.getDate_res().clone();
                                        d1.addJ(duree);
                                        d2.addJ(s.getDure());

                                        if (!(d1.comparTo(s.getDate_res()) < 0 || date_res.comparTo(d2) > 0)) {
                                            throw new Error("reservation");
                                        }
                                    }
                                }
                            }
                            res.num_ch[k] = num;
                            break;
                        } catch (Error r) {
                            System.out.println(r);
                        }

                    }
                }
                else {
                    int categorie;
                    while (true) {
                        try {
                            System.out.println("donner la categorie de cette chambre:  ");
                            test = input.next();
                            if(test.equals("quitter")){
                                break;
                            }
                            if (test.matches("\\d+")) {
                                categorie = Integer.parseInt(test);
                            } else {
                                throw new Error("nb");
                            }
                            if (categorie > 3 || categorie < 0) {
                                throw new Error("nb");
                            }
                            boolean b = false;
                            for (Chambre chb : h.tab) {
                                if (chb.getCategorie() == categorie) {
                                    System.out.println(chb.getNum_ch()+" "+chb.getCategorie());
                                    for (Reservation s : h.reservations) {
                                        for (int a : s.num_ch) {
                                            if (a == chb.getNum_ch()) {
                                                System.out.println(chb.getNum_ch());
                                                Date d1 = date_res.clone();
                                                Date d2 = s.getDate_res().clone();
                                                d1.addJ(duree);
                                                d2.addJ(s.getDure());
                                                if (!(d1.comparTo(s.getDate_res()) < 0 || date_res.comparTo(d2) > 0)) {
                                                    throw new Error("reservation");
                                                }
                                            }
                                        }
                                    }
                                    res.num_ch[k] = chb.getNum_ch();
                                    b = true;
                                    break;
                                }
                            }
                            if (b == false)
                                throw new Error("reservation");
                            break;

                        } catch (Error r) {
                            System.out.println(r);
                        }
                    }
                }
                break;
            }

            System.out.println("mainetenant vous pouvez choisir les services que vous voulez consommer");
            this.addConsommation(h,res);
        }
        h.reservations.add(res);
        this.addclient(res.getNum_res(),h,res);



        System.out.println(res);
        
    }
    public void addclient(int n,Hotel h,Reservation res) {
        String test;
        Scanner input = new Scanner(System.in);
        int num_client=n;
        String nom;
        while (true) {
            try {
                System.out.println("donner le nom de le client :  ");
                nom = input.next().toUpperCase().strip();
                if (nom.matches("\\d+")) {
                    throw new Error("nom_h");
                } else {
                    break;
                }
            } catch (Error r) {
                System.out.println(r);
            }
        }
        String prenom;
        while (true) {
            try {
                System.out.println("donner le prenom de le client :  ");
                prenom = input.next().toUpperCase().strip();
                if (prenom.matches("\\d+")) {
                    throw new Error("nom_h");
                } else {
                    break;
                }
            } catch (Error r) {
                System.out.println(r);
            }
        }
        String nomRue;
        while (true) {
            try {
                System.out.println("donner le nom rue :  ");
                nomRue = input.next().toUpperCase().strip();
                if (nomRue.matches("\\d+")) {
                    throw new Error("nom_rue");
                } else {
                    break;
                }
            } catch (Error r) {
                System.out.println(r);
            }
        }
        int numeroImmeuble;
        while (true) {
            try {
                System.out.println("donner le numero d'immeuble :  ");
                test = input.next();
                if (test.matches("\\d+")) {
                    numeroImmeuble = Integer.parseInt(test);
                } else {
                    throw new Error("numeroimmeuble");
                }
                break;
            } catch (Error r) {
                System.out.println(r);
            }
        }
        String nomcommune;
        while (true) {
            try {
                System.out.println("donner le nom de la commune :  ");
                nomcommune = input.next().toUpperCase().strip();
                if (nomcommune.matches("\\d+")) {
                    throw new Error("nom_commune");
                } else {
                    break;
                }
            } catch (Error r) {
                System.out.println(r);
            }
        }
        int codepostal;
        while (true) {
            try {
                System.out.println("donner le code postal :  ");
                test = input.next();
                if (test.matches("\\d+")) {
                    codepostal = Integer.parseInt(test);
                } else {
                    throw new Error("codepostal");
                }
                break;
            } catch (Error r) {
                System.out.println(r);
            }
        }
        String departementouetat;
        while (true) {
            try {
                System.out.println("donner le departement ou l'etat:  ");
                departementouetat = input.next().toUpperCase().strip();
                if (departementouetat.matches("\\d+")) {
                    throw new Error("departementouetat");
                } else {
                    break;
                }
            } catch (Error r) {
                System.out.println(r);
            }
        }
        String pays;
        while (true) {
            try {
                System.out.println("donner la pays :  ");
                pays = input.next().toUpperCase().strip();
                if (pays.matches("\\d+")) {
                    throw new Error("pays");
                } else {
                    break;
                }
            } catch (Error r) {
                System.out.println(r);
            }
        }
        String numeroTelephone;
        while (true) {
            try {
                System.out.println("donner le numero de telephone :  ");
                numeroTelephone = input.next().toUpperCase().strip();
                if ((!numeroTelephone.matches("\\d+"))||numeroTelephone.length() >8) {
                    throw new Error("numeroTelephone");

                }
                else {
                    break;
                }
            } catch (Error r) {
                System.out.println(r);
            }
        }
        String adresseCourriel;
        while (true) {
            try {
                System.out.println("donner l'adresse courriel :  ");
                adresseCourriel = input.next().toUpperCase().strip();
                if (adresseCourriel.matches("\\d+")) {
                    throw new Error("adresseCourriel");
                } else {
                    break;
                }
            } catch (Error r) {
                System.out.println(r);
            }
        }
        String adresseWeb;
        while (true) {
            try {
                System.out.println("donner l'adresse Web :  ");
                adresseWeb = input.next().toUpperCase().strip();
                if (adresseWeb.length() > 50) {
                    throw new Error("adresseWeb");
                } else {
                    break;
                }
            } catch (Error r) {
                System.out.println(r);
            }
        }
        Adresse ad = new Adresse(nomRue, numeroImmeuble, nomcommune, codepostal, departementouetat, pays, numeroTelephone, adresseCourriel, adresseWeb);
        Client c = new Client(num_client,nom, prenom, ad);
        c.reservation=res;
        for(int i=0;i<res.getNb_chambre();i++){
            for (Chambre chb : h.tab){
                for (int a : res.num_ch) {
                    if(a== chb.getNum_ch())
                        c.chambres.add(chb);

                }}
        }
        h.clients.add(c);
        }
    public void addConsommation(Hotel h,Reservation reser) {
        ArrayList<Consommation> cons = new ArrayList<Consommation>();
        Scanner input = new Scanner(System.in);
        String test;
        while (true) {
            System.out.println("Voulez vous consommer des services?");
            test = input.next().toUpperCase().strip();
            try {
                if (!test.equals("OUI") && !test.equals("NON")) {
                    throw new Error("reponse");
                }
                if (test.equals("OUI")) {
                    while (true) {
                        try {
                            while (true) {
                                try {
                                    System.out.println("voulez vous consommer un petit dejeuner ?");
                                    test = input.next().toUpperCase().strip();
                                    if (!test.equals("OUI") && !test.equals("NON")) {
                                        throw new Error("reponse");
                                    }
                                    if (test.equals("NON")) {
                                        break;
                                    } else {
                                        String finalNom_service = "petit_dej";
                                        Service ser = h.services.stream().filter(Service -> finalNom_service.equals(Service.getNom())).findAny().orElse(null);
                                        if (ser == null) {
                                            throw new Error("service");
                                        } else {
                                            int categorie;
                                            while (true) {
                                                try {
                                                    System.out.println("donner la categorie du votre petit dej ");
                                                    test = input.next();
                                                    if (test.matches("\\d+")) {
                                                        categorie = Integer.parseInt(test);
                                                    } else {
                                                        throw new Error("categorie");
                                                    }
                                                    if (categorie < 1 || categorie > 3) {
                                                        throw new Error("categorie");
                                                    }
                                                    break;
                                                } catch (Error r) {
                                                    System.out.println(r);
                                                }
                                            }
                                            Date date;
                                            int j1;
                                            int m1;
                                            while (true) {
                                                try {
                                                    System.out.print("donner le jour de la consomation: ");
                                                    test = input.next();
                                                    if (test.matches("\\d+")) {
                                                        j1 = Integer.parseInt(test);
                                                    } else {
                                                        throw new Error("jour");
                                                    }

                                                    System.out.print("donner le mois la consomation: ");
                                                    test = input.next();
                                                    if (test.matches("\\d+")) {
                                                        m1 = Integer.parseInt(test);
                                                    } else {
                                                        throw new Error("mois");
                                                    }
                                                    date = new Date(j1, m1);
                                                    break;
                                                } catch (Error r) {
                                                    System.out.println(r);
                                                }
                                            }
                                            Consommation com = new Consommation(ser, categorie, date, 0, 0);
                                            cons.add(com);
                                        }
                                    }break;
                                } catch (Error r) {
                                    System.out.println(r);
                                }
                            }

                            System.out.println("voulez vous consommer des communications telephoniques ?");
                            test = input.next().strip().toUpperCase();;
                            if (!test.equals("OUI") && !test.equals("NON")) {
                                throw new Error("reponse");
                            }
                            if(test.equals("OUI"))  {
                                String finalNom_service = "communication_tele";
                                Service ser = h.services.stream().filter(Service -> finalNom_service.equals(Service.getNom())).findAny().orElse(null);
                                if (ser == null) {
                                    throw new Error("service");
                                } else {
                                    int distance;
                                    while (true) {
                                        try {
                                            System.out.println("donner la distance du cette communication ");
                                            test = input.next();
                                            if (test.matches("\\d+")) {
                                                distance = Integer.parseInt(test);
                                            } else {
                                                throw new Error("distance");
                                            }
                                            if (distance < 0) {
                                                throw new Error("distance");
                                            }
                                            break;
                                        } catch (Error r) {
                                            System.out.println(r);
                                        }
                                    }
                                    Date date;
                                    int j1;
                                    int m1;
                                    while (true) {
                                        try {
                                            System.out.print("donner le jour de consommation: ");
                                            test = input.next();
                                            if (test.matches("\\d+")) {
                                                j1 = Integer.parseInt(test);
                                            } else {
                                                throw new Error("jour");
                                            }

                                            System.out.print("donner le mois de consommation: ");
                                            test = input.next();
                                            if (test.matches("\\d+")) {
                                                m1 = Integer.parseInt(test);
                                            } else {
                                                throw new Error("mois");
                                            }
                                            date = new Date(j1, m1);
                                            break;
                                        } catch (Error r) {
                                            System.out.println(r);
                                        }
                                    }
                                    Consommation com = new Consommation(ser, 0, date, 0, distance);
                                    cons.add(com);
                                }
                            }
                            System.out.println("voulez vous consommer les articles de mini bar?");
                            test = input.next().strip().toUpperCase();;
                            if (!test.equals("OUI") && !test.equals("NON")) {
                                throw new Error("reponse");
                            }
                            if(test.equals("OUI")){
                                String finalNom_service = "minibar";
                                Service ser = h.services.stream().filter(Service -> finalNom_service.equals(Service.getNom())).findAny().orElse(null);
                                if (ser == null) {
                                    throw new Error("service");
                                } else {
                                    int quantite;
                                    while (true) {
                                        try {
                                            System.out.println("donner a quantite des articles du mini bar ");
                                            test = input.next();
                                            if (test.matches("\\d+")) {
                                                quantite = Integer.parseInt(test);
                                            } else {
                                                throw new Error("quantite");
                                            }
                                            if (quantite < 0) {
                                                throw new Error("quantite");
                                            }
                                            break;
                                        } catch (Error r) {
                                            System.out.println(r);
                                        }
                                    }
                                    Date date;
                                    int j1;
                                    int m1;
                                    while (true) {
                                        try {
                                            System.out.print("donner le jour de consommation: ");
                                            test = input.next();
                                            if (test.matches("\\d+")) {
                                                j1 = Integer.parseInt(test);
                                            } else {
                                                throw new Error("jour");
                                            }

                                            System.out.print("donner le mois de consommation: ");
                                            test = input.next();
                                            if (test.matches("\\d+")) {
                                                m1 = Integer.parseInt(test);
                                            } else {
                                                throw new Error("mois");
                                            }
                                            date = new Date(j1, m1);
                                            break;
                                        } catch (Error r) {
                                            System.out.println(r);
                                        }
                                    }
                                    Consommation com = new Consommation(ser, 0, date, quantite, 0);
                                    cons.add(com);
                                }
                            }
                            System.out.println("voulez vous consommer le service de soin?");
                            test = input.next().strip().toUpperCase();;
                            if (!test.equals("OUI") && !test.equals("NON")) {
                                throw new Error("reponse");

                            }
                            if(test.equals("OUI")) {
                                String finalNom_service = "soin";
                                Service ser = h.services.stream().filter(Service -> finalNom_service.equals(Service.getNom())).findAny().orElse(null);
                                if (ser == null) {
                                    throw new Error("service");
                                } else {
                                    Date date;
                                    int j1;
                                    int m1;
                                    while (true) {
                                        try {
                                            System.out.print("donner le jour de consommation: ");
                                            test = input.next();
                                            if (test.matches("\\d+")) {
                                                j1 = Integer.parseInt(test);
                                            } else {
                                                throw new Error("jour");
                                            }

                                            System.out.print("donner le mois de consommation: ");
                                            test = input.next();
                                            if (test.matches("\\d+")) {
                                                m1 = Integer.parseInt(test);
                                            } else {
                                                throw new Error("mois");
                                            }
                                            date = new Date(j1, m1);
                                            break;
                                        } catch (Error r) {
                                            System.out.println(r);
                                        }
                                    }
                                    Consommation com = new Consommation(ser, 0, date, 0, 0);
                                    cons.add(com);
                                }
                            }
                            System.out.println("voulez vous consommer le service de sauna?");
                            test = input.next().strip().toUpperCase();;
                            if (!test.equals("OUI") && !test.equals("NON")) {
                                throw new Error("reponse");
                            }
                            if(test.equals("OUI")) {
                                String finalNom_service = "sauna";
                                Service ser = h.services.stream().filter(Service -> finalNom_service.equals(Service.getNom())).findAny().orElse(null);
                                if (ser == null) {
                                    throw new Error("service");
                                } else {
                                    Date date;
                                    int j1;
                                    int m1;
                                    while (true) {
                                        try {
                                            System.out.print("donner le jour de consommation: ");
                                            test = input.next();
                                            if (test.matches("\\d+")) {
                                                j1 = Integer.parseInt(test);
                                            } else {
                                                throw new Error("jour");
                                            }

                                            System.out.print("donner le mois de consommation: ");
                                            test = input.next().strip().toUpperCase();;
                                            if (test.matches("\\d+")) {
                                                m1 = Integer.parseInt(test);
                                            } else {
                                                throw new Error("mois");
                                            }
                                            date = new Date(j1, m1);
                                            break;
                                        } catch (Error r) {
                                            System.out.println(r);
                                        }
                                    }
                                    Consommation com = new Consommation(ser, 0, date, 0, 0);
                                    cons.add(com);
                                }
                            }
                            System.out.println("voulez vous consommer le service de roomservice?");
                            test = input.next().strip().toUpperCase();
                            if (!test.equals("OUI") && !test.equals("NON")) {
                                throw new Error("reponse");
                            }
                            if(test.equals("OUI")){
                                String finalNom_service = "roomservice";
                                Service ser = h.services.stream().filter(Service -> finalNom_service.equals(Service.getNom())).findAny().orElse(null);
                                if (ser == null) {
                                    throw new Error("service");
                                } else {
                                    Date date;
                                    int j1;
                                    int m1;
                                    while (true) {
                                        try {
                                            System.out.print("donner le jour de consommation: ");
                                            test = input.next();
                                            if (test.matches("\\d+")) {
                                                j1 = Integer.parseInt(test);
                                            } else {
                                                throw new Error("jour");
                                            }

                                            System.out.print("donner le mois de consommation: ");
                                            test = input.next();
                                            if (test.matches("\\d+")) {
                                                m1 = Integer.parseInt(test);
                                            } else {
                                                throw new Error("mois");
                                            }
                                            date = new Date(j1, m1);
                                            break;
                                        } catch (Error r) {
                                            System.out.println(r);
                                        }
                                    }
                                    Consommation com = new Consommation(ser, 0, date, 0, 0);
                                    cons.add(com);
                                }
                            }
                            System.out.println("voulez vous consommer le service de blanchisserie?");
                            test = input.next().strip().toUpperCase();
                            if (!test.equals("OUI") && !test.equals("NON")) {
                                throw new Error("reponse");
                            }
                            if(test.equals("OUI")){
                                String finalNom_service = "Blanchisserie";
                                Service ser = h.services.stream().filter(Service -> finalNom_service.equals(Service.getNom())).findAny().orElse(null);
                                if (ser == null) {
                                    throw new Error("service");
                                } else {
                                    Date date;
                                    int j1;
                                    int m1;
                                    while (true) {
                                        try {
                                            System.out.print("donner le jour de consommation: ");
                                            test = input.next();
                                            if (test.matches("\\d+")) {
                                                j1 = Integer.parseInt(test);
                                            } else {
                                                throw new Error("jour");
                                            }

                                            System.out.print("donner le mois de consommation: ");
                                            test = input.next();
                                            if (test.matches("\\d+")) {
                                                m1 = Integer.parseInt(test);
                                            } else {
                                                throw new Error("mois");
                                            }
                                            date = new Date(j1, m1);
                                            break;
                                        } catch (Error r) {
                                            System.out.println(r);
                                        }
                                    }
                                    Consommation com = new Consommation(ser, 0, date, 0, 0);
                                    cons.add(com);
                                }
                            }
                        } catch (Error s) {
                            System.out.println(s);
                        }
                        break;
                    }
                }
            }catch(Error r){
                    System.out.println(r);
                }
            reser.listeDeListes.add(cons);
            break;
        }
    }
    public void fact(){
        Scanner input=new Scanner(System.in);
        String test;
        String nom;
        do{
            try {
                System.out.println("donner le nom de votre hotel");
                nom = input.next().toUpperCase().strip();
                if (!Hotel.noms.contains(nom)) {
                    throw new Error("nom");
                }
                else {
                    break;
                }
            }catch (Error r){
                System.out.println(r);
            }
        }while(true);
        String finalNom_hotel = nom;
        Hotel h=hotels.stream().filter(Hotel-> finalNom_hotel.equals(Hotel.getNom())).findAny().orElse(null);
        int num_client;
        while(true){
            try{
                System.out.println("donner numero de client ");
                test=input.next();
                if(test.matches("\\d+")){
                    num_client=Integer.parseInt(test);
                }
                else{
                    throw new Error("num_client");
                }
                int finalNum_client=num_client;
                if(h.clients.stream().filter(Client-> finalNum_client==Client.getNum_client()).findAny().orElse(null)==null){
                    throw new Error("num_client");
                }
                break;
            }catch(Error r){
                System.out.println(r);
            }
        }
        int finalNum_client=num_client;
        Client c=h.clients.stream().filter(Client-> finalNum_client==Client.getNum_client()).findAny().orElse(null);

        int j1;
        int m1;
        Date date;
        while(true){
            try{
                System.out.print("donner le jour de la demande de facture: ");
                test=input.next();
                if(test.matches("\\d+")){
                    j1=Integer.parseInt(test);}
                else{
                    throw new Error("jour");
                }

                System.out.print("donner le mois la demande de facture: ");
                test=input.next();
                if(test.matches("\\d+")){
                    m1=Integer.parseInt(test);}
                else{
                    throw new Error("mois"); }
                date=new Date (j1,m1);
                break;
            }catch (Error r){
                System.out.println(r);
            }
        }

        Facture f=new Facture(date);
        System.out.println(f.toString(c));
    }
}






