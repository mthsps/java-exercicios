package orientacaoaobjetos;

import java.time.LocalDate;

public class Paciente {
	
	String nome;
	private String medicoResponsavel;
	private String estadoSaude;
	private String remedioPrincipal;
	private LocalDate dataAlta;
	
	public Paciente(String nome, String medicoResponsavel, String remedioPrincipal) {
		this.nome = nome;
		this.medicoResponsavel = medicoResponsavel;
		this.remedioPrincipal = remedioPrincipal;
		this.estadoSaude = "diagnostico";
	}
	
	
	public void medicar() {
		System.out.println(remedioPrincipal + " foi dado para " + nome + ".");
		estadoSaude = "tratamento";
	}	
	
	public void trocarMedicamento(String remedio) {
		System.out.println("Troca de medicamento registrada no prontuário.");
		remedioPrincipal = remedio;
	}
	
	public void darAlta(String medico) {
		if (medico == medicoResponsavel) {
			System.out.println(nome + " rebebeu alta.");
			dataAlta = LocalDate.now();
		} else {
			System.out.println("Pessoa sem autorização para dar alta.");
			estadoSaude = "recuperado";
		}
	}
	
	public void imprimirProntuario() {
		if (estadoSaude == "diagnostico") {
			System.out.println(nome + " está em fase de diagnóstico com doutor/a " + medicoResponsavel + ".");
		} else if (estadoSaude == "tratamento") {
			System.out.println(nome + " está recebendo o remédio " + remedioPrincipal + " e o doutor/a responsável é " + medicoResponsavel + ".");
		} else {
			System.out.println(nome + " recebeu alta em " + dataAlta + ".");
		}
		
	}
	
	
}
