package uniandes.cupi2.pxxxx.interfaz.spec;

import co.edu.uniandes.cupi2.generador.anotaciones.interfaz.*;
import uniandes.cupi2.pxxxx.mundo.*;
import javax.swing.JOptionPane;
import javax.swing.UIManager;


/**
 * Ventana principal de la aplicación.
 */
@UIFrame(alto=800, ancho=600, titulo = "Empleado")
public class InterfazEmpleado extends _InterfazEmpleado
{
	private Empleado mundo_Empleado;
	
	private PanelImagen panelImagen;
	
	private PanelExtension panelExtensiones;
	
	

	public InterfazEmpleado()
	 {

	 }

	



    // -----------------------------------------------------------------
    // Puntos de Extensión
    // -----------------------------------------------------------------


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



	// -----------------------------------------------------------------
    // Main
    // -----------------------------------------------------------------

    /**
     * Este método ejecuta la aplicación, creando una nueva interfaz.
     * @param pArgs Argumentos para la ejecución de la aplicación. En este caso no son necesarios.
     */
    public static void main( String[] pArgs )
    {
    	// Unifica la interfaz para Mac y para Windows.
    	try 
    	{
			UIManager.setLookAndFeel( UIManager.getCrossPlatformLookAndFeelClassName( ) );
		} 
    	catch (Exception e) 
    	{
			e.printStackTrace();
		}
    	
        InterfazEmpleado interfaz = new InterfazEmpleado( );
        interfaz.setVisible( true );
    }
}
