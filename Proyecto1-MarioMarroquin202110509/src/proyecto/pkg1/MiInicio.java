package proyecto.pkg1;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.event.ActionListener;

public class MiInicio extends JFrame implements ActionListener {

    JLabel label, label1, label2, label3, label4, label5; //declaramos variables
    JButton botonlogin, botonAbout;
    
    MiInicio(){
        
        //añadimos las respectivas imagenes
        ImageIcon imgusu= new ImageIcon(new ImageIcon(getClass().getResource("imgs/usuario.png")).getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT));
        label = new JLabel(); //creamos un nuevo objeto tipo label
        label.setIcon(imgusu);//añadimos la imagen al objeto label
        label.setVerticalAlignment(JLabel.TOP); //posocion vertical del label
        label.setHorizontalAlignment(JLabel.LEFT); //posocion horizontal del label
        

        ImageIcon logo= new ImageIcon(new ImageIcon(getClass().getResource("imgs/logoInge.png")).getImage().getScaledInstance(500, 225, Image.SCALE_DEFAULT));
        label1 = new JLabel();
        label1.setIcon(logo);
        label1.setVerticalAlignment(JLabel.CENTER);
        label1.setHorizontalAlignment(JLabel.CENTER);

        //añadimos el texto
        label2 = new JLabel();
        label2.setText("<html><body><b>VISIÓN</b></body></html>"); //Agregamos el texto
        label2.setVerticalAlignment(JLabel.CENTER); //posocion vertical del label
        label2.setHorizontalAlignment(JLabel.CENTER);//posocion horizontal del label


        label3 = new JLabel();
        String vision = "<html><body>Contribuir a elevar la excelencia académica de la Facultad<br>de Ingeniería, generando una cultura de información en la<br>búsqueda de nuevos conocimientos mediante la<br>implementación de sistemas innovadores y de nuevas<br>tecnologías en la prestación de servicios, ampliando<br>la proyección de las especialidades de acuerdo con<br>las exigencias de este mundo globalizado, participando<br>con implementación de sistemas de redes virtuales<br>que lo conectan con el ciberespacio universal.</body></html> ";
        label3.setText(vision);
        label3.setVerticalAlignment(JLabel.TOP);
        label3.setHorizontalAlignment(JLabel.LEFT);

        // creamos un objeto de tipo boton
        botonlogin = new JButton(); // Creamos el objeto 
        botonlogin.setLayout(null); // Indicamos que no se use ningun Layout 
        botonlogin.setText("INGRESAR"); // Agregamos texto al botón
        botonlogin.setFocusable(false); //Indicamos que no tome posicion para el texto
        botonlogin.addActionListener(this); //Pones en funcionamiento el boton
        botonlogin.setHorizontalAlignment(JButton.CENTER); //Posicion horizontal del botón
        botonlogin.setVerticalAlignment(JButton.CENTER);//Posicion vertical del botón


        botonAbout = new JButton();
        botonAbout.setLayout(null);
        botonAbout.setText("About");
        botonAbout.setFocusable(false);
        botonAbout.addActionListener(this);
        botonAbout.setHorizontalAlignment(JButton.CENTER);
        botonAbout.setVerticalAlignment(JButton.CENTER);


        
        JPanel panel = new JPanel();//Creamos un nuevo objeto de tipo panel
        panel.setBounds(10,0,90,90);//Añadimos las coordenadas y tamaño del panel
        panel.setLayout(new BorderLayout());//agregamos un borde al panel


        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.red);
        panel1.setBounds(650,10,95,25);
        panel1.setLayout(new BorderLayout());
        

        JPanel panel2 = new JPanel();
        panel2.setBounds(0,125,500,225);
        panel2.setLayout(new BorderLayout());


        JPanel panel3 = new JPanel();
        panel3.setBounds(630,125,80,20);
        panel3.setLayout(new BorderLayout());


        JPanel panel4 = new JPanel();
        panel4.setBounds(500,145,350,255);
        panel4.setLayout(new BorderLayout());

        
        JPanel panel5 = new JPanel();
        panel5.setBounds(30,375,75,25);
        panel5.setLayout(new BorderLayout());

        
        
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //al cerrar la ventana finaliza la ejecución
        this.setResizable(false);//Indicamos que no se puede cambiar de tamaño la ventana
        this.setLayout(null); // Indicamos que no se use ningun Layout
        this.setTitle("BIBLIOTECA FACULTAD DE INGENIERIA USAC");//titulo de la ventana
        this.setSize(900,480);//tamaño de la ventana
        this.setVisible(true);//Activamos la visibilidad de la ventana
        panel.add(label); //añadimos objetos al panel
        panel1.add(botonlogin);
        panel2.add(label1);
        panel3.add(label2);
        panel4.add(label3);
        panel5.add(botonAbout);
        this.add(panel); //añadimos los paneles a la ventana
        this.add(panel1);
        this.add(panel2);
        this.add(panel3);
        this.add(panel4);
        this.add(panel5);
        this.setLocationRelativeTo(null);
        
    }

    
    
    
    
    
    
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) { //Detectar click sobre el boton
        if(e.getSource()==botonlogin){ //condicional para detectar
            this.dispose();
            //this.dispose(); //Se cierra la ventana de inicion y presenta otra ventana
            //MyRegistro frame = new MyRegistro(); //nos lleva a la ventana de registro
            //JOptionPane.showMessageDialog(this, "Error, el usuario ya existe", "si", HEIGHT);
            MyRegistro frame = new MyRegistro();
        }
        
        if(e.getSource() == botonAbout){ 
            JOptionPane.showMessageDialog(this, "<html><body>Proyecto1 1S 2022 -202110509- <br>Mario Ernesto Marroquín Pérez</body></html>", "INFO", HEIGHT);
            //About frame = new About(); //muestra la ventana de About
        }
        
    }
    
    
    
    
}




















