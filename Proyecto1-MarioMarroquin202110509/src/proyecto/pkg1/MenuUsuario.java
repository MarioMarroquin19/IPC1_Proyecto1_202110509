package proyecto.pkg1;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.TableColumn;

import java.awt.event.ActionListener;



public class MenuUsuario  extends JFrame implements ActionListener{

    JLabel labelLogo, labelUsuA,textoInfo;
    JButton botonlogout, botonPrestamos,botonBuscar;
    static JTextField textBuscar;
     String buscar;

    
    
    
    MenuUsuario(){

 
        
        ImageIcon logo= new ImageIcon(new ImageIcon(getClass().getResource("imgs/logoInge.png")).getImage().getScaledInstance(400, 200, Image.SCALE_DEFAULT));
        labelLogo = new JLabel();
        labelLogo.setIcon(logo);
        labelLogo.setVerticalAlignment(JLabel.CENTER);
        labelLogo.setHorizontalAlignment(JLabel.CENTER);
        
        ImageIcon imgusu= new ImageIcon(new ImageIcon(getClass().getResource("imgs/usuario.png")).getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT));
        labelUsuA = new JLabel(); 
        labelUsuA.setIcon(imgusu);
        labelUsuA.setVerticalAlignment(JLabel.CENTER); 
        labelUsuA.setHorizontalAlignment(JLabel.CENTER);
        
        textoInfo = new JLabel();
        textoInfo.setText("Busca bibliografias ingresando temas de tu interés!");
        textoInfo.setVerticalAlignment(JLabel.CENTER); //posocion vertical del label
        textoInfo.setHorizontalAlignment(JLabel.LEFT);
        
        botonlogout = new JButton();
        botonlogout.setLayout(null);
        botonlogout.setText("Logout");
        botonlogout.setFocusable(false);
        botonlogout.addActionListener(this);
        botonlogout.setHorizontalAlignment(JButton.CENTER);
        botonlogout.setVerticalAlignment(JButton.CENTER);
        
        botonPrestamos = new JButton();
        botonPrestamos.setLayout(null);
        botonPrestamos.setText("Ver Prestamos");
        botonPrestamos.setFocusable(false);
        botonPrestamos.addActionListener(this);
        botonPrestamos.setHorizontalAlignment(JButton.CENTER);
        botonPrestamos.setVerticalAlignment(JButton.CENTER);
        
        botonBuscar = new JButton();
        botonBuscar.setLayout(null);
        botonBuscar.setText("Buscar");
        botonBuscar.setFocusable(false);
        botonBuscar.addActionListener(this);
        botonBuscar.setHorizontalAlignment(JButton.CENTER);
        botonBuscar.setVerticalAlignment(JButton.CENTER);

        textBuscar=new JTextField();
        
        
        JPanel panellogo = new JPanel();
        panellogo.setBounds(0,0,400,200);
        panellogo.setLayout(new BorderLayout());
        
        JPanel panelUsuA = new JPanel();
        panelUsuA.setBounds(470,25,70,70);
        panelUsuA.setLayout(new BorderLayout()); 
        
        JPanel panelLogout = new JPanel();
        panelLogout.setBounds(580,45,80,25);
        panelLogout.setLayout(new BorderLayout()); 
        
        JPanel panelBuscar = new JPanel();
        panelBuscar.setBounds(10,240,80,20);
        panelBuscar.setLayout(new BorderLayout());
        
        JPanel panelPrestamos = new JPanel();
        panelPrestamos.setBounds(490,220,130,20);
        panelPrestamos.setLayout(new BorderLayout());

        JPanel textpanelBuscar = new JPanel();
        textpanelBuscar.setBounds(100,240,180,20);
        textpanelBuscar.setLayout(new BorderLayout());
 
        JPanel textInfo = new JPanel();
        textInfo.setBounds(5,205,320,25);
        textInfo.setLayout(new BorderLayout());
        

        panellogo.add(labelLogo);
        panelUsuA.add(labelUsuA);
        panelLogout.add(botonlogout);
        panelBuscar.add(botonBuscar);
        panelPrestamos.add(botonPrestamos);
        textpanelBuscar.add(textBuscar);
        textInfo.add(textoInfo);

        

        
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //al cerrar la ventana finaliza la ejecución
        this.setResizable(false);//Indicamos que no se puede cambiar de tamaño la ventana
        this.setLayout(null); // Indicamos que no se use ningun Layout
        this.setTitle("USUARIO NORMAL");//titulo de la ventana
        this.setSize(690,320);//tamaño de la ventana
        this.setVisible(true);
        this.add(panellogo);
        this.add(panelUsuA);
        this.add(panelLogout);
        this.add(panelBuscar);
        this.add(panelPrestamos);
        this.add(textpanelBuscar);
        this.add(textInfo);
        //this.add(panelTabla);
        this.setLocationRelativeTo(null);
        
        
    }
    
    
    
    
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == botonBuscar){
            this.dispose();
            String biblio= textBuscar.getText();
            buscarr();

            TablaBiblios JFrame = new TablaBiblios();

        }

        if(e.getSource() == botonPrestamos){
            this.dispose();
            VerPrestamos JFrame = new VerPrestamos(); 
        }










        if(e.getSource()==botonlogout){ //condicional para detectar
            this.dispose(); //Se cierra la ventana de inicion y presenta otra ventana
            MiInicio frame = new MiInicio(); //nos lleva a la ventana de registro
            
        }
    }

    public static String buscarr(){
        String buscar = textBuscar.getText();
        return buscar;
    }







}
