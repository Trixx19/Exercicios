public class ItemDeVenda{
    String codigo;
    String descricao;
    Double quantidade;
    String unidade;
    Double valorUnitario;
    double valorTotal;

    public ItemDeVenda(String codigoProduto,String descricaoDoItem ,Double quantidades,String un,Double precoUnidade){
        this.codigo = codigoProduto;
        this.descricao = descricaoDoItem;
        this.quantidade = quantidades;
        this.unidade = un;
        this.valorUnitario = precoUnidade;
        this.valorTotal = quantidades * precoUnidade;
    }

    public String imprimir(){
        return "\n"+ codigo + " " + descricao + " " + quantidade + " " + unidade + " " + valorUnitario + " " + valorTotal;
    }

    public Double getValorTotal(){
        return this.valorTotal; 
    }


    //ajuda na impresao

    public String getcodigo(){
        return this.codigo;
    }
    public String getdescricao(){
        return this.descricao;
    }
    public Double getquantidade(){
        return this.quantidade;
    }
    public String getunidade(){
        return this.unidade;
    }
    public Double getvalorUnitario(){
        return this.valorUnitario;
    }
}