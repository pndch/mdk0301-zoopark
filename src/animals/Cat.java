package animals;

import abstracts.Mammal;

public class Cat extends Mammal {
    public void voice() {
        System.out.println("Мяууу");
    }

    public void Run() {
        System.out.println("Кошка бежит");
    }
}
