/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

import main.java.co.edu.uniquindio.poo.Marca;
import main.java.co.edu.uniquindio.poo.Tipoproducto;

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
        
        Marca marcaNueva = new Marca("Diana", "www.Diana.com", "Diana@gamil.co");
        Producto productoNuevo =new Producto("Arroz", LocalDate.of(2024, 5, 3), (float)2000, marcaNueva,Tipoproducto.NACIONAL);

       assertEquals("Diana",marcaNueva.nombre());
       assertEquals("www.Diana.com", marcaNueva.web());
       

        LOG.info("Finalizando test shouldAnswerWithTrue");
    }
}
