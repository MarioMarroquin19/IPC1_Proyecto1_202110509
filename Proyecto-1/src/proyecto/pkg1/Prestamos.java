package proyecto.pkg1;
import java.util.*;




public class Prestamos {


    
    public static int contador;
    private String Titulo;
    private String Tipo;
    private String Fecha;
    private String Usuario;


    public String getTitulo() {
        return this.Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getTipo() {
        return this.Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getFecha() {
        return this.Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getUsuario() {
        return this.Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

}
