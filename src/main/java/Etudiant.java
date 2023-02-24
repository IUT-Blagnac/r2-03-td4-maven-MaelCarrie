
/**
 * Indiquer le ou les numeros de TP et d'exercice.
 *
 * @author (votre nom)
 */
public class Etudiant
{
    String nom, prenom, ine;
    char promo;
    Adresse adr;
    /** Constructeur sans paramètre */
    Etudiant (){
        this.nom = "";
        this.prenom = "";
        this.ine = "";
        this.promo = '-';
        this.adr = new Adresse();
    }
    
    /** Constructeur avec paramètre
     * @param pfNom IN : nom de l'étudiant 
     * @param pfPrenom IN : prénom de l'étudiant
     * @param pfIne IN : ine de l'étudiant
     * @param pfPromo IN : numéro de la promo
     * @param pfAdr IN : adresse de l'étudiant
     */
    Etudiant (String pfNom, String pfPrenom, String pfIne, char pfPromo, Adresse pfAdr){
        this.nom = pfNom;
        this.prenom = pfPrenom;
        this.ine = pfIne;
        this.promo = pfPromo;
        this.adr = pfAdr;
    }
}

