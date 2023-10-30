package Day35.Ovveriding;

public class Dog extends Animal{

    @Override
    public void animalSound() {
        super.animalSound();
        System.out.println("hello ist overriding");
    }
}
