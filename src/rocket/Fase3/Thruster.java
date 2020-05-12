package rocket.Fase3;

import java.util.ArrayList;

public class Thruster {

	String idTh;
	int maxPower;
	int actualPower;
	static double speed = 0;
	public static int j;
	public static int i;
	public static double maxSpeed32;
	public static double maxSpeedld;

	static ArrayList<Double> actualSpeed = new ArrayList<Double>();

	public Thruster(String id, int mPT, int aPT) {
		idTh = id;
		maxPower = mPT;
		actualPower = aPT;

		this.setIdTh(idTh);
		this.setMaxPower(maxPower);
		this.setActualPower(aPT);

	}

	private void setActualPower(int aPT) {

	}

	String getIdTh() {
		return idTh;
	}

	private void setIdTh(String idTh) {
		this.idTh = idTh;
	}

	private void setMaxPower(int maxPower) {
		this.maxPower = maxPower;
	}

	@Override
	public String toString() {
		return "Thruster [idTh=" + idTh + ", maxPower=" + maxPower + ", actualPower=" + actualPower + "]";
	}

	public static void genTh32() {

		Thruster th1 = new Thruster("1", 10, 0);
		Main.thList32.add(th1);
		Thruster th2 = new Thruster("2", 30, 0);
		Main.thList32.add(th2);
		Thruster th3 = new Thruster("3", 80, 0);
		Main.thList32.add(th3);

	}

	public static void genThld() {

		Thruster th1 = new Thruster("1", 30, 0);
		Main.thListld.add(th1);
		Thruster th2 = new Thruster("2", 40, 0);
		Main.thListld.add(th2);
		Thruster th3 = new Thruster("3", 50, 0);
		Main.thListld.add(th3);
		Thruster th4 = new Thruster("4", 50, 0);
		Main.thListld.add(th4);
		Thruster th5 = new Thruster("5", 30, 0);
		Main.thListld.add(th5);
		Thruster th6 = new Thruster("6", 10, 0);
		Main.thListld.add(th6);
	}

	public static void genThread32() {
		speed = 0;
		System.out.println("Rocket 32WESSDS launched!");

		for (j = 1; j < Main.thList32.size(); j++) {

			for (i = 0; i <= Main.thList32.get(j).maxPower; i++) {

				Thread object = new Thread(new Accelerate());
				object.start();
				// System.out.println("Thruster " + j + " actual power of " + i + "!");
				if (speed <= Main.targetSpeed) {
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

		for (j = 1; j < Main.thListld.size(); j++) {

			for (i = 0; i <= Main.thListld.get(j).maxPower; i++) {

				Thread object = new Thread(new Accelerate());
				object.start();
				// System.out.println("Thruster " + j + " actual power of " + i + "!");
				if (speed <= Main.targetSpeed) {
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

	static void calculateMaxSpeed() {
		for (j = 1; j < Main.thList32.size(); j++) {

			for (i = 0; i <= Main.thList32.get(j).maxPower; i++) {
				maxSpeed32 = maxSpeed32 + 0.1;
			}
		}
		for (j = 1; j < Main.thListld.size(); j++) {

			for (i = 0; i <= Main.thListld.get(j).maxPower; i++) {
				maxSpeedld = maxSpeedld + 0.1;
			}
		}
	}

	static void resumeActualSpeed() {
		System.out.println("Target speed of the Rockets was " + Main.targetSpeed);
		System.out.println("Actual speed of Rocket 32WESSDS is " + actualSpeed.get(0) + "km/s.");
		if (Main.targetSpeed > maxSpeed32) {
			System.out.println("Impossible reach the target speed, " + "maximum speed of Rocket 32WESSDS is "
					+ maxSpeed32 + "km/s.");
		}

		System.out.println("Target speed of the Rockets was " + Main.targetSpeed);
		System.out.println("Actual speed of Rocket LDSFJA32 is " + actualSpeed.get(1) + "km/s.");
		if (Main.targetSpeed > maxSpeedld) {
			System.out.println("Impossible reach the target speed, " + "maximum speed of Rocket LDSFJA32 is "
					+ maxSpeedld + "km/s.");
		}

		if (Main.targetSpeed < 11) {
			System.out.println("Huston we have a problem! Escape velocity not Reached!");
			System.out.println("Escape velocity must be at least of 11 km/s.");
		}
	}

}
