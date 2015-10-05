package uniandes.cupi2.pxxxx.interfaz.spec;

import co.edu.uniandes.cupi2.generador.anotaciones.interfaz.*;
import uniandes.cupi2.pxxxx.mundo.*;
import javax.swing.JOptionPane;


@UIFrame(alto=800, ancho=600, titulo = "Empleado")
public class InterfazEmpleado extends _InterfazEmpleado
{
	private Empleado mundo_Empleado;
	
	private PanelExtension panelExtensiones;
	
	

	public InterfazEmpleado()
	 {

	 }

	


    /**
     * Método para la extensión 1
     */
    public void reqFuncOpcion1( )
    {
        String resultado = Empleado.metodo1();
        JOptionPane.showMessageDialog( this, resultado, "Respuesta", JOptionPane.INFORMATION_MESSAGE );
    }

    /**
     * Método para la extensión 2
     */
    public void reqFuncOpcion2( )
    {
        String resultado = Empleado.metodo2();
        JOptionPane.showMessageDialog( this, resultado, "Respuesta", JOptionPane.INFORMATION_MESSAGE );
    }

}
