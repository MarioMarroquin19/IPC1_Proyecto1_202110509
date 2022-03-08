package proyecto.pkg1;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.event.ActionListener;



public class VerUsuarios1  extends JFrame implements ActionListener{
    
    private CrearUsuario1 formCarga;
    private TablaUsuarios fmTabla;
   
    JButton botonlogout;

    
    VerUsuarios1(){


        
        Object[][] data = AlmUsuarios.obtenerUsuarios();


        String[] columnNames = {"ID", "Nombre", "Apellido", "Usuario","Rol", "Password"};
        //DefaultTableModel modelo = new DefaultTableModel();
        JTable tabla = new JTable (data,columnNames);
        tabla.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tabla.setRowHeight(25);
        JScrollPane sp = new JScrollPane(tabla);

            
        
        botonlogout = new JButton();
        botonlogout.setLayout(null);
        botonlogout.setText("Regresar");
        botonlogout.setFocusable(false);
        botonlogout.addActionListener(this);
        botonlogout.setHorizontalAlignment(JButton.CENTER);
        botonlogout.setVerticalAlignment(JButton.CENTER);
        
       

        JPanel paneltabla = new JPanel();
        paneltabla.setBounds(10,10,870,315);
        paneltabla.setLayout(new BorderLayout());
        
       
      
        JPanel panelLogout = new JPanel();
        panelLogout.setBounds(380,330,90,20);
        panelLogout.setLayout(new BorderLayout());
        
        
        

        paneltabla.add(sp);
        panelLogout.add(botonlogout);
        
        
        
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //al cerrar la ventana finaliza la ejecución
        this.setResizable(false);//Indicamos que no se puede cambiar de tamaño la ventana
        this.setLayout(null); // Indicamos que no se use ningun Layout
        this.setTitle("VER USUARIOS");//titulo de la ventana
        this.setSize(900,400);//tamaño de la ventana
        this.setVisible(true);
        this.add(paneltabla);
        this.add(panelLogout);
        this.setLocationRelativeTo(null);
        
        
    }
    
    
    
    
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==botonlogout){ //condicional para detectar
            this.dispose(); //Se cierra la ventana de inicion y presenta otra ventana
            MenuAdmin Jframe = new MenuAdmin(); //nos lleva a la ventana de registro
            
        }
  

        
    }








}
