
package ec.gob.orellana.www.sistemaacademico.personasinvitadas;


public interface IPersonasInvitadas {
    public boolean agregarpersonaInvitada(PersonaInvitada personasInvitadas);
    public void imprimirDatos ();
    public boolean actualizarPersonaInvitada (int id, PersonaInvitada personasInvitadas );
    public boolean eliminarPersonaInvitada (int id);
    public boolean buscarPersonaInvitada (int id);
}
