package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		double nota1, nota2, media;
		Scanner leitor = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0.0");
		System.out.println("Cálculo da média");
		System.out.print("Digite a nota 1: ");
		nota1 =leitor.nextDouble();
		System.out.print("Digite a nota 2: ");
		nota2 =leitor.nextDouble();
		media = (nota1 + nota2) /2;
		System.out.println("Média: " + formatador.format (media));
		if (media < 2) {
			System.out.println("REPROVADO");
		} else if (media >= 2 && media < 5) {
			System.out.println("RECUPERAÇÃO");
		} else {
			System.out.println("APROVADO");
		}
		leitor.close();
	}

}
