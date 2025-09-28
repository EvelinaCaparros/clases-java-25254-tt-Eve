import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio01_hechoTest {
    @Test
    void testSaludoEdadUnAño() {
        String resultado = Ejercicio01_hecho.generarSaludo("Juan", 1);
        assertEquals("Hola Juan, tenes 1 año!", resultado);
    }

    @Test
    void testSaludoEdadVariosAños() {
        String resultado = Ejercicio01_hecho.generarSaludo("Ana", 25);
        assertEquals("Hola Ana, tenes 25 años!", resultado);
    }
}
