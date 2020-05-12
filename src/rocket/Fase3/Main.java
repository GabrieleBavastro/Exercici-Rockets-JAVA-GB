/*FASE 3:

Per la fase 3 modificarem els propulsors afegint tamb� una potencia actual. 
Un propulsor tindr� una pot�ncia m�xima (no la pot superar) i una potencia actual 
(la potencia que t� el propulsor en aquell moment). 
Tots els propulsors tindran una pot�ncia actual que comen�ar� amb 0.
El coet tindr� dos m�todes, accelerar o frenar. Aquests m�todes indicaran 
la pot�ncia objectiu de cada propulsor, tingues en compte que cada propulsor ha de 
saber si ha d'augmentar o baixar d'un en un la seva potencia i de forma independent (threads!).

Com a resultat hauries de veure per pantalla cada propulsor amb el fil adequat pujant 
o baixant la potencia segons hagis indicat a l'ordre d'accelerar o frenar
*/

package rocket.Fase3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static Scanner scanner = new Scanner((System.in));
	static ArrayList<Thruster> thList32 = new ArrayList<Thruster>();
	static ArrayList<Thruster> thListld = new ArrayList<Thruster>();
	static ArrayList<Rocket> rocketList = new ArrayList<Rocket>();

	static double targetSpeed;

	public static void main(String[] args) {

		System.out.println("Welcome to Space Rocket Race!");
		System.out.println("--- --- --- --- --- --- --- ---");

		Thruster.genTh32();
		Rocket WESSDS32 = new Rocket("32WESSDS", thList32);
		System.out.println("The rocket 32WESSDS" + " it's equipped with " + thList32.size() + " thrusthers:"
				+ thList32.toString());
		rocketList.add(WESSDS32);

		Thruster.genThld();
		Rocket LDSFJA32 = new Rocket("LDSFJA32", thListld);
		System.out.println("The rocket LDSFJA32" + " it's equipped with " + thListld.size() + " thrusthers:"
				+ thListld.toString());
		rocketList.add(LDSFJA32);

		System.out.println("--- --- --- --- --- --- --- ---");
		System.out.println("Please introduce the target speed for the Rockets");
		System.out.println("*Remember that the escape velocity must be at least of 11 km/s.");

		targetSpeed = (scanner.nextDouble());

		Accelerate.runRockets();
		Thruster.calculateMaxSpeed();
		Thruster.resumeActualSpeed();
		
	}

}
