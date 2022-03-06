package proyecto.pkg1;


public class ReporteUsuarios {

    private String antesDeTabla = "<!DECTYPE html>\n"+
                                    "<html lang =\"en\">\n"+
                                    "<head>\n"+
                                    "<title>Reporte Usuarios</title>\n"+
                                     "</head>\n"+
                                    "<body>\n"+
                                    "<table border=\"\">\n";


    private String despuesDeTabla = " </table>\n"+
                                    "</body>\n"+
                                    "</html>";

    private GuardarUsuarios[] datos;
    private String [] columnas;


    public ReporteUsuarios(GuardarUsuarios []datos, String []columnas){
        this.datos = datos;
        this.columnas = columnas;
    }

    public String obtenerReporteUsuarios(){
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
                tablaDatos+="                  <td>"+datos[i].getId()+"</td>\n";
                tablaDatos+="                  <td>"+datos[i].getNombre()+"</td>\n";
                tablaDatos+="                  <td>"+datos[i].getApellido()+"</td>\n";
                tablaDatos+="                  <td>"+datos[i].getUsuario()+"</td>\n";
                tablaDatos+="                  <td>"+datos[i].getRol()+"</td>\n";
                tablaDatos+="                  <td>"+datos[i].getContraseña()+"</td>\n";
                tablaDatos+="                  </tr>\n";


            }
        }
        return antesDeTabla+tablaColumnas+tablaDatos+despuesDeTabla;
    }

}