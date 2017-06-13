package cinema.t3.ine5612.cinema.DB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import cinema.t3.ine5612.cinema.model.entity.Cinema;
import cinema.t3.ine5612.cinema.model.entity.Filme;
import cinema.t3.ine5612.cinema.model.entity.Pessoa;
import cinema.t3.ine5612.cinema.model.entity.Sala;
import cinema.t3.ine5612.cinema.model.entity.Tela;
import cinema.t3.ine5612.cinema.model.entity.TipoDeTela;

public class DB {
    private static final DB dados = new DB();

    private List<Cinema> cinemas;
    private List<Filme> filmes;

    private DB() {
        this.adicionarCinemas();
        this.adicionarFilmes();
    }

    public List<Cinema> getCinemas() {
        return this.cinemas;
    }

    public List<Filme> getFilmes() {
        return this.filmes;
    }

    public static DB getInstance() {
        return dados;
    }

    private void adicionarCinemas() {
        this.cinemas = new ArrayList<>();

        List<Sala> salas = new ArrayList<>();
        salas.add(new Sala(1, 80, new Tela(700, TipoDeTela.TELA_FULL_HD)));
        salas.add(new Sala(2, 100, new Tela(800, TipoDeTela.TELA_HD)));
        salas.add(new Sala(3, 98, new Tela(800, TipoDeTela.TELA_FULL_HD)));

        this.cinemas.add(new Cinema(
                1L,
                "Cinespaço Beira-Mar",
                11122232L,
                44L,
                salas
        ));

        salas.add(new Sala(4, 149, new Tela(1000, TipoDeTela.ULTRA_HD)));
        this.cinemas.add(new Cinema(
                2L,
                "Cinesystem Iguatemi",
                11122232L,
                44L,
                salas
        ));

        salas.add(new Sala(5, 180, new Tela(1200, TipoDeTela.ULTRA_HD)));
        this.cinemas.add(new Cinema(
                3L,
                "Cinemark Floripa Shopping",
                11122232L,
                44L,
                salas
        ));
    }

    private void adicionarFilmes() {
        Pessoa peterJackson = new Pessoa(1, "Peter Jackson");
        Pessoa sirIanMcKellen = new Pessoa(2, "Sir Ian McKellen");
        Pessoa viggoMortensen = new Pessoa(3, "Vigo Mortensen");
        Pessoa elijahWood = new Pessoa(4, "Elijah Wood");
        Pessoa christopherLee = new Pessoa(5, "Christopher Lee");
        Pessoa billyBoyd = new Pessoa(6, "Billy Boyd");
        Pessoa bernardHill = new Pessoa(7, "Bernard Hill");
        Pessoa seanAstin = new Pessoa(8, "Sean Astin");
        Pessoa andrySerkins = new Pessoa(9, "Andy Serkins");

        Pessoa dennisGensel = new Pessoa(10, "Dennis Gensel");
        Pessoa jurgenVogel = new Pessoa(11, "Jügen Vogel");
        Pessoa maxRiemelt = new Pessoa(12, "Max Riemelt");


        Pessoa jimCarrey = new Pessoa(13, "Jim Carrey");
        Pessoa kateWinslet = new Pessoa(14, "Kate Winslet");
        Pessoa kirstenDunst = new Pessoa(15, "Kirsten Dunst");
        Pessoa markRuffalo = new Pessoa(16, "Mark Ruffalo");
        Pessoa michelGondry = new Pessoa(17, "Michel Gondry");

        this.filmes.add(
                new Filme(1,
                        "O Senhor dos Anéis: O Retorno do Rei",
                        peterJackson,
                        Arrays.asList(sirIanMcKellen, viggoMortensen, elijahWood, christopherLee, billyBoyd, bernardHill, seanAstin, andrySerkins),
                        "Sauron planeja um grande ataque a Minas Tirith, capital de Gondor, o que faz com que Gandalf (Ian McKellen) e Pippin (Billy Boyd) partam para o local na intenção de ajudar a resistência. Um exército é reunido por Theoden (Bernard Hill) em Rohan, em mais uma tentativa de deter as forças de Sauron. Enquanto isso Frodo (Elijah Wood), Sam (Sean Astin) e Gollum (Andy Serkins) seguem sua viagem rumo à Montanha da Perdição, para destruir o Um Anel.",
                        192,
                        null, // TODO adicionar poster
                        "https://www.youtube.com/watch?v=Q9wZCGjBxyU",
                        true
                )
        );

        this.filmes.add(
                new Filme(2,
                        "A Onda",
                        dennisGensel,
                        Arrays.asList(dennisGensel, jurgenVogel, maxRiemelt),
                        "",
                        107,
                        null, // TODO adicionar poster
                        "https://www.youtube.com/watch?v=brnEKSEvtZg",
                        false
                )
        );

        this.filmes.add(
                new Filme(3,
                        "O Brilho Eterno de uma Mente sem Lembranças",
                        michelGondry,
                        Arrays.asList(jimCarrey, kateWinslet, kirstenDunst, markRuffalo, elijahWood),
                        "Joel se surpreende ao saber que seu amor verdadeiro, Clementine, o apagou completamente de sua memória. Ele decide fazer o mesmo, mas muda de ideia. Preso dentro da própria mente enquanto os especialistas se mantêm ocupados em seu apartamento, Joel precisa avisá-los para parar.",
                        108,
                        null, // TODO adicionar poster
                        "https://www.youtube.com/watch?v=yEFJPhmZl1c",
                        false
                )
        );

    }
}
