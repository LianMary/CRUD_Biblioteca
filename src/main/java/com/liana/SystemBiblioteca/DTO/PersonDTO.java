package com.liana.SystemBiblioteca.DTO;

public class PersonDTO {
    private String namePerson;
    private String addressPerson;
    private String codPerson;

    public void setNamePerson(String namePerson) {
        this.namePerson = namePerson;
    }

    public void setAddressPerson(String addressPerson) {
        this.addressPerson = addressPerson;
    }

    public String getAddressPerson() {
        return addressPerson;
    }

    public String getNamePerson() {
        return namePerson;
    }

    public String getCodPerson() {
        return codPerson;
    }

    public void setCodPerson(String codPerson) {
        this.codPerson = codPerson;
    }
}
