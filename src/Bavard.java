public class Bavard implements PapotageListener{
    
    private String pseudonyme = "Whatsup";
    private Concierge concierge;

    public void listen(PapotageEvent e){

    }

    public Bavard(String pseudonyme, Concierge concierge){
        this.pseudonyme = pseudonyme;
        this.concierge = concierge;
    }

    public Concierge getConcierge(){
        return this.concierge;
    }

    public void setConcierge(Concierge c){
        this.concierge = c;
    }

    public String getPseudo(){
        return this.pseudonyme;
    }
}
