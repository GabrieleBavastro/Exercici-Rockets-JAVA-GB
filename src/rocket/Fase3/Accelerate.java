package rocket.Fase3;

/*Escape velocity is the speed at which an object must travel
 *  to break free of a planet or moon's gravitational force 
 *  and enter orbit. A spacecraft leaving the surface of Earth, 
 *  for example, needs to be going about 11,2 kilometers (7 miles) per second, 
 *  or over 40,000 kilometers per hour (25,000 miles per hour), to enter orbit.
 *  Source Nasa.gov*/

class Accelerate implements Runnable {
	public void run() {
		try {
			// Displaying the thread that is running
			if (Main.speed <= 11 && Main.speed<=Main.targetSpeed) {
				System.out.println("Thruster " + Main.j + " actual power of " + Main.i + "!");
				System.out.println("Actual speed of " + Main.speed + " km/s. Increasing Power");
			} else if (Main.speed >= 11 && Main.speed <= 15 && Main.speed<=Main.targetSpeed) {
				System.out.println("Thruster " + Main.j + " actual power of " + Main.i + "!");
				System.out.println(
						"Actual speed of " + Main.speed + " km/s. You reached the optimal speed! Rocket left Earth!.");
			} else if (Main.speed >= 12 && Main.speed<=Main.targetSpeed) {
				System.out.println("Thruster " + Main.j + " actual power of " + Main.i + "!");
				System.out.println("Actual speed of " + Main.speed
						+ " km/s. You are going too much fast! Please stop the thusters!");
			} else {brake();}
		} catch (Exception e) {
			// Throwing an exception
			System.out.println("Exception is caught");
		}
	}

	public void brake() {
		Thread.currentThread().interrupt();
	}
}