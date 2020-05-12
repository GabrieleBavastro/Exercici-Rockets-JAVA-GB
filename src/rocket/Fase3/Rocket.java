package rocket.Fase3;

import java.util.List;

public class Rocket {

	String rocketName;
	List<Thruster> numberOfThrusthers;

	public Rocket(String name, List<Thruster> number) {
		rocketName = name;
		numberOfThrusthers = number;

		this.setRocketName(rocketName);
		this.setNumberOfThrusthers(numberOfThrusthers);
	}

	String getRocketName() {
		return rocketName;
	}

	private void setRocketName(String rocketName) {
		this.rocketName = rocketName;
	}

	private void setNumberOfThrusthers(List<Thruster> numberOfThrusthers) {
		this.numberOfThrusthers = numberOfThrusthers;
	}

	@Override
	public String toString() {
		return "Rocket [rocketName=" + rocketName + ", numberOfThrusthers=" + numberOfThrusthers + "]";
	}

}
