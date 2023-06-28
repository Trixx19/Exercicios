public class ItemDePedido{
    private String Codigo;
    private String Descricao;
    private Integer Quantidade;
    private Double Peso;
    private Double Valor_unitario;

    public ItemDePedido(String cod, String produto, Integer unidades, Double peso, Double valor){
        this.Codigo = cod;
        this.Descricao = produto;
        this.Quantidade = unidades;
        this.Peso = peso;
        this.Valor_unitario = valor;
    }

    public Double getValorTotal(){
        this.Valor_unitario *= 1* this.Quantidade;
        return this.Valor_unitario;
    }

    public Double getPesoTotal(){
        this.Peso *= 1* this.Quantidade;
        return this.Peso;
    }

    



    

}