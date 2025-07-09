
package ec.gob.orellana.www.sistemaacademico.personasservicios;


public interface IPersonasServicios {
    public boolean agregarPersonalServicio(PersonalServicios  personalServicios);
    public void imprimirDatos ();
    public boolean actualizarPersonalServicio (int id, PersonalServicios  personalServicios );
    public boolean eliminarPersonasServicio(int id);
    public boolean buscarPersonasServicio(int id);
}
