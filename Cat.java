public class Cat extends Animal implements Speakable, Runable{


    public Cat(String name, String breed, String color, Integer countLegs, Integer age) {
        super(name, breed, color, countLegs, age);
    }

    @Override
    public String speak() {
        return "Meow";
    }

    @Override
    public String run() {
        return "50 km/h";
    }
    
}
