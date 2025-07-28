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

    // Caso de prueba 1: Verificar constructor y valores asignados correctamente
    @Test
    public void testMedicoConstructor() {
        // Datos de entrada
        String nombre = "Dr. Luis";
        String especialidad = "Cardiología";

        // Crear objeto Medico
        Medico medico = new Medico(nombre, especialidad);

        // Verificar que los valores fueron correctamente asignados
        assertEquals(nombre, medico.getNombre());
        assertEquals(especialidad, medico.getEspecialidad());
    }

    // Caso de prueba 2: Verificar el comportamiento del método toString()
    @Test
    public void testMedicoToString() {
        // Datos de entrada
        String nombre = "Dr. Luis";
        String especialidad = "Cardiología";

        // Crear objeto Medico
        Medico medico = new Medico(nombre, especialidad);

        // Salida esperada para el método toString()
        String esperado = "Dr. Luis - Cardiología";

        // Verificar que toString devuelve el formato correcto
        assertEquals(esperado, medico.toString());
    }
}