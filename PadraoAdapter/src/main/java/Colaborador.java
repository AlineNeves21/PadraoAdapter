public class Colaborador {

    IAvaliacao avaliacao;
    AvaliacaoAdapter persistencia;

    public Colaborador() {
        avaliacao = new AvaliacaoFinalDeAno();
        persistencia = new AvaliacaoAdapter(avaliacao);
    }

    public void setAvaliacao(String finalDeAno) {
        avaliacao.setAvaliacao(finalDeAno);
        persistencia.salvarAvaliacao();
    }

    public String getAvaliacao() {
        return persistencia.recuperarAvaliacao();
    }

    // Método apenas para mostrar que está convertendo conceito para nota através do adaptador
    public float getPorcentagem() {
        return persistencia.getPorcentagem();
    }
}
