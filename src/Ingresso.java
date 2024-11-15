public class Ingresso {
    private Filme filme;         // Filme escolhido
    private String tipoIngresso; // "Inteira" ou "Meia"
    private String horarioSessao; // Horário da sessão, por exemplo "14:00"

    // Construtor
    public Ingresso(Filme filme, String tipoIngresso, String horarioSessao) {
        this.filme = filme;
        this.tipoIngresso = tipoIngresso;
        this.horarioSessao = horarioSessao;
    }

    // Getters (Métodos de acesso)
    public Filme getFilme() {
        return filme;
    }

    public String getTipoIngresso() {
        return tipoIngresso;
    }

    public String getHorarioSessao() {
        return horarioSessao;
    }

    // Método toString() para exibir o ingresso de forma legível
    @Override
    public String toString() {
        return "Filme: " + filme.getNome() + "\n" +
                "Tipo de Ingresso: " + tipoIngresso + "\n" +
                "Sessão: " + horarioSessao;
    }
}
