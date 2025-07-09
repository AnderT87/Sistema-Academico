
package ec.gob.orellana.www.sistemaacademico.personasservicios;


public class PersonasServicios implements IPersonasServicios{
    
   private PersonalServicios [] personalServicios;
    private int totalPersonalS;

    public PersonasServicios(int dimension) {
        personalServicios = new PersonalServicios[dimension];
        totalPersonalS=0;
    }
    
    
    public boolean agregarPersonalServicio(PersonalServicios personalServicio){
        if(totalPersonalS == personalServicios.length){
             return false;     
        }else{
            personalServicios[totalPersonalS] = personalServicio;
            totalPersonalS = totalPersonalS +1 ;
            return true;    
        }        
    }
    
    
    public void imprimirDatos (){
        for(int i =0; i < totalPersonalS;i++){
            System.out.println("-----PERSONAL DE SERVICIO-----" + "|" + (i + 1) + "|");
            System.out.print("Nombre del personal: " + personalServicios[i].getNombre());
            System.out.println("Cedula : " + personalServicios[i].getCedula());
            System.out.println("Correo Institucional : " + personalServicios[i].getCorreoInstitucional());
            System.out.println("Correo personal : " + personalServicios[i].getCorreo());
            System.out.println("Gremio al que pertenece : " +personalServicios[i].getGremio());
            System.out.println("Sueldo : " + personalServicios[i].getSueldo());
            System.out.println("Codigo de identificacion : " + personalServicios[i].getId());
        }
            
    }
    
    
    public boolean actualizarPersonalServicio(int id, PersonalServicios personalServicio){
        for (int i = 0; i < totalPersonalS; i++) {
            personalServicios[i]= personalServicio;
            imprimirDatos();
            return true;
        }
        return true;
    }
    
    public boolean eliminarPersonasServicio(int id) {
        for (int i = 0; i < totalPersonalS; i++) {
            if (personalServicios[i].getId() == id) {
                // Reorganizar el arreglo para quitar el hueco
                for (int j = i; j < totalPersonalS - 1; j++) {
                    personalServicios[j] = personalServicios[j + 1];
                }
                personalServicios[totalPersonalS - 1] = null;
                totalPersonalS--;
                System.out.println("Profesor eliminado");
                return true;
            }
        }
        return false;
    }
    
    public boolean buscarPersonasServicio(int id){
        for (int i = 0; i < totalPersonalS; i++) {
            if (personalServicios[i].getId()==id) {
                imprimirDatos();
                return true;
            }else{
                System.out.println("Codigo erroneo");
                return false;
            }
        }
        return false;
    }
}
