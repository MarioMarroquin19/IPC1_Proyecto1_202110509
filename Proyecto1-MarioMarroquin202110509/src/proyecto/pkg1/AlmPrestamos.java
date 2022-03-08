package proyecto.pkg1;

public class AlmPrestamos {
    private static GuardarPrestamos [] CrearPrestamo = new GuardarPrestamos [100];
    private static int cantidadPrestamos =0;

    public static void ColocarPrestamo ( GuardarPrestamos nuevoPrestamo){
        for (int i=0; i<CrearPrestamo.length; i++){
            if (CrearPrestamo [i] == null){
                CrearPrestamo [i] = nuevoPrestamo;
                cantidadPrestamos++;
                return;
            }
        }
    }


    public static GuardarPrestamos[] getPrestamos(){
        String [] prestamos = new String [3];
        int posicion =0;
        for(GuardarPrestamos prestamo: CrearPrestamo){
            if(prestamo != null){
                String []fila={
                    prestamo.getUsuario(),
                    prestamo.getTitulo(),
                    prestamo.getTipo(),
                    prestamo.getFecha()
                };
            }
        }
        return CrearPrestamo;
    }


    public static String [][] obtenerPrestamos (String nombreUsuario){
        String [][] prestamos = new String [cantidadPrestamos][3];
        int posicion = 0;
        for (GuardarPrestamos prestamo: CrearPrestamo){
            if (prestamo != null){
                if(prestamo.getUsuario().equals(nombreUsuario)){
                    String []fila = {
                    prestamo.getTitulo(),
                    prestamo.getTipo(),
                    prestamo.getFecha()
                    };
                prestamos[posicion]=fila;
                posicion ++;
                
                }
            } 

        }
        return prestamos;
    }   

    public static void EliminarPrestamo(String titulo,String nombre){
        for(GuardarPrestamos prestamos: CrearPrestamo){
            if(prestamos != null){
                if(prestamos.getTitulo().equals(titulo) && prestamos.getUsuario().equals(nombre)){
                    //prestamos.setUsuario(null);
                    prestamos.setTitulo("");
                    prestamos.setTipo("");
                    prestamos.setFecha("");
                }
            }
        }
    }




}
