package com.hospital;

import java.util.*;

public class ShowDetails extends PatientImpl {

    ArrayList<PatientImpl> list = new ArrayList<>();
    Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
        ShowDetails SD = new ShowDetails();
        String status ="yes";
        while(status.equalsIgnoreCase("yes")) {
        	System.out.println("Wel-Come to Prasanna Hospital's");
        	System.out.println("1. Add Patient\r\n"
        			+ "2. View Patient\r\n"
        			+ "3. Search Patient by ID\r\n"
        			+ "4. Search Patient by Name\r\n"
        			+ "5. Update Patient\r\n"
        			+ "6. Delete Patient\r\n"
        			+ "7. Display All Patients\r\n"
        			+ "8. Exit");
        	System.out.println("Enter your choice :");
        	int ch=sc.nextInt();
        	switch(ch) {
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
        	case 6:
        		SD.DeletePatient();
        		break;
        	case 7:
        		SD.DisplayAll();
        		break;
        	case 8:
        		System.out.println("EXIT TATA BYEEE..");
        		break;
        	default :
        		System.out.println("Invalid choice");
        	}
        	if(ch!=8) {
	        	System.out.println("if You Want to continue then click yes");
	        	 status=sc.next();
        	}else {
        		status="no";
        	}
        }
        
       
    }

    // 1. Add Patient
    public void AddPatients() {

        PatientImpl patient = new PatientImpl();

        patient.name = getName();
        patient.age = getAge();
        patient.gender = getGender();
        patient.pid = getPatientId();
        patient.disease = getDisease();
        patient.phone = getPhone();
        patient.address = getAddress();

        list.add(patient);

        System.out.println("\nPatient Added Successfully!");
        System.out.println("Name    : " + patient.name);
        System.out.println("Age     : " + patient.age);
        System.out.println("Gender  : " + patient.gender);
        System.out.println("PID     : " + patient.pid);
        System.out.println("Disease : " + patient.disease);
        System.out.println("Phone   : " + patient.phone);
        System.out.println("Address : " + patient.address);
    } 
    //2 .View Patients
    public void ViewPatients() {

        System.out.println("Enter the patient name: ");
        String na = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < list.size(); i++) {

            PatientImpl patient = list.get(i);

            if (patient != null && na.equalsIgnoreCase(patient.name)) {

                System.out.println("Patient Found");
                System.out.println("Name: " + patient.name);
                System.out.println("Age: " + patient.age);
                System.out.println("Disease: " + patient.disease);

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Patient Not Found");
        }
    }
    public void SearchById() {

        System.out.println("Enter the patient ID: ");
        String na = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < list.size(); i++) {

            PatientImpl patient = list.get(i);

            if (patient != null && na.equalsIgnoreCase(patient.pid)) {

                System.out.println("Patient Found");
                System.out.println("Name: " + patient.name);
                System.out.println("Age: " + patient.age);
                System.out.println("Disease: " + patient.disease);

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Patient Not Found");
        }
    }
    public void SearchByName() {

        System.out.println("Enter the patient name: ");
        String na = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < list.size(); i++) {

            PatientImpl patient = list.get(i);

            if (patient != null && na.equalsIgnoreCase(patient.name)) {

                System.out.println("Patient Found");
                System.out.println("Name: " + patient.name);
                System.out.println("Age: " + patient.age);
                System.out.println("Disease: " + patient.disease);

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Patient Not Found");
        }
    }
    public void DisplayAll() {

        if (list.isEmpty()) {
            System.out.println("Currently no patient is there.");
            return;
        }

        for (int i = 0; i < list.size(); i++) {

            PatientImpl patient = list.get(i);

            if (patient != null) {

                System.out.println("Patient " + (i + 1));
                System.out.println("Name    : " + patient.name);
                System.out.println("Age     : " + patient.age);
                System.out.println("Gender  : " + patient.gender);
                System.out.println("PID     : " + patient.pid);
                System.out.println("Disease : " + patient.disease);
                System.out.println("Phone   : " + patient.phone);
                System.out.println("Address : " + patient.address);
                System.out.println("-----------------------------");
            }
        }
    }
    public void DeletePatient() {

        System.out.println("Enter the patient name: ");

        String na = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < list.size(); i++) {

            PatientImpl patient = list.get(i);

            if (patient != null && na.equalsIgnoreCase(patient.name)) {

                list.remove(i);

                System.out.println("Patient is deleted");

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Patient Not Found");
        }
    }
}
