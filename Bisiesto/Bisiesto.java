public class Bisiesto
{
	//Consideramos los anyos negativos como anyos despues de cristo
	public boolean EsBisiesto(int anyo){
		if((anyo %4 == 0) && ((anyo %100 != 0) || (anyo %400 == 0))){
			return true;
		}else{
			return false;
		}
	}
}
