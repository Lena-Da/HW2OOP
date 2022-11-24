public class Fish extends Animal implements SwimmingSpeedAble{

    public Fish(String name, String breed, String color, Integer countLegs, Integer age) {
        super(name, breed, color, countLegs, age);
    }

    @Override
    public String swimSpeed() {
        return "2 km/h";
    }
    
}
