public class Dolphin extends Animal implements Speakable, SwimmingSpeedAble{

    public Dolphin(String name, String breed, String color, Integer countLegs, Integer age) {
        super(name, breed, color, countLegs, age);
    }

    @Override
    public String swimSpeed() {
        return "50 km/h";
    }

    @Override
    public String speak() {
        return "Ra";
    }
    
}
