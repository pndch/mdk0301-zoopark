package animals;

import abstracts.Bird;

public class Eagle extends Bird {
    public void voice() {
        System.out.println("Крик орла");
    }

    public void Run() {
        System.out.println("Орел бежит");
    }

    public void Fly() {
        System.out.println("Орел летит");
    }
}
