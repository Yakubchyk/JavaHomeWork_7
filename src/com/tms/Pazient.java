package com.tms;
// Класс пациента. Выбор лечения. Наслевует класс от Доктора.
class Pazient extends Behandeln {
    int Plan;
    Doctor doctor;
    Pazient(int Plan) {
        this.Plan = Plan;
    }
    void addDoctor() {
        if (Plan == 1) {
            doctor = new Hirurg();

        } else if (Plan == 2) {
            doctor = new Dantist();
        } else {
            doctor = new Therapoid();
        }
    }
    void DoctorBehandeln() {
        doctor.behandeln();
    }
}
