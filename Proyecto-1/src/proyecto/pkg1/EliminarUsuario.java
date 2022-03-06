package proyecto.pkg1;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;


public class EliminarUsuario  extends JFrame implements ActionListener  {
    Label labelID;
    JLabel labelRol;
    JLabel labelUsuario;
    JLabel labelApellido;
    JLabel labelNombre;
    JLabel labelTitulo;
    JTextField textID, textNombre, textApellido, textUsuario,textRol;
    JButton botonEliminar, botonCancelar, botonBuscar;
    String seleccionado;   
    public String Buscar; 
    
    EliminarUsuario(){  
        
        labelTitulo = new JLabel();
        labelTitulo.setText("ELIMINAR USUARIO");
        labelTitulo.setVerticalAlignment(JLabel.CENTER);
        labelTitulo.setHorizontalAlignment(JLabel.LEFT);  
        
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
        
        textID = new JTextField();
        //textID.setEnabled(false);
        textNombre = new JTextField();
        textNombre.setEditable(false);
        textApellido = new JTextField();
        textApellido.setEditable(false);
        textUsuario = new JTextField();
        textUsuario.setEditable(false);
        textRol = new JTextField(); 
        textRol.setEditable(false);
        
        botonBuscar = new JButton();
        botonBuscar.setLayout(null);
        botonBuscar.setText("Buscar");
        botonBuscar.setFocusable(false);
        botonBuscar.addActionListener(this);
        botonBuscar.setHorizontalAlignment(JButton.CENTER);
        botonBuscar.setVerticalAlignment(JButton.CENTER); 
        
        botonEliminar = new JButton();
        botonEliminar.setLayout(null);
        botonEliminar.setText("Eliminar");
        botonEliminar.setFocusable(false);
        botonEliminar.addActionListener(this);
        botonEliminar.setHorizontalAlignment(JButton.CENTER);
        botonEliminar.setVerticalAlignment(JButton.CENTER); 
        
        botonCancelar = new JButton();
        botonCancelar.setLayout(null);
        botonCancelar.setText("Cancelar");
        botonCancelar.setFocusable(false);
        botonCancelar.addActionListener(this);
        botonCancelar.setHorizontalAlignment(JButton.CENTER);
        botonCancelar.setVerticalAlignment(JButton.CENTER);   
        
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
        
        JPanel campoRol = new JPanel ();
        textpanelRol.setBounds(155,250,155,20);
        textpanelRol.setLayout(new BorderLayout()); 
        
        JPanel botonCrear = new JPanel();
        botonCrear.setBounds(50, 300,90,20);
        botonCrear.setLayout(new BorderLayout());
        
        JPanel botonCancelarJ = new JPanel();
        botonCancelarJ.setBounds(180, 300,90,20);
        botonCancelarJ.setLayout(new BorderLayout());  
        
        panelTitulo.add(labelTitulo);
        panelID.add(botonBuscar);
        panelNombre.add(labelNombre);
        panelApellido.add(labelApellido);
        panelUsuario.add(labelUsuario);
        panelRol.add(labelRol);
        textpanelID.add(textID);
        textpanelNombre.add(textNombre);
        textpanelApellido.add(textApellido);        
        textpanelUsuario.add(textUsuario); 
        textpanelRol.add(textRol);
        botonCrear.add(botonEliminar);
        botonCancelarJ.add(botonCancelar);  
        
        //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //al cerrar la ventana finaliza la ejecución     
        this.setResizable(false);//Indicamos que no se puede cambiar de tamaño la ventana
        this.setLayout(null); // Indicamos que no se use ningun Layout
        this.setTitle("ELIMINAR USUARIO");//titulo de la ventana
        this.setSize(350,375);//tamaño de la ventana
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
        this.add(botonCrear);
        this.add(botonCancelarJ);
        this.setLocationRelativeTo(null);        
    }  
    @Override
    public void actionPerformed(ActionEvent e) {    
        
        if(e.getSource() == botonBuscar){
            
            this.Buscar = textID.getText();

            textNombre.setText(AlmUsuarios.MostrarNombre(Buscar));
            textApellido.setText(AlmUsuarios.MostrarApellido(Buscar));
            textUsuario.setText(AlmUsuarios.MostrarUsuario(Buscar));
            textRol.setText(AlmUsuarios.MostrarRol(Buscar));
           
        }

        if(e.getSource() == botonEliminar){ 
            AlmUsuarios.EliminarUsuarios(Buscar);

            JOptionPane.showMessageDialog(this, "<html><body>Usuario eliminado correctamente</body></html>", "Eliminar", HEIGHT);
            this.dispose();
            MenuAdmin JFrame = new MenuAdmin();
        }


        
        if(e.getSource() == botonCancelar){
            MenuAdmin JFrame = new MenuAdmin();
            this.dispose();

        }                       
    } 
}
