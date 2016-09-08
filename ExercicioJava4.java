// Esse programa calculara a quantidade de litros
// para pecorrer x quilometros

/**
* @author Manoel Henrique
*
*
*/

import java.util.Scanner;

public class ExercicioJava4{

	public static void main(String[] args) {
			
		Scanner input = new Scanner( System.in ); //criando objeto para receber entrada	

		int tempo; //Quanto tempo vai ser gasto 
		float velocidadeMedia, // A velocidade a media do carro
			  litrosCombustivel, // Os litros que seram nescessarios
			  distancia;	
		final float KMPORLITRO = 14; // Quilometro para consumir um litro (CONSTANTE)

		// Sera pedido dados para o programa
		System.out.println("Digite o tempo que levara em horas");
		tempo = input.nextInt();

		System.out.println("Digite a velocidade media do veiculo");
		velocidadeMedia = input.nextFloat();

		//Calculara a distancia e quanto de combustivel sera consumido
		distancia = tempo * velocidadeMedia;
		litrosCombustivel = distancia/KMPORLITRO;

		System.out.print("\nSerao consumido(s) "+litrosCombustivel+" litro(s) nessa viagem");

	}

}// fim da classe ExercicioJava4