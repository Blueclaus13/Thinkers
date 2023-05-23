package FirstModule.Vet.Models;

public class Dog extends Animal{

    protected int legs = 4;
    protected Dog(String name, String typeOfAnimal) {
        super(name, typeOfAnimal);
    }

    public void walk(){
        System.out.println("This animal walks on " + this.legs + " legs.");
    }

    @Override
    public void eat() {
        System.out.println("The "+ typeOfAnimal + " eats Cats");
    }

    public void printName(){
        System.out.println("I'm a "+ typeOfAnimal + " and my name is " + name);
    }

}
