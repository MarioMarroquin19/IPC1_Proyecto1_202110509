package proyecto.pkg1;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.event.ActionListener;



public class MenuAdmin  extends JFrame implements ActionListener{
    public String arg_usuario [] = new String [100]; 
    public String arg_bibliografia [] = new String [100];

    
    JLabel labelLogo, labelUsuA, labelReportes, labelBibliografia, labelUsuarios1;
    JButton botonlogout, botonUsuario,botonBibliografias,botonPrestamos,botonCrear,botonVer,botonModificar;
    JButton botonEliminar, botonCrear1,botonVer1,botonModificar1, botonEliminar1;
    
    MenuAdmin(){


        
        ImageIcon logo= new ImageIcon(new ImageIcon(getClass().getResource("imgs/logoInge.png")).getImage().getScaledInstance(450, 180, Image.SCALE_DEFAULT));
        labelLogo = new JLabel();
        labelLogo.setIcon(logo);
        labelLogo.setVerticalAlignment(JLabel.CENTER);
        labelLogo.setHorizontalAlignment(JLabel.CENTER);
        
        labelReportes = new JLabel();
        labelReportes.setText("Reportes");
        labelReportes.setVerticalAlignment(JLabel.CENTER);
        labelReportes.setHorizontalAlignment(JLabel.LEFT);
        
        labelBibliografia = new JLabel();
        labelBibliografia.setText("Bibliografía");
        labelBibliografia.setVerticalAlignment(JLabel.CENTER);
        labelBibliografia.setHorizontalAlignment(JLabel.LEFT);
        
        labelUsuarios1 = new JLabel();
        labelUsuarios1.setText("Usuarios");
        labelUsuarios1.setVerticalAlignment(JLabel.CENTER);
        labelUsuarios1.setHorizontalAlignment(JLabel.LEFT);
        
        
        ImageIcon imgusu= new ImageIcon(new ImageIcon(getClass().getResource("imgs/usuario.png")).getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT));
        labelUsuA = new JLabel(); 
        labelUsuA.setIcon(imgusu);
        labelUsuA.setVerticalAlignment(JLabel.CENTER); 
        labelUsuA.setHorizontalAlignment(JLabel.CENTER); 
        
        botonlogout = new JButton();
        botonlogout.setLayout(null);
        botonlogout.setText("Logout");
        botonlogout.setFocusable(false);
        botonlogout.addActionListener(this);
        botonlogout.setHorizontalAlignment(JButton.CENTER);
        botonlogout.setVerticalAlignment(JButton.CENTER);
        
        botonUsuario = new JButton();
        botonUsuario.setLayout(null);
        botonUsuario.setText("Usuarios");
        botonUsuario.setFocusable(false);
        botonUsuario.addActionListener(this);
        botonUsuario.setHorizontalAlignment(JButton.CENTER);
        botonUsuario.setVerticalAlignment(JButton.CENTER);
        
        botonBibliografias = new JButton();
        botonBibliografias.setLayout(null);
        botonBibliografias.setText("Bibliografías");
        botonBibliografias.setFocusable(false);
        botonBibliografias.addActionListener(this);
        botonBibliografias.setHorizontalAlignment(JButton.CENTER);
        botonBibliografias.setVerticalAlignment(JButton.CENTER);
        
        botonPrestamos = new JButton();
        botonPrestamos.setLayout(null);
        botonPrestamos.setText("Préstamos");
        botonPrestamos.setFocusable(false);
        botonPrestamos.addActionListener(this);
        botonPrestamos.setHorizontalAlignment(JButton.CENTER);
        botonPrestamos.setVerticalAlignment(JButton.CENTER);
        
        
        botonCrear = new JButton();
        botonCrear.setLayout(null);
        botonCrear.setText("Crear");
        botonCrear.setFocusable(false);
        botonCrear.addActionListener(this);
        botonCrear.setHorizontalAlignment(JButton.CENTER);
        botonCrear.setVerticalAlignment(JButton.CENTER);
        
        
        botonVer = new JButton();
        botonVer.setLayout(null);
        botonVer.setText("Ver");
        botonVer.setFocusable(false);
        botonVer.addActionListener(this);
        botonVer.setHorizontalAlignment(JButton.CENTER);
        botonVer.setVerticalAlignment(JButton.CENTER);
        
        
        botonModificar = new JButton();
        botonModificar.setLayout(null);
        botonModificar.setText("Modificar");
        botonModificar.setFocusable(false);
        botonModificar.addActionListener(this);
        botonModificar.setHorizontalAlignment(JButton.CENTER);
        botonModificar.setVerticalAlignment(JButton.CENTER);
        
         
        botonEliminar = new JButton();
        botonEliminar.setLayout(null);
        botonEliminar.setText("Eliminar");
        botonEliminar.setFocusable(false);
        botonEliminar.addActionListener(this);
        botonEliminar.setHorizontalAlignment(JButton.CENTER);
        botonEliminar.setVerticalAlignment(JButton.CENTER);
        
        
                botonCrear1 = new JButton();
        botonCrear1.setLayout(null);
        botonCrear1.setText("Crear");
        botonCrear1.setFocusable(false);
        botonCrear1.addActionListener(this);
        botonCrear1.setHorizontalAlignment(JButton.CENTER);
        botonCrear1.setVerticalAlignment(JButton.CENTER);
        
        
        botonVer1 = new JButton();
        botonVer1.setLayout(null);
        botonVer1.setText("Ver");
        botonVer1.setFocusable(false);
        botonVer1.addActionListener(this);
        botonVer1.setHorizontalAlignment(JButton.CENTER);
        botonVer1.setVerticalAlignment(JButton.CENTER);
        
        
        botonModificar1 = new JButton();
        botonModificar1.setLayout(null);
        botonModificar1.setText("Modificar");
        botonModificar1.setFocusable(false);
        botonModificar1.addActionListener(this);
        botonModificar1.setHorizontalAlignment(JButton.CENTER);
        botonModificar1.setVerticalAlignment(JButton.CENTER);
        
         
        botonEliminar1 = new JButton();
        botonEliminar1.setLayout(null);
        botonEliminar1.setText("Eliminar");
        botonEliminar1.setFocusable(false);
        botonEliminar1.addActionListener(this);
        botonEliminar1.setHorizontalAlignment(JButton.CENTER);
        botonEliminar1.setVerticalAlignment(JButton.CENTER);
        
        
        
        
        
        JPanel panellogo = new JPanel();
        panellogo.setBounds(10,23,450,180);
        panellogo.setLayout(new BorderLayout());
        
        JPanel panelUsuA = new JPanel();
        panelUsuA.setBounds(500,25,70,70);
        panelUsuA.setLayout(new BorderLayout()); 
        
        JPanel panelLogout = new JPanel();
        panelLogout.setBounds(750,35,80,25);
        panelLogout.setLayout(new BorderLayout()); 
        
        JPanel panelReportes = new JPanel();
        panelReportes.setBounds(500,120,60,20);
        panelReportes.setLayout(new BorderLayout());
        
        JPanel panelUsuarios = new JPanel();
        panelUsuarios.setBounds(500,140,90,20);
        panelUsuarios.setLayout(new BorderLayout());
        
        JPanel panelBibliografia = new JPanel();
        panelBibliografia.setBounds(600,140,120,20);
        panelBibliografia.setLayout(new BorderLayout());
        
        JPanel panelPrestamos = new JPanel();
        panelPrestamos.setBounds(730,140,100,20);
        panelPrestamos.setLayout(new BorderLayout());
        
        
        JPanel panelBibliografiaTexto = new JPanel();
        panelBibliografiaTexto.setBounds(500,200,90,20);
        panelBibliografiaTexto.setLayout(new BorderLayout());
        
        
        JPanel panelCrear = new JPanel();
        panelCrear.setBounds(500,240,90,20);
        panelCrear.setLayout(new BorderLayout());
        
        JPanel panelVer = new JPanel();
        panelVer.setBounds(730,240,90,20);
        panelVer.setLayout(new BorderLayout());
        
        JPanel panelModificar = new JPanel();
        panelModificar.setBounds(500,300,90,20);
        panelModificar.setLayout(new BorderLayout());
        
      
        JPanel panelEliminar = new JPanel();
        panelEliminar.setBounds(730,300,90,20);
        panelEliminar.setLayout(new BorderLayout());
        
        
        
        JPanel panelUsuariosTexto = new JPanel();
        panelUsuariosTexto.setBounds(50,200,90,20);
        panelUsuariosTexto.setLayout(new BorderLayout());
        
        
        JPanel panelCrear1 = new JPanel();
        panelCrear1.setBounds(50,240,90,20);
        panelCrear1.setLayout(new BorderLayout());
        
        JPanel panelVer1 = new JPanel();
        panelVer1.setBounds(280,240,90,20);
        panelVer1.setLayout(new BorderLayout());
        
        JPanel panelModificar1 = new JPanel();
        panelModificar1.setBounds(50,300,90,20);
        panelModificar1.setLayout(new BorderLayout());
        
      
        JPanel panelEliminar1 = new JPanel();
        panelEliminar1.setBounds(280,300,90,20);
        panelEliminar1.setLayout(new BorderLayout());
        
        
        

        panellogo.add(labelLogo);
        panelUsuA.add(labelUsuA);
        panelLogout.add(botonlogout);
        
        panelReportes.add(labelReportes);
        panelUsuarios.add(botonUsuario);
        panelBibliografia.add(botonBibliografias);
        panelPrestamos.add(botonPrestamos);
        
        panelBibliografiaTexto.add(labelBibliografia);
        panelCrear.add(botonCrear);
        panelVer.add(botonVer);
        panelModificar.add(botonModificar);
        panelEliminar.add(botonEliminar);
        
        
        panelUsuariosTexto.add(labelUsuarios1);
        panelCrear1.add(botonCrear1);
        panelVer1.add(botonVer1);
        panelModificar1.add(botonModificar1);
        panelEliminar1.add(botonEliminar1);
        
        
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //al cerrar la ventana finaliza la ejecución
        this.setResizable(false);//Indicamos que no se puede cambiar de tamaño la ventana
        this.setLayout(null); // Indicamos que no se use ningun Layout
        this.setTitle("ADMINISTRADOR");//titulo de la ventana
        this.setSize(900,400);//tamaño de la ventana
        this.setVisible(true);
        this.add(panellogo);
        this.add(panelUsuA);
        this.add(panelLogout);
        this.add(panelReportes);
        this.add(panelUsuarios);
        this.add(panelBibliografia);
        this.add(panelPrestamos);
        this.add(panelBibliografiaTexto);
        this.add(panelCrear);
        this.add(panelVer);
        this.add(panelModificar);
        this.add(panelEliminar);
        this.add(panelUsuariosTexto);
        this.add(panelCrear1);
        this.add(panelVer1);
        this.add(panelModificar1);
        this.add(panelEliminar1);
        this.setLocationRelativeTo(null);
        
        
    }
    
    
    
    
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==botonlogout){ //condicional para detectar
            this.dispose(); //Se cierra la ventana de inicion y presenta otra ventana
            MiInicio frame = new MiInicio(); //nos lleva a la ventana de registro
        }

        if(e.getSource() == botonUsuario){
            this.dispose();
            VerReporteUsuario JFrame = new VerReporteUsuario();

        }

        if(e.getSource() == botonBibliografias){
            this.dispose();
            VerReporteBiblios JFrame = new VerReporteBiblios();
        }

        if(e.getSource() == botonPrestamos){
            this.dispose();
            VerReportePrestamos JFrame = new VerReportePrestamos();
        }


        if (e.getSource()==botonCrear1){
            this.dispose();
            CrearUsuario1 JFrame = new CrearUsuario1();
            //CrearUsuario frame = new CrearUsuario();
            

            
        }
        
        if(e.getSource ()== botonModificar1){
            this.dispose();
            ModificarUsuario1 frame = new ModificarUsuario1();
        }
        
        if(e.getSource () == botonEliminar1){
            this.dispose();
            EliminarUsuario frame = new EliminarUsuario();
        }

        if(e.getSource () == botonVer1){
            this.dispose();
            VerUsuarios1 frame = new VerUsuarios1();
        }

        //BIBLIOGRAFIAS
        if (e.getSource()==botonCrear){
            this.dispose();
            CrearBiblio frame = new CrearBiblio();
            
        }
        
        if(e.getSource ()== botonModificar){
            this.dispose();
            ModificarBiblio frame = new ModificarBiblio();
        }
        
        if(e.getSource () == botonEliminar){
            this.dispose();
            EliminarBiblio frame = new EliminarBiblio();
        }

        if(e.getSource () == botonVer){
            this.dispose();
            VerBibliografias frame = new VerBibliografias();
        }

        

        
    }







}
