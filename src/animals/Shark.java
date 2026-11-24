package animals;

import abstracts.Fish;

public class Shark extends Fish {

    public void voice() {
        System.out.println("бульбульбуль");
    }

    public void Swim() {
        System.out.println("Акула плывет");
    }

    public void Bite() {
        System.out.println("Акула кусает");
    }
}
