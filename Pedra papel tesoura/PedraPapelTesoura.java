import java.util.Random;
import java.util.Scanner;

public class PedraPapelTesoura {
	
	static final int PEDRA = 0;
	static final int PAPEL = 1;
	static final int TESOURA = 2;
 
	static public void main(String[] args){
		System.out.println("Vamos jogar Pedra, Papel, Tesoura!");
		System.out.println(" 0. PEDRA\n 1. PAPEL\n 2. TESOURA");
		System.out.println("Digite sua jogada:");
		int jogadaUsuario = recebeJogadaUsuario();
		int jogadaCpu = geraJogadaCpu();
		int resultado = executaJogada(jogadaUsuario, jogadaCpu);
		exibeResultado(jogadaUsuario, jogadaCpu, resultado);
	}
	
	static public int recebeJogadaUsuario(){
		return new Scanner(System.in).nextInt();
	}
	
	static public int geraJogadaCpu(){
		Random rnd = new Random();
		long semente = System.currentTimeMillis();
		rnd.setSeed(semente);
		return rnd.nextInt(3); // retorna aleatorio entre 0 e 2
	}
	
	static public int executaJogada(int jogadaUsuario, int jogadaCpu){
		if(jogadaUsuario == jogadaCpu){
			return 5;
		} else if((jogadaUsuario != 0) && (jogadaUsuario != 1) && (jogadaUsuario != 2)){
			return 6;
		} else if((jogadaUsuario == 0) && (jogadaCpu == 2)){
			return 3;
		} else if((jogadaUsuario == 2)&& (jogadaCpu == 1)){
			return 3;
		} else if((jogadaUsuario == 1) && (jogadaCpu == 0)){
			return 3;
		} else {
			return 4;
		}
	
	}
	
	static public void exibeResultado(int jogadaUsuario, int jogadaCpu, int resultado){
	
		System.out.printf("Jogada do usuario: %d\n", jogadaUsuario);
		System.out.printf("Jogada da CPU: %d\n", jogadaCpu);
		if(resultado == 5){
			System.out.println("Resultado: Empate!!!");
		}	else if(resultado == 3){
				System.out.println("Resultado: Usuario é o vencedor!!!");
		}	else if(resultado == 4) {
			System.out.println("Resultado: Cpu é o vencedor!!!");
		}	else if(resultado == 6){
			System.out.println(">>>Jogada do usuario invalida<<<");
		}
	}
	
}
/* new scanner(System.in).nestInt() */