import java.util.List;
import java.util.ArrayList;

public class Concierge implements PapotageListener{
    
    private int id = 0;
    private Compte compte;
    private List<Bavard> listBavardsConnected = new ArrayList<>();
    private List<Bavard> listBavardsDisconnected = new ArrayList<>();
    private String pseudo;

    public Concierge(int id, Compte compte, String pseudo){
        this.id = id;
        this.compte = compte;
        this.pseudo = pseudo;
    }

    public int getID(){
        return this.id;
    }

    public void listen(PapotageEvent e){

    }

    public void addBavard(Bavard b){
        listBavardsConnected.add(b);
        System.out.println(b.getPseudo() + " ajouté à la liste des bavards connectés");
    }

    public void interet(Bavard b, boolean bool){
        if(bool == true & listBavardsDisconnected.contains(b)){
            for(int i = 0; i < listBavardsDisconnected.size(); i++){
                if(listBavardsDisconnected.get(i) == b){
                    listBavardsDisconnected.remove(i);
                    listBavardsConnected.add(b);
                }
            }
        }

        if(bool == false & listBavardsConnected.contains(b)){
            for(int i = 0; i < listBavardsConnected.size(); i++){
                if(listBavardsConnected.get(i) == b){
                    listBavardsConnected.remove(i);
                    listBavardsDisconnected.add(b);
                }
            }
        }
    }

    public void selfNotify(PapotageEvent e){
        this.listen(e);
        }

    public void notify(PapotageEvent e){
        for(PapotageListener l : this.listBavardsConnected){
            l.listen(e);
        }
    }

    public boolean verifyNameIntegrity(String name){
        for(int i = 0; i < listBavardsConnected.size(); i++){
            if(listBavardsConnected.get(i).getPseudo() == name){
                return false;
            }
        }

        for(int i = 0; i < listBavardsDisconnected.size(); i++){
            if(listBavardsDisconnected.get(i).getPseudo() == name){
                return false;
            }
        }
        
        return true;
    }

    public void setCompte(Compte c){
        if (this.pseudo == c.getPseudo() && c.getType() == "User"){
            this.compte = c;
        }
    }
}
