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
			if (Thruster.speed <= 11 && Thruster.speed <= Main.targetSpeed) {
				System.out.println("Thruster " + Thruster.j + " actual power of " + Thruster.i + "!");
				System.out.println("Actual speed of " + Thruster.speed + " km/s. Increasing Power");
			} else if (Thruster.speed >= 11 && Thruster.speed <= 15 && Thruster.speed <= Main.targetSpeed) {
				System.out.println("Thruster " + Thruster.j + " actual power of " + Thruster.i + "!");
				System.out.println("Actual speed of " + Thruster.speed
						+ " km/s. You reached the optimal speed! Rocket left Earth!.");
			} else if (Thruster.speed >= 12 && Thruster.speed <= Main.targetSpeed) {
				System.out.println("Thruster " + Thruster.j + " actual power of " + Thruster.i + "!");
				System.out.println("Actual speed of " + Thruster.speed
						+ " km/s. You are going too much fast! Please stop the thusters!");
			} else {
				brake();
			}
		} catch (Exception e) {
			// Throwing an exception
			System.out.println("Exception is caught");
		}
	}

	public void brake() {
		Thread.currentThread().interrupt();
	}
}