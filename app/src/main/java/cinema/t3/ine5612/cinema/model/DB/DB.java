package cinema.t3.ine5612.cinema.model.DB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import cinema.t3.ine5612.cinema.model.entity.Cinema;
import cinema.t3.ine5612.cinema.model.entity.Filme;
import cinema.t3.ine5612.cinema.model.entity.Pessoa;
import cinema.t3.ine5612.cinema.model.entity.Poster;
import cinema.t3.ine5612.cinema.model.entity.Sala;
import cinema.t3.ine5612.cinema.model.entity.Tela;
import cinema.t3.ine5612.cinema.model.entity.TipoDeTela;

public class DB {
    private static final DB dados = new DB();

    private List<Cinema> cinemas;
    private List<Filme> filmes;

    private DB() {
        this.adicionarFilmes();
        this.adicionarCinemas();
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
                -27.584262,
                -48.545102,
                adicionarFilmesAoCinema(1),
                salas,
                null
        ));

        salas.add(new Sala(4, 149, new Tela(1000, TipoDeTela.ULTRA_HD)));
        this.cinemas.add(new Cinema(
                2L,
                "Cinesystem Iguatemi",
                -27.590553,
                -48.514590,
                adicionarFilmesAoCinema(2),
                salas,
                null
        ));


        salas.add(new Sala(5, 180, new Tela(1200, TipoDeTela.ULTRA_HD)));
        this.cinemas.add(new Cinema(
                3L,
                "Cinemark Floripa Shopping",
                -27.554054,
                -48.497611,
                adicionarFilmesAoCinema(3),
                salas,
                null
        ));
    }

    private void adicionarFilmes() {
        this.filmes = new ArrayList<>();
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
            new Filme(
                1,
                "O Senhor dos Anéis: O Retorno do Rei",
                peterJackson,
                Arrays.asList(sirIanMcKellen, viggoMortensen, elijahWood, christopherLee, billyBoyd, bernardHill, seanAstin, andrySerkins),
                "Sauron planeja um grande ataque a Minas Tirith, capital de Gondor, o que faz com que Gandalf (Ian McKellen) e Pippin (Billy Boyd) partam para o local na intenção de ajudar a resistência. Um exército é reunido por Theoden (Bernard Hill) em Rohan, em mais uma tentativa de deter as forças de Sauron. Enquanto isso Frodo (Elijah Wood), Sam (Sean Astin) e Gollum (Andy Serkins) seguem sua viagem rumo à Montanha da Perdição, para destruir o Um Anel.",
                192,
                new Poster("http://www.queroposters.com.br/media/catalog/product/cache/1/image/800x800/9df78eab33525d08d6e5fb8d27136e95/c/0/c0750_-_p_ster_the_lord_of_the_rings.jpg"),
                "https://www.youtube.com/watch?v=Q9wZCGjBxyU",
                true
            )
        );

        this.filmes.add(
            new Filme(
                2,
                "A Onda",
                dennisGensel,
                Arrays.asList(dennisGensel, jurgenVogel, maxRiemelt),
                "Em uma escola da Alemanha, alunos tem de escolher entre duas disciplinas eletivas, uma sobre anarquia e a outra sobre autocracia. O professor Rainer Wenger (Jürgen Vogel) é colocado para dar aulas sobre autocracia, mesmo sendo contra sua vontade. Após alguns minutos da primeira aula, ele decide, para exemplificar melhor aos alunos, formar um governo fascista dentro da sala de aula. Eles dão o nome de \"A Onda\" ao movimento, e escolhem um uniforme e até mesmo uma saudação. Só que o professor acaba perdendo o controle da situação, e os alunos começam a propagar \"A Onda\" pela cidade, tornando o projeto da escola um movimento real. Quando as coisas começam a ficar sérias e fanáticas demais, Wenger tenta acabar com \"A Onda\", mas aí já é tarde demais.",
                107,
                new Poster("http://filmesegames.com.br/wp-content/uploads/2015/02/21645450_4.jpg"),
                "https://www.youtube.com/watch?v=brnEKSEvtZg",
                false
            )
        );

        this.filmes.add(
            new Filme(
                3,
                "O Brilho Eterno de uma Mente sem Lembranças",
                michelGondry,
                Arrays.asList(jimCarrey, kateWinslet, kirstenDunst, markRuffalo, elijahWood),
                "Joel se surpreende ao saber que seu amor verdadeiro, Clementine, o apagou completamente de sua memória. Ele decide fazer o mesmo, mas muda de ideia. Preso dentro da própria mente enquanto os especialistas se mantêm ocupados em seu apartamento, Joel precisa avisá-los para parar.",
                108,
                new Poster("http://4.bp.blogspot.com/-Up3ow-d4i1k/VipESGE15oI/AAAAAAAAALU/Ukuv5QczhwM/s1600/Eternal_Sunshine_of_the_Spotless_Mind-487862604-large.jpg"),
                "https://www.youtube.com/watch?v=GBEke6JixyE",
                false
            )
        );

        this.filmes.add(
                new Filme(
                        4,
                        "A Múmia",
                        new Pessoa(18, "Alex Kurtzman"),
                        Arrays.asList(kateWinslet, kirstenDunst, markRuffalo, elijahWood),
                        "Nas profundezas do deserto, uma antiga rainha cujo destino foi injustamente tirado está mumificada. Apesar de estar sepultada em sua cripta, ela desperta nos dias atuais. Com uma maldade acumulada ao longo dos anos, ela espelha terror desde as areais do Oriente Médio até os becos de Londres.",
                        110,
                        new Poster("http://br.web.img3.acsta.net/c_215_290/pictures/17/04/18/19/09/596203.jpg"),
                        "https://www.youtube.com/watch?v=Vov3hbmweRI",
                        true
                )
        );

        this.filmes.add(
                new Filme(
                        5,
                        "Mulher Maravilha",
                        new Pessoa(19, "Patty Jenkins"),
                        Arrays.asList(jimCarrey, kateWinslet, kirstenDunst, markRuffalo, elijahWood),
                        "Treinada desde cedo para ser uma guerreira imbatível, Diana Prince (Gal Gadot) nunca saiu da paradisíaca ilha em que é reconhecida como princesa das Amazonas. Quando o piloto Steve Trevor (Chris Pine) se acidenta e cai numa praia do local, ela descobre que uma guerra sem precedentes está se espalhando pelo mundo e decide deixar seu lar certa de que pode parar o conflito. Lutando para acabar com todas as lutas, Diana percebe o alcance de seus poderes e sua verdadeira missão na Terra.",
                        140,
                        new Poster("http://br.web.img3.acsta.net/c_215_290/pictures/17/03/10/19/41/580546.jpg"),
                        "https://www.youtube.com/watch?v=F7j-OqYXXhI",
                        false
                )
        );

        this.filmes.add(
                new Filme(
                        6,
                        "Neve Negra",
                        new Pessoa(20, "Martin Hodara"),
                        Arrays.asList(jimCarrey, kateWinslet, kirstenDunst, markRuffalo, elijahWood),
                        "Salvador (Ricardo Darín) vive isolado do mundo nas colinas geladas da Patagônia. Sozinho há décadas, ele recebe a inesperada visita do irmão Marcos (Leonardo Sbaraglia) e da cunhada Laura (Laia Costa). O objetivo dos dois é que Salvador aceite vender as terras que os irmãos receberam em herança, mas ele não está nem um pouco disposto.",
                        90,
                        new Poster("http://br.web.img3.acsta.net/c_215_290/pictures/17/05/02/23/04/384217.jpg"),
                        "https://www.youtube.com/watch?v=NefuoiB_sIs",
                        false
                )
        );

        this.filmes.add(
                new Filme(
                        7,
                        "Tour de France",
                        new Pessoa(21, "Rachid Djaïdani"),
                        Arrays.asList(jimCarrey, kateWinslet, kirstenDunst, markRuffalo, elijahWood),
                        "JFar'Hook é um jovem rapper de 20 anos. Após um acerto de contas, ele é obrigado a sair de Paris por algum tempo. Seu produtor, Bilal, propõe a ele que o substitua e acompanhe seu pai Serge numa volta pelos portos da França, seguindo os passos do pintor Joseph Vernet. Apesar do choque de gerações e culturas, uma amizade improvável surgirá entre o rapper promissor e esse pedreiro do norte da França durante um périplo que os levará a Marselha para um show final, o da reconciliação.",
                        95,
                        new Poster("https://upload.wikimedia.org/wikipedia/en/c/c3/Tour_de_France_%28film%29.jpg"),
                        "https://www.youtube.com/watch?v=GBEke6JixyE",
                        false
                )
        );

    }

    private List<Filme> adicionarFilmesAoCinema(long idCinema) {
        List<Filme> filmes = new ArrayList<Filme>();
        if (idCinema == 1) {
            filmes.add(this.filmes.get(0));
            filmes.add(this.filmes.get(1));
            filmes.add(this.filmes.get(3));
            filmes.add(this.filmes.get(6));
        } else if (idCinema == 2) {
            filmes.add(this.filmes.get(1));
            filmes.add(this.filmes.get(3));
            filmes.add(this.filmes.get(4));
            filmes.add(this.filmes.get(5));
            filmes.add(this.filmes.get(6));
        } else {
            filmes.add(this.filmes.get(0));
            filmes.add(this.filmes.get(1));
            filmes.add(this.filmes.get(2));
            filmes.add(this.filmes.get(3));
            filmes.add(this.filmes.get(4));
            filmes.add(this.filmes.get(5));
            filmes.add(this.filmes.get(6));
        }
        return filmes;
    }
}
