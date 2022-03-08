package proyecto.pkg1;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CrearBiblio extends JFrame implements ActionListener{
    JLabel labelTipo; //declaramos variables
    JButton botonMasiva, botonIndividual, botonAtras;

    
    CrearBiblio(){

        labelTipo = new JLabel();
        labelTipo.setText("Seleccione tipo de Carga:");
        labelTipo.setVerticalAlignment(JLabel.CENTER); //posocion vertical del label
        labelTipo.setHorizontalAlignment(JLabel.LEFT);
        
      
        botonMasiva = new JButton();
        botonMasiva.setLayout(null);
        botonMasiva.setText("Masiva");
        botonMasiva.setFocusable(false);
        botonMasiva.addActionListener(this);
        botonMasiva.setHorizontalAlignment(JButton.CENTER);
        botonMasiva.setVerticalAlignment(JButton.CENTER);
        
        botonIndividual = new JButton();
        botonIndividual.setLayout(null);
        botonIndividual.setText("Individual");
        botonIndividual.setFocusable(false);
        botonIndividual.addActionListener(this);
        botonIndividual.setHorizontalAlignment(JButton.CENTER);
        botonIndividual.setVerticalAlignment(JButton.CENTER);
        
        botonAtras = new JButton();
        botonAtras.setLayout(null);
        botonAtras.setText("Atrás");
        botonAtras.setFocusable(false);
        botonAtras.addActionListener(this);
        botonAtras.setHorizontalAlignment(JButton.CENTER);
        botonAtras.setVerticalAlignment(JButton.CENTER);
        
       
        JPanel textpanelInfo = new JPanel();
        textpanelInfo.setBounds(20,5,150,25);
        textpanelInfo.setLayout(new BorderLayout());

        JPanel botpanelMasiva = new JPanel();
        botpanelMasiva.setBounds(10,40,80,25);
        botpanelMasiva.setLayout(new BorderLayout());
        
        JPanel botpanelIndividual = new JPanel();
        botpanelIndividual.setBounds(100,40,100,25);
        botpanelIndividual.setLayout(new BorderLayout());

        JPanel botpanelAtras = new JPanel();
        botpanelAtras.setBounds(60,80,80,25);
        botpanelAtras.setLayout(new BorderLayout());



        textpanelInfo.add(labelTipo);
        botpanelMasiva.add(botonMasiva);
        botpanelIndividual.add(botonIndividual);
        botpanelAtras.add(botonAtras);
        //textpanelTipo.add();




        

        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLayout(null);
        this.setTitle("TIPO DE CARGA");
        this.setSize(225,155);
        this.setVisible(true);


        this.add(textpanelInfo);
        this.add(botpanelMasiva);
        this.add(botpanelIndividual);
        this.add(botpanelAtras);
        this.setLocationRelativeTo(null);
        
        
    }


        
    @Override
    public void actionPerformed(ActionEvent e) {
        

        if (e.getSource()==botonMasiva){
            this.dispose();
            CargaMasiva JFrame = new CargaMasiva();
        }


        if (e.getSource()==botonIndividual){
            this.dispose();
            CargaIndividual JFrame = new CargaIndividual();
        }
        
        
        if(e.getSource()==botonAtras){ //condicional para detectar
            this.dispose(); //Se cierra la ventana de inicion y presenta otra ventana
            MenuAdmin JFrame = new MenuAdmin();
        }
    }


}
