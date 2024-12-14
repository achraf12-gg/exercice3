package personne;

public class personne {
    // Définition des orientations possibles
    private enum Orientation {
        NORD, EST, SUD, OUEST;
    }

    // L'orientation initiale du personnage est NORD
    private Orientation orientation = Orientation.NORD;

    // Méthode pour faire tourner le personnage
    public String tourner(int fois) {
        // Le nombre de rotations modifié pour éviter de dépasser un tour complet
       if (fois==1) return "EST";
       else if(fois==2) return "SUD";
       else if(fois==3) return "OUEST";
       else return "NORD";
    }


}
