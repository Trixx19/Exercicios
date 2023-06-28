
public class CartaoRU{
    public String id;
    public final String siapeDiscente;
    public Boolean isencao;
    public double saldo;

    public CartaoRU(String id, String Discente, Boolean iser){
        this.id = id;
        this.siapeDiscente= Discente;
        this.isencao= iser;
        this.saldo= 0.00;
        
    }

    public double emitirSaldo() {
        return this.saldo;
    }

    public void recarregar(double saldo) {
        this.saldo += saldo;
    }

    public void alterarIsencao(Boolean nova_isencao) {
        this.isencao = nova_isencao;
    }

    public Boolean fazerRefeicao(){
        Boolean aux = true;
        if(this.isencao == true){
            return aux;
        } else if((this.saldo > 0) && (this.saldo>=1.10)){
            this.saldo-=1.10;
            return aux;
        } else {
            aux = false;
        }
        
        return aux;
    }
}

