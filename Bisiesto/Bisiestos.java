public class Bisiestos
{
	//Consideramos los anyos negativos como anyos despues de cristo
	//---> He cambiado EsBisiesto por esBisiesto
	public boolean esBisiesto(int anyo){
		//---> Añadida gestión de números negativos
		if(anyo < 0) throw new IllegalArgumentException();

		if((anyo %4 == 0) && ((anyo %100 != 0) || (anyo %400 == 0))){
			return true;
		}else{
			return false;
		}
	}
}
