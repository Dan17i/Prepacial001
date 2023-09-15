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
    assert valorPagado>valorPagado;

 }

}
