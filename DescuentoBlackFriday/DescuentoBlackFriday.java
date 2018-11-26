import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DescuentoBlackFriday
{
	public DateTimeFormatter f;
	public LocalDate fecha;

	public DescuentoBlackFriday()
	{
		this.f = DateTimeFormatter.ofPattern("yyyy-dd-MM");
		this.fecha = LocalDate.now();
	}

	public double PrecioFinal(double precioOriginal)
	{
		double precio;

		if(precioOriginal < 0.00){
			//throw new ClassCastException("DescuentoBlackFriday.PrecioFinal");
			//---> Cambio el tipo de excepción
			throw new IllegalArgumentException("DescuentoBlackFriday.PrecioFinal");
		}	
		if(fecha.getMonthValue() == 11 && this.fecha.getDayOfMonth()==23){
			precio = precioOriginal*0.7;
		}else{
			precio = precioOriginal;
		}
		return precio;
	}
}
