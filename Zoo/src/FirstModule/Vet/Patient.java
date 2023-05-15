package FirstModule.Vet;

public class Patient {
    private String name;
    private String ownerName;
    private Animal typeOfPet;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Animal getTypeOfPet() {
        return typeOfPet;
    }

    public void setTypeOfPet(String typeOfPet) {
        switch (typeOfPet.toUpperCase()){
            case "CAT":
                this.typeOfPet = Animal.CAT;
                break;
            case "DOG":
                this.typeOfPet = Animal.DOG;
                break;
            case "FISH":
                this.typeOfPet = Animal.FISH;
                break;
            case "HAMNSTER":
                this.typeOfPet = Animal.HAMNSTER;
                break;
            case "MOUSE":
                this.typeOfPet = Animal.MOUSE;
                break;
            case "BIRD":
                this.typeOfPet = Animal.BIRD;
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
                "specie: " + typeOfPet + '\n' +
                "isTreatmentPayed: " + isTreatmentPayed + '\n' +
                "problemDescription: " + problemDescription + '\n' +
                "treatment: " + treatment + '\n' +
                "age: " + age + "months";
    }
}
