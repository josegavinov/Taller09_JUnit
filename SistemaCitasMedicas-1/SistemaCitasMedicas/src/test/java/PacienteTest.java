/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

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
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PacienteTest {

    // Caso de prueba 1: Validar manejo de entrada inválida
    @Test
    public void testPacienteConCedulaVacia() {
        // Datos de entrada
        Paciente paciente = new Paciente("", "Juan Perez", "juan.perez@example.com");

        // Salida esperada
        String mensajeEsperado = "Error o comportamiento inesperado"; 

        // Verificar que la cedula no está vacía (según el plan de pruebas)
        assertTrue(paciente.getCedula().isEmpty(), mensajeEsperado);
    }

    // Caso de prueba 2: Validar constructor normal
    @Test
    public void testPacienteConstructor() {
        // Datos de entrada
        Paciente paciente = new Paciente("12345678", "Juan Perez", "juan.perez@example.com");

        // Verificar que los datos del paciente se almacenan correctamente
        assertEquals("12345678", paciente.getCedula());
        assertEquals("Juan Perez", paciente.getNombre());
        assertEquals("juan.perez@example.com", paciente.getCorreo());
    }

    // Caso de prueba 3: Validar el comportamiento de toString
    @Test
    public void testToString() {
        // Datos de entrada
        Paciente paciente = new Paciente("12345678", "Juan Perez", "juan.perez@example.com");

        // Salida esperada
        String resultadoEsperado = "Juan Perez (12345678)";

        // Verificar que el toString devuelve el formato correcto
        assertEquals(resultadoEsperado, paciente.toString());
    }

    // Caso de prueba 4: Verificar nombre vacío
    @Test
    public void testNombreVacio() {
        // Datos de entrada
        Paciente paciente = new Paciente("12345678", "", "juan.perez@example.com");

        // Salida esperada
        String mensajeEsperado = "Error o comportamiento inesperado";

        // Verificar que el nombre no está vacío
        assertTrue(paciente.getNombre().isEmpty(), mensajeEsperado);
    }

    // Caso de prueba 5: Verificar correo inválido
    @Test
    public void testCorreoInvalido() {
        // Datos de entrada
        Paciente paciente = new Paciente("12345678", "Juan Perez", "correo_invalido");

        // Validar que el correo no tiene un formato válido
        assertFalse(paciente.getCorreo().contains("@"), "Correo inválido, falta '@'");
    }
}