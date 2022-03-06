package proyecto.pkg1;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class VerReportePrestamos extends JFrame implements ActionListener {
    JTextArea textCarga;
    JScrollPane scrollpanel;
    JButton botonAtras;

    VerReportePrestamos(){

        String[] columnas = {"Usuario", "Titulo", "Tipo", "Fecha"};
        GuardarPrestamos []datos = AlmPrestamos.getPrestamos();
        ReportePrestamos generadorHtml = new ReportePrestamos(datos,columnas);

       String reporteHtml = generadorHtml.obtenerReportePrestamos();


        textCarga = new JTextArea();
        textCarga.setEditable(false);
        textCarga.setLineWrap(true);
        textCarga.setText(reporteHtml);
        JScrollPane sp =new JScrollPane(textCarga);
        //sp.setBounds(10,10,600,180);

        botonAtras = new JButton();
        botonAtras.setLayout(null);
        botonAtras.setText("Atrás");
        botonAtras.setFocusable(false);
        botonAtras.addActionListener(this);
        botonAtras.setHorizontalAlignment(JButton.CENTER);
        botonAtras.setVerticalAlignment(JButton.CENTER);



        JPanel botpanelAtras = new JPanel();
        botpanelAtras.setBounds(250,200,80,25);
        botpanelAtras.setLayout(new BorderLayout());

        JPanel textpanelAutor = new JPanel();
        textpanelAutor.setBounds(10,10,600,180);
        textpanelAutor.setLayout(new BorderLayout());


        textpanelAutor.add(sp);
        botpanelAtras.add(botonAtras);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLayout(null);
        this.setTitle("REPORTE USUARIOS");
        this.setSize(650,300);
        this.setVisible(true);

        this.add(botpanelAtras);
        this.add(textpanelAutor);
        this.setLocationRelativeTo(null);


        }

        @Override
        public void actionPerformed(ActionEvent e) {
        
            if(e.getSource()==botonAtras){ //condicional para detectar
                this.dispose(); //Se cierra la ventana de inicion y presenta otra ventana
               MenuAdmin JFrame = new MenuAdmin();
            }
        
        
        
        }  

}
