public class Computer {
	// variables
	private double cpuSpeed;
	
	// constructor
	Computer() {
		cpuSpeed = 0;
	}
	
	// methods
	void setCpuSpeed(double _cpuSpeed) {
		cpuSpeed = _cpuSpeed;
	}
	
	double getCpuSpeed() {
		return cpuSpeed;
	}
	
	@Deprecated
	public void whatIsIt() {
		System.out.println("it is a PC");
	}
}
