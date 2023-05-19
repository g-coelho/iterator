import org.example.Biblioteca;
import org.example.Livro;
import org.example.Censo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;

public class CensoTest {
    @Test
    public void deveContarLivrosGeneroNaturalismo(){
        Biblioteca biblioteca = new Biblioteca(
                new Livro("A Normalista", "Adolfo Caminha", "Naturalismo"),
                new Livro("O Ateneu", "Raul Pompéia", "Naturalismo"),
                new Livro("O Sertanejo", "José de Alencar", "Regionalismo")
        );

        assertEquals(2, Censo.contarLivrosGeneroNaturalismo(biblioteca).intValue());

    }

    @Test
    public void deveContarLivrosGeneroRegionalismo(){
        Biblioteca biblioteca = new Biblioteca(
                new Livro("A Normalista", "Adolfo Caminha", "Naturalismo"),
                new Livro("O Ateneu", "Raul Pompéia", "Naturalismo"),
                new Livro("O Sertanejo", "José de Alencar", "Regionalismo")
        );

        assertEquals(1, Censo.contarLivrosGeneroRegionalismo(biblioteca).intValue());

    }

    @Test
    public void deveContarTotalLivrosBiblioteca(){
        Biblioteca biblioteca = new Biblioteca(
                new Livro("A Normalista", "Adolfo Caminha", "Naturalismo"),
                new Livro("O Ateneu", "Raul Pompéia", "Naturalismo"),
                new Livro("O Sertanejo", "José de Alencar", "Regionalismo")
        );

        assertEquals(3, Censo.contarTotalLivrosBiblioteca(biblioteca).intValue());

    }




}
