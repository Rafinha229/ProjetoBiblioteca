package com.example.demo.entities;

import java.time.Instant;

public class Emprestimo {
    private Long id;
    private Instant dataEmprestimo;
    private Instant dataDeDevolucaoPrevista;
    private Instant dataDeDevolucaoReal;
    private String status;
    private String livro;
    private String usuario;
}
