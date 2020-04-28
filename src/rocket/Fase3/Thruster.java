package rocket.Fase3;

public class Thruster {

	String idTh;
	int maxPower;
	int actualPower;
	
	public Thruster(String id, int mPT, int aPT) {
		idTh = id;
		maxPower = mPT;
		actualPower =aPT;
	
	this.setIdTh(idTh);
	this.setMaxPower(maxPower);
	this.setActualPower(aPT);
	
	}
	
	private int getActualPower() {
		return actualPower;
	}

	private void setActualPower(int aPT) {
		
	}

	String getIdTh() {
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
		return "Thruster [idTh=" + idTh + ", maxPower=" + maxPower + ", actualPower=" + actualPower + "]";
	}
}
