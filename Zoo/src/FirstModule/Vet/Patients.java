package FirstModule.Vet;

import java.util.LinkedList;

public class Patients {

    private final LinkedList<Patient> patients;

    public Patients() {
        this.patients = new LinkedList<>();
    }

    public void addNewPatient(Patient patient){
        patients.add(patient);
    }

    public void  deletePatient(Patient patient){
        //int index = patients.indexOf(patient);
        patients.remove(patient);
    }

    public int getAmountOfPatients(){
        return patients.size();
    }

    public int getIndex(Patient patient){
        return patients.indexOf(patient) + 1;
    }

    @Override
    public String toString() {
        return "Consultorio{" +
                "patients=" + patients +
                '}';
    }
}
