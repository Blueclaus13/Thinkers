package FirstModule.Vet.Models;

public class Fish extends Animal{
    protected Fish(String name, String typeOfAnimal) {
        super(name, typeOfAnimal);
    }

    @Override
    public void eat() {
        System.out.println("The "+ typeOfAnimal + " eats worms");
    }

    @Override
    public void printName() {
        System.out.println("I'm a "+ typeOfAnimal + " and my name is " + name);
    }
}
