package ec.gob.orellana.www.sistemaacademico.estudiantes;

public interface IEstudiantes {

    public boolean agregarEstudiantes(Estudiante estudiante);
    public void imprimirDato ();
    public boolean eliminarEstudiante (int id);
    public boolean buscarEstudiante(int id);
    public boolean actualizarEstudiante (int id, Estudiante estudiante);
}
