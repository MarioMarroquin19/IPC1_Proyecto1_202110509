package proyecto.pkg1;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ModificarBiblio  extends JFrame implements ActionListener{
    JLabel labelArea,labelTipo, labelAutor, labelTitulo, labelEdicion, labelDescripcion, 
    labelTemas, labelFrecuencia, labelEjemplares, labelCopias, labelDisponibles; //declaramos variables
    JButton botonCrear, botonAtras, botonbuscar;
    JTextField textArea,textAutor, textTitulo, textEdicion, textDescripcion, textTemas, 
    textFrecuencia, textEjemplares, textCopias, textDisponibles, textBuscar;
    JComboBox<String> combo1;
    String seleccionado;
    public String Buscar;

    ModificarBiblio(){
        labelTipo = new JLabel();
        labelTipo.setText("Tipo:");
        labelTipo.setVerticalAlignment(JLabel.CENTER); //posocion vertical del label
        labelTipo.setHorizontalAlignment(JLabel.LEFT);
        
        labelAutor = new JLabel();
        labelAutor.setText("Autor:");
        labelAutor.setVerticalAlignment(JLabel.CENTER); //posocion vertical del label
        labelAutor.setHorizontalAlignment(JLabel.LEFT);

        labelTitulo = new JLabel();
        labelTitulo.setText("Título:");
        labelTitulo.setVerticalAlignment(JLabel.CENTER); //posocion vertical del label
        labelTitulo.setHorizontalAlignment(JLabel.LEFT);

        labelEdicion = new JLabel();
        labelEdicion.setText("Edición:");
        labelEdicion.setVerticalAlignment(JLabel.CENTER); //posocion vertical del label
        labelEdicion.setHorizontalAlignment(JLabel.LEFT);

        labelDescripcion = new JLabel();
        labelDescripcion.setText("Descripción:");
        labelDescripcion.setVerticalAlignment(JLabel.CENTER); //posocion vertical del label
        labelDescripcion.setHorizontalAlignment(JLabel.LEFT);

        labelTemas = new JLabel();
        labelTemas.setText("Temas:");
        labelTemas.setVerticalAlignment(JLabel.CENTER); //posocion vertical del label
        labelTemas.setHorizontalAlignment(JLabel.LEFT);

        labelFrecuencia= new JLabel();
        labelFrecuencia.setText("Frecuencia:");
        labelFrecuencia.setVerticalAlignment(JLabel.CENTER); //posocion vertical del label
        labelFrecuencia.setHorizontalAlignment(JLabel.LEFT);

        labelEjemplares = new JLabel();
        labelEjemplares.setText("Ejemplares:");
        labelEjemplares.setVerticalAlignment(JLabel.CENTER); //posocion vertical del label
        labelEjemplares.setHorizontalAlignment(JLabel.LEFT);

        labelArea = new JLabel();
        labelArea.setText("Área:");
        labelArea.setVerticalAlignment(JLabel.CENTER); //posocion vertical del label
        labelArea.setHorizontalAlignment(JLabel.LEFT);

        labelCopias = new JLabel();
        labelCopias.setText("Copias:");
        labelCopias.setVerticalAlignment(JLabel.CENTER); //posocion vertical del label
        labelCopias.setHorizontalAlignment(JLabel.LEFT);

        labelDisponibles= new JLabel();
        labelDisponibles.setText("Disponibles:");
        labelDisponibles.setVerticalAlignment(JLabel.CENTER); //posocion vertical del label
        labelDisponibles.setHorizontalAlignment(JLabel.LEFT);

         
        
        botonCrear = new JButton();
        botonCrear.setLayout(null);
        botonCrear.setText("Aceptar");
        botonCrear.setFocusable(false);
        botonCrear.addActionListener(this);
        botonCrear.setHorizontalAlignment(JButton.CENTER);
        botonCrear.setVerticalAlignment(JButton.CENTER);
        
        botonAtras = new JButton();
        botonAtras.setLayout(null);
        botonAtras.setText("Atrás");
        botonAtras.setFocusable(false);
        botonAtras.addActionListener(this);
        botonAtras.setHorizontalAlignment(JButton.CENTER);
        botonAtras.setVerticalAlignment(JButton.CENTER);

        botonbuscar = new JButton();
        botonbuscar.setLayout(null);
        botonbuscar.setText("Buscar");
        botonbuscar.setFocusable(false);
        botonbuscar.addActionListener(this);
        botonbuscar.setHorizontalAlignment(JButton.CENTER);
        botonbuscar.setVerticalAlignment(JButton.CENTER);
        
        textAutor=new JTextField();
        textTitulo=new JTextField();
        textCopias=new JTextField();
        textDescripcion=new JTextField();
        textDisponibles=new JTextField();
        textEdicion=new JTextField();
        textEjemplares=new JTextField();
        textArea = new JTextField();
        textFrecuencia=new JTextField();
        textTemas=new JTextField();
        textBuscar = new JTextField();
        
        String tipo []={" ","Libro", "Revista", "Tesis"};
        combo1=new JComboBox(tipo);
        combo1.addActionListener(this);
        
       

        JPanel panelTipo = new JPanel();
        panelTipo.setBounds(320,10,80,25);
        panelTipo.setLayout(new BorderLayout());

        JPanel panelAutor = new JPanel();
        panelAutor.setBounds(10,40,80,25);
        panelAutor.setLayout(new BorderLayout());

        JPanel panelTitulo = new JPanel();
        panelTitulo.setBounds(10,70,80,25);
        panelTitulo.setLayout(new BorderLayout());

        JPanel panelEdicion = new JPanel();
        panelEdicion.setBounds(10,100,80,25);
        panelEdicion.setLayout(new BorderLayout());

        JPanel panelDescripcion = new JPanel();
        panelDescripcion.setBounds(10,130,80,25);
        panelDescripcion.setLayout(new BorderLayout());

        JPanel panelTemas = new JPanel();
        panelTemas.setBounds(10,160,80,25);
        panelTemas.setLayout(new BorderLayout());

        JPanel panelFrecuencia = new JPanel();
        panelFrecuencia.setBounds(320,40,80,25);    
        panelFrecuencia.setLayout(new BorderLayout());

        JPanel panelEjemplares = new JPanel();
        panelEjemplares.setBounds(320,70,80,25);
        panelEjemplares.setLayout(new BorderLayout());

        JPanel panelArea = new JPanel();
        panelArea.setBounds(320,100,80,25);
        panelArea.setLayout(new BorderLayout());

        JPanel panelCopias = new JPanel();
        panelCopias.setBounds(320,130,80,25);
        panelCopias.setLayout(new BorderLayout());

        JPanel panelDisponibles = new JPanel();
        panelDisponibles.setBounds(320,160,80,25);
        panelDisponibles.setLayout(new BorderLayout());

        JPanel textpanelTipo = new JPanel();
        textpanelTipo.setBounds(400,10,80,25);
        textpanelTipo.setLayout(new BorderLayout());

        JPanel textpanelAutor = new JPanel();
        textpanelAutor.setBounds(100,40,200,25);
        textpanelAutor.setLayout(new BorderLayout());

        JPanel textpanelTitulo = new JPanel();
        textpanelTitulo.setBounds(100,70,200,25);
        textpanelTitulo.setLayout(new BorderLayout());

        JPanel textpanelEdicion = new JPanel();
        textpanelEdicion.setBounds(100,100,200,25);
        textpanelEdicion.setLayout(new BorderLayout());

        JPanel textpanelDescripcion = new JPanel();
        textpanelDescripcion.setBounds(100,130,200,25);
        textpanelDescripcion.setLayout(new BorderLayout());

        JPanel textpanelTemas = new JPanel();
        textpanelTemas.setBounds(100,160,200,25);
        textpanelTemas.setLayout(new BorderLayout());

        JPanel textpanelFrecuencia = new JPanel();
        textpanelFrecuencia.setBounds(400,40,200,25);
        textpanelFrecuencia.setLayout(new BorderLayout());

        JPanel textpanelEjemplares = new JPanel();
        textpanelEjemplares.setBounds(400,70,200,25);
        textpanelEjemplares.setLayout(new BorderLayout());
        JPanel textpanelArea = new JPanel ();
        textpanelArea.setBounds(400,100,200,25);
        textpanelArea.setLayout(new BorderLayout());

        JPanel textpanelCopias = new JPanel();
        textpanelCopias.setBounds(400,130,200,25);
        textpanelCopias.setLayout(new BorderLayout());

        JPanel textpanelDisponibles = new JPanel();
        textpanelDisponibles.setBounds(400,160,200,25);
        textpanelDisponibles.setLayout(new BorderLayout());

        JPanel textpanelBuscar = new JPanel();
        textpanelBuscar.setBounds(100,10,130,25);
        textpanelBuscar.setLayout(new BorderLayout());

        
        JPanel botpanelAceptar = new JPanel();
        botpanelAceptar.setBounds(200,200,80,25);
        botpanelAceptar.setLayout(new BorderLayout());

        JPanel botpanelBuscar = new JPanel();
        botpanelBuscar.setBounds(10,10,80,25);
        botpanelBuscar.setLayout(new BorderLayout());

        JPanel botpanelAtras = new JPanel();
        botpanelAtras.setBounds(375,200,80,25);
        botpanelAtras.setLayout(new BorderLayout());


        panelTipo.add(labelTipo);
        panelAutor.add(labelAutor);
        panelTitulo.add(labelTitulo);
        panelEdicion.add(labelEdicion);
        panelDescripcion.add(labelDescripcion);
        panelTemas.add(labelTemas);
        panelFrecuencia.add(labelFrecuencia);
        panelEjemplares.add(labelEjemplares);
        panelArea.add(labelArea);
        panelCopias.add(labelCopias);
        panelDisponibles.add(labelDisponibles);
        textpanelTipo.add(combo1);
        textpanelAutor.add(textAutor);
        textpanelTitulo.add(textTitulo);
        textpanelEdicion.add(textEdicion);
        textpanelDescripcion.add(textDescripcion);
        textpanelTemas.add(textTemas);
        textpanelFrecuencia.add(textFrecuencia);
        textpanelEjemplares.add(textEjemplares);
        textpanelArea.add(textArea);
        textpanelCopias.add(textCopias);
        textpanelDisponibles.add(textDisponibles);
        textpanelBuscar.add(textBuscar);
        botpanelBuscar.add(botonbuscar);
        botpanelAceptar.add(botonCrear);
        botpanelAtras.add(botonAtras);
        //textpanelTipo.add();




        

        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLayout(null);
        this.setTitle("Modificar Bibliografia");
        this.setSize(650,300);
        this.setVisible(true);

        this.add(panelTipo);
        this.add(panelAutor);
        this.add(panelTitulo);
        this.add(panelEdicion);
        this.add(panelDescripcion);
        this.add(panelTemas);
        this.add(panelFrecuencia);
        this.add(panelEjemplares);
        this.add(panelArea);
        this.add(panelCopias);
        this.add(panelDisponibles);
        this.add(textpanelTipo);
        this.add(textpanelAutor);
        this.add(textpanelTitulo);
        this.add(textpanelEdicion);
        this.add(textpanelDescripcion);
        this.add(textpanelTemas);
        this.add(textpanelFrecuencia);
        this.add(textpanelEjemplares);
        this.add(textpanelArea);
        this.add(textpanelCopias);
        this.add(textpanelDisponibles);
        this.add(textpanelAutor);
        this.add(textpanelAutor);
        this.add(textpanelBuscar);
        this.add(botpanelBuscar);
        this.add(botpanelAceptar);
        this.add(botpanelAtras);
        this.setLocationRelativeTo(null);
        
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()== combo1 ){
            seleccionado=(String)combo1.getSelectedItem();  
            

        }  

        if (e.getSource() == botonbuscar){
            this.Buscar = textBuscar.getText();

            

            textAutor.setText(AlmBiblios.MostrarAutor(Buscar));
            textTitulo.setText(Buscar);
            textEdicion.setText(AlmBiblios.MostrarEdicion(Buscar));
            textDescripcion.setText(AlmBiblios.MostrarDescripcion(Buscar));
            textTemas.setText(AlmBiblios.MostrarTemas(Buscar));
            textFrecuencia.setText(AlmBiblios.MostrarFrecuencia(Buscar));
            textEjemplares.setText(AlmBiblios.MostrarEjemplares(Buscar));
            textArea.setText(AlmBiblios.MostrarAreas(Buscar));
            textCopias.setText(AlmBiblios.MostrarCopias(Buscar));
            textDisponibles.setText(AlmBiblios.MostrarDisponibles(Buscar));

            


        }
        
        if (e.getSource()==botonCrear){
            //CargaIndividual JFrame = new CargaIndividual();
            String Autor = textAutor.getText();
            String tipo = seleccionado;
            String titulo = textTitulo.getText();
            String Edicion = textEdicion.getText();
            String Descripcion = textDescripcion.getText();
            String Temas = textTemas.getText();
            String Frecuencia = textFrecuencia.getText();
            String Ejemplares = textEjemplares.getText();   
            String Area = textArea.getText();
            String Copias = textCopias.getText();
            String Disponibles = textDisponibles.getText();

            
            //int pos = AlmUsuario.verificarLogueo(usuario, contrase);
            
            AlmBiblios.ModificarBiblios(Buscar,tipo,titulo,Autor, Edicion, Descripcion, 
            Temas, Frecuencia, Ejemplares,Area,Copias, Disponibles);

            
            JOptionPane.showMessageDialog(null, "Bibliografia Modificada!", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
            MenuAdmin JFrame = new MenuAdmin();
        }
        
        
        if(e.getSource()==botonAtras){ //condicional para detectar
            this.dispose(); //Se cierra la ventana de inicion y presenta otra ventana
            MenuAdmin JFrame = new MenuAdmin();
        }
    }

}
