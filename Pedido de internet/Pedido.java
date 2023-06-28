//import java.lang.reflect.Array;

public class Pedido{
   private ItemDePedido[] Items;
   private String Numero_pedido;
   private String Cidade;
   private String Estado;
   private Double Valor_total;
   private Double ValorDoFrete;
   private Integer cont;

   public Pedido(String numero, String cidade, String estado){
    this.Numero_pedido = numero;
    this.Cidade = cidade;
    this.Estado = estado;
    this.Items = new ItemDePedido[20];
    this.ValorDoFrete = 0.00;
    this.Valor_total = 0.00;
    this.cont = 0;
   }

   public String adicionarItem(String codigo, String descricao, Integer quantidade, Double peso, Double valorUnitario){
      if(quantidade >0 && valorUnitario>0 && descricao != "" && codigo !=""){
         this.Items[cont] = new ItemDePedido(codigo, descricao, quantidade, peso, valorUnitario);
         this.cont++;
         this.Valor_total += valorUnitario * 1 *quantidade;
         if(peso >= 1000.00){
            this.ValorDoFrete += (peso *1* quantidade)/1000;
         } else{
            this.ValorDoFrete += peso * 1* quantidade;
         }
      }
      return null;
   }

   public Double getValorTotal(){
      return this.Valor_total;
  }



  /*Política de frete
    Qualquer pedido igual ou acima de R$ 1.000,00 tem frete grátis
    Pedidos abaixo de 1.000,00, valor do frete segue a tabela:
    Norte/Nordeste = R$ 20,00/kg
    Centro-Oeste/Sudeste = R$ 25,00/kg
    Sul = R$ 30,00/kg*/

    public Double getValorFrete() {
      if(this.Valor_total < 1000.00){
          if(Estado == "AM" || Estado == "PA" || Estado == "AC" || Estado == "RR" || Estado == "RO" || Estado == "AP" || Estado == "TO" || Estado == "MA" || Estado == "PI" || Estado == "CE" || Estado == "RN" || Estado == "PB" || Estado == "PE" || Estado == "AL" || Estado == "SE" || Estado == "BA"){
              this.ValorDoFrete *=  20.0 ;
              return this.ValorDoFrete;
          }
          else if(Estado == "GO" || Estado == "MT" || Estado == "MS" || Estado == "DF" || Estado == "ES" || Estado == "MG" || Estado == "RJ" || Estado == "SP"){
              this.ValorDoFrete *= 25.0 ;
              return this.ValorDoFrete;
          }
          else{
              this.Valor_total *= 30.0 ;
              return this.ValorDoFrete;
          }
      }
      else{
          return 0.0;
      }
      }
        

}