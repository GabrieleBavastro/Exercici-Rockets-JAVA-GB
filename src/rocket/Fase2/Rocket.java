

package rocket.Fase2;

import java.util.List;

public class Rocket {

	String rocketName;
	List<Thruster> numberOfThrusthers;
	
	public Rocket(String name, List<Thruster> number) {
		rocketName = name;
		numberOfThrusthers = number;
		
		this.setRocketName(rocketName);
		this.setNumberOfThrusthers (numberOfThrusthers);
	}

	private String getRocketName() {
		return rocketName;
	}

	private void setRocketName(String rocketName) {
		this.rocketName = rocketName;
	}

	private List<Thruster> getNumberOfThrusthers() {
		return numberOfThrusthers;
	}

	private void setNumberOfThrusthers(List<Thruster> numberOfThrusthers) {
		this.numberOfThrusthers = numberOfThrusthers;
	}
}


