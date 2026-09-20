package com.hospital;

public class PatientImpl implements Patient {

    private String name;
    private int age;
    private String gender;
    private String pid;
    private String disease;
    private String phone;
    private String address;

    // Constructor
    public PatientImpl() {
    }

    // Parameterized Constructor
    public PatientImpl(String name, int age, String gender, String pid,
                       String disease, String phone, String address) {

        this.name = name;
        this.age = age;
        this.gender = gender;
        this.pid = pid;
        this.disease = disease;
        this.phone = phone;
        this.address = address;
    }

    // Getters

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public String getPatientId() {
        return pid;
    }

    @Override
    public String getDisease() {
        return disease;
    }

    @Override
    public String getPhone() {
        return phone;
    }

    @Override
    public String getAddress() {
        return address;
    }

    // Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPatientId(String pid) {
        this.pid = pid;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}