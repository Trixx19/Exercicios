public class AvaliacaoRU{

    String data;
    String turno; 
    String proteina; 
    Integer nota; 
    String comentario;

    public AvaliacaoRU(String dataDaAvaliacao,String turnoDaAvaliacao, String proteinaDaAvaliacao, Integer notaDaAvaliacao, String comentarioDaAvaliacao){
        this.data = dataDaAvaliacao;
        this.turno = turnoDaAvaliacao;
        this.proteina = proteinaDaAvaliacao;
        this.nota = notaDaAvaliacao;
        this.comentario = comentarioDaAvaliacao;
    }

    public String getData() {
        return this.data;
    }
    public String getTurno() {
        return this.turno;
    }
    public String getProteina() {
        return this.proteina;
    }
    public Integer getNota() {
        return this.nota;
    }
    public String getComentario() {
        return this.comentario;
    }

}