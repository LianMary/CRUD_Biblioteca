package com.liana.SystemBiblioteca.DTO;

import java.util.Date;

public class BooksDTO {
    private String tituloBook;
    private String codBook;
    private Date datePublication;

    public void setDatePublication(Date datePublication) {
        this.datePublication = datePublication;
    }

    public void setCodBook(String codBook) {
        this.codBook = codBook;
    }

    public void setTituloBook(String tituloBook) {
        this.tituloBook = tituloBook;
    }

    public String getTituloBook() {
        return tituloBook;
    }

    public String getCodBook() {
        return codBook;
    }

    public Date getDatePublication() {
        return datePublication;
    }
}
