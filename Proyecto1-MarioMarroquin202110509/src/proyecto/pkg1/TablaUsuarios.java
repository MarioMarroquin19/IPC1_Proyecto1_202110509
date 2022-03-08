package proyecto.pkg1;

import javax.swing.*;

/**
 *
 * @author marroquin
 */
public class TablaUsuarios  extends JFrame{
    private String[] columnas; //Columnas de la tabla, referencia 
   private String[][] datos; //Datos presentados en la tabla

   private JPanel plTabla; //Panel de tabla
   private JTable tbLecturas; //Objeto tabla
   private JScrollPane scpScroll;

   public TablaUsuarios(String[][] datos, String[] columnas) {
    this.columnas = columnas;
    this.datos = datos;


    
}
}
