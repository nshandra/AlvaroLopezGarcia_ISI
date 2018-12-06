public class Embotelladora
{
	public int calculaBotellasPequenas(int pequenas,int grandes,int total)
	{
		int modulo;
		int max_grandes;
		int max_pequenas;

		if (pequenas < 0 || grandes < 0 || total < 0){
			return -1; // throw new ClassCastException("Embotelladora.calculaBotellasPequenas");
		}

		if(total == 0){
			return 0;
		}

		// modulo = total%5;
		// if(modulo == 0){
		// 	return 0;
		// }

		max_grandes = grandes*5;
		if((total-max_grandes) < 0){
			max_grandes = total;
		}

		max_pequenas = total - max_grandes;
		if((pequenas-max_pequenas) < 0){
			max_pequenas = -1;
		}
		return max_pequenas;
	}
}
