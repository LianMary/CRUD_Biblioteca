package com.liana.SystemBiblioteca.DTO;

public class LoanDTO {
    private PersonDTO codPerson;
    private String codLoan;
    private BooksDTO codBook;

    public void setCodPerson(PersonDTO codPerson) {
        this.codPerson = codPerson;
    }

    public void setCodLoan(String codLoan) {
        this.codLoan = codLoan;
    }

    public void setCodBook(BooksDTO codBook) {
        this.codBook = codBook;
    }

    public PersonDTO getCodPerson() {
        return codPerson;
    }

    public String getCodLoan() {
        return codLoan;
    }

    public BooksDTO getCodBook() {
        return codBook;
    }
}
