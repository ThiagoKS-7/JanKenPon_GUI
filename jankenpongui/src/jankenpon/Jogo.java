package jankenpon;

public class Jogo {
	private JanKenPon usuario;
	private JanKenPon computador;
	
	public Jogo(byte jogadaUsuario) {
		this.usuario = new JanKenPon(jogadaUsuario);
		byte sorteio = (byte) (Math.random()*3 + 1);
		this.computador = new JanKenPon(sorteio);
	}
	
	
	public String verificaVencedor() {
		byte usr = this.usuario.getJogada();
		byte pc = this.computador.getJogada();
		
		if (usr == pc) {
			return "Empate";
		}
		else if (usr == 1 && pc == 2 || usr == 2 && pc == 1 || usr == 3 && pc == 2) {
			return "User venceu";
		}
		else {
			return "Pc venceu";
		}
	}


	@Override
	public String toString() {
		return "Usuario jogou: " + this.usuario + "\n" + " - " + "PC jogou: " + this.computador  + "\n";
	}
	
	
	
}
