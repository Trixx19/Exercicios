public class ControladorAvaliacoes{

    private AvaliacaoRU [] avaliacoes;
    private Integer controlador;

    public ControladorAvaliacoes(){
        this.avaliacoes = new AvaliacaoRU[50];
        this.controlador=0;
    }

    public boolean adicionarAvaliacao(AvaliacaoRU novaAvaliacao){
        if(novaAvaliacao.getData() == ""){
            return false;
        }
        if(!(novaAvaliacao.getTurno() == "almoco" || novaAvaliacao.getTurno() == "jantar")){
            return false;
        }
        if(!(novaAvaliacao.getProteina() == "animal" || novaAvaliacao.getProteina() == "vegetal")){
            return false;
        }
        if(!(novaAvaliacao.getNota() >= 1 && novaAvaliacao.getNota() <= 5)){
            return false;
        }
        if(novaAvaliacao.getComentario() == ""){
            if(novaAvaliacao.getNota() <= 2){
                return false;
            }
        }

        this.avaliacoes[controlador] = novaAvaliacao;
        this.controlador++; 
        return true;
    }
    public Double getMediaAvaliacoes(){
        double total=0;
        //Integer quantidade=0;
        for(Integer i=0;i< controlador;i++){
            total += avaliacoes[i].getNota(); 
        }
        if(controlador==0 ){
            return 0.0;
        }
        return total/controlador;
    }
    public Double getMediaAvaliacoesPorProteina(String proteina){
        double total=0;
        Integer quantidade=0;
        for(Integer i=0;i< controlador;i++){
            if(avaliacoes[i].getProteina()==proteina){
                total += avaliacoes[i].getNota(); 
                quantidade++;
            }
        }
        if(quantidade==0){
            return 0.0;
        }
        return total/quantidade;
    }
    public Double getMediaAvaliacoesPorTurno(String turno){
        double total=0;
        Integer quantidade=0;
        for(Integer i=0;i< controlador;i++){
            if(avaliacoes[i].getTurno()==turno){
                total += avaliacoes[i].getNota(); 
                quantidade++;
            }
        }
        if(quantidade==0){
            return 0.0;
        }
        return total/quantidade;
    }
    public Double getMediaAvaliacoesPorData(String data){
        double total=0;
        Integer quantidade=0;
        for(Integer i=0;i< controlador;i++){
            if(avaliacoes[i].getData()==data){
                total += avaliacoes[i].getNota(); 
                quantidade++;
            }
        }
        if(quantidade==0){
            return 0.0;
        }
        return total/quantidade;
    }
    public String getTodosComentarios() {
        String resultado ="";
        for(Integer i=0;i<controlador;i++){
            if(avaliacoes[i].getComentario() !=""){
                resultado += avaliacoes[i].getData() + "_" + avaliacoes[i].getProteina() + "_" 
                + avaliacoes[i].getNota() + "_" + avaliacoes[i].getTurno() + "\n" ;  
            }
        }
        return "\n" + resultado;
    }

}