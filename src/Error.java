public class Error extends Exception {
    private String msg;
    Error(String m){
        switch (m){
            case "nom":msg="ce nom existe deja !";break;
            case "cat":msg="erreur reessayer";break;
            case "jour":msg="le jour doit etre un entier";break;
            case "mois":msg="le mois doit etre un entier";break;
            case "prix":msg="le prix n'est pas valide";break;
            case "nb":msg="le nombre des chambres n'est pas valide";break;
            case "adresse":msg="l'adresse n'est pas valide";break;
            case "nb_etage":msg="le nombre d'etage n'est pas valide";break;
            case "categorie":msg="la categorie n'est pas valide";break;
            case "num_et":msg="le numero de l'etage depasse le nb d'etage de l'hotel n'est pas valide";break;
            case "nb_eqp":msg="le nombre d'eqiupement n'est pas valide";break;
            case "nb_lit":msg="le nombre des lits est invalide";break;
            case "reservation":msg="cette chambre est deja reserve";break;
            case "duree":msg="cette duree est invalide";break;
            case "nom_h":msg="cet hotel n'existe pas";break;
            case "num_ch":msg="cette chambre n'existe pas";break;
            case "nom_rue":msg="ce nom de rue est invalide";break;
            case "numeroimmeuble":msg="ce numero d'immeube est invalide";break;
            case "nom_commune":msg="ce nom du commune est invalide";break;
            case "codepostal":msg="ce code postal est invalide";break;
            case "departementouetat":msg="ce departement ou etat n'est pas valide";break;
            case "pays":msg="ce pays est invalid";break;
            case "numeroTelephone":msg="ce numero de telephone est invalide";break;
            case "adresseCourriel":msg="l'adresse courriel est invalde";break;
            case "adresseWeb":msg="l'adresse web est invalde";break;
            case "reponse":msg="la reponse doit oui ou non ";break;
            case "tarif":msg="un tarif doit etre positive";break;
            case "service":msg="ce service n'existe pas dans l'hotel";break;
            case "distance":msg="cette distance est invalide";break;
            case "quantite":msg="cette quantite est invalide";break;
            case "nomc":msg="nom invalide";break;
            case "prenomc":msg="prenom invalide";break;
            case "num_client":msg="numero de client invalide";break;
        }
    }
    @Override
    public String toString() {
        return msg;
    }
}
