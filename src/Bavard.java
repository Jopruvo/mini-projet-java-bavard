import java.util.List;
import java.util.ArrayList;

public class Bavard implements PapotageListener{
    
    String pseudonyme = "Unknown Lacrimatica";
    List<PapotageListener> listListener = new ArrayList<>();

    public void listen(PapotageEvent e){

    }

    public Bavard(String pseudonyme){
        this.pseudonyme = pseudonyme;
    }

    public String getBavard(){
        return this.pseudonyme;
    }

    public void addListener(PapotageListener l){
        listListener.add(l);
    }

    public void notify(PapotageEvent e){
        for(PapotageListener l : this.listListener){
            l.listen(e);
        }
    }
}
