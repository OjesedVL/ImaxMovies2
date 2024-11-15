import java.util.Scanner;

public class MenuController {

    private Scanner scanner;
    private Filme[] filmes;
    private String[] sessoes;
    private double precoInteira;

    public MenuController() {
        this.scanner = new Scanner(System.in);

        // Inicializando filmes com objetos da classe Filme
        filmes = new Filme[]{
                new Filme("Matrix", "Lilly Wachowski; Lana Wachowskio",
                        "Um hacker descobre que o mundo em que vive é uma simulação virtual criada por máquinas para escravizar a humanidade.",
                        "Ação, Aventura, Ficção Científica", 136),
                new Filme("Seven: Os Sete Crimes Capitais", "David Finchers",
                        "Dois detetives perseguem um assassino que usa os sete pecados capitais como inspiração para seus crimes.",
                        "Crime, Drama, Mistério", 127),
                new Filme("O Iluminado", "Stanley Kubrick",
                        "Um homem fica obcecado por uma entidade maligna em um hotel isolado durante o inverno, levando-o a perder a razão.",
                        "Terror, Mistério", 146),
                new Filme("Scarface", "Brian De Palma",
                        "A história de Tony Montana, um imigrante cubano que se torna um grande traficante de drogas em Miami.",
                        "Crime, Drama", 165)
        };

        // Sessões disponíveis
        sessoes = new String[]{
                "1 - 14:00",
                "2 - 16:30",
                "3 - 19:00",
                "4 - 21:30"
        };

        // Preço dos ingressos
        precoInteira = 32.0;
        double precoMeia;
        precoMeia = 16.0;
    }

    // Método principal que inicia o processo de compra
    public void iniciarCompra() {
        while (true) {
            boolean filmeEscolhido = selecionarFilme();
            int sessaoEscolhida = selecionarSessao();
            int ingressosInteiros = obterQuantidadeIngressos("inteiros");
            int ingressosMeia = obterQuantidadeIngressos("meia-entrada");

            // Calcular o total
            double total = calcularTotal(ingressosInteiros, ingressosMeia);

            // Exibir resumo e total a pagar
            exibirResumo(filmeEscolhido, sessaoEscolhida, ingressosInteiros, ingressosMeia, total);

            // Perguntar se o usuário deseja fazer outra compra
            if (!desejaFazerOutraCompra()) {
                System.out.println("Obrigado por utilizar o sistema de compra de ingressos. Até logo!");
                break;  // Encerra o programa
            }
        }
    }

    private boolean desejaFazerOutraCompra() {
        return false;
    }

    private void exibirResumo(boolean filmeEscolhido, int sessaoEscolhida, int ingressosInteiros, int ingressosMeia, double total) {
    }

    private float calcularTotal(float ingressosInteiros, int ingressosMeia) {
        return ingressosInteiros;
    }

    private int obterQuantidadeIngressos(String inteiros) {
        return 0;
    }

    private char selecionarSessao() {
        return 0;
    }

    // Método para selecionar o filme
    private boolean selecionarFilme() {
        System.out.println("\nEscolha um filme:");
        for (int i = 0; i < filmes.length; i++) {
            System.out.println((i + 1) + " - " + filmes[i].getNome());
        }
        return obterOpcaoValida("Digite o número do filme desejado: ", 1, filmes.length);
    }

    private boolean obterOpcaoValida(String s, int i, int length) {
        return false;
    }

    // Outros métodos permanecem os mesmos...
}
