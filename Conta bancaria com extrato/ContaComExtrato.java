import java.util.ArrayList;
public class ContaComExtrato {

    private int conta;
    private double saldo;
    private double limite;
    private ArrayList<Double> extrato;
    
    public ContaComExtrato(int conta,double saldo){
        this.conta = conta;
        this.saldo = saldo;
        limite = 100;
        extrato = new ArrayList<Double>();
    }

    public void alterarLimite(double novoLimite){
        limite = novoLimite;
    }

    public double emitirSaldo(){
        return saldo;
    }

    public void depositar(double valor){
        if(valor != 0){
            saldo += valor;
            extrato.add(valor);
        }
    }

    public boolean sacar(double valor){
        if(valor != 0){
            if(valor <= (saldo+limite)){
                extrato.add(valor*(-1));
                return true;
            }
        }
        return false;
    }

    public Double[] emitirExtrato(){
        Double[] array = extrato.toArray(new Double[20]);
        return array;
    }

    public int getConta(){
        return conta;
    }

}