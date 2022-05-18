import java.util.List;

public class Main{
    public static void main(String arg[]) {
		//new PapotageGUI();
		Compte cmpt = new Compte("a", "a", "Bavard 1", "a");
		Compte cmpt2 = new Compte("a", "a", "Bavard 2", "a");
		Compte cmpt3 = new Compte("a", "a", "Bavard 1", "a");
		Concierge c = new Concierge(0, cmpt , "C0nc13rg3");

		c.createBavard(cmpt);
		c.createBavard(cmpt2);
		c.createBavard(cmpt3);

		List<Bavard> list1 = c.getListConnected();

		PapotageEvent p = new PapotageEvent(list1.get(0), "Lacrimatica", "Pourquoi ?");

		c.selfNotify(p);
		c.notify(p);

	}
}