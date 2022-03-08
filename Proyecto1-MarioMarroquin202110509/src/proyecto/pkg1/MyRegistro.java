package proyecto.pkg1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MyRegistro extends JFrame implements ActionListener {
    static int num;
    static String Usuario1;
    JLabel labelusu, labelpass, labelIMG; //declaramos variables
    JButton botonAcep, botonCancel;
    JTextField textUsu, textPass;
    JPasswordField contra;


    
    
    MyRegistro(){
        
        labelusu = new JLabel();
        labelusu.setText("Usuario:");
        labelusu.setVerticalAlignment(JLabel.CENTER); //posocion vertical del label
        labelusu.setHorizontalAlignment(JLabel.LEFT);
        
        labelpass = new JLabel();
        labelpass.setText("Contraseña:");
        labelpass.setVerticalAlignment(JLabel.CENTER); //posocion vertical del label
        labelpass.setHorizontalAlignment(JLabel.LEFT);
        
        ImageIcon imgusu= new ImageIcon(new ImageIcon(getClass().getResource("imgs/usuario.png")).getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT));
        labelIMG = new JLabel(); //creamos un nuevo objeto tipo label
        labelIMG.setIcon(imgusu);//añadimos la imagen al objeto label
        labelIMG.setVerticalAlignment(JLabel.TOP); //posocion vertical del label
        labelIMG.setHorizontalAlignment(JLabel.LEFT); //posocion horizontal del label
        
        botonAcep = new JButton();
        botonAcep.setLayout(null);
        botonAcep.setText("Ingresar");
        botonAcep.setFocusable(false);
        botonAcep.addActionListener(this);
        botonAcep.setHorizontalAlignment(JButton.CENTER);
        botonAcep.setVerticalAlignment(JButton.CENTER);
        
        botonCancel = new JButton();
        botonCancel.setLayout(null);
        botonCancel.setText("Cancelar");
        botonCancel.setFocusable(false);
        botonCancel.addActionListener(this);
        botonCancel.setHorizontalAlignment(JButton.CENTER);
        botonCancel.setVerticalAlignment(JButton.CENTER);
        
        textUsu=new JTextField();
        
        
        contra = new JPasswordField();
       

        JPanel panelUsu = new JPanel();
        panelUsu.setBounds(20,100,80,25);
        panelUsu.setLayout(new BorderLayout());
        
        JPanel panelpass = new JPanel();
        panelpass.setBounds(20,150,80,25);
        panelpass.setLayout(new BorderLayout());
        
        JPanel panelImg = new JPanel();//Creamos un nuevo objeto de tipo panel
        panelImg.setBounds(210,10,90,90);//Añadimos las coordenadas y tamaño del panel
        panelImg.setLayout(new BorderLayout());//agregamos un borde al panel
        
        JPanel panelAcep = new JPanel();
        panelAcep.setBounds(120, 200, 90, 25);
        panelAcep.setLayout(new BorderLayout());
        
        JPanel panelCan = new JPanel();
        panelCan.setBounds(270, 200, 90, 25);
        panelCan.setLayout(new BorderLayout());
        
        JPanel panelUsua = new JPanel();
        panelUsua.setBounds(120,100,240,25);
        panelUsua.setLayout(new BorderLayout());
        
        JPanel panelContra = new JPanel ();
        panelContra.setBounds(120,150,240,25);
        panelContra.setLayout(new BorderLayout());
        
        
        panelUsu.add(labelusu);
        panelpass.add(labelpass);
        panelImg.add(labelIMG);
        panelAcep.add(botonAcep);
        panelCan.add(botonCancel);
        panelUsua.add(textUsu);
        panelContra.add(contra);
        
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLayout(null);
        this.setTitle("AUTENTICACIÓN");
        this.setSize(500,300);
        this.setVisible(true);
        this.add(panelImg);
        this.add(panelUsu);
        this.add(panelpass);
        this.add(panelAcep);
        this.add(panelCan);
        this.add(panelUsua);
        this.add(panelContra);
        this.setLocationRelativeTo(null);
        
        
    }


        
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource()==botonAcep){
            num=0;
            String usuario = textUsu.getText();
            String Contra = contra.getText();
            if (usuario.equals("admin") && Contra.equals("password")){
                num = 2;
                this.dispose(); 
                MenuAdmin frame = new MenuAdmin();
                //MenuUsuario Jframe = new MenuUsuario();
            }

            /*if (usuario.equals("admin") && !Contra.equals("password")){
                num = 2;
                JOptionPane.showMessageDialog(this, "<html><body>Credenciales inválidas, por <br> favor intente nuevamente.</body></html>", "ERROR", HEIGHT);
            }*/

            if(AlmUsuarios.Logueo(usuario, Contra)==-1){
                this.dispose();
                Usuario1 = usuario;
                MenuUsuario Jframe = new MenuUsuario();
            }

            if(AlmUsuarios.Logueo(usuario, Contra)!=-1 && !Contra.equals("password") && usuario.equals("admin")){
                num = 2;
                //this.dispose();
                JOptionPane.showMessageDialog(this, "<html><body>Credenciales inválidas, por <br> favor intente nuevamente.</body></html>", "ERROR", HEIGHT);
            }

            if(AlmUsuarios.Logueo(usuario, Contra)!=-1 && !usuario.equals("admin") && AlmUsuarios.VerUsuario(usuario)!=1){
                //this.dispose();
                JOptionPane.showMessageDialog(this, "<html><body>Credenciales inválidas, por <br> favor intente nuevamente.</body></html>", "ERROR", HEIGHT);
            }



            if(AlmUsuarios.VerUsuario(usuario)==1 && !usuario.equals("admin") ){
                //this.dispose();
                JOptionPane.showMessageDialog(this, "<html><body>El usuario no existe, por favor póngase en contacto <br> con el administrador del sistema para efectuar <br> su registro </body></html>", "ERROR", HEIGHT);
            }

           
         /*   
           if (CrearUsuario.VerificarLogueo(usuario, contrase)==-1){
                this.dispose(); 
                MenuUsuario Jframe = new MenuUsuario();
            }          
            //int pos = AlmUsuario.verificarLogueo(usuario, contrase);
            if (!usuario.equals("admin") && CrearUsuario.VerificarExistenciaLogueo(usuario)==0){
                num = 2;
                JOptionPane.showMessageDialog(this, "<html><body>El usuario no existe, por favor póngase en contacto <br> con el administrador del sistema para efectuar <br> su registro </body></html>", "ERROR", HEIGHT);
            }
           

/*
            if (usuario.equals("admin") && !contrase.equals("password")){
                JOptionPane.showMessageDialog(this, "<html><body>Credenciales inválidas, por <br> favor intente nuevamente.</body></html>", "ERROR", HEIGHT);
            }


            if(CrearUsuario.VerificarLogueo(usuario, contrase)==num){
                JOptionPane.showMessageDialog(this, "<html><body>Credenciales inválidas, por <br> favor intente nuevamente.</body></html>", "ERROR", HEIGHT);
            }
            
            
            
            if (CrearUsuario.VerificarLogueo2(usuario, contrase)==-1){
                this.dispose(); 
                MenuUsuario Jframe = new MenuUsuario();
            }     */ 


            
        }
        
        
        if(e.getSource()==botonCancel){ //condicional para detectar
            this.dispose(); //Se cierra la ventana de inicion y presenta otra ventana
            MiInicio Jframe = new MiInicio();
        }
    }




}
