package FirstModule.Vet;

import java.util.Scanner;

public class Consutorio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Patients patientsList = new Patients();


       while(true){
           System.out.println("\n--------------------------");
           System.out.println("Welcome to The Vet");
           System.out.println("--------------------------");
           System.out.println("To quit system please write: 'quit'");


           System.out.format("There are %d patients ahead\n", patientsList.countingPatients() );
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

               System.out.println("Options: Dog, Cat, Hamster, Bird, Fish, Mouse ");
               String typeOfPet = sc.nextLine();

               System.out.print("How old is it? unit: months ");
               int age = sc.nextInt();
               sc.nextLine();

               System.out.println("Please, give a brief description of its condition: ");
               String description = sc.nextLine();

//            System.out.println("Type: " + typeOfPet);
//            System.out.println("Age: " + age + " months");
//            System.out.println("Description: " + description);

               Patient patient = new Patient(petName, ownerName, typeOfPet,age);
               patient.setProblemDescription(description);
               System.out.println();

               System.out.println(patient);
               patientsList.addNewPatient(patient);
               System.out.println();

               System.out.format("You are number %d of a line of %d \n", patientsList.getIndex(patient), patientsList.countingPatients());

               //System.out.println("Is the data correct (yes / no)?");


           }else{
               System.out.println("Ok, thank you for coming. Have a good Day!");
           }
       }
       sc.close();

    }
}
