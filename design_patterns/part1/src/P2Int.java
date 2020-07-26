// Programming to an Interface concept

/*
We want to have a computer system that will have a display
system (a monitor for instance), however, the user may want to
exchange the monitor with a projector => this means that the
display module should be flexible
 */

interface displayModule {
    /*
     The display method should be generic enough so that two classes can
     implement different behavior for it.
     */
    public void display();
}

class Monitor implements displayModule {
    public void display() {
        System.out.println("Displayed through a monitor!");
    }
}

class Projector implements displayModule {
    public void display() {
        System.out.println("Displayed through a projector");
    }
}

// let's utilize the classes now:
class Computer {
    //using supertype (not concrete type):
    displayModule dm;

    // Now, this setDisplayModule can be invoked externally to set
    // the display module of this computer
    public void setDisplayModule (displayModule dm) {
        this.dm = dm;
    }

    public void display() {
        dm.display();
    }
}

public class P2Int {
    public static void main(String[] args) {

        // creating a computer with a projector
        Computer projectorComputer = new Computer();
        projectorComputer.setDisplayModule(new Projector());
        projectorComputer.display();

        // creating a computer that has a monitor
        Computer monitorComputer = new Computer();
        monitorComputer.setDisplayModule(new Monitor());
        monitorComputer.display();
    }
}