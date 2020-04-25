/*FASE 2:

Volem millorar el software perquè el propulsor tingui una potència màxima.

Modifiquem en el main anterior:
1. Creem dos coets amb els codis “32WESSDS” I “ ”. El primer coet tindrà tres propulsors (potència: 10,30,80) 
	i el segon sis propulsors (potència: 30,40,50,50,30,10).
2. Mostrar a pantalla el codi dels coets, el número de propulsors que té i la potència màxima de cada propulsor.

Output:

32WESSDS: 10,30,80
LDSFJA32: 30,40,50,50,30,10
*/

package rocket.Fase2;

import java.util.ArrayList;

public class Main {

	static ArrayList<Thruster> thList32 = new ArrayList<Thruster>();
	static ArrayList<Thruster> thListld = new ArrayList<Thruster>();

	public static void main(String[] args) {

		genTh32();
		Rocket WESSDS32 = new Rocket("32WESSDS", thList32);
		System.out.println("The rocket 32WESSDS" + " it's equipped with " + thList32.size() + " thrusthers."
				+ thList32.toString());

		genThld();
		Rocket LDSFJA32 = new Rocket("LDSFJA32", thListld);
		System.out.println("The rocket LDSFJA32" + " it's equipped with " + thListld.size() + " thrusthers:"
				+ thListld.toString());
	}

	public static void genTh32() {

		Thruster th1 = new Thruster("1", 10);
		thList32.add(th1);
		Thruster th2 = new Thruster("2", 30);
		thList32.add(th2);
		Thruster th3 = new Thruster("3", 80);
		thList32.add(th3);

	}

	public static void genThld() {

		Thruster th1 = new Thruster("1", 30);
		thListld.add(th1);
		Thruster th2 = new Thruster("2", 40);
		thListld.add(th2);
		Thruster th3 = new Thruster("3", 50);
		thListld.add(th3);
		Thruster th4 = new Thruster("4", 50);
		thListld.add(th4);
		Thruster th5 = new Thruster("5", 30);
		thListld.add(th5);
		Thruster th6 = new Thruster("6", 10);
		thListld.add(th6);
	}

}
