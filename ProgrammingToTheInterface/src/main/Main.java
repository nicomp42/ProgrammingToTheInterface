// Bill Nicholson
// nicholdw@ucmail.uc.edu
// Programming To The Interface

package main;

import java.util.ArrayList;

import control.Control;
import device.Conveyor;
import device.Motor;
import device.Pump;

public class Main {

	public static void main(String[] args) {
        Motor myMotor = new Motor("M1");
        Conveyor myConveyor = new Conveyor("C1");
        ArrayList<Control> myFactory = new ArrayList<Control>();	// Programming to the Interface

        // Put some devices in the ArrayList. NOT homogeneous!
        myFactory.add(new Conveyor("C2"));
        myFactory.add(new Motor("M2"));
        myFactory.add(new Motor("M3"));
        myFactory.add(new Conveyor("C4"));
        myFactory.add(new Pump("P1"));

        // No polymorphism here:
        myConveyor.Start();
        myMotor.Start();

        System.out.println("Iterating through the ArrayList...");
        // Ta da! Polymorphism. 
        for (Control myDevice : myFactory)
        {
            System.out.println("Starting a Device Object...");
            myDevice.Start();   // Dynamic Binding
        }

	}

}
