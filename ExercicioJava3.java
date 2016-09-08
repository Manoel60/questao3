/*
* @utor 
* Manoel Henrique
* Versão 1.0
**/
//package exerciciojava3;

import java.util.Scanner;


public class ExercicioJava3{

	public static void main ( String args[]){

		Scanner leia = new Scanner( System.in );
		ConverteEnergiaSalario usuario = new ConverteEnergiaSalario();		

		float salario, quiloWatts;

		//O programa ira solicitar o salario e os quilowatts 
		System.out.print("Digite o salario atual :");
		salario = leia.nextFloat();
		System.out.print("Digite os quilowatts consumidos : ");
		quiloWatts = leia.nextFloat();

		//Os valores serão setados na classe para manipulação
		usuario.setSalario( salario );
		usuario.setQwatt( quiloWatts );

		System.out.printf("\n%s %.2f %s\n%s %.2f %s\n%s %.2f %s ",
						  "Os valores em reais em cada quilowatts : ",usuario.getQwattPorReais(),"w",
						  "O valor a ser pago :",usuario.getValorPago(),"R$",
						  "O valor a ser pago com 10% de desconto : ",usuario.getValorPagoDes(),"R$" );


	}//fim do metodo main


}//fim da classe ExercicioJava3