package proyecto.pkg1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.TableColumn;

import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author marroquin
 */
public class TablaBiblios  extends JFrame implements ActionListener{
    JLabel labelTexto;
    JButton botonlogout, botonPrestar;
    JTextField textbiblio;

    TablaBiblios(){

        

    String[] columnNames = {"Tipo", "Autor", "Titulo", "Descripción","Edición"
        ,"Temas","Frecuencia Actual", "Ejemplares","Área", "Copias", "Disponibles"};    
    
    String [][] data = AlmBiblios.BiblioInteres(MenuUsuario.buscarr());
    //AlmBiblios.BiblioInteres(MenuUsuario.buscarr());


    
    JTable tabla = new JTable(data, columnNames);
    tabla.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
    tabla.setRowHeight(25);
    JScrollPane sp = new JScrollPane(tabla);


    labelTexto = new JLabel();
    labelTexto.setText("Ingresa el titulo de la Bibliografia a prestar");
    labelTexto.setVerticalAlignment(JLabel.CENTER); //posocion vertical del label
    labelTexto.setHorizontalAlignment(JLabel.LEFT);

    botonPrestar = new JButton();
    botonPrestar.setLayout(null);
    botonPrestar.setText("Prestar");
    botonPrestar.setFocusable(false);
    botonPrestar.addActionListener(this);
    botonPrestar.setHorizontalAlignment(JButton.CENTER);
    botonPrestar.setVerticalAlignment(JButton.CENTER);

    textbiblio = new JTextField();


    botonlogout = new JButton();
    botonlogout.setLayout(null);
    botonlogout.setText("Atrás");
    botonlogout.setFocusable(false);
    botonlogout.addActionListener(this);
    botonlogout.setHorizontalAlignment(JButton.CENTER);
    botonlogout.setVerticalAlignment(JButton.CENTER);

    JPanel panelLogout = new JPanel();
    panelLogout.setBounds(780,260,80,25);
    panelLogout.setLayout(new BorderLayout()); 

    JPanel panelPrestar = new JPanel();
    panelPrestar.setBounds(5,260,80,25);
    panelPrestar.setLayout(new BorderLayout()); 

    JPanel panelTexto = new JPanel();
    panelTexto.setBounds(5,230,270,25);
    panelTexto.setLayout(new BorderLayout()); 

    JPanel textBiblio = new JPanel();
    textBiblio.setBounds(90,260,200,25);
    textBiblio.setLayout(new BorderLayout()); 



    JPanel panelTabla = new JPanel();
    panelTabla.setBounds(5,10,850,200);
    panelTabla.setLayout(new BorderLayout());

    panelTabla.add(sp);
    panelLogout.add(botonlogout);
    panelPrestar.add(botonPrestar);
    panelTexto.add(labelTexto);
    textBiblio.add(textbiblio);




    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //al cerrar la ventana finaliza la ejecución
    this.setResizable(false);//Indicamos que no se puede cambiar de tamaño la ventana
    this.setLayout(null); // Indicamos que no se use ningun Layout
    this.setTitle("BIBLIOGRAFIAS");//titulo de la ventana
    this.setSize(880,340);//tamaño de la ventana
    this.setVisible(true);
    this.add(panelTabla);
    this.add(panelLogout);
    this.add(panelPrestar);
    this.add(panelTexto);
    this.add(textBiblio);
    this.setLocationRelativeTo(null);
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==botonlogout){ //condicional para detectar
            this.dispose(); //Se cierra la ventana de inicion y presenta otra ventana
            MenuUsuario Jframe = new MenuUsuario(); //nos lleva a la ventana de registro
            
        }


        if(e.getSource() == botonPrestar){
            String text = textbiblio.getText();
            //AlmBiblios.Prestar(text);

            if(AlmBiblios.Prestar(text)==-1){
                JOptionPane.showMessageDialog(null, "Bibliografía prestada!", "Felicidades", JOptionPane.INFORMATION_MESSAGE);
                
                GuardarPrestamos nuevoPrestamo = new GuardarPrestamos(MyRegistro.Usuario1,text,AlmBiblios.MostrarTipo(text),HoraFecha());
                AlmPrestamos.ColocarPrestamo(nuevoPrestamo);
                this.dispose();
                MenuUsuario JFrame = new MenuUsuario();
            }else{
                JOptionPane.showMessageDialog(null, "No hay disponibilidad!", "ERROR", JOptionPane.INFORMATION_MESSAGE);
                //this.dispose();
                textbiblio.setText("");
            }

            
        }

    }

    public String HoraFecha(){
        String FechaHora = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(Calendar.getInstance().getTime());
        return FechaHora;
        
    }


}
