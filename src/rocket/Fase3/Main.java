/*FASE 3:

Per la fase 3 modificarem els propulsors afegint també una potencia actual. 
Un propulsor tindrà una potència màxima (no la pot superar) i una potencia actual 
(la potencia que té el propulsor en aquell moment). 
Tots els propulsors tindran una potència actual que començarà amb 0.
El coet tindrà dos mètodes, accelerar o frenar. Aquests mètodes indicaran 
la potència objectiu de cada propulsor, tingues en compte que cada propulsor ha de 
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
	static ArrayList<Double> actualSpeed = new ArrayList<Double>();
	static double speed = 0;
	static double targetSpeed = 0;
	public static int j;
	public static int i;
	public static double maxSpeed32;
	public static double maxSpeedld;

	public static void main(String[] args) {

		System.out.println("Welcome to Space Rocket Race!");
		System.out.println("--- --- --- --- --- --- --- ---");

		genTh32();
		Rocket WESSDS32 = new Rocket("32WESSDS", thList32);
		System.out.println("The rocket 32WESSDS" + " it's equipped with " + thList32.size() + " thrusthers."
				+ thList32.toString());
		rocketList.add(WESSDS32);

		genThld();
		Rocket LDSFJA32 = new Rocket("LDSFJA32", thListld);
		System.out.println("The rocket LDSFJA32" + " it's equipped with " + thListld.size() + " thrusthers:"
				+ thListld.toString());
		rocketList.add(LDSFJA32);
		
		System.out.println("--- --- --- --- --- --- --- ---");
		System.out.println("Please introduce the target speed for the Rockets");
		System.out.println("*Remember that the escape velocity must be at least of 11 km/s.");
		
		targetSpeed = (scanner.nextDouble());

		genThread32();
		genThreadLD();
		calculateMaxSpeed();
		resumeActualSpeed();

	}

	public static void genTh32() {

		Thruster th1 = new Thruster("1", 10, 0);
		thList32.add(th1);
		Thruster th2 = new Thruster("2", 30, 0);
		thList32.add(th2);
		Thruster th3 = new Thruster("3", 80, 0);
		thList32.add(th3);

	}

	public static void genThld() {

		Thruster th1 = new Thruster("1", 30, 0);
		thListld.add(th1);
		Thruster th2 = new Thruster("2", 40, 0);
		thListld.add(th2);
		Thruster th3 = new Thruster("3", 50, 0);
		thListld.add(th3);
		Thruster th4 = new Thruster("4", 50, 0);
		thListld.add(th4);
		Thruster th5 = new Thruster("5", 30, 0);
		thListld.add(th5);
		Thruster th6 = new Thruster("6", 10, 0);
		thListld.add(th6);
	}

	public static void genThread32() {
		speed = 0;
		System.out.println("Rocket 32WESSDS launched!");

		for (j = 1; j < thList32.size(); j++) {

			for (i = 0; i <= thList32.get(j).maxPower; i++) {

				Thread object = new Thread(new Accelerate());
				object.start();
				// System.out.println("Thruster " + j + " actual power of " + i + "!");
				if (speed <= targetSpeed) {
					speed = speed + 0.1;
				}
				try {
					Thread.sleep(20);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		System.out.println(
				"Target speed or Maximum power reached! " + "The speed of Rocket 32WESSDS is " + speed + "km/s.");
		if (speed >= 11) {
			System.out.println("Rocket arrived safely in space!");
		} else {
			System.out.println("Huston we have a problem! Escape velocity not Reached!");
		}
		System.out.println("--- --- --- --- ---");
		actualSpeed.add(speed);
	}

	public static void genThreadLD() {
		speed = 0;
		System.out.println("Rocket LDSFJA32 launched!");

		for (j = 1; j < thListld.size(); j++) {

			for (i = 0; i <= thListld.get(j).maxPower; i++) {

				Thread object = new Thread(new Accelerate());
				object.start();
				// System.out.println("Thruster " + j + " actual power of " + i + "!");
				if (speed <= targetSpeed) {
					speed = speed + 0.1;
				}
				try {
					Thread.sleep(20);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		System.out.println(
				"Target speed or Maximum power reached! " + "The speed of Rocket LDSFJA32 is " + speed + "km/s.");
		if (speed >= 11) {
			System.out.println("Rocket arrived safely in space!");
		} else {
			System.out.println("Huston we have a problem! Escape velocity not Reached!");
		}
		System.out.println("--- --- --- --- ---");
		actualSpeed.add(speed);
	}

	private static void calculateMaxSpeed() {
		for (j = 1; j < thList32.size(); j++) {

			for (i = 0; i <= thList32.get(j).maxPower; i++) {
				maxSpeed32 = maxSpeed32 + 0.1;
			}
		}
		for (j = 1; j < thListld.size(); j++) {

			for (i = 0; i <= thListld.get(j).maxPower; i++) {
				maxSpeedld = maxSpeedld + 0.1;
			}
		}
	}

	private static void resumeActualSpeed() {
		System.out.println("Target speed of the Rockets was " + targetSpeed);
		System.out.println("Actual speed of Rocket 32WESSDS is " + actualSpeed.get(0) + "km/s.");
		if (targetSpeed > maxSpeed32) {
			System.out.println("Impossible reach the target speed, " + "maximum speed of Rocket 32WESSDS is "
					+ maxSpeed32 + "km/s.");
		}

		System.out.println("Target speed of the Rockets was " + targetSpeed);
		System.out.println("Actual speed of Rocket LDSFJA32 is " + actualSpeed.get(1) + "km/s.");
		if (targetSpeed > maxSpeedld) {
			System.out.println("Impossible reach the target speed, " + "maximum speed of Rocket LDSFJA32 is "
					+ maxSpeedld + "km/s.");
		}

		if (targetSpeed < 11) {
			System.out.println("Huston we have a problem! Escape velocity not Reached!");
			System.out.println("Escape velocity must be at least of 11 km/s.");
		}
	}
}
