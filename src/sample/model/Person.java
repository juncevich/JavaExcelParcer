package sample.model;


import javafx.beans.property.*;

import java.time.LocalDate;


public class Person {
    private final IntegerProperty codeSMO;
    private final IntegerProperty polisVersion;
    private final IntegerProperty polisNumber;
    private final StringProperty firstName;
    private final StringProperty secondName;
    private final StringProperty lastName;
    private final ObjectProperty<LocalDate> birthday;




    public Person(Integer codeSMO, Integer polisVersion, Integer polisNumber, String firstName, String secondName,
                  String lastName, LocalDate birthday) {
        this.codeSMO = new SimpleIntegerProperty(codeSMO);
        this.polisVersion = new SimpleIntegerProperty(polisVersion);
        this.polisNumber = new SimpleIntegerProperty(polisNumber);
        this.firstName = new SimpleStringProperty(firstName);
        this.secondName = new SimpleStringProperty(secondName);
        this.lastName = new SimpleStringProperty(lastName);
        this.birthday = new SimpleObjectProperty<LocalDate>(birthday);
    }

    public int getCodeSMO() {
        return codeSMO.get();
    }

    public IntegerProperty codeSMOProperty() {
        return codeSMO;
    }

    public void setCodeSMO(int codeSMO) {
        this.codeSMO.set(codeSMO);
    }

    public int getPolisVersion() {
        return polisVersion.get();
    }

    public IntegerProperty polisVersionProperty() {
        return polisVersion;
    }

    public void setPolisVersion(int polisVersion) {
        this.polisVersion.set(polisVersion);
    }

    public int getPolisNumber() {
        return polisNumber.get();
    }

    public IntegerProperty polisNumberProperty() {
        return polisNumber;
    }

    public void setPolisNumber(int polisNumber) {
        this.polisNumber.set(polisNumber);
    }

    public String getFirstName() {
        return firstName.get();
    }

    public StringProperty firstNameProperty() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName.set(firstName);
    }

    public String getSecondName() {
        return secondName.get();
    }

    public StringProperty secondNameProperty() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName.set(secondName);
    }

    public String getLastName() {
        return lastName.get();
    }

    public StringProperty lastNameProperty() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName.set(lastName);
    }

    public LocalDate getBirthday() {
        return birthday.get();
    }

    public ObjectProperty<LocalDate> birthdayProperty() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday.set(birthday);
    }
}
