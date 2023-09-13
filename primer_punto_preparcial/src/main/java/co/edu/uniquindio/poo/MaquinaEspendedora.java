package co.edu.uniquindio.poo;

public record MaquinaEspendedora(float valorPagar, float valorPagado) {
    
 public Float CalcularDevuelta(float valorPagar, float valorPagado){
   float valor=0;

  valor= valorPagar-valorPagado;
  return  valor;
 }
 /**
 * 
 */
public MaquinaEspendedora{
    assert valorPagar >=0;
    assert valorPagado>=0;
    //assert valorPagar != null; porque aparece  error
    //assert valorPagado != null; porque aparece error
 }

}
