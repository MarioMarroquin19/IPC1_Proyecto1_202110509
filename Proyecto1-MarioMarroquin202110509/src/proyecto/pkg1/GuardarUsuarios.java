package proyecto.pkg1;

public class GuardarUsuarios{
    private String  id;
    private String  nombre;
    private String  apellido;
    private String  usuario;
    private String  rol;
    private String  contraseña;
    

    public GuardarUsuarios(
        String id,
        String nombre,
        String apellido,
        String usuario,
        String rol,
        String contraseña


    ){

        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.rol = rol;
        this.contraseña = contraseña;

    }




    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsuario() {
        return this.usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getRol() {
        return this.rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getContraseña() {
        return this.contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }





}
