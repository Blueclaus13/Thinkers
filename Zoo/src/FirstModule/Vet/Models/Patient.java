package FirstModule.Vet.Models;

public class Patient {
    private String name;
    private String ownerName;
    private Animal animal;
    private FirstModule.Vet.Animal typeOfPet;
    private Boolean isTreatmentPayed = false;
    private String problemDescription;
    private String treatment;

    private  int age;

    private Patient() {
    }

    public Patient(String name, String ownerName, String typeOfPet, int age) {
        this.name = name;
        this.ownerName = ownerName;
        this.setTypeOfPet(typeOfPet);
        this.age = age;
    }

    public Animal getAnimal() {
        return animal;
    }

    public String getName() {
        return name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setTypeOfPet(String typeOfPet) {
        switch (typeOfPet.toUpperCase()){
            case "CAT":
                this.animal = new Cat(this.name, typeOfPet);
                break;
            case "DOG":
                this.animal = new Dog(this.name, typeOfPet);
                break;
            case "FISH":
                this.animal = new Fish(this.name, typeOfPet);
                break;
            case "HAMNSTER":
                this.animal = new Hamster(this.name, typeOfPet);
                break;
            case "MOUSE":
                this.animal = new Mouse(this.name, typeOfPet);
                break;
            case "BIRD":
                this.animal = new Bird(this.name, typeOfPet);
                break;
            default:
                break;
        }
    }

    public Boolean getTreatmentPayed() {
        return isTreatmentPayed;
    }

    public void setTreatmentPayed(Boolean treatmentPayed) {
        isTreatmentPayed = treatmentPayed;
    }

    public String getProblemDescription() {
        return problemDescription;
    }

    public void setProblemDescription(String problemDescription) {
        this.problemDescription = problemDescription;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Patient Data: \n" +
                "name: " + name + '\n' +
                "ownerName: " + ownerName + '\n' +
                "specie: " + animal.typeOfAnimal + '\n' +
                "isTreatmentPayed: " + isTreatmentPayed + '\n' +
                "problemDescription: " + problemDescription + '\n' +
                "treatment: " + treatment + '\n' +
                "age: " + age + "months";
    }
}
