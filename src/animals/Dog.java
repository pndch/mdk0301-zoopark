package animals;

import abstracts.Mammal;

public class Dog extends Mammal {

    public void voice() {
        System.out.println("Вуф Вуф");
    }

    public void Run() {
        System.out.println("Собака бежит");
    }
}
