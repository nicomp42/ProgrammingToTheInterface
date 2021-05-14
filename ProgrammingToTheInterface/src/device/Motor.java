// Bill Nicholson
// nicholdw@ucmail.uc.edu
// Programming To The Interface
package device;

import control.Control;

public class Motor implements Control {
	private String ID;
	
	public Motor(String ID) {this.ID = ID;}
	
	@Override
	public void Start() {
		System.out.println("I am a moptor with ID " + ID + " and I am starting");	
		
	}

	@Override
	public void Stop() {
		System.out.println("I am a moptor with ID " + ID + " and I am stopping");	
		
	}

}
