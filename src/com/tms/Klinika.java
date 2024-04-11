package com.tms;

public class Klinika {
    public static void main(String[] args) {
        Pazient patient = new Pazient(1);
        patient.addDoctor();
        patient.DoctorBehandeln();
        Pazient patient2 = new Pazient(2);
        patient2.addDoctor();
        patient2.DoctorBehandeln();
        Pazient patient3 = new Pazient(3);
        patient3.addDoctor();
        patient3.DoctorBehandeln();
    }
}