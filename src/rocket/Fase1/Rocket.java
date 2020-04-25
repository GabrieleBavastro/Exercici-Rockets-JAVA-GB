/*FASE 1:

Volem fer un software de carreres de coets.

Un coet està identificat per un codi de 8 caràcters i un número de propulsors.

Realitza els següents passos:

1. Creem dos coets amb els codis “x” I “LDSFJA32”. El primer coet tindrà tres propulsors i el segon sis propulsors.

2. Mostrar a pantalla el codi dels coets i el número de propulsors que té.
*/

package rocket.Fase1;

public class Rocket {

	String rocketName;
	int numberOfThrusthers;
	
	public Rocket(String name, int number) {
		rocketName = name;
		numberOfThrusthers = number;
	}

	public static void main(String[] args) {
		Rocket myRocket1 = new Rocket("XDSFJA32", 3);
		System.out.println("The rocket " + myRocket1.rocketName + 
				" it's equipped with " + myRocket1.numberOfThrusthers + " thrusthers.");
		Rocket myRocket2 = new Rocket("LDSFJA32", 6);
		System.out.println("The rocket " + myRocket2.rocketName + 
				" it's equipped with " + myRocket2.numberOfThrusthers + " thrusthers.");
	}

}
