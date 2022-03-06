package proyecto.pkg1;
import java.util.*;




public class Usuarios  {



    /*private String arg_usuario [] = new String [50] ;
    public Bibliografias [] arg_bibliografias;
*/

    private int carnet;
    public static int contador;
    private String ID;
    private String Nombre;
    private String Apellido;
    private String Usuario;
    private String Rol;
    private String Contra;
    private String ConfirmarContra;



    
    /*public Usuarios (String ID, String Nombre){
        setID(ID);
        setNombre(Nombre);
    }*/


    public int getCarnet() {
        return this.carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    public String getID() {
        return this.ID;
    }

    public void setID(String ID) {
        this.ID = ID;
        
    }

    public String getNombre() {
        return this.Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return this.Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getUsuario() {
        return this.Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getRol() {
        return this.Rol;
    }

    public void setRol(String Rol) {
        this.Rol = Rol;
    }

    public String getContra() {
        return this.Contra;
    }

    public void setContra(String Contra) {
        this.Contra = Contra;
    }

    public String getConfirmarContra() {
        return this.ConfirmarContra;
    }

    public void setConfirmarContra(String ConfirmarContra) {
        this.ConfirmarContra = ConfirmarContra;
    }


    
    /*public void AlmIDS (String ids){ ;    
    arg_usuario[contador]= ids;
    contador++;
    for(int i=0;i<arg_usuario.length;i++){
        System.out.println(arg_usuario[i]);
    }
    //arg_bibliografias = new Bibliografias [50];
    }*/





    public String toString(){
        return "ID:"+this.ID;
    }

 


}
