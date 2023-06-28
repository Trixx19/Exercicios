public class SessaoCinema{
    String data;
    String horario;
    String filme;
    Integer capacidade;
    String totalReserva;
    private Cliente [] assentos;
    //private Integer controlador;
    public SessaoCinema(String dataDaSessao,String horarioDaSessao,String filmeDaSessao,Integer capacidadeDaSessao){
        this.data=dataDaSessao;
        this.horario=horarioDaSessao;
        this.filme = filmeDaSessao;
        this.capacidade=capacidadeDaSessao;
        this.assentos = new Cliente[capacidadeDaSessao];
        //this.controlador = 0;
        this.totalReserva="";
    }

    public boolean reservar(Cliente c,Integer assento){
        for(Integer i=0;i<capacidade;i++){
            if(assentos[assento]== null  ){//&& assentos[i]==null && assentos[assento].getCpf()!=c.getCpf() //assentos[assento].getCpf()!=c.getCpf()
                //if(assentos[assento].getCpf()==null){
                assentos[assento] = new Cliente(c.getCpf(),c.getTelefone());
                this.totalReserva = Integer.toString(assento);
                return true;
                //}    
            }

        }
        return false;
    }

    public void cancelar(String cpf) {
        for(Integer i=0;i<capacidade;i++){
            if(assentos[i].getCpf()==cpf){
                assentos[capacidade]= null;
                //controlador--;
            }
        }
    }

    public String getMapaReservas() {
        return "\n" + totalReserva + " ";
    }


}