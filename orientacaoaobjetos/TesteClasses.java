package orientacaoaobjetos;

public class TesteClasses {

	public static void main(String[] args) {
		
		System.out.println("========================= Clase Cliente ============================");
		
		Cliente cliente1 = new Cliente("Augeu", 694838, "Rua", "nul@gello.co", 67499494, "email");
		cliente1.comprar(345.56);
		cliente1.comprar(50.00);
		cliente1.comprar(95.00);
		cliente1.pagar(400.00);
		cliente1.imprimirInfos();
		
		System.out.println("========================= Clase Avião ============================");
		
		Aviao aviao1 = new Aviao("Voador", "jato", "Embraer", 190, 100, 1999);
		
		aviao1.voar("Brasília", 4);
		aviao1.abastecer(300);
		aviao1.voar("Manaus", 10);
		aviao1.voar("Salgueiro", 6);
		aviao1.imprimirInfos();
		
		System.out.println("========================= Clase Funcionário ============================");
		
		Funcionario funcionario1 = new Funcionario("Aurelio", 34, "vendedor", 8, 1000.00, "ativo");
		
		funcionario1.serPromovido("gerente");
		funcionario1.aumentarSalario(1000.00);
		funcionario1.imprimirInfos();
		funcionario1.serDemitido();
		
		System.out.println("========================= Clase Patinente ============================");
		
		Patinete patinete1 = new Patinete("elétrico", 50);
		
		patinete1.aumentarVelocidade(10);
		patinete1.usar();
		patinete1.aumentarVelocidade(10);
		patinete1.aumentarVelocidade(25);
		patinete1.aumentarVelocidade(50);
		patinete1.aumentarVelocidade(50);
		patinete1.imprimirInfos();
		patinete1.parar();

		System.out.println("========================= Clase Conta ============================");
		
		ContaBancaria conta1 = new ContaBancaria("Gaia", 1234, 1000, "senha", 1886);
		
		conta1.depositar(1234, 600);
		conta1.sacar(1500, "12");
		conta1.sacar(1500, "senha");
		conta1.transferir(1500, 150, "senha");
		conta1.imprimirInfos();
		conta1.redefinirSenha(1888, "hello");
		conta1.redefinirSenha(1886, "hello");
		conta1.depositar(1234, 8000);
		conta1.imprimirInfos();
		conta1.sacar(3000, "134");
		conta1.sacar(3000, "h122");
		conta1.sacar(3000, "h222");
		conta1.sacar(3000, "h222");
		conta1.sacar(3000, "h222");
		conta1.imprimirInfos();
		
		System.out.println("========================= Clase Conta ============================");
		
		Paciente paciente1 = new Paciente("Atlas", "Afrania", "Fenol");
		
		paciente1.imprimirProntuario();
		paciente1.medicar();
		paciente1.trocarMedicamento("Frentrozol");
		paciente1.imprimirProntuario();
		paciente1.darAlta("Golileu");
		paciente1.darAlta("Afrania");
		paciente1.imprimirProntuario();
		
		System.out.println("========================= Clase Luminária ============================");
		
		Luminaria luminaria1 = new Luminaria("Luzinha", 10);
		
		luminaria1.imprimirInfos();
		luminaria1.ligar();
		luminaria1.estabelerIntensidade(15);
		luminaria1.imprimirInfos();
		luminaria1.estabelerIntensidade(-8);
		luminaria1.imprimirInfos();
		luminaria1.estabelerIntensidade(-8);
		luminaria1.estabelerIntensidade(15);
		luminaria1.desligar();
		luminaria1.desligar();
		
	}

}
