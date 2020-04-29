package question3;



/**
 * NFP121 TpIntroduction, usage de BlueJ et du "Submitter".
 * 
 * @version septembre 2009
 * @author ï¿½ complï¿½ter
 * @see java.lang.String, java.lang.Math
 */
public class AuditeurCNAM {
    /** l'attribut nom de chaque auditeur. */
    private String nom;
    /** l'attribut prenom de chaque auditeur. */
    private String prenom;
    /** l'attribut matricule de chaque auditeur. */
    private String matricule;

    /**
     * "Crï¿½ation", le constructeur d'un auditeur avec son nom, son prï¿½nom et son
     * matricule.
     * 
     * @param nom
     *            le nom de l'auditeur
     * @param prenom
     *            son prï¿½nom
     * @param matricule
     *            sur la carte d'inscription, prï¿½s de la photo
     */
    public AuditeurCNAM(String nom, String prenom, String matricule) {
        this.nom = nom;
        this.prenom = prenom;
        this.matricule = matricule;
    }

    /**
     * le login au Cnam : 6 premiï¿½res lettres du nom suivies de la premiï¿½re
     * lettre du prï¿½nom sï¿½parï¿½es de '_' . le login retournï¿½ est en minuscules,
     * le trait d'union, ou spï¿½ciaux <i>(pour unix)</i> sont remplacï¿½s par des
     * '_' pas de caractï¿½res accentuï¿½s pour le login voir les classes
     * prï¿½dï¿½fines, java.lang.String : les mï¿½thodes replaceAll, toLowerCase et
     * substring java.lang.Math : la mï¿½thode min<br>
     * <b>BlueJ : Menu Aide</b>
     * 
     * @return le login du Cnam simplifiï¿½, sans les adaptations dues aux
     *         homonymes...
     */
    public String login() {
        String nom=nom().length()>6 ? nom().substring(0,6) : nom();
        String prenom=prenom().substring(0,1);
        return (nom+"_"+prenom).toLowerCase().replaceAll("-","_")
        .replaceAll("é","e").replaceAll(" ","_").replaceAll(",","_");//
    }

    /**
     * Lecture du nom de l'auditeur.
     * 
     * @return son nom
     */
    public String nom() {
        return nom;//
    }

    /**
     * Lecture du prï¿½nom de l'auditeur.
     * 
     * @return son prï¿½nom
     */
    public String prenom() {
        return prenom;// 
    }

    /**
     * Lecture du matricule de l'auditeur.
     * 
     * @return son matricule
     */
    public String matricule() {
        return matricule;// 
    }

    /**
     * mï¿½thode toString ( mï¿½thode redï¿½finie de la classe Object).
     * 
     * @return la concatï¿½nation du nom, du prï¿½nom et du login, selon cette
     *         syntaxe
     *         <code>nom() + " " + prenom() +  " login : " + login()</code>
     */
    @Override
    public String toString() {
        return nom() + " " + prenom() + " login : " + login();
    }

}
