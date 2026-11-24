import abstracts.Animal;
import animals.*;

import java.util.ArrayList;

public class Main {
    public static void main() {
        ArrayList<Animal> zoopark = new ArrayList<>();
        zoopark.add(new Cat());
        zoopark.add(new Dog());
        zoopark.add(new Dog());
        zoopark.add(new Eagle());
        zoopark.add(new Clownfish());

        for (Animal animal : zoopark) {
            animal.voice();
        }
    }
}
