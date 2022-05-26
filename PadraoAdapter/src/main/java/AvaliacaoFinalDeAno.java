public class AvaliacaoFinalDeAno implements IAvaliacao {

    private String finalDeAno;

    @Override
    public String getAvaliacao() {
        return this.finalDeAno;
    }

    @Override
    public void setAvaliacao(String finalDeAno) {
        this.finalDeAno = finalDeAno;
    }
}
