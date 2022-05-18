public class Bavard implements PapotageListener{
    
    private String pseudonyme = "Whatsup";
    private Concierge concierge;
    //private Compte compte;

    public void listen(PapotageEvent e){
        System.out.println(this.pseudonyme + " a reçu : " + e.getSujet() + " - " + e.getCorps());
    }

    public Bavard(Compte compte, Concierge concierge){
        this.pseudonyme = compte.getPseudo();
        this.concierge = concierge;
        //this.compte = compte;
    }

    public String getPseudo(){
        return this.pseudonyme;
    }

    public Concierge getConcierge(){
        return this.concierge;
    }

    public void setConcierge(Concierge c){
        this.concierge = c;
    }

    public void setCompte(Compte c){
        if (this.pseudonyme == c.getPseudo() && c.getType() == "User"){
            //this.compte = c;
        }
    }
}
