package FirstModule.Vet.Models;

public class Hamster extends Animal{

    protected Hamster(String name, String typeOfAnimal) {
        super(name, typeOfAnimal);
    }

    @Override
    public void eat() {
        System.out.println("The "+ typeOfAnimal + " eats Lettuce");
    }

    @Override
    public void printName() {

    }
}
