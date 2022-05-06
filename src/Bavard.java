public class Bavard implements PapotageListener{
    
    private String pseudonyme = "Unknown Lacrimatica";
    private Concierge concierge;

    public void listen(PapotageEvent e){

    }

    public Bavard(String pseudonyme, Concierge concierge){
        this.pseudonyme = pseudonyme;
        this.concierge = concierge;
    }

    public String getBavard(){
        return this.pseudonyme;
    }

    public Concierge getConcierge(){
        return this.concierge;
    }

    public void setConcierge(Concierge c){
        this.concierge = c;
    }
}
