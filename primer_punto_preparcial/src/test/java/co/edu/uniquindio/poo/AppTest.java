/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;


import java.time.LocalDateTime;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        LOG.info("Iniciado test shouldAnswerWithTrue");
         Contacto contactoAnna= new Contacto("Anna", "12345678", "ana@uqvirtua.edu.co");
         Vehiculo vehiculoAnna= new Vehiculo("ABC-123", Tipovehiculo.CAMIONETA, contactoAnna);
         Registrolavado registrolavadoAnna = new Registrolavado(LocalDateTime.of(2006, 5, 31, 3, 8, 0), LocalDateTime.of(2006, 6, 4, 3, 0, 0), Tipolavado.DELUX, vehiculoAnna);

         assertEquals(80000, registrolavadoAnna.CalcularCostoLavado());
         assertEquals("Anna", contactoAnna.nombre());
        LOG.info("Finalizando test shouldAnswerWithTrue");
    }
}
