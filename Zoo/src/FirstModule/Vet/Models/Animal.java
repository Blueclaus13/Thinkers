package FirstModule.Vet.Models;

public abstract class Animal {
    protected String name;
    protected String typeOfAnimal;

    protected Animal(String name, String typeOfAnimal){
        this.name = name;
        this.typeOfAnimal = typeOfAnimal;
    }

    public abstract void eat();
    public void printName(){
        System.out.println("I'm a "+ typeOfAnimal + " and my name is " + name);
    }





}
