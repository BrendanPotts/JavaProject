package Assignment2;

public class Champion {
	private String name;
	private String passive;
	private String abilityQ;
	private String abilityW;
	private String abilityE;
	private String abilityR;
	
	public Champion(String name, String passive, String abilityQ, String abilityW, String abilityE, String abilityR) {
		super();
		this.name = name;
		this.passive = passive;
		this.abilityQ = abilityQ;
		this.abilityW = abilityW;
		this.abilityE = abilityE;
		this.abilityR = abilityR;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassive() {
		return passive;
	}
	public void setPassive(String passive) {
		this.passive = passive;
	}
	public String getAbilityQ() {
		return abilityQ;
	}
	public void setAbilityQ(String abilityQ) {
		this.abilityQ = abilityQ;
	}
	public String getAbilityW() {
		return abilityW;
	}
	public void setAbilityW(String abilityW) {
		this.abilityW = abilityW;
	}
	public String getAbilityE() {
		return abilityE;
	}
	public void setAbilityE(String abilityE) {
		this.abilityE = abilityE;
	}
	public String getAbilityR() {
		return abilityR;
	}
	public void setAbilityR(String abilityR) {
		this.abilityR = abilityR;
	}

}
