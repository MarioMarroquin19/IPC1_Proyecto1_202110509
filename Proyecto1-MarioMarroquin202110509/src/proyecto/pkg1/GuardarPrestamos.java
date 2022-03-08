package proyecto.pkg1;
//import java.util.*;




public class GuardarPrestamos {
    private String Usuario;
    private String Titulo;
    private String Tipo;
    private String Fecha;

    public GuardarPrestamos(
        String Usuario,
        String Titulo,
        String Tipo, 
        String Fecha
    ){
        this.Usuario=Usuario;
        this.Titulo=Titulo;
        this.Tipo=Tipo;
        this.Fecha=Fecha;
    }

    public String getUsuario() {
        return this.Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

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
  


}
