import java.util.List;
import java.util.ArrayList;

public class Concierge implements PapotageListener{
    
    List<Bavard> listBavardsConnected = new ArrayList<>();
    List<Bavard> listBavardsDisconnected = new ArrayList<>();

    public Concierge(){
    }

    public void listen(PapotageEvent e){

    }

    public void createBavard(Bavard b){
        listBavardsConnected.add(b);
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
}
