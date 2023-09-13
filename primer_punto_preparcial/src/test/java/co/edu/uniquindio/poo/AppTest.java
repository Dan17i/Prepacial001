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
        LOG.info("Iniciado test de la entreada de datos");

         Contacto contactoAnna= new Contacto("Anna", "12345678", "ana@uqvirtua.edu.co");
         Vehiculo vehiculoAnna= new Vehiculo("ABC-123", Tipovehiculo.CAMIONETA, contactoAnna);
         Registrolavado registrolavadoAnna = new Registrolavado(LocalDateTime.of(2006, 5, 31, 3, 8, 0), LocalDateTime.of(2006, 6, 4, 3, 0, 0), Tipolavado.DELUX, vehiculoAnna);
       
         LOG.info("ya creamos  el contato , el vehiculo y el registro");

         assertEquals("Anna", contactoAnna.nombre());
         assertEquals("12345678", contactoAnna.numero());
         assertEquals("ana@uqvirtua.edu.co",contactoAnna.email());
         assertEquals("ABC-123",vehiculoAnna.placa()); 
         assertEquals(Tipovehiculo.CAMIONETA, vehiculoAnna.tipovehiculo());
         assertEquals(contactoAnna, vehiculoAnna.contacto());
         assertEquals(LocalDateTime.of(2006, 5, 31, 3, 8, 0),registrolavadoAnna.fechaHE());
         assertEquals( LocalDateTime.of(2006, 6, 4, 3, 0, 0),registrolavadoAnna.fechaHS());
         assertEquals(Tipolavado.DELUX, registrolavadoAnna.tipolavado());

        // assertEquals(80000, registrolavadoAnna.CalcularCostoLavado());

        LOG.info("Finalizando test no cuenta con ningun error de entrada de datos");
    }

   
}
