
package ec.gob.orellana.www.sistemaacademico.profesores;

public class Profesores implements IProfesores {

    private Profesor[] profesores;
    private int totalProfesores;

    public Profesores(int dimension) {
        profesores = new Profesor[dimension];
        totalProfesores = 0;
    }

    @Override
    public boolean agregarProfesor(Profesor profesoress) {
        if (totalProfesores == profesores.length) {
            return false;
        } else {
            profesores[totalProfesores] = profesoress;
            totalProfesores++;
            return true;
        }
    }

    @Override
    public void imprimirDatos() {
        for (int i = 0; i < totalProfesores; i++) {
            System.out.println("Datos del profesor :" + profesores[i].getNombre());
            System.out.println("Correo del profesor: " + profesores[i].getCorreoInstitucional());
            System.out.println("Correo Personal:" + profesores[i].getCorreo());
            System.out.println("Cedula del Profesor: "+profesores[i].getCedula());
            System.out.println("El sueldo que recibe es de :"+profesores[i].getSueldo());
            //System.out.println("Escalafón: " + profesores[i].getEscalafon());
            System.out.println("El ide el profesor es el siguiente:"+profesores[i].getId());
        }
    }
    
    public boolean eliminarProfesor(int i,Profesor profesoress){
        profesores[i]= profesoress;
        System.out.println("Profesor eliminado");
        return true;
    }
    
    public boolean actualizarProfesor(int i,Profesor profesoress){
        profesores[i]= profesoress;
        return true;
    }
    
    public boolean buscarProfesor(int id){
        for (int i = 0; i < totalProfesores; i++){
            if(profesores[i].getId()==id){
                System.out.println("Profesor encontrado");
                return true;
            }else{
                System.out.println("Codigo erroneo");
                return false;
            }
        }
        return false;
    }
}

