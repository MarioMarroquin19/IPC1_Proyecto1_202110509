package proyecto.pkg1;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.TableColumn;

import java.awt.event.ActionListener;


public class VerBibliografias  extends JFrame implements ActionListener {

    JButton botonCancelar;
    private GuardarBibliosMasiva formCarga;
    private TablaBiblios fmTabla;

    VerBibliografias(){

        //"Tipo",
    String[] columnNames = {"Tipo", "Autor", "Titulo", "Descripción","Edición"
        ,"Temas","Frecuencia Actual", "Ejemplares","Área", "Copias", "Disponibles"};
        
    String datos [][] = AlmBiblios.obtenerBiblios();

   
    JTable tabla = new JTable(datos, columnNames);
    tabla.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

    tabla.setRowHeight(25);

    JScrollPane sp = new JScrollPane(tabla);

    botonCancelar = new JButton();
    botonCancelar.setLayout(null);
    botonCancelar.setText("Atrás");
    botonCancelar.setFocusable(false);
    botonCancelar.addActionListener(this);
    botonCancelar.setHorizontalAlignment(JButton.CENTER);
    botonCancelar.setVerticalAlignment(JButton.CENTER); 


    JPanel panelTabla = new JPanel();
    panelTabla.setBounds(5,5,865,300);
    panelTabla.setLayout(new BorderLayout());

    JPanel botonCancelarJ = new JPanel();
    botonCancelarJ.setBounds(390, 320,90,20);
    botonCancelarJ.setLayout(new BorderLayout());



    panelTabla.add(sp);
    botonCancelarJ.add(botonCancelar);


    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //al cerrar la ventana finaliza la ejecución
    this.setResizable(false);//Indicamos que no se puede cambiar de tamaño la ventana
    this.setLayout(null); // Indicamos que no se use ningun Layout
    this.setTitle("VER BIBLIOGRAFIA");//titulo de la ventana
    this.setSize(900,400);//tamaño de la ventana
    this.setVisible(true);
    this.add(panelTabla);
    this.add(botonCancelarJ);
    this.setLocationRelativeTo(null);




    }


    @Override
    
    
    public void actionPerformed(ActionEvent e) {   
        if(e.getSource() == botonCancelar){
            this.dispose();
            MenuAdmin frame = new MenuAdmin();     
        }
        
    }
    

}
