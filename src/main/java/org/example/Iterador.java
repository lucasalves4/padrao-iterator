package org.example;

import java.util.Iterator;

public class Iterador {

    public static Integer contarLivrosAtuais(Biblioteca biblioteca) {
        int quantidade = 0;
        for (Livro livro : biblioteca) {
            if (livro.getAnoPublicacao() == 2024) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarLivrosLetraA(Biblioteca biblioteca) {
        int quantidade = 0;
        for (Livro livro : biblioteca) {
            if (livro.getNome().charAt(0) == 'A') {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalLivrosBiblioteca(Biblioteca biblioteca) {
        int quantidade = 0;
        for (Iterator a = biblioteca.iterator(); a.hasNext(); ) {
            quantidade++;
            a.next();
        }
        return quantidade;
    }
}
