package uniandes.cupi2.pxxxx.interfaz.spec;

import co.edu.uniandes.cupi2.generador.anotaciones.interfaz.*;
import uniandes.cupi2.pxxxx.mundo.*;
import javax.swing.JOptionPane;


@UIFrame(alto=800, ancho=600, titulo = "Empleado")
public class InterfazEmpleado extends _InterfazEmpleado
{
	private PanelExtension panelExtensiones;
	
	private Empleado mundo_Empleado;
	
	

	public InterfazEmpleado()
	 {

	 }

	


    /**
     * Método para la extensión 1
     */
    public void reqFuncOpcion1( )
    {
        String resultado = mundo_Empleado.metodo1();
        JOptionPane.showMessageDialog( this, resultado, "Respuesta", JOptionPane.INFORMATION_MESSAGE );
    }

    /**
     * Método para la extensión 2
     */
    public void reqFuncOpcion2( )
    {
        String resultado = mundo_Empleado.metodo2();
        JOptionPane.showMessageDialog( this, resultado, "Respuesta", JOptionPane.INFORMATION_MESSAGE );
    }

    /**
     * Este método ejecuta la aplicación, creando una nueva interfaz
     * @param args
     */
    public static void main( String[] args )
    {

        InterfazEmpleado interfaz = new InterfazEmpleado( );
        interfaz.setVisible( true );
    }
}
