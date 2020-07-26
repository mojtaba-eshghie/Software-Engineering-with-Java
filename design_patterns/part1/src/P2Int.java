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
