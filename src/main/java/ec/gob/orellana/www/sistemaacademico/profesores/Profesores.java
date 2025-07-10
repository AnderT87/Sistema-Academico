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
            if (profesores[i] != null) {
                System.out.println("------PROFESOR------" + "|" + (i + 1) + "|");
                System.out.println("Nombre :" + profesores[i].getNombre());
                System.out.println("Correo del profesor: " + profesores[i].getCorreoInstitucional());
                System.out.println("Correo Personal:" + profesores[i].getCorreo());
                System.out.println("Cedula del Profesor: " + profesores[i].getCedula());
                System.out.println("El sueldo que recibe es de :" + profesores[i].getSueldo());
                System.out.println("Escalafon: " + profesores[i].getEscalafon());
                System.out.println("El id d el profesor es el siguiente:" + profesores[i].getId());
                System.out.println(" ");
            }

        }
    }

    public boolean eliminarProfesor(int id) {
        for (int i = 0; i < totalProfesores; i++) {
            if (profesores[i].getId() == id) {

                for (int j = i; j < totalProfesores - 1; j++) {
                    profesores[j] = profesores[j + 1];
                }
                profesores[totalProfesores - 1] = null;
                totalProfesores--;
                System.out.println("Profesor eliminado");
                return true;
            }
        }
        return false;
    }

    public boolean actualizarProfesor(int id, Profesor nuevoProfesor) {
        for (int i = 0; i < totalProfesores; i++) {
            if (profesores[i] != null && profesores[i].getId() == id) {
                profesores[i] = nuevoProfesor;
                return true;
            }
        }
        return false;
    }

    public Profesor buscarProfesor(int id) {
        for (int i = 0; i < totalProfesores; i++) {
            if (profesores[i] != null && profesores[i].getId() == id) {
                return profesores[i];
            }
        }
        return null;
    }

}
