package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.LocalDateTime;
import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

public class RegistrolavadoTest {
    private static final Logger LOG = Logger.getLogger(RegistrolavadoTest.class.getName());
@Test
public void CalcularCostoLavado (){

    LOG.info("Iniciado test de la entreada de datos");

      Contacto contactoAnna= new Contacto("Anna", "12345678", "ana@uqvirtua.edu.co");
      Vehiculo vehiculoAnna= new Vehiculo("ABC-123", Tipovehiculo.CAMIONETA, contactoAnna);
      Registrolavado registrolavadoAnna = new Registrolavado(LocalDateTime.of(2006, 5, 31, 3, 8, 0), LocalDateTime.of(2006, 6, 4, 3, 0, 0), Tipolavado.DELUX, vehiculoAnna);
    LOG.info(" realizando evaluación ");

    assertEquals(80000, registrolavadoAnna.CalcularCostoLavado());

    LOG.info(" fin del test ");
}

}
