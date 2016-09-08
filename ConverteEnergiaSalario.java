// Classe que faz os calculos de conversão de quilometros e litros

/**
* @author Manoel Henrique
*
*/

public class ConverteEnergiaSalario
{

	float salario,
		  reaisPorQwatt,
		  qwatt, valorPago;

	//Esse metodo irar receber um novo salario
	public void setSalario( float newSalario )
	{
		salario = newSalario;
	
	}

	//Esse metodo recebera um novo valor de quilowatts
	public void setQwatt ( float newQwatt )
	{
		qwatt = newQwatt;
	
	}

	//Esse metodo calculrá o valor de cada quilowatts em reais
	//E retornara esse valor obtido
	public float getQwattPorReais(  )
	{

		reaisPorQwatt = ( salario/700 );// Calculara quantos em reais vale um litro

		return reaisPorQwatt;

	}

	/*Esse metodo calculará o quanto sera pago pelo quantidade
	/de quilowatts consumido
	*/
	public float getValorPago(  )
	{
		
		valorPago = ( reaisPorQwatt * qwatt );// Irar calcular o quanto irar ser pagor

		return valorPago;
	}

	/*Nesse metodo ele ira retorna o valor a ser pago com 10%
	/ de desconto
	*/
	public float getValorPagoDes(  )
	{

		valorPago -= ( valorPago * 0.10 );// Calculara 10% do valor  

		return valorPago;
	}
}//Fim da classe 