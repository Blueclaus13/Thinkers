package FirstModule.Vet;

import FirstModule.Vet.Models.Animal;
import FirstModule.Vet.Models.Patient;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Consutorio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Patients patientsList = new Patients();
        ArrayList<String> typeOfAnimals = new ArrayList<>(Arrays.asList("dog", "cat", "hamster", "bird", "fish", "mouse"));


       while(true){
           System.out.println("\n--------------------------");
           System.out.println("Welcome to The Vet");
           System.out.println("--------------------------");
           System.out.println("To quit system please write: 'quit'");


           System.out.format("There are %d patients ahead\n", patientsList.getAmountOfPatients() );
           System.out.println("Do you want to stay (yes, no)? ");

           String response = sc.nextLine();

           if(response.equalsIgnoreCase("quit")){
               break;
           }

           if(response.equalsIgnoreCase("yes")){
               System.out.println("Please, fill the next questions to get in line:");

               System.out.print("What is your name: ");
               String ownerName = sc.nextLine();

               System.out.print("What is your pet's name: ");
               String petName = sc.nextLine();

               System.out.print("What kind of pet is?: ");
               String typeOfPet;
               //Validation
               do {
                   System.out.println("\nOptions:\n Dog,\n Cat,\n Hamster,\n Bird,\n Fish,\n Mouse\n ");
                   typeOfPet = sc.nextLine();

               }while (!typeOfAnimals.contains(typeOfPet.toLowerCase()));


               System.out.print("How old is it? (unit: months) ");
               int age = sc.nextInt();
               sc.nextLine();

               System.out.println("Please, give a brief description of its condition: ");
               String description = sc.nextLine();

               Patient patient = new Patient(petName, ownerName, typeOfPet,age);
               patient.setProblemDescription(description);
               System.out.println();

               System.out.println(patient);
               patientsList.addNewPatient(patient);
               System.out.println();

               System.out.format("You are number %d of a line of %d \n", patientsList.getIndex(patient), patientsList.getAmountOfPatients());

               //System.out.println("Is the data correct (yes / no)?");


           }else{
               System.out.println("Ok, thank you for coming. Have a good Day!");
           }

           for (Patient patient: patientsList.getPatients()){
               Animal animal = patient.getAnimal();
               animal.printName();
               animal.eat();
           }
       }
       sc.close();

    }
}
