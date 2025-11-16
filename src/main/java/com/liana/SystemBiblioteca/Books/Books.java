package com.liana.SystemBiblioteca.Books;

//import jakarta.persistence.Entity;
//import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;

//@Table(name = "books")
//@Entity(name ="books")
@EqualsAndHashCode(of = "idLivro")

public class Books {
   // @ID @GeneratedValue(strategy = GenerationType.UUID)
    private String idLivro;

    private String titulo;
    private String autor;
}
