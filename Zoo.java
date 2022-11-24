import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zoo {
    private List<Animal> animals;

    public Zoo(){
        animals = new ArrayList<>(Arrays.asList(new Cat("Robert", "Scottish", "Grey", 4, 2)
        ,new Dog("Shaggy", "Rottweiler", "Black", 4, 6)
        ,new Fish("Nemo", "Gupi", "Red", 0, 1)
        ,new Duck("Nora", "Beijing", "White", 2, 1)
        ,new Dolphin("Dodo", "Sea", "Grey", 0, 5)));

    }

    public void talk(){
        for (Speakable item : getSpeakable()) {
            System.out.printf("%s\n", item.speak());
        }
    }

    public List<Speakable> getSpeakable(){
        List<Speakable> result = new ArrayList<>();
        for (Animal speakItem : animals) {
            if (speakItem instanceof Speakable){
                result.add((Speakable) speakItem);
            }
        } result.add(new Radio());
        return result;
    }

    public List<Runable> getRunable(){
        List<Runable> result = new ArrayList<>();
        for (Animal runItem : animals) {
            if (runItem instanceof Runable){
                result.add((Runable) runItem);
            }
        }
        return result;
    }

    public List<Flyable> getFlyable(){
        List<Flyable> result = new ArrayList<>();
        for (Animal flyItem : animals) {
            if (flyItem instanceof Flyable){
                result.add((Flyable) flyItem);
            }
        }
        return result;
    }

    public List<SwimmingSpeedAble> getSwimAble(){
        List<SwimmingSpeedAble> result = new ArrayList<>();
        for (Animal swimItem : animals) {
            if (swimItem instanceof SwimmingSpeedAble){
                result.add((SwimmingSpeedAble) swimItem);
            }
        }
        return result;
    }
    
    public void run(){
        for (Runable item : getRunable()) {
            System.out.printf("%s %s\n", item.toString(), item.run());
        }
    }

    public void fly(){
        for (Flyable item : getFlyable()) {
            System.out.printf("%s %s\n", item.toString(), item.fly());
        }
    }

    public void swim(){
        for (SwimmingSpeedAble item : getSwimAble()) {
            System.out.printf("%s %s\n", item.toString(), item.swimSpeed());
        }
    }
}
