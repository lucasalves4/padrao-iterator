package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IteradorTest {

    @Test
    void deveContarLivrosAtuaisBiblioteca() {
        Biblioteca biblioteca = new Biblioteca(
                new Livro("Imperfeitos", "Christina Lauren", 2024),
                new Livro("Onde estão as flores?", "Ilko Minev", 2024),
                new Livro("A Revolução dos Bichos", "George Orwell", 1945),
                new Livro("A Sombra do Vento", "Carlos Ruiz Zafón", 2001)
        );
        assertEquals(2, Iterador.contarLivrosAtuais(biblioteca));
    }
    @Test
    void deveContarLivrosComecamLetraA() {
        Biblioteca biblioteca = new Biblioteca(
                new Livro("Imperfeitos", "Christina Lauren", 2024),
                new Livro("Onde estão as flores?", "Ilko Minev", 2024),
                new Livro("A Revolução dos Bichos", "George Orwell", 1945),
                new Livro("A Sombra do Vento", "Carlos Ruiz Zafón", 2001)
        );
        assertEquals(2, Iterador.contarLivrosLetraA(biblioteca));
    }

    @Test
    void deveContarTotalLivrosBiblioteca() {
        Biblioteca biblioteca = new Biblioteca(
                new Livro("Imperfeitos", "Christina Lauren", 2024),
                new Livro("Onde estão as flores?", "Ilko Minev", 2024),
                new Livro("A Revolução dos Bichos", "George Orwell", 1945),
                new Livro("A Sombra do Vento", "Carlos Ruiz Zafón", 2001)
        );
        assertEquals(4, Iterador.contarTotalLivrosBiblioteca(biblioteca));
    }
}