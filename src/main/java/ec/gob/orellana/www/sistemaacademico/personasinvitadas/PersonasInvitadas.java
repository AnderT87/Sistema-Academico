
package ec.gob.orellana.www.sistemaacademico.personasinvitadas;

public class PersonasInvitadas implements IPersonasInvitadas {
    
    private PersonaInvitada [] personasInvitadas;
    private int totalPersonasI;

    public PersonasInvitadas(int dimension) {
        personasInvitadas = new PersonaInvitada[dimension];
        totalPersonasI=0;
    }
    
    
    public boolean agregarpersonaInvitada(PersonaInvitada personaInvitada){
        if(totalPersonasI == personasInvitadas.length){
             return false;     
        }else{
            personasInvitadas[totalPersonasI] = personaInvitada;
            totalPersonasI = totalPersonasI +1 ;
            return true;    
        }        
    }
    
    public void imprimirDatos (){
        for (int i = 0; i < totalPersonasI; i++) {
            System.out.println("-----Persona Invitada-------");
            System.out.println("Datos de la persona: " + personasInvitadas[i].getNombre());
            System.out.println("Cedula: " +  personasInvitadas[i].getCedula());
            System.out.println("Correo: " + personasInvitadas[i].getCorreo());
            System.out.println("ID:"+ personasInvitadas[i].getId());
            System.out.println("Descripcion : " + personasInvitadas[i].getDescripcion());
            System.out.println(" ");
        }
    }
    
    public boolean actualizarPersonaInvitada(int id, PersonaInvitada personaInvitada){
        for (int i = 0; i < totalPersonasI; i++) {
            personasInvitadas[i]= personaInvitada;
            imprimirDatos();
            return true;
        }
        return true;
    }
    
    public boolean eliminarPersonaInvitada(int id) {
        for (int i = 0; i < totalPersonasI; i++) {
            if (personasInvitadas[i].getId() == id) {
                // Reorganizar el arreglo para quitar el hueco
                for (int j = i; j <  totalPersonasI - 1; j++) {
                    personasInvitadas[j] = personasInvitadas[j + 1];
                }
                personasInvitadas[ totalPersonasI - 1] = null;
                 totalPersonasI--;
                System.out.println("Persona invitada eliminada");
                return true;
            }
        }
        return false;
    }
    public boolean buscarPersonaInvitada(int id){
        for (int i = 0; i < totalPersonasI; i++){
            if(personasInvitadas[i].getId()==id){
                imprimirDatos();
                return true;
            }else{
                System.out.println("");
                return false;
            }
        }
        return false;
    }
}
