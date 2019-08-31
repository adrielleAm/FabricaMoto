package pkg_refatoracao;

import javax.swing.JOptionPane;

public class LojaMoto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {
			try {
				String nome = JOptionPane.showInputDialog("Informe a marca (acione [CANCELAR] para sair)");

				if (nome.equalsIgnoreCase("Honda")) {
					Moto moto = new Honda();

					mostraDadosMoto(moto);
				} else if (nome.equalsIgnoreCase("YAMAHA")) {
					Moto moto = new YAMAHA();

					mostraDadosMoto(moto);
				}else if (nome.equalsIgnoreCase("Suzuki")){
					Moto moto = new Suzuki();
					
					mostraDadosMoto(moto);
				}

			} catch (Exception e) {
				break;
			}
		}
	}

	private static void mostraDadosMoto(Moto moto) {
		JOptionPane.showMessageDialog(null,
				"\nNome: " + moto.nome + "\nCilindrada: " + moto.cilindrada + "\nCor: " + moto.cor, "Dados da moto",
				JOptionPane.CLOSED_OPTION);
	}

}
