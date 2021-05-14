// Bill Nicholson
// nicholdw@ucmail.uc.edu
// Programming To The Interface
package device;

import control.Control;

public class Pump implements Control {
	private String ID;
	
	public Pump(String ID) {this.ID = ID;}
	
	@Override
	public void Start() {
		System.out.println("I am a pump with ID " + ID + " and I am starting");	
	}

	@Override
	public void Stop() {
		System.out.println("I am a pump with ID " + ID + " and I am stopping");	
	}

}
