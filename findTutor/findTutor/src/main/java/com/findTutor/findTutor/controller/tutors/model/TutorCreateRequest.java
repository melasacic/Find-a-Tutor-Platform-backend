package com.findTutor.findTutor.controller.tutors.model;


public class TutorCreateRequest {
    // json iz body-a treba da se mapira u ovu klasu, pa tek onda ona u DB object
    // json body -> TutorCreateRequest -> DBTutor

    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String email;
    private String city;
    private String phoneNumber;
    private String instructionsType;

    public String getInstructionsType() {
        return instructionsType;
    }

    public void setInstructionsType(String instructionsType) {
        this.instructionsType = instructionsType;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
