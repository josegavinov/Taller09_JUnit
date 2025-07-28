/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import java.time.LocalDateTime;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author CltControl
 */
public class CitaMedicaTest {

    // Caso de prueba 1: Validar constructor de CitaMedica con datos válidos
    @Test
    public void testCitaMedicaConstructor() {
        // Datos de entrada
        Paciente paciente = new Paciente("12345678", "Juan Perez", "juan.perez@example.com");
        Medico medico = new Medico("Dr. Luis", "Cardiología");
        LocalDateTime fechaHora = LocalDateTime.of(2025, 7, 28, 10, 0);
        
        // Crear la cita médica
        CitaMedica cita = new CitaMedica(paciente, medico, fechaHora);

        // Verificar que los datos fueron correctamente asignados
        assertEquals(paciente, cita.getPaciente());
        assertEquals(medico, cita.getMedico());
        assertEquals(fechaHora, cita.getFechaHora());
        assertEquals("Agendada", cita.getEstado());
    }

    // Caso de prueba 2: Verificar la función toString()
    @Test
    public void testCitaMedicaToString() {
        // Datos de entrada
        Paciente paciente = new Paciente("12345678", "Juan Perez", "juan.perez@example.com");
        Medico medico = new Medico("Dr. Luis", "Cardiología");
        LocalDateTime fechaHora = LocalDateTime.of(2025, 7, 28, 10, 0);

        // Crear la cita médica
        CitaMedica cita = new CitaMedica(paciente, medico, fechaHora);
        
        // Salida esperada para el método toString()
        String esperado = "Cita con Dr. Luis para Juan Perez (12345678) en 2025-07-28T10:00 [Agendada]";
        
        // Verificar que el toString() devuelve el formato esperado
        assertEquals(esperado, cita.toString());
    }

    // Caso de prueba 3: Cambiar el estado de la cita con setEstado()
    @Test
    public void testSetEstado() {
        // Datos de entrada
        Paciente paciente = new Paciente("12345678", "Juan Perez", "juan.perez@example.com");
        Medico medico = new Medico("Dr. Luis", "Cardiología");
        LocalDateTime fechaHora = LocalDateTime.of(2025, 7, 28, 10, 0);
        
        // Crear la cita médica
        CitaMedica cita = new CitaMedica(paciente, medico, fechaHora);

        // Cambiar el estado de la cita
        cita.setEstado("Cancelada");

        // Verificar que el estado fue correctamente actualizado
        assertEquals("Cancelada", cita.getEstado());
    }

    // Caso de prueba 4: Verificar estado de la cita después de la creación
    @Test
    public void testEstadoInicial() {
        // Datos de entrada
        Paciente paciente = new Paciente("12345678", "Juan Perez", "juan.perez@example.com");
        Medico medico = new Medico("Dr. Luis", "Cardiología");
        LocalDateTime fechaHora = LocalDateTime.of(2025, 7, 28, 10, 0);
        
        // Crear la cita médica
        CitaMedica cita = new CitaMedica(paciente, medico, fechaHora);

        // Verificar que el estado inicial es "Agendada"
        assertEquals("Agendada", cita.getEstado());
    }
}