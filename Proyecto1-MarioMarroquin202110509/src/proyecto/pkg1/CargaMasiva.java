package proyecto.pkg1;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;



public class CargaMasiva extends JFrame implements ActionListener {
    JLabel labelTipo;
    JButton botonCrear, botonAtras;
    JTextField textAutor, textTitulo, textEdicion, textDescripcion, textTemas, textFrecuencia, textEjemplares, textCopias, textDisponibles;
    JComboBox<String> combo1;
    String seleccionado;
    JTextArea textCarga;
    JScrollPane scrollpanel;
    public String [] atributos;

    CargaMasiva(){

        textCarga = new JTextArea();
        //textCarga.setEditable(false);
        //textCarga.setLineWrap(true); //Para que salte de línea al llegar al final del ancho del jTextArea
        JScrollPane sp =new JScrollPane(textCarga);
        sp.setBounds(10,10,600,180);
        //JScrollPane sp = new JScrollPane();
        //scrollpanel.setBounds(10,50,400,300);
        
        

        botonCrear = new JButton();
        botonCrear.setLayout(null);
        botonCrear.setText("Cargar");
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


        JPanel textpanelAutor = new JPanel();
        textpanelAutor.setBounds(10,10,600,180);
        textpanelAutor.setLayout(new BorderLayout());

        JPanel botpanelAceptar = new JPanel();
        botpanelAceptar.setBounds(200,200,80,25);
        botpanelAceptar.setLayout(new BorderLayout());

        JPanel botpanelAtras = new JPanel();
        botpanelAtras.setBounds(375,200,80,25);
        botpanelAtras.setLayout(new BorderLayout());


        textpanelAutor.add(sp);
        botpanelAceptar.add(botonCrear);
        botpanelAtras.add(botonAtras);
        

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLayout(null);
        this.setTitle("CARGA MASIVA");
        this.setSize(650,300);
        this.setVisible(true);


        this.add(botpanelAceptar);
        this.add(botpanelAtras);
        this.add(textpanelAutor);
        this.setLocationRelativeTo(null);


    }

    public void cargarBiblios(String texto){
        String[] lineasTexto = texto.split("\n");
        for(String linea: lineasTexto) {
            atributos = linea.split(";"); //Cada línea se debe separar en otras sub cadenas para obtener los atributos separados por("-")
    
            if(atributos.length  == 11) { //Las cadénas válidas de acuerdo con la entrada del usuario, deben contener 9 atributos separados por("-")
    
                if(atributos[0].equals("0")){
                    atributos[0] = "Libro";
                }

                if(atributos[0].equals("1")){
                    atributos[0] = "Revista";
                }

                if(atributos[0].equals("2")){
                    atributos[0] = "Tesis";
                }
                if(atributos[1].equals("")){
                    atributos[1] = "-----";
                }
                if(atributos[2].equals("")){
                    atributos[2] = "-----";
                }
                if(atributos[3].equals("")){
                    atributos[3] = "-----";
                }
                /*if(atributos[4].equals("")){
                    atributos[4] = "0";
                }*/
                if(atributos[5].equals("")){
                    atributos[5] = "-----";
                }
                if(atributos[6].equals("")){
                    atributos[6] = "-----";
                }

                if(atributos[7].equals("")){
                    atributos[7] = "0";
                }
                if(atributos[8].equals("")){
                    atributos[8] = "-----";
                }

                if(atributos[9].equals("")){
                    atributos[9] = "0";
                }

                if(atributos[10].equals("")){
                    atributos[10] = "0";
                }


                
              GuardarBibliosMasiva nuevaBiblio = new GuardarBibliosMasiva(atributos[0], atributos[1], atributos[2], atributos[3], atributos[4], atributos[5],
               atributos[6],atributos[7],atributos[8],atributos[9],atributos[10]); 
              
                AlmBiblios.colocarBiblio(nuevaBiblio);
                
            }
            else {
                JOptionPane.showMessageDialog(null, "<html><body>Error al cargar, asegurese de ingresar <br> de forma correcta los datos </body></html>", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            }
          }
          if(atributos.length  == 11){
          JOptionPane.showMessageDialog(null, "Carga completa!", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
          setVisible(false);
          CrearBiblio JFrame = new CrearBiblio();
          }
        }


    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource()==botonCrear){
            //textCarga.setText("hola");

            String entradaTexto = textCarga.getText();
            
            cargarBiblios(entradaTexto);
            //CargaIndividual JFrame = new CargaIndividual();
            //String Autor = scrollpanel.getToolTipText();          
            //int pos = AlmUsuario.verificarLogueo(usuario, contrase);
            

            

            
        }
        
        
        if(e.getSource()==botonAtras){ //condicional para detectar
            this.dispose(); //Se cierra la ventana de inicion y presenta otra ventana
            CrearBiblio JFrame = new CrearBiblio();
        }
    }


}
