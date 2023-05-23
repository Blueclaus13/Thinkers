package FirstModule.Vet.Models;

public class Bird extends  Animal{

    protected Bird(String name, String typeOfAnimal) {
        super(name, typeOfAnimal);
    }

    @Override
    public void eat() {
        System.out.println("The "+ typeOfAnimal + " eats Seeds");
    }

    @Override
    public void printName() {

    }
}
