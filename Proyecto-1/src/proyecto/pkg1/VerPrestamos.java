package proyecto.pkg1;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.TableColumn;
import java.awt.event.ActionListener;

public class VerPrestamos extends JFrame implements ActionListener {
    
    private TablaBiblios formCarga;
    private TablaBiblios fmTabla;
    JLabel labelinfo;
    JButton botonlogout,botonDevolver;
    JTextField text;

    VerPrestamos (){


    Object [][] data = AlmPrestamos.obtenerPrestamos(MyRegistro.Usuario1);
    String [] columnas = {"Titulo","Tipo","Fecha y Hora"};

    JTable tabla = new JTable (data,columnas);
        tabla.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tabla.setRowHeight(25);
        tabla.getColumnModel().getColumn(0).setPreferredWidth(200);
        tabla.getColumnModel().getColumn(1).setPreferredWidth(70);
        tabla.getColumnModel().getColumn(2).setPreferredWidth(150);
        JScrollPane sp = new JScrollPane(tabla);


        labelinfo = new JLabel();
        labelinfo.setText("Ingresa el titulo de la Bibliografia a devolver");
        labelinfo.setVerticalAlignment(JLabel.CENTER); //posocion vertical del label
        labelinfo.setHorizontalAlignment(JLabel.LEFT);
        

        botonlogout = new JButton();
        botonlogout.setLayout(null);
        botonlogout.setText("Regresar");
        botonlogout.setFocusable(false);
        botonlogout.addActionListener(this);
        botonlogout.setHorizontalAlignment(JButton.CENTER);
        botonlogout.setVerticalAlignment(JButton.CENTER);
        
        botonDevolver = new JButton();
        botonDevolver.setLayout(null);
        botonDevolver.setText("Devolver");
        botonDevolver.setFocusable(false);
        botonDevolver.addActionListener(this);
        botonDevolver.setHorizontalAlignment(JButton.CENTER);
        botonDevolver.setVerticalAlignment(JButton.CENTER);
       
        text = new JTextField();

        JPanel paneltabla = new JPanel();
        paneltabla.setBounds(10,10,440,220);
        paneltabla.setLayout(new BorderLayout());
        
       JPanel info =  new JPanel();
       info.setBounds(5,250,300,25);
       info.setLayout(new BorderLayout());

       JPanel Devolver =  new JPanel();
       Devolver.setBounds(5,275,90,20);
       Devolver.setLayout(new BorderLayout());

      
        JPanel panelLogout = new JPanel();
        panelLogout.setBounds(350,275,100,20);
        panelLogout.setLayout(new BorderLayout());

        JPanel Texto = new JPanel();
        Texto.setBounds(105,275,150,20);
        Texto.setLayout(new BorderLayout());
        
        
        

        paneltabla.add(sp);
        panelLogout.add(botonlogout);
        info.add(labelinfo);
        Devolver.add(botonDevolver);
        Texto.add(text);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //al cerrar la ventana finaliza la ejecución
        this.setResizable(false);//Indicamos que no se puede cambiar de tamaño la ventana
        this.setLayout(null); // Indicamos que no se use ningun Layout
        this.setTitle("PRESTAMOS");//titulo de la ventana
        this.setSize(470,350);//tamaño de la ventana
        this.setVisible(true);
        this.add(paneltabla);
        this.add(panelLogout);
        this.add(info);
        this.add(Devolver);
        this.add(Texto);
        this.setLocationRelativeTo(null);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==botonlogout){ //condicional para detectar
            this.dispose(); //Se cierra la ventana de inicion y presenta otra ventana
            MenuUsuario JFrame = new MenuUsuario();
        }

        if(e.getSource() == botonDevolver){
            String volver = text.getText();
            if(AlmBiblios.Devolver(volver)==-1){
                AlmPrestamos.EliminarPrestamo(volver,MyRegistro.Usuario1);
                JOptionPane.showMessageDialog(null, "La bibliografía ha sido devuelta!", "Felicidades", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
                MenuUsuario JFrame = new MenuUsuario();
            }
        }
  
    }

        

}
