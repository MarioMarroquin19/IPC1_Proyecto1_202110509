package proyecto.pkg1;


/**
 *
 * @author marroquin
 */
public class GuardarBibliosMasiva {
    private String tipo; 
    private String autor; 
    private String titulo; 
    private String descripcion; 
    private int edicion; 
    private String []temas;
    private String frecuenciaActual;
    private int ejemplares;
    private String area;
    private int copias; 
    private int disponibles; 
    
    private String temasConcatenados;
    private String strEdicion; //Presentación concatenada de los géneros, separados por coma
    private String strEjemplares;
    private String strCopias; //Presentación de tipo String del atributo copias
    private String strDisponibles; //Presentación de tipo String del atributo existencia
    
    public GuardarBibliosMasiva(
        String tipo,
        String autor,
        String titulo,
        String descripcion,
        String edicion,
        String temas,
        String frecuenciaActual,
        String ejemplares,
        String area,
        String copias,
        String disponibles
        ){
            this.tipo = tipo;
            this.autor=autor;
            this.titulo = titulo;
            this.descripcion = descripcion;
            this.edicion = Integer.parseInt(edicion);
            this.temas = temas.split(",");
            this.frecuenciaActual = frecuenciaActual;
            this.ejemplares = Integer.parseInt(ejemplares);
            this.area = area;
            this.copias = Integer.parseInt(copias);
            this.disponibles = Integer.parseInt(disponibles);


            this.temasConcatenados = temas;
            this.strCopias = copias;
            this.strDisponibles= disponibles;
            this.strEdicion = edicion;
            this.strEjemplares=ejemplares;

        }
        



    public void MostrarTemas(){
        for (String temas: getTemas()){
            System.out.println(temas);
        }
    }
    

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getEdicion() {
        return this.edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public String[] getTemas() {
        return this.temas;
    }

    public void setTemas(String[] temas) {
        this.temas = temas;
    }

    public String getFrecuenciaActual() {
        return this.frecuenciaActual;
    }

    public void setFrecuenciaActual(String frecuenciaActual) {
        this.frecuenciaActual = frecuenciaActual;
    }

    public int getEjemplares() {
        return this.ejemplares;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    public String getArea() {
        return this.area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getCopias() {
        return this.copias;
    }

    public void setCopias(int copias) {
        this.copias = copias;
    }

    public int getDisponibles() {
        return this.disponibles;
    }

    public void setDisponibles(int disponibles) {
        this.disponibles = disponibles;
    }

    public String getTemasConcatenados() {
        return this.temasConcatenados;
    }

    public void setTemasConcatenados(String temasConcatenados) {
        this.temasConcatenados = temasConcatenados;
    }

    public String getStrEdicion() {
        return this.strEdicion;
    }

    public void setStrEdicion(String strEdicion) {
        this.strEdicion = strEdicion;
    }

    public String getStrEjemplares() {
        return this.strEjemplares;
    }

    public void setStrEjemplares(String strEjemplares) {
        this.strEjemplares = strEjemplares;
    }

    public String getStrCopias() {
        return this.strCopias;
    }

    public void setStrCopias(String strCopias) {
        this.strCopias = strCopias;
    }

    public String getStrDisponibles() {
        return this.strDisponibles;
    }

    public void setStrDisponibles(String strDisponibles) {
        this.strDisponibles = strDisponibles;
    }




}
