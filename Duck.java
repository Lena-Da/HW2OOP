public class Duck extends Animal implements Flyable, Runable, Speakable, SwimmingSpeedAble{

    public Duck(String name, String breed, String color, Integer countLegs, Integer age) {
        super(name, breed, color, countLegs, age);
    }


    @Override
    public String fly() {
        return "90 km/h";
    }

    @Override
    public String run() {
        return "8 km/h";
    }

    @Override
    public String speak() {
        return "Quack";
    }

    @Override
    public String swimSpeed() {
        return "5 km/h";
    }
}
