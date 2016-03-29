package sample.model;


import javafx.beans.property.*;


public class Person {
    private final StringProperty codeSMO;
    private final StringProperty polisVersion;
    private final StringProperty polisNumber;
    private final StringProperty firstName;
    private final StringProperty secondName;
    private final StringProperty lastName;
    private final StringProperty birthday;

    public Person(String codeSMO, String polisVersion, String polisNumber, String firstName, String secondName,
                  String lastName, String birthday) {
        this.codeSMO = new SimpleStringProperty(codeSMO);
        this.polisVersion = new SimpleStringProperty(polisVersion);
        this.polisNumber = new SimpleStringProperty(polisNumber);
        this.firstName = new SimpleStringProperty(firstName);
        this.secondName = new SimpleStringProperty(secondName);
        this.lastName = new SimpleStringProperty(lastName);
        this.birthday = new SimpleStringProperty(birthday);
    }

    public String getCodeSMO() {
        return codeSMO.get();
    }

    public StringProperty codeSMOProperty() {
        return codeSMO;
    }

    public void setCodeSMO(String codeSMO) {
        this.codeSMO.set(codeSMO);
    }

    public String getPolisVersion() {
        return polisVersion.get();
    }

    public StringProperty polisVersionProperty() {
        return polisVersion;
    }

    public void setPolisVersion(String polisVersion) {
        this.polisVersion.set(polisVersion);
    }

    public String getPolisNumber() {
        return polisNumber.get();
    }

    public StringProperty polisNumberProperty() {
        return polisNumber;
    }

    public void setPolisNumber(String polisNumber) {
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

    public String getBirthday() {
        return birthday.get();
    }

    public StringProperty birthdayProperty() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday.set(birthday);
    }
}
