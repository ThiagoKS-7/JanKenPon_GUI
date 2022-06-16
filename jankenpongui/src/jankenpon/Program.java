package jankenpon;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		byte escolha = -1;
		do {
			System.out.println(
						"1 - Joga\n"
						+ "0 - Sair"
					);
			escolha = sc.nextByte();
			switch(escolha) {
				case 1:
					System.out.println(
							"FAÇA SUA ESCOHA:\n"
							+ "1 - Pedra\n"
							+ "2 - Papel\n"
							+ "3 - Tesoura\n"
						);
					byte jogadaUsuario = sc.nextByte();
					Jogo j = new Jogo(jogadaUsuario);
					System.out.println(j);
					System.out.println("Resultado: " + j.verificaVencedor());
					break;
				case 0:
					System.out.println("Jogo encerrado!");				
			}
		}while (escolha != 0);
	}

}
