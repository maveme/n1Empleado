package uniandes.cupi2.pxxxx.mundo.spec;

import co.edu.uniandes.cupi2.generador.anotaciones.*;


@Mundo
public class Empleado extends _Empleado
{
	@Atributo(genGet=true, genSet=true)
	private String apellido;
	@Atributo(genGet=true, genSet=true)
	private String nombre;
	

	private Fecha fecha;
	
	

	public String darNombre2()
	{
	
	}
	
	public void cambiarNombre2(String nNombre, Boolean a)
	{
	
	}
	
	
}
