public class Conta{
    private Integer codigo;
    private Double saldo;
    private Double limite;

    public  Conta(Integer numero, Double saldo){
        this.codigo= numero;
        this.saldo= saldo;
        this.limite=100.00;

    }

    public double emitirSaldo(){
        return this.saldo;
    }

    public boolean sacar(double valor){
        if(valor != 0){
            this.saldo += this.limite;
            if(this.saldo > valor){
            this.saldo -= valor;
            return true;
            }
        }
        return false;
    }

    public boolean depositar(double deposito){
        if(deposito != 0){
            this.saldo+= deposito;
            return true;
        }
        return false;
    }

    public void alterarLimite(double novo_limite){
        this.limite+= novo_limite;
    }

}