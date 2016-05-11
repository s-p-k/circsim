// See LICENSE file for details.

public class Gate {

	int inputs;

	// Gate constructor method
	public Gate(int inputs) {
		super();
		this.inputs = inputs;
	}
	
	public void printInputs(Gate gate) {
		System.out.println(gate.inputs);
	}
}
