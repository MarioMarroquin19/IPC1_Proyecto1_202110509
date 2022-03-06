package proyecto.pkg1;


public class AlmUsuarios {

    private static GuardarUsuarios [] CrearUsuario = new GuardarUsuarios [100];
    private static int cantidadUsuarios =0;

    public static void ColocarUsuarios (GuardarUsuarios nuevoUsuario){
        for (int i=0; i<CrearUsuario.length; i++){
            if (CrearUsuario [i] == null){
                CrearUsuario [i] = nuevoUsuario;
                cantidadUsuarios++;
                return;
            }
        }
    }

    public static GuardarUsuarios[] getUsuarios (){
        String []usuarios = new String [5];
        int posicion = 0;
        for (GuardarUsuarios usuario: CrearUsuario){
            if (usuario != null){
                String []fila = {
                usuario.getId(),
                usuario.getNombre(),
                usuario.getApellido(),
                usuario.getUsuario(),
                usuario.getRol(),
                usuario.getContraseña()
                };

            } 

        }
        return CrearUsuario;
    }   




    public static String [][] obtenerUsuarios (){
        String [][] usuarios = new String [cantidadUsuarios][5];
        int posicion = 0;
        for (GuardarUsuarios usuario: CrearUsuario){
            if (usuario != null){
                String []fila = {
                usuario.getId(),
                usuario.getNombre(),
                usuario.getApellido(),
                usuario.getUsuario(),
                usuario.getRol(),
                usuario.getContraseña()
            };
            usuarios[posicion]=fila;
            posicion ++;
           
            } 

        }
        return usuarios;
    }   

public static void ModificarUsuarios(String ID, String nombre, String apellido, String usuarios, String rol, String contraseña){
    for (GuardarUsuarios usuario :CrearUsuario){
        if (usuario != null){
            if(usuario.getId().equals(ID)){
                usuario.setNombre(nombre);
                usuario.setApellido(apellido);
                usuario.setUsuario(usuarios);
                usuario.setRol(rol);
                usuario.setContraseña(contraseña);
                    }
                }
            }
        }

public static void EliminarUsuarios(String Id){
    for(GuardarUsuarios usuario: CrearUsuario){
        if(usuario != null){
            if(usuario.getId().equals(Id)){
                usuario.setId(null);
                usuario.setNombre(null);
                usuario.setApellido(null);
                usuario.setUsuario(null);
                usuario.setRol(null);
                usuario.setContraseña(null);
            }
        }
    }
}





    public static String MostrarNombre(String Buscar){
        String Nombre ="";
        for (GuardarUsuarios usuario: CrearUsuario){
            if (usuario != null){
                if(usuario.getId().equals(Buscar)){
                    Nombre = usuario.getNombre();
                }
            }
        }
        return Nombre;
    }

    public static String MostrarApellido(String Buscar){
        String Nombre ="";
        for (GuardarUsuarios usuario: CrearUsuario){
            if (usuario != null){
                if(usuario.getId().equals(Buscar)){
                    Nombre = usuario.getApellido();
                }
            }
        }
        return Nombre;
    }

    public static String MostrarUsuario(String Buscar){
        String Nombre ="";
        for (GuardarUsuarios usuario: CrearUsuario){
            if (usuario != null){
                if(usuario.getId().equals(Buscar)){
                    Nombre = usuario.getUsuario();
                }
            }
        }
        return Nombre;
    }

    public static String MostrarRol(String Buscar){
        String Nombre ="";
        for (GuardarUsuarios usuario: CrearUsuario){
            if (usuario != null){
                if(usuario.getId().equals(Buscar)){
                    Nombre = usuario.getRol();
                }
            }
        }
        return Nombre;
    }

    public static String MostrarContraseña(String Buscar){
        String Nombre ="";
        for (GuardarUsuarios usuario: CrearUsuario){
            if (usuario != null){
                if(usuario.getId().equals(Buscar)){
                    Nombre = usuario.getContraseña();
                }
            }
        }
        return Nombre;
    }


    public static int VerificarNuevoUsuario(String id, String usuarios){
        int i = 1;
        for (GuardarUsuarios usuario: CrearUsuario){
            if (usuario != null){
                if(usuario.getId().equals(id) || usuario.getUsuario().equals(usuarios)){
                    i = -1;
                }
            }
        }
        return i;
    }



    public static int Logueo(String Usuario, String Contra){
        int i=1;
        for (GuardarUsuarios usuario: CrearUsuario){
            if (usuario != null){
                if(usuario.getUsuario().equals(Usuario) && usuario.getContraseña().equals(Contra)){
                    i = -1;
                }
            }
        }
        return i;
    }

    public static int VerUsuario(String Usuario){
        int i=1;
        for (GuardarUsuarios usuario: CrearUsuario){
            if (usuario != null){
                if(usuario.getUsuario().equals(Usuario)){
                    i = -1;
                }
            }
        }
        return i;
    }





}
