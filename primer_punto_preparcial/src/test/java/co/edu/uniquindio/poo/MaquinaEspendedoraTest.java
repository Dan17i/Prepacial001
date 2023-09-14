package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

public class MaquinaEspendedoraTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    
    @Test
    public void datosCompletos(){

        LOG.info("inicio de entrada de datos");

        MaquinaEspendedora maquinaEspendedora= new MaquinaEspendedora(30000, 25000);

        assertEquals((float)30000, maquinaEspendedora.valorPagar());
        assertEquals((float)25000,maquinaEspendedora.valorPagado());
       
         LOG.info("test excitoso");
    } 

    @Test
    public void valoresNegativos(){

        LOG.info("inicio de datos negativos");

        assertThrows(Throwable.class,()-> new MaquinaEspendedora(-20000, 15000));
        assertThrows(Throwable.class,()-> new MaquinaEspendedora(20000, -15000));

        LOG.info("fin de datos negativos");
    }

    @Test
    public void CalcularDevuelta(){

         LOG.info("inicio de entrada de datos");

        MaquinaEspendedora maquinaEspendedora= new MaquinaEspendedora(30000, 25000);

        assertEquals((float)5000, maquinaEspendedora.CalcularDevuelta(maquinaEspendedora.valorPagar(),maquinaEspendedora.valorPagado()));
        
        LOG.info("fin exitoso");

}
}
