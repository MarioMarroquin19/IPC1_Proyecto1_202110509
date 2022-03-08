package proyecto.pkg1;

public class ReporteBibliografias {

    private String antesDeTabla = "<!DECTYPE html>\n"+
                                    "<html lang =\"en\">\n"+
                                    "<head>\n"+
                                    "   <title>Reporte Bibliografias</title>\n"+
                                    "</head>\n"+
                                    "<body>\n"+
                                    "   <table border=\"\">\n";


    private String despuesDeTabla = " </table>\n"+
                                    "</body>\n"+
                                    "</html>";

    private GuardarBibliosMasiva[] datos;
    private String [] columnas;


    public ReporteBibliografias(GuardarBibliosMasiva[] datos, String [] columnas){
        this.datos = datos;
        this.columnas = columnas;
    }

    public String obtenerReporteBiblios(){
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
                tablaDatos+="                  <td>"+datos[i].getTipo()+"</td>\n";
                tablaDatos+="                  <td>"+datos[i].getAutor()+"</td>\n";
                tablaDatos+="                  <td>"+datos[i].getTitulo()+"</td>\n";
                tablaDatos+="                  <td>"+datos[i].getDescripcion()+"</td>\n";
                tablaDatos+="                  <td>"+datos[i].getStrEdicion()+"</td>\n";
                tablaDatos+="                  <td>"+datos[i].getTemasConcatenados()+"</td>\n";
                tablaDatos+="                  <td>"+datos[i].getFrecuenciaActual()+"</td>\n";
                tablaDatos+="                  <td>"+datos[i].getStrEjemplares()+"</td>\n";
                tablaDatos+="                  <td>"+datos[i].getArea()+"</td>\n";
                tablaDatos+="                  <td>"+datos[i].getStrCopias()+"</td>\n";
                tablaDatos+="                  <td>"+datos[i].getStrDisponibles()+"</td>\n";
                tablaDatos+="                  </tr>\n";


            }
        }
        return antesDeTabla+tablaColumnas+tablaDatos+despuesDeTabla;
    }

}
