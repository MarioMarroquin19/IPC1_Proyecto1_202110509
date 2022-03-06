 package proyecto.pkg1;


public class AlmBiblios {
    
    private static GuardarBibliosMasiva [] AlmBiblios = new GuardarBibliosMasiva [100];
    private static int cantidadBiblios =0;

    
    



    
    public static void colocarBiblio( GuardarBibliosMasiva nuevaBiblio){
        for (int i=0; i<AlmBiblios.length; i++){
            if (AlmBiblios[i]==null){
                AlmBiblios[i] = nuevaBiblio;
                cantidadBiblios++;
                return;
            }
        }
    }

    public static  GuardarBibliosMasiva [] getbiblio(){
        String [] biblios = new String [100];
        int posicion =0;
        for (GuardarBibliosMasiva biblio: AlmBiblios){
            if (biblio != null ){
                String [] fila ={
                    biblio.getTipo(),
                    biblio.getTitulo(),
                    biblio.getAutor(),
                    biblio.getStrEdicion(),
                    biblio.getDescripcion(),
                    biblio.getTemasConcatenados(),
                    biblio.getFrecuenciaActual(),
                    biblio.getStrEjemplares(),
                    biblio.getArea(),
                    biblio.getStrCopias(),
                    biblio.getStrDisponibles()
                };
            }
        }
        return AlmBiblios;
    }


    public static String [][] obtenerBiblios(){
        String [][] biblios = new String [cantidadBiblios][10];
        int posicion =0;
        for (GuardarBibliosMasiva biblio: AlmBiblios){
            if (biblio != null ){
                String [] fila ={
                    biblio.getTipo(),
                    biblio.getAutor(),
                    biblio.getTitulo(),
                    biblio.getDescripcion(),
                    biblio.getStrEdicion(),
                    biblio.getTemasConcatenados(),
                    biblio.getFrecuenciaActual(),
                    biblio.getStrEjemplares(),
                    biblio.getArea(),
                    biblio.getStrCopias(),
                    biblio.getStrDisponibles()
                };
               biblios[posicion]=fila;
               posicion++; 
            }
        }
        return biblios;
    }





    public static String [][] BiblioInteres(String buscar){
        String [][] biblios = new String [cantidadBiblios][11];
        int posicion =0;
        for (GuardarBibliosMasiva biblio: AlmBiblios){
            if (biblio != null ){
            String [] tem = biblio.getTemasConcatenados().split(",");
            for(int i =0; i<tem.length; i++){
            if(tem[i].equals(buscar) ){
                if (tem[i] !=null){
                    String [] fila ={
                    biblio.getTipo(),
                    biblio.getAutor(),
                    biblio.getTitulo(),
                    biblio.getDescripcion(),
                    biblio.getStrEdicion(),
                    biblio.getTemasConcatenados(),
                    biblio.getFrecuenciaActual(),
                    biblio.getStrEjemplares(),
                    biblio.getArea(),
                    biblio.getStrCopias(),
                    biblio.getStrDisponibles()
                };
               biblios[posicion]=fila;
               posicion++; 
                        }
                    }
                }
            }
            
        }
        return biblios;
    }

public static int Prestar (String text){
    int num = 0;
    for (GuardarBibliosMasiva biblios: AlmBiblios){
        if(biblios != null){
            if(biblios.getTitulo().equals(text)){

                String numero1 = biblios.getStrDisponibles();
                int numero2 = Integer.parseInt(numero1);
                if(numero2 <=0 ){
                    num=0;
                }
                if(numero2 > 0){
                numero2 -=1;
                String numero3 = String.valueOf(numero2);
                biblios.setStrDisponibles(numero3);
                num=-1;
                }
            }
        }
    }
    return num;
}


public static int Devolver (String text){
    int num = 0;
    for (GuardarBibliosMasiva biblios: AlmBiblios){
        if(biblios != null){
            if(biblios.getTitulo().equals(text)){

                String numero1 = biblios.getStrDisponibles();
                int numero2 = Integer.parseInt(numero1);
                if(numero2 <0 ){
                    num=0;
                }
                if(numero2 >= 0){
                numero2 +=1;
                String numero3 = String.valueOf(numero2);
                biblios.setStrDisponibles(numero3);
                num=-1;
                }
            }
        }
    }
    return num;
}



public static void ModificarBiblios (String titulo,String tipo,String titulo1,String Autor, String edicion, String descripcion, String temas, String frecuencia,
String ejemplares,String area, String copias, String disponibles){
    for (GuardarBibliosMasiva biblios: AlmBiblios){
        if(biblios != null){
            if(biblios.getTitulo().equals(titulo)){
                biblios.setTitulo(titulo1);
                biblios.setTipo(tipo);
                biblios.setAutor(Autor);
                biblios.setStrEdicion(edicion);
                biblios.setDescripcion(descripcion);
                biblios.setTemasConcatenados(temas);
                biblios.setStrEjemplares(ejemplares);
                biblios.setArea(area);
                biblios.setStrCopias(copias);
                biblios.setStrDisponibles(disponibles);

            }
        }
    }
}


public static void EliminarBiblios (String titulo){
    for (GuardarBibliosMasiva biblios: AlmBiblios){
        if(biblios != null){
            if(biblios.getTitulo().equals(titulo)){
                
                biblios.setTitulo(null);
                biblios.setTipo(null);
                biblios.setAutor(null);
                biblios.setStrEdicion(null);
                biblios.setDescripcion(null);
                biblios.setTemasConcatenados(null);
                biblios.setFrecuenciaActual(null);
                biblios.setStrEjemplares(null);
                biblios.setArea(null);
                biblios.setStrCopias(null);
                biblios.setStrDisponibles(null);

            }
        }
    }
}

public static String MostrarTipo(String Buscar){
    String Autor = " ";
    for (GuardarBibliosMasiva biblios: AlmBiblios){
        if(biblios != null){
            if(biblios.getTitulo().equals(Buscar)){
                 Autor= biblios.getTipo();
            }
        }
    }
    return Autor;
}





public static String MostrarAutor(String Buscar){
    String Autor = " ";
    for (GuardarBibliosMasiva biblios: AlmBiblios){
        if(biblios != null){
            if(biblios.getTitulo().equals(Buscar)){
                 Autor= biblios.getAutor();
            }
        }
    }
    return Autor;
}

public static String MostrarEdicion(String Buscar){
    String Autor = " ";
    for (GuardarBibliosMasiva biblios: AlmBiblios){
        if(biblios != null){
            if(biblios.getTitulo().equals(Buscar)){
                 Autor= biblios.getStrEdicion();
            }
        }
    }
    return Autor;
}


public static String MostrarDescripcion(String Buscar){
    String Autor = " ";
    for (GuardarBibliosMasiva biblios: AlmBiblios){
        if(biblios != null){
            if(biblios.getTitulo().equals(Buscar)){
                 Autor= biblios.getDescripcion();
            }
        }
    }
    return Autor;
}

public static String MostrarTemas(String Buscar){
    String Autor = " ";
    for (GuardarBibliosMasiva biblios: AlmBiblios){
        if(biblios != null){
            if(biblios.getTitulo().equals(Buscar)){
                 Autor= biblios.getTemasConcatenados();
            }
        }
    }
    return Autor;
}

public static String MostrarFrecuencia(String Buscar){
    String Autor = " ";
    for (GuardarBibliosMasiva biblios: AlmBiblios){
        if(biblios != null){
            if(biblios.getTitulo().equals(Buscar)){
                 Autor= biblios.getFrecuenciaActual();
            }
        }
    }
    return Autor;
}

public static String MostrarEjemplares(String Buscar){
    String Autor = " ";
    for (GuardarBibliosMasiva biblios: AlmBiblios){
        if(biblios != null){
            if(biblios.getTitulo().equals(Buscar)){
                 Autor= biblios.getStrEjemplares();
            }
        }
    }
    return Autor;
}

public static String MostrarAreas(String Buscar){
    String Autor = " ";
    for (GuardarBibliosMasiva biblios: AlmBiblios){
        if(biblios != null){
            if(biblios.getTitulo().equals(Buscar)){
                 Autor= biblios.getArea();
            }
        }
    }
    return Autor;
}

public static String MostrarCopias(String Buscar){
    String Autor = " ";
    for (GuardarBibliosMasiva biblios: AlmBiblios){
        if(biblios != null){
            if(biblios.getTitulo().equals(Buscar)){
                 Autor= biblios.getStrCopias();
            }
        }
    }
    return Autor;
}

public static String MostrarDisponibles(String Buscar){
    String Autor = " ";
    for (GuardarBibliosMasiva biblios: AlmBiblios){
        if(biblios != null){
            if(biblios.getTitulo().equals(Buscar)){
                 Autor= biblios.getStrDisponibles();
            }
        }
    }
    return Autor;
}






}
