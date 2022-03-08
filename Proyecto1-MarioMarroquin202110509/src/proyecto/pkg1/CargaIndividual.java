package proyecto.pkg1;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CargaIndividual extends JFrame implements ActionListener {
    JLabel labelArea,labelTipo, labelAutor, labelTitulo, labelEdicion, labelDescripcion, labelTemas, labelFrecuencia, labelEjemplares, labelCopias, labelDisponibles; //declaramos variables
    JButton botonCrear, botonAtras;
    JTextField textArea,textAutor, textTitulo, textEdicion, textDescripcion, textTemas, textFrecuencia, textEjemplares, textCopias, textDisponibles;
    JComboBox<String> combo1;
    String seleccionado;
    private String temasConcatenados;


    CargaIndividual(){
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
        botonCrear.setText("Crear");
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
        
        String tipo []={" ","Libro", "Revista", "Tesis"};
        combo1=new JComboBox(tipo);
        combo1.addActionListener(this);
        
       

        JPanel panelTipo = new JPanel();
        panelTipo.setBounds(10,10,80,25);
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
        textpanelTipo.setBounds(100,10,80,25);
        textpanelTipo.setLayout(new BorderLayout());

        JPanel textpanelAutor = new JPanel();
        textpanelAutor.setBounds(100,40,200,25);
        textpanelAutor.setLayout(new BorderLayout());

        JPanel textpanelTitulo = new JPanel();
        textpanelTitulo.setBounds(100,70,200,25);
        textpanelTitulo.setLayout(new BorderLayout());

        JPanel textpanelDescripcion = new JPanel();
        textpanelDescripcion.setBounds(100,100,200,25);
        textpanelDescripcion.setLayout(new BorderLayout());

        JPanel textpanelEdicion = new JPanel();
        textpanelEdicion.setBounds(100,130,200,25);
        textpanelEdicion.setLayout(new BorderLayout());

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

        
        JPanel botpanelAceptar = new JPanel();
        botpanelAceptar.setBounds(200,200,80,25);
        botpanelAceptar.setLayout(new BorderLayout());

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
        botpanelAceptar.add(botonCrear);
        botpanelAtras.add(botonAtras);
        //textpanelTipo.add();




        

        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLayout(null);
        this.setTitle("CARGA INDIVIDUAL");
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
        this.add(botpanelAceptar);
        this.add(botpanelAtras);
        this.setLocationRelativeTo(null);
        
        
    }



    /*public void cargarBiblios(String []tipo,String []autor,String []titulo,String []edicion,String []descripcion,
    String []temas,String []frecuencia,String []ejemplares,String []area,String []copias,String []disponibles){

    }*/


        
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== combo1 ){
            seleccionado=(String)combo1.getSelectedItem(); 
            if (seleccionado.equals("Libro")){
                textFrecuencia.setEnabled(false);
                textEjemplares.setEnabled(false);
                textArea.setEnabled(false);
            }

            if(seleccionado.equals("Revista")){
                textArea.setEnabled(false);
                textFrecuencia.setEnabled(true);
                textEjemplares.setEnabled(true);
            }
        
            if(seleccionado.equals("Tesis")){
                textArea.setEnabled(true);
                textFrecuencia.setEnabled(false);
                textEjemplares.setEnabled(false);
            } 
            

        }  
        
        if (e.getSource()==botonCrear){
            //CargaIndividual JFrame = new CargaIndividual();
            String tipo = seleccionado;
            String Autor = textAutor.getText();
            String Titulo = textTitulo.getText();
            String Edicion = textEdicion.getText();
            String Descripcion = textDescripcion.getText();
            String Temas = textTemas.getText();
            String Frecuencia = textFrecuencia.getText();
            String Ejemplares = textEjemplares.getText();
            String Area = textArea.getText();
            String Copias = textCopias.getText();
            String Disponibles = textDisponibles.getText();

            //String [] temas1 = Temas.split(",");
           // int ejemplares = Integer.parseInt(Ejemplares);


            if (tipo.equals("")){
                tipo = "-----";
            }

            if (Autor.equals("")){
                Autor = "-----";
            }

            if ( Titulo.equals("") ){
                Titulo = "-----";
            }

            if (Edicion.equals("")){
                Edicion = "0";
            }

            if(Descripcion.equals("")){
                Descripcion = "-----";
            }

            if(Temas.equals("")){
                Temas = "-----";
            }

            if( Frecuencia.equals("")){
                Frecuencia = "----";
            }

            if( Ejemplares.equals("")){
                Ejemplares= "0";
            }

            if(Area.equals("") ){
                Area  = "-----";
            }

            if(Copias.equals("")){
                Copias = "0";
            }

            if(Disponibles.equals("")){
                Disponibles = "0";
            }

            GuardarBibliosMasiva nuevaBiblio = new GuardarBibliosMasiva(tipo,Autor,Titulo,Edicion,Descripcion,Temas,
               Frecuencia,Ejemplares,Area,Copias,Disponibles); 
              
                AlmBiblios.colocarBiblio(nuevaBiblio);


            
            //int pos = AlmUsuario.verificarLogueo(usuario, contrase);
            
            JOptionPane.showMessageDialog(null, "Bibliografia agregada!", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            
            
            textAutor.setText("");
            textTitulo.setText("");
            textEdicion.setText("");
            textDescripcion.setText("");
            textTemas.setText("");
            textFrecuencia.setText("");
            textEjemplares.setText("");
            textArea.setText("");
            textCopias.setText("");
            textDisponibles.setText("");
            this.dispose(); //Se cierra la ventana de inicion y presenta otra ventana
            CrearBiblio JFrame = new CrearBiblio();

            
        }
        
        
        if(e.getSource()==botonAtras){ //condicional para detectar
            this.dispose(); //Se cierra la ventana de inicion y presenta otra ventana
            CrearBiblio JFrame = new CrearBiblio();
        }
    }

}

