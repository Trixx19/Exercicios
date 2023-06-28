public class Venda{

    private ItemDeVenda[] itensDasVendas;
    private Integer controlador;
    String numeroNotaFiscal;
    Double valorTotal;

    public Venda(String numeroDaNota){
        this.numeroNotaFiscal = numeroDaNota;
        this.itensDasVendas = new ItemDeVenda[100];
        this.controlador = 0;
        this.valorTotal=0.0;
    }

    public void adicionarItem(String codigo, String descricao,Double quantidade,String unidade,Double valorUnitario){
        if(quantidade > 0 && valorUnitario >0 && codigo!="" && descricao!="" && unidade!=""){
            this.itensDasVendas[controlador] = new ItemDeVenda(codigo, descricao, quantidade, unidade, valorUnitario);
            this.controlador ++;
            this.valorTotal += quantidade * valorUnitario;
        }
    }

    public String imprimir(){
        String imprimir="";    
            for(Integer auxilio = 0;auxilio<controlador;auxilio++ ){
                imprimir += itensDasVendas[auxilio].getcodigo() + " " + itensDasVendas[auxilio].getdescricao() + " "+ 
                itensDasVendas[auxilio].getquantidade() + " " + itensDasVendas[auxilio].getunidade() + " " + 
                itensDasVendas[auxilio].getvalorUnitario() + " " + itensDasVendas[auxilio].getValorTotal() + "\n"; 
            }
            imprimir += "Valor total " + this.valorTotal + "\n"; 
            imprimir += "Nota fiscal "+this.numeroNotaFiscal;

        return  imprimir;
    }

    public Double getValorTotal(){ 
        return this.valorTotal; 
    }
}