public class Bavard implements PapotageListener{
    
    String pseudonyme = "Unknown Lacrimatica";
    Concierge concierge;

    public void listen(PapotageEvent e){

    }

    public Bavard(String pseudonyme, Concierge concierge){
        this.pseudonyme = pseudonyme;
        this.concierge = concierge;
    }

    public String getBavard(){
        return this.pseudonyme;
    }

    public void setConcierge(Concierge c){
        this.concierge = c;
    }
}
