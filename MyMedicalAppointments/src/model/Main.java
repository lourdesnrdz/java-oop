package model;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        //showMenu();

        Doctor myDoctor = new Doctor("Anahí Salgado", "ahahi@anahi.com");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");

        System.out.println(myDoctor);

        User user = new Doctor("Anahi", "ana@ana.com");
        user.showDataUser();

        User userPa = new Patient("Anahi", "ana@ana.com");
        userPa.showDataUser();

//        for (model.Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()) {
//            System.out.println(aA.getDate() + " " + aA.getTime());
//        }

//        System.out.println();
//        System.out.println();
//        Patient patient = new Patient("Alejandra", "alejandra@mail.com");
//        Patient patient2 = new Patient("Anahi", "anahi@mail.com");
//
//        System.out.println(patient);

//        System.out.println(patient.getName());
//        System.out.println(patient2.getName());
//        patient2 = patient;
//
//        System.out.println(patient.getName());
//        System.out.println(patient2.getName());
//
//        patient2.setName("Manuel");
//        System.out.println(patient.getName());
//        System.out.println(patient2.getName());


    }



}
