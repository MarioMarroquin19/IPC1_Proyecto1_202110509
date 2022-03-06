package proyecto.pkg1;

public class ReportePrestamos {

    private String antesDeTabla = "<!DECTYPE html>\n"+
                                  "<html lang =\"en\">\n"+
                                  "<head>\n"+
                                  "<title>Reporte Prestamos</title>\n"+
                                  "</head>\n"+
                                  "<body>\n"+
                                  "<table border=\"\">\n";


private String despuesDeTabla = " </table>\n"+
                                "</body>\n"+
                                "</html>";

private GuardarPrestamos[] datos;
private String [] columnas;

public ReportePrestamos(GuardarPrestamos []datos, String []columnas){
    this.datos = datos;
    this.columnas = columnas;
}

public String obtenerReportePrestamos(){
    String tablaColumnas = "";
    tablaColumnas +="                   <tr>\n";

    for (int i=0; i<columnas.length;i++){
        tablaColumnas +="               <th>"+columnas[i]+"</th>\n";
    }
    tablaColumnas +="                   </tr>\n";

    String tablaDatos="";

    for (int i=0; i<datos.length; i++){
        if (datos[i] != null){
            tablaDatos+="                  <tr>\n";
            tablaDatos+="                  <td>"+datos[i].getUsuario()+"</td>\n";
            tablaDatos+="                  <td>"+datos[i].getTitulo()+"</td>\n";
            tablaDatos+="                  <td>"+datos[i].getTipo()+"</td>\n";
            tablaDatos+="                  <td>"+datos[i].getFecha()+"</td>\n";
            tablaDatos+="                  </tr>\n";


            }
        }
    return antesDeTabla+tablaColumnas+tablaDatos+despuesDeTabla;
    }
}