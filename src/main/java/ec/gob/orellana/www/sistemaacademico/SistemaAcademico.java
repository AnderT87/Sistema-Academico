/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.gob.orellana.www.sistemaacademico;
import ec.gob.orellana.www.sistemaacademico.estudiantes.Estudiante;
import ec.gob.orellana.www.sistemaacademico.personasservicios.PersonalServicios;
import ec.gob.orellana.www.sistemaacademico.decanos.Decano;
import ec.gob.orellana.www.sistemaacademico.personasinvitadas.PersonaInvitada;
//import ec.gob.orellana.www.sistemaacademico.profesores.Escalafon;
import ec.gob.orellana.www.sistemaacademico.profesores.Profesor;
import ec.gob.orellana.www.sistemaacademico.decanos.Decanos;
import ec.gob.orellana.www.sistemaacademico.decanos.IDecanos;
import ec.gob.orellana.www.sistemaacademico.estudiantes.Estudiantes;
import ec.gob.orellana.www.sistemaacademico.estudiantes.IEstudiantes;
import ec.gob.orellana.www.sistemaacademico.personasinvitadas.IPersonasInvitadas;
import ec.gob.orellana.www.sistemaacademico.personasinvitadas.PersonasInvitadas;
import ec.gob.orellana.www.sistemaacademico.personasservicios.IPersonasServicios;
import ec.gob.orellana.www.sistemaacademico.personasservicios.PersonasServicios;
import ec.gob.orellana.www.sistemaacademico.profesores.Escalafon;
import ec.gob.orellana.www.sistemaacademico.profesores.IProfesores;
import ec.gob.orellana.www.sistemaacademico.profesores.Profesores;
import ec.gob.orellana.www.sistemaacademico.vista.VProfesores;
import ec.gob.orellana.www.sistemaacademico.vista.VentanaSeleccion;
import javax.swing.SwingUtilities;

public class SistemaAcademico {

    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(() -> {
            new VentanaSeleccion().setVisible(true);
        });
        
        /*
        VentanaSeleccion seleccion = new VentanaSeleccion();
        seleccion.setVisible(true);
        VProfesores vistaProfesores = new VProfesores();
        vistaProfesores.setVisible(true);
        */
        
        //CLASE PERSONA INVITADA
        System.out.println("---PERSONA INVITADA---");
        IPersonasInvitadas objPersonaInvitada  = new PersonasInvitadas(2); 
        
        PersonaInvitada PersonaUno = new PersonaInvitada("Alexis", 5380, " alexisyasacama@gmail.com ", "2250180862", "Estudiante de la ESPOCH");
        PersonaInvitada PersonaDos = new PersonaInvitada("Xavier", 5381, " xavier@gmail.com ", " 2218603578 ", "Profesor de la ESPOCH");
        
        PersonaInvitada pModificada = new PersonaInvitada("Alexis", 5380, " alexis.vargas@gmail.com", "2250180862", "Estudiante de la Sede Orellana");
        
        objPersonaInvitada.agregarpersonaInvitada(PersonaUno);
        objPersonaInvitada.agregarpersonaInvitada(PersonaDos);
        objPersonaInvitada.imprimirDatos();
        System.out.println("---DATOS MODIFICADOS---");
        objPersonaInvitada.actualizarPersonaInvitada(1, pModificada);
        objPersonaInvitada.imprimirDatos();
        System.out.println(" ");
        
        //CLASE ESTUDIANTE
        IEstudiantes objEstudiante = new Estudiantes (3);
        //Constructur datos Estudiante
        Estudiante estudianteUno = new Estudiante (022, "Xavier@espoch.edu", "Xavier", 69, "xaviertoala@hotmail", "6969696969");
        Estudiante estudianteDos = new Estudiante (023, "Ander@espoch.edu", "Ander", 79, "anderayovi@hotmail", "2020202020");
        Estudiante estudianteTres = new Estudiante (024, "Alexis@espoch.edu", "Alexis", 89, "alexisvargas@hotmail", "2121212121");
        
        objEstudiante.agregarEstudiantes(estudianteUno);
        objEstudiante.agregarEstudiantes(estudianteDos);
        objEstudiante.agregarEstudiantes(estudianteTres);
        objEstudiante.imprimirDato(); //Impresion estudiantes
        System.out.println("------DATOS MODIFICADOS------");
        //Metodo Actualizar estudiante
        Estudiante Emodificado = new Estudiante (032, "Ander@espoch", "AnderAyovi", 79, "ander01@gmail", "22002200");
        objEstudiante.actualizarEstudiante(1, Emodificado);
        objEstudiante.imprimirDato();
        System.out.println("------DATOS ELIMINADOS------");
        //Metodo Eliminar estudiante
        Estudiante EliminarE = new Estudiante (0, " ", " ", 0, " ", " ");
        objEstudiante.eliminarEstudiante(2, EliminarE);
        objEstudiante.imprimirDato();
        System.out.println(" ");
        
        //CLASE PERSONA DE SERVICIO
        System.out.println("---PERSONAL DE SERVICIO---");
        IPersonasServicios objPServicios = new PersonasServicios(2);
        
        PersonalServicios PUno = new PersonalServicios("ESPOCH SEDE ORELLANA", 458.0, "MAURICIO@GMAIL.COM", "Mauricio", 2580, "M@gmail.com", "2265801472");
        PersonalServicios PDos = new PersonalServicios("MATRIZ EN RIOBAMBA", 458.0, "MAURICIO@GMAIL.COM", "Mauricio", 2580, "M@gmail.com", "2265801472");
        
        PersonalServicios sModificada = new PersonalServicios("NUEVA SEDE EN GUAYAQUIL", 458.0, "MAURICIO@GMAIL.COM", "Mauricio", 2580, "M@gmail.com", "2265801472");
        
        objPServicios.agregarPersonalServicio(PUno);
        objPServicios.agregarPersonalServicio(PDos);
        objPServicios.imprimirDatos();
        System.out.println("---DATOS MODIFICADOS---");
        objPServicios.actualizarPersonalServicio(1, sModificada);
        objPServicios.imprimirDatos();
        System.out.println(" ");
        
        //CLASE PROFESOR
        System.out.println("---PROFESOR---");
        
        //Constructor
        IProfesores objProfesor = new Profesores(3);
     
        Profesor profesorUno = new Profesor(Escalafon.AUXILIAR,2345,"Juan@espoch.edu.ec", "Juan",2, "juan@espoch.edu.ec", "220046735");
        Profesor profesorDos = new Profesor(Escalafon.AUXILIAR, 2756,"Alex@espoch.edu.ec", "Alex",5, "alex@espoch.edu.ec", "228872628");
        
        Profesor agregoProfesor = new Profesor(Escalafon.PRINCIPAL, 2345, "Josue@espoch.edu.ec", "Josue", 5, "josue@gmail.com", "22546738");
        
        //Metodos
        
        //Agregar
        objProfesor.agregarProfesor(profesorUno);
        objProfesor.agregarProfesor(profesorDos);
        objProfesor.agregarProfesor(agregoProfesor);
        objProfesor.imprimirDatos();
        //Eliminar
        Profesor eProfesor = new Profesor(null,0, " ", " ", 0, " ", " ");
        objProfesor.eliminarProfesor(2);
        objProfesor.imprimirDatos();
        
        //Actualizar
        Profesor aProfesor = new Profesor(Escalafon.AGREGADO, 2345, "Erick@gmail.com", "Erick", 1234, "Erick@gmail.com", "23876766");
        objProfesor.eliminarProfesor(2);
        System.out.println(" ");
        
        //Buscar
        objProfesor.buscarProfesor(2);
        objProfesor.imprimirDatos();
        
        //CLASE DECANO
        IDecanos objDecano = new Decanos (2);
        //Constructor datos Decano
        Decano decanoUno = new Decano ("Intermedio-alto ", 3800, "Rene@espoch.edu", "Rene", 40, "Rene@outlook", "220054678");
        Decano decanoDos = new Decano ("Intermedio-alto", 3800, "Higuita@espoch.edu", "Higuita", 50, "Higuita@outlook", "1010101010");

        objDecano.AgregarDecanos(decanoUno);
        objDecano.AgregarDecanos(decanoDos);
        objDecano.imprimirDatos(); //Impresion decanos
        System.out.println("------DATOS MODIFICADOS------");
        //Metodo Actualizar Decano 
        Decano Edecano = new Decano ("Alto", 4000, "Rene@espoch", "ReneX", 41, "Rene@Gmail", "220044444");
        objDecano.actualizarDecano(0, Edecano);
        objDecano.imprimirDatos();
        System.out.println("------DATOS ELIMINADOS------");
        //Metodo Eliminar Decano 
        Decano EliminarD = new Decano (" ", 0, " ", " ", 0, " ", " ");
        objDecano.eliminarDecano(1);
        objDecano.imprimirDatos(); 
    }
}
