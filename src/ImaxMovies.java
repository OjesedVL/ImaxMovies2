import java.util.Scanner;

public class ImaxMovies {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lista de filmes e sessões
        String[] filmes = {
                "1 - Matrix",
                "2 - Seven: Os Sete Crimes Capitais",
                "3 - O Iluminado",
                "4 - Scarface"
        };

        String[] sessoes = {
                "1 - 14:00",
                "2 - 16:30",
                "3 - 19:00",
                "4 - 21:30"
        };

        // Preço dos ingressos
        double precoInteira = 32.0;
        double precoMeia = 16.0;

        // Exibir lista de filmes
        System.out.println("Escolha um filme:");
        for (String filme : filmes) {
            System.out.println(filme);
        }
        System.out.print("Digite o número do filme desejado: ");
        int filmeEscolhido = scanner.nextInt();

        // Exibir lista de sessões
        System.out.println("\nEscolha a sessão:");
        for (String sessao : sessoes) {
            System.out.println(sessao);
        }
        System.out.print("Digite o número da sessão desejada: ");
        int sessaoEscolhida = scanner.nextInt();

        // Perguntar a quantidade de ingressos
        System.out.print("\nDigite a quantidade de ingressos inteiros: ");
        int ingressosInteiros = scanner.nextInt();

        System.out.print("Digite a quantidade de ingressos meia-entrada: ");
        int ingressosMeia = scanner.nextInt();

        // Calcular total
        double total = (ingressosInteiros * precoInteira) + (ingressosMeia * precoMeia);

        // Exibir resumo e total a pagar
        System.out.println("\nResumo da compra:");
        System.out.println("Filme escolhido: " + filmes[filmeEscolhido - 1].split(" - ")[1]);
        System.out.println("Sessão escolhida: " + sessoes[sessaoEscolhida - 1].split(" - ")[1]);
        System.out.println("Ingressos Inteiros: " + ingressosInteiros + " x R$ " + precoInteira);
        System.out.println("Ingressos Meia-Entrada: " + ingressosMeia + " x R$ " + precoMeia);
        System.out.println("Total a pagar: R$ " + total);

        scanner.close();
    }
}

