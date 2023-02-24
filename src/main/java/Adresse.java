
/**
 * Indiquer le ou les numeros de TP et d'exercice.
 *
 * @author (votre nom)
 */
public class Adresse
{
    int numR;
    String codeP, nomR, ville;

    /** Constructeur sans paramètre */
    Adresse(){
        this.codeP = "";
        this.nomR = "";
        this.numR = 1;
        this.ville = "";
    }
    
    /** Constructeur avec paramètre
     * @param pfNumR IN : numero de la rue
     * @param pfNomR IN : nom de la rue
     * @param pfCodeP IN : code postal
     * @param pfVille IN : nom de la ville
     */
    Adresse(int pfNumR, String pfNomR, String pfCodeP, String pfVille){
        this.codeP = pfCodeP;
        this.nomR = pfNomR;
        this.numR = pfNumR;
        this.ville = pfVille;
    }
}

