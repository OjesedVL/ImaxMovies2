public class Filme {
    private String nome;
    private String diretor;
    private String descricao;
    private String genero;
    private int duracao; // duração em minutos

    // Construtor
    public Filme(String nome, String diretor, String descricao, String genero, int duracao) {
        this.nome = nome;
        this.diretor = diretor;
        this.descricao = descricao;
        this.genero = genero;
        this.duracao = duracao;
    }

    // Getters (Métodos de acesso)
    public String getNome() {
        return nome;
    }

    public String getDiretor() {
        return diretor;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getGenero() {
        return genero;
    }

    public int getDuracao() {
        return duracao;
    }

    // Método toString() para exibir o filme de forma legível
    @Override
    public String toString() {
        return "Nome: " + nome + "\n" +
                "Diretor: " + diretor + "\n" +
                "Descrição: " + descricao + "\n" +
                "Gênero: " + genero + "\n" +
                "Duração: " + duracao + " minutos";
    }
}
