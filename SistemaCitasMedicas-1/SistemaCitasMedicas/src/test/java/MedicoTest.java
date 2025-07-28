/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class MedicoTest {

    
    @Test
    public void testMedicoConstructor() {
        
        String nombre = "Dr. Luis";
        String especialidad = "Cardiología";

        
        Medico medico = new Medico(nombre, especialidad);

        
        assertEquals(nombre, medico.getNombre());
        assertEquals(especialidad, medico.getEspecialidad());
    }

    
    @Test
    public void testMedicoToString() {
        
        String nombre = "Dr. Luis";
        String especialidad = "Cardiología";

        
        Medico medico = new Medico(nombre, especialidad);

        
        String esperado = "Dr. Luis - Cardiología";

        
        assertEquals(esperado, medico.toString());
    }
}