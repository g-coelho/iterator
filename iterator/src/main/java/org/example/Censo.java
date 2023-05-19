package org.example;

import java.util.Iterator;
import java.util.List;

public class Censo {

    public static Integer contarLivrosGeneroNaturalismo(Biblioteca biblioteca) {
        int quantidade = 0;
        for (Iterator<Livro> it = biblioteca.iterator(); it.hasNext(); ) {
            Livro livro = it.next();
            if (livro.getGenero().equals("Naturalismo")) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarLivrosGeneroRegionalismo(Biblioteca biblioteca) {
        int quantidade = 0;
        for (Iterator<Livro> it = biblioteca.iterator(); it.hasNext(); ) {
            Livro livro = it.next();
            if (livro.getGenero().equals("Regionalismo")) {
                quantidade++;
            }
        }
        return quantidade;
    }


    public static Integer contarTotalLivrosBiblioteca(Biblioteca biblioteca){
        int quantidade = 0;
        for(Iterator a = biblioteca.iterator(); a.hasNext();){
            quantidade++;
            a.next();
        }
        return quantidade;
    }


}
