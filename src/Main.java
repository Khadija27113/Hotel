import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Enregistrer t=new Enregistrer();
        Scanner input=new Scanner(System.in);
        String test;
        while(true){
            System.out.println("Que voulez-vous faire?\n");
            System.out.println("Vous avez 4 choix: \n *Ajouter un hotel \n *Faire une reservation \n *Facture \n *Quitter\n");
            test=input.nextLine().strip().toUpperCase();
            switch (test){
                case "AJOUTER UN HOTEL":t.add_hotel();break;
                case "FAIRE UNE RESERVATION":t.add_reservation();break;
                case "FACTURE":t.fact();
                case "QUITTER":break;
            }
        }
    }
}