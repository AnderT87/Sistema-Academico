package ec.gob.orellana.www.sistemaacademico.estudiantes;

public class Estudiantes implements IEstudiantes {

    private Estudiante [] estudiantes; 
    private int totalEstudiantes; 
    
   public Estudiantes(int dimension) {
        estudiantes = new Estudiante[dimension];
        totalEstudiantes =0;
    }
    
    
    @Override
    public boolean agregarEstudiantes (Estudiante estudiante){
        if (totalEstudiantes == estudiantes.length){
            return false;
        } else {
            estudiantes [totalEstudiantes] = estudiante;
            totalEstudiantes = totalEstudiantes +1;
            return true;
        }     
    }
    @Override
    public void imprimirDato (){
        for (int i =0; i< totalEstudiantes; i++){
            System.out.println("------Estudiante------"+"|"+(i+1)+"|");
            System.out.println("Nombre del estudiante: "+estudiantes[i].getNombre());
            System.out.println("Cedula del estudiante: "+estudiantes[i].getCedula());
            System.out.println("Correo personal del estudiante: "+estudiantes[i].getCorreo());
            System.out.println("Correo institucional del estudiante: "+estudiantes[i].getCorreoInstitucional());
            System.out.println("Codigo del estudiante: "+ estudiantes[i].getCodigo());
            System.out.println("ID del estudiante: "+estudiantes[i].getId());
            System.out.println(" ");
        }
    }
        
    
    public boolean eliminarEstudiante(int id) {
        for (int i = 0; i < totalEstudiantes; i++) {
            if (estudiantes[i].getId() == id) {
                // Reorganizar el arreglo para quitar el hueco
                for (int j = i; j < totalEstudiantes - 1; j++) {
                    estudiantes[j] = estudiantes[j + 1];
                }
                estudiantes[totalEstudiantes - 1] = null;
                totalEstudiantes--;
                System.out.println("Estudiante eliminado");
                return true;
            }
        }
        return false;
    }
    
    public boolean buscarEstudiante(int id) {
        for (int i = 0; i < totalEstudiantes ; i++) {
            if (estudiantes[i].getId() == id) {
                return true;
            }
        }
        System.out.println("Codigo no encontrado");
        return false;
    }
    
    @Override
    public boolean actualizarEstudiante (int id, Estudiante estudiante){
        for(int i = 0; i < totalEstudiantes ; i++){
            estudiantes [i] = estudiante; 
            imprimirDato();
            return true; 
        }
        return false;
    }

    

}
