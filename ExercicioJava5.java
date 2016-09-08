//Programa que imprimira o desconto do INSS

/**
*
* @author Manoel Henrique
*
*/

import java.util.Scanner;

public class ExercicioJava5{

	public static void main(String[] args) {
		
		Scanner input = new Scanner( System.in );

		float salario;

		//Pedira a informação do salario
		System.out.print( "Digite o seu salario : " );
		salario = input.nextFloat();

		//Aqui sera decidido qual desconto sera usado
		if ( salario <= 600.00 )
		{
			System.out.print( "Isento\n" );
			System.out.print( salario );
		}else
			if ( salario <= 1200.00 )
			{
				System.out.print( "O desconto sera de 20%\n" );
				System.out.print( salario * 0.2 );		
			}else
				if ( salario <= 2000.00 )
				{
					System.out.print( "O desconto sera de 25%\n" );
					System.out.print( salario * 0.25 );
				}else {
					System.out.print( "O desconto sera de 30%\n" );
					System.out.print( salario * 0.3 );
				}//fim de else
	}
}// fim da classe ExercicioJava5 