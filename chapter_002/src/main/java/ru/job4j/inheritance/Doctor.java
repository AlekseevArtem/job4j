package ru.job4j.inheritance;

public class Doctor extends Profession {
    private String medicalInstitute;
    private boolean accessToAnesthesia;

    public String getMedicalInstitute() {
        return medicalInstitute;
    }

    public boolean getAccessToAnesthesia() {
        return accessToAnesthesia;
    }

    public Diagnose heal(Patient patient) {}
}
