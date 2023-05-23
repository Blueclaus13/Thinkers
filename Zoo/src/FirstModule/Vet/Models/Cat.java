package FirstModule.Vet.Models;

public class Cat extends Animal {

    protected int legs = 4;

    protected Cat(String name, String typeOfAnimal) {
        super(name, typeOfAnimal);
    }


    public void walk(){
        System.out.println("This animal walks on " + this.legs + " legs.");
    }

    @Override
    public void eat() {
        System.out.println("The "+ typeOfAnimal + " eats Mouses and Fish");
    }

    @Override
    public void printName() {
        System.out.println("I'm a "+ typeOfAnimal + " and my name is " + name);
    }
}
