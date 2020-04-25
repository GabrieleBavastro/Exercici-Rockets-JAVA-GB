package rocket.Fase2;

/*Escape velocity is the speed at which an object must travel
 *  to break free of a planet or moon's gravitational force 
 *  and enter orbit. A spacecraft leaving the surface of Earth, 
 *  for example, needs to be going about 11,2 kilometers (7 miles) per second, 
 *  or over 40,000 kilometers per hour (25,000 miles per hour), to enter orbit.
 *  Source Nasa.gov*/

public class Thruster {

	String idTh;
	int maxPower;
	
	public Thruster(String id, int mPT) {
		idTh = id;
		maxPower = mPT;
	
	this.setIdTh(idTh);
	this.setMaxPower(maxPower);
	
	}

	private String getIdTh() {
		return idTh;
	}

	private void setIdTh(String idTh) {
		this.idTh = idTh;
	}

	private int getMaxPower() {
		return maxPower;
	}

	private void setMaxPower(int maxPower) {
		this.maxPower = maxPower;
	}

	@Override
	public String toString() {
		return "\n" + "id=" + idTh + " - Max Power=" + maxPower;
	}
	
	
	
}
