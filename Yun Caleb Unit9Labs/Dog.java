public class Dog extends Animal implements Pet
{
    public Dog() {
        super(10);
    }
    
    public void play() {
        System.out.println("Woof woof!");
    }
}