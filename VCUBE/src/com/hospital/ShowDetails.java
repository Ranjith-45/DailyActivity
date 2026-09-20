package com.hospital;

import java.util.ArrayList;
import java.util.Scanner;

public class ShowDetails {

    // Abstraction
    // We are storing Patient interface references
    ArrayList<Patient> list = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        ShowDetails SD = new ShowDetails();

        String status = "yes";

        while (status.equalsIgnoreCase("yes")) {

            System.out.println("\n==================================");
            System.out.println("   WELCOME TO PRASANNA HOSPITAL");
            System.out.println("==================================");

            System.out.println("1. Add Patient");
            System.out.println("2. View Patient");
            System.out.println("3. Search Patient by ID");
            System.out.println("4. Search Patient by Name");
            System.out.println("5. Update Patient");
            System.out.println("6. Delete Patient");
            System.out.println("7. Display All Patients");
            System.out.println("8. Exit");

            System.out.println("Enter your choice:");
            int ch = SD.sc.nextInt();
            SD.sc.nextLine();

            switch (ch) {

            case 1:
                SD.AddPatients();
                break;

            case 2:
                SD.ViewPatients();
                break;

            case 3:
                SD.SearchById();
                break;

            case 4:
                SD.SearchByName();
                break;

            case 5:
                SD.UpdatePatient();
                break;

            case 6:
                SD.DeletePatient();
                break;

            case 7:
                SD.DisplayAll();
                break;

            case 8:
                System.out.println("EXIT TATA BYEEE..");
                status = "no";
                break;

            default:
                System.out.println("Invalid choice");
            }

            if (ch != 8) {

                System.out.println("\nIf you want to continue, type yes:");
                status = SD.sc.nextLine();
            }
        }

        SD.sc.close();
    }

    // =========================================================
    // 1. ADD PATIENT
    // =========================================================

    public void AddPatients() {

        System.out.println("\n========== ADD PATIENT ==========");

        String name = getName();
        int age = getAge();
        String gender = getGender();
        String pid = getPatientId();
        String disease = getDisease();
        String phone = getPhone();
        String address = getAddress();

        /*
         * PatientImpl object
         * is UPCASTED to Patient reference.
         *
         * Patient patient = new PatientImpl();
         */

        Patient patient = new PatientImpl(
                name,
                age,
                gender,
                pid,
                disease,
                phone,
                address
        );

        // Adding interface reference into ArrayList
        list.add(patient);

        System.out.println("\nPatient Added Successfully!");

        System.out.println("Name    : " + patient.getName());
        System.out.println("Age     : " + patient.getAge());
        System.out.println("Gender  : " + patient.getGender());
        System.out.println("PID     : " + patient.getPatientId());
        System.out.println("Disease : " + patient.getDisease());
        System.out.println("Phone   : " + patient.getPhone());
        System.out.println("Address : " + patient.getAddress());
    }

    // =========================================================
    // 2. VIEW PATIENT
    // =========================================================

    public void ViewPatients() {

        System.out.println("\n========== VIEW PATIENT ==========");

        System.out.println("Enter the patient name:");
        String name = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < list.size(); i++) {

            Patient patient = list.get(i);

            if (patient != null &&
                name.equalsIgnoreCase(patient.getName())) {

                System.out.println("\nPatient Found");

                System.out.println("Name    : " + patient.getName());
                System.out.println("Age     : " + patient.getAge());
                System.out.println("Gender  : " + patient.getGender());
                System.out.println("PID     : " + patient.getPatientId());
                System.out.println("Disease : " + patient.getDisease());
                System.out.println("Phone   : " + patient.getPhone());
                System.out.println("Address : " + patient.getAddress());

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Patient Not Found");
        }
    }

    // =========================================================
    // 3. SEARCH BY ID
    // =========================================================

    public void SearchById() {

        System.out.println("\n========== SEARCH BY ID ==========");

        System.out.println("Enter the patient ID:");
        String id = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < list.size(); i++) {

            Patient patient = list.get(i);

            if (patient != null &&
                id.equalsIgnoreCase(patient.getPatientId())) {

                System.out.println("\nPatient Found");

                System.out.println("Name    : " + patient.getName());
                System.out.println("Age     : " + patient.getAge());
                System.out.println("Gender  : " + patient.getGender());
                System.out.println("PID     : " + patient.getPatientId());
                System.out.println("Disease : " + patient.getDisease());
                System.out.println("Phone   : " + patient.getPhone());
                System.out.println("Address : " + patient.getAddress());

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Patient Not Found");
        }
    }

    // =========================================================
    // 4. SEARCH BY NAME
    // =========================================================

    public void SearchByName() {

        System.out.println("\n========== SEARCH BY NAME ==========");

        System.out.println("Enter the patient name:");
        String name = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < list.size(); i++) {

            Patient patient = list.get(i);

            if (patient != null &&
                name.equalsIgnoreCase(patient.getName())) {

                System.out.println("\nPatient Found");

                System.out.println("Name    : " + patient.getName());
                System.out.println("Age     : " + patient.getAge());
                System.out.println("Gender  : " + patient.getGender());
                System.out.println("PID     : " + patient.getPatientId());
                System.out.println("Disease : " + patient.getDisease());
                System.out.println("Phone   : " + patient.getPhone());
                System.out.println("Address : " + patient.getAddress());

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Patient Not Found");
        }
    }

    // =========================================================
    // 5. UPDATE PATIENT
    // =========================================================

    public void UpdatePatient() {

        System.out.println("\n========== UPDATE PATIENT ==========");

        System.out.println("Enter the patient ID:");
        String id = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < list.size(); i++) {

            Patient patient = list.get(i);

            if (patient != null &&
                id.equalsIgnoreCase(patient.getPatientId())) {

                /*
                 * Upcasting is already present:
                 *
                 * Patient patient = list.get(i);
                 *
                 * But setters are not available in Patient interface.
                 *
                 * So we DOWNCAST Patient to PatientImpl
                 * when we specifically need implementation methods.
                 */

                PatientImpl p = (PatientImpl) patient;

                System.out.println("Enter new name:");
                p.setName(sc.nextLine());

                System.out.println("Enter new age:");
                p.setAge(sc.nextInt());
                sc.nextLine();

                System.out.println("Enter new gender:");
                p.setGender(sc.nextLine());

                System.out.println("Enter new disease:");
                p.setDisease(sc.nextLine());

                System.out.println("Enter new phone:");
                p.setPhone(sc.nextLine());

                System.out.println("Enter new address:");
                p.setAddress(sc.nextLine());

                System.out.println("\nPatient Updated Successfully!");

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Patient Not Found");
        }
    }

    // =========================================================
    // 6. DELETE PATIENT
    // =========================================================

    public void DeletePatient() {

        System.out.println("\n========== DELETE PATIENT ==========");

        System.out.println("Enter the patient name:");
        String name = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < list.size(); i++) {

            Patient patient = list.get(i);

            if (patient != null &&
                name.equalsIgnoreCase(patient.getName())) {

                list.remove(i);

                System.out.println("Patient is deleted successfully");

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Patient Not Found");
        }
    }

    // =========================================================
    // 7. DISPLAY ALL PATIENTS
    // =========================================================

    public void DisplayAll() {

        System.out.println("\n========== ALL PATIENTS ==========");

        if (list.isEmpty()) {

            System.out.println("Currently no patient is there.");

            return;
        }

        for (int i = 0; i < list.size(); i++) {

            Patient patient = list.get(i);

            if (patient != null) {

                System.out.println("\nPatient " + (i + 1));

                System.out.println("Name    : " + patient.getName());
                System.out.println("Age     : " + patient.getAge());
                System.out.println("Gender  : " + patient.getGender());
                System.out.println("PID     : " + patient.getPatientId());
                System.out.println("Disease : " + patient.getDisease());
                System.out.println("Phone   : " + patient.getPhone());
                System.out.println("Address : " + patient.getAddress());

                System.out.println("-----------------------------");
            }
        }
    }

    // =========================================================
    // INPUT METHODS
    // =========================================================

    public String getName() {

        System.out.println("Enter patient name:");
        return sc.nextLine();
    }

    public int getAge() {

        System.out.println("Enter patient age:");
        return sc.nextInt();
    }

    public String getGender() {

        sc.nextLine();

        System.out.println("Enter patient gender:");
        return sc.nextLine();
    }

    public String getPatientId() {

        System.out.println("Enter patient ID:");
        return sc.nextLine();
    }

    public String getDisease() {

        System.out.println("Enter patient disease:");
        return sc.nextLine();
    }

    public String getPhone() {

        System.out.println("Enter patient phone:");
        return sc.nextLine();
    }

    public String getAddress() {

        System.out.println("Enter patient address:");
        return sc.nextLine();
    }
}