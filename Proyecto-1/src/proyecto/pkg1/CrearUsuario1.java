package proyecto.pkg1;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.util.HashSet;
import java.util.Set;

public class CrearUsuario1  extends JFrame implements ActionListener{
    
    JLabel labelID, labelNombre, labelApellido, labelUsuario, labelRol, labelContra, labelConfirmarContra, labelTitulo;
    JTextField textID, textNombre, textApellido, textUsuario, textRol;
    JPasswordField contra, confirmarContra;
    JButton botonAceptar, botonCancelar;
    JComboBox<String> combo1;
    String seleccionado;

    

    
    CrearUsuario1(){  
           
        labelTitulo = new JLabel();
        labelTitulo.setText("CREAR USUARIO");
        labelTitulo.setVerticalAlignment(JLabel.CENTER);
        labelTitulo.setHorizontalAlignment(JLabel.LEFT);   
        
        labelID = new JLabel();
        labelID.setText("ID");
        labelID.setVerticalAlignment(JLabel.CENTER);
        labelID.setHorizontalAlignment(JLabel.LEFT);     
        
        labelNombre = new JLabel();
        labelNombre.setText("Nombre");
        labelNombre.setVerticalAlignment(JLabel.CENTER);
        labelNombre.setHorizontalAlignment(JLabel.LEFT);    
        
        labelApellido = new JLabel();
        labelApellido.setText("Apellido");
        labelApellido.setVerticalAlignment(JLabel.CENTER);
        labelApellido.setHorizontalAlignment(JLabel.LEFT);   
        
        labelUsuario = new JLabel();
        labelUsuario.setText("Usuario");
        labelUsuario.setVerticalAlignment(JLabel.CENTER);
        labelUsuario.setHorizontalAlignment(JLabel.LEFT);  
        
        labelRol = new JLabel();
        labelRol.setText("Rol");
        labelRol.setVerticalAlignment(JLabel.CENTER);
        labelRol.setHorizontalAlignment(JLabel.LEFT);  
        
         String opciones []={" ","Estudiante", "Catedrático"};
        combo1=new JComboBox(opciones);
        combo1.addActionListener(this); 
        
        labelContra = new JLabel();
        labelContra.setText("Contraseña");
        labelContra.setVerticalAlignment(JLabel.CENTER);
        labelContra.setHorizontalAlignment(JLabel.LEFT);   
        
        labelConfirmarContra = new JLabel();
        labelConfirmarContra.setText("Confirmar contraseña");
        labelConfirmarContra.setVerticalAlignment(JLabel.CENTER);
        labelConfirmarContra.setHorizontalAlignment(JLabel.LEFT);  
        
        textID = new JTextField();
        textNombre = new JTextField();
        textApellido = new JTextField();
        textUsuario = new JTextField();
        textRol = new JTextField();  
        
        botonAceptar = new JButton();
        botonAceptar.setLayout(null);
        botonAceptar.setText("Crear");
        botonAceptar.setFocusable(false);
        botonAceptar.addActionListener(this);
        botonAceptar.setHorizontalAlignment(JButton.CENTER);
        botonAceptar.setVerticalAlignment(JButton.CENTER); 
        
        botonCancelar = new JButton();
        botonCancelar.setLayout(null);
        botonCancelar.setText("Cancelar");
        botonCancelar.setFocusable(false);
        botonCancelar.addActionListener(this);
        botonCancelar.setHorizontalAlignment(JButton.CENTER);
        botonCancelar.setVerticalAlignment(JButton.CENTER); 
        
        contra = new JPasswordField();
        confirmarContra = new JPasswordField(); 
        
        JPanel panelTitulo = new JPanel();
        panelTitulo.setBounds(110,10,150,20);
        panelTitulo.setLayout(new BorderLayout()); 
        
        JPanel panelID = new JPanel();
        panelID.setBounds(10,50,90,20);
        panelID.setLayout(new BorderLayout());
        
        JPanel panelNombre = new JPanel();
        panelNombre.setBounds(10,100,90,20);
        panelNombre.setLayout(new BorderLayout());
        
        JPanel panelApellido = new JPanel();
        panelApellido.setBounds(10,150,90,20);
        panelApellido.setLayout(new BorderLayout());
        
        JPanel panelUsuario = new JPanel();
        panelUsuario.setBounds(10,200,90,20);
        panelUsuario.setLayout(new BorderLayout());  
        
        JPanel panelRol = new JPanel();
        panelRol.setBounds(10,250,90,20);
        panelRol.setLayout(new BorderLayout());   
        
        JPanel panelContra = new JPanel();
        panelContra.setBounds(10,300,90,20);
        panelContra.setLayout(new BorderLayout());  
        
        JPanel panelConfirmarContra = new JPanel();
        panelConfirmarContra.setBounds(10,350,150,20);
        panelConfirmarContra.setLayout(new BorderLayout());  
        
        JPanel textpanelID = new JPanel();
        textpanelID.setBounds(155,50,155,20);
        textpanelID.setLayout(new BorderLayout());
        
        JPanel textpanelNombre = new JPanel();
        textpanelNombre.setBounds(155,100,155,20);
        textpanelNombre.setLayout(new BorderLayout()); 
        
        JPanel textpanelApellido = new JPanel();
        textpanelApellido.setBounds(155,150,155,20);
        textpanelApellido.setLayout(new BorderLayout()); 
        
        JPanel textpanelUsuario = new JPanel();
        textpanelUsuario.setBounds(155,200,155,20);
        textpanelUsuario.setLayout(new BorderLayout()); 
        
        JPanel textpanelRol = new JPanel();
        textpanelRol.setBounds(155,250,155,20);
        textpanelRol.setLayout(new BorderLayout());  
        
        JPanel textpanelContra = new JPanel();
        textpanelContra.setBounds(155,300,155,20);
        textpanelContra.setLayout(new BorderLayout());
        
        JPanel textpanelConfirmarContra = new JPanel();
        textpanelConfirmarContra.setBounds(155,350,155,20);
        textpanelConfirmarContra.setLayout(new BorderLayout());
        
        JPanel botonCrear = new JPanel();
        botonCrear.setBounds(50, 400,90,20);
        botonCrear.setLayout(new BorderLayout());
        
        JPanel botonCancelarJ = new JPanel();
        botonCancelarJ.setBounds(180, 400,90,20);
        botonCancelarJ.setLayout(new BorderLayout());
        
        panelTitulo.add(labelTitulo);
        panelID.add(labelID);
        panelNombre.add(labelNombre);
        panelApellido.add(labelApellido);
        panelUsuario.add(labelUsuario);
        panelRol.add(labelRol);
        panelContra.add(labelContra);
        panelConfirmarContra.add(labelConfirmarContra);
        textpanelID.add(textID);
        textpanelNombre.add(textNombre);
        textpanelApellido.add(textApellido);        
        textpanelUsuario.add(textUsuario);        
        textpanelRol.add(combo1);
        textpanelContra.add(contra);
        textpanelConfirmarContra.add(confirmarContra);     
        botonCrear.add(botonAceptar);
        botonCancelarJ.add(botonCancelar);   
        
        //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //al cerrar la ventana finaliza la ejecución
        this.setResizable(false);//Indicamos que no se puede cambiar de tamaño la ventana
        this.setLayout(null); // Indicamos que no se use ningun Layout
        this.setTitle("Crear Usuario");//titulo de la ventana
        this.setSize(350,475);//tamaño de la ventana
        this.setVisible(true);
        this.add(panelTitulo);
        this.add(panelID);
        this.add(panelNombre);
        this.add(panelApellido);
        this.add(panelUsuario);
        this.add(panelRol);
        this.add(panelContra);
        this.add(panelConfirmarContra);
        this.add(textpanelID);
        this.add(textpanelNombre);
        this.add(textpanelApellido);
        this.add(textpanelUsuario);
        this.add(textpanelRol);
        this.add(textpanelContra);
        this.add(textpanelConfirmarContra);
        this.add(botonCrear);
        this.add(botonCancelarJ);
        this.setLocationRelativeTo(null);
    }





    @Override
    
    
    public void actionPerformed(ActionEvent e) {   
        if(e.getSource()== combo1 ){
            seleccionado=(String)combo1.getSelectedItem();  
            

        }  


        if (e.getSource()==botonAceptar){
            String ID = textID.getText();
            String Nombre=textNombre.getText();
            String Apellido=textApellido.getText();
            String Usuario=textUsuario.getText();
            String Rol=(String) combo1.getSelectedItem();
            String Contra=contra.getText();
            String ConfirmarContra=confirmarContra.getText();

            if(!Contra.equals(ConfirmarContra)){
                JOptionPane.showMessageDialog(this, "<html><body>¡La contraseña y la<br>confirmación no coinciden!</body></html>", "INFO", HEIGHT);
                contra.setText("");
                confirmarContra.setText("");
            }else{

            if (AlmUsuarios.VerificarNuevoUsuario(ID, Usuario)==-1){
                JOptionPane.showMessageDialog(null, "Error, el usuario ya existe", "Error", JOptionPane.INFORMATION_MESSAGE);
                textID.setText("");
                textNombre.setText("");
                textApellido.setText("");
                textUsuario.setText("");
                contra.setText("");
                confirmarContra.setText("");
            }else{
                GuardarUsuarios nuevoUsuario = new GuardarUsuarios (ID, Nombre, Apellido, Usuario, Rol, Contra);
                AlmUsuarios.ColocarUsuarios(nuevoUsuario);
                JOptionPane.showMessageDialog(null, "Usuario creado exitosamente!", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                textID.setText("");
                textNombre.setText("");
                textApellido.setText("");
                textUsuario.setText("");
                contra.setText("");
                confirmarContra.setText("");
                this.dispose();
                MenuAdmin JFrame = new MenuAdmin();
            }
         }




        }
        
        if(e.getSource() == botonCancelar){
            this.setVisible(false);
            MenuAdmin frame = new MenuAdmin();     
        }
        
    }


  


}
