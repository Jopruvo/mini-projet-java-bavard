import java.util.EventObject;


public class PapotageEvent extends EventObject{
    
    private String sujet;
    private String corps;

    public PapotageEvent(Object source, String sujet, String corps){
        super(source);
        this.sujet = sujet;
        this.corps = corps;
    }

    public String getSujet(){
        return this.sujet;
    }

    public String getCorps(){
        return this.corps;
    }
}
