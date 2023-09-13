package co.edu.uniquindio.poo;

import java.time.LocalDateTime;

public record Registrolavado( LocalDateTime fechaHE, LocalDateTime fechaHS, Tipolavado tipolavado, Vehiculo vehiculo){

    /**
     * @return
     */
    public int CalcularCostoLavado (){
      
        int valor =0;
      Tipovehiculo tipovehiculo= vehiculo.tipovehiculo();

      switch (tipovehiculo) {
        case CARRO:
            switch (tipolavado) {
                case SIMPLE:
                    valor= 30000 ;
                    break;
                case POLICHADO:
                    valor=45000 ;   
                    break;
                case DELUX:
                     valor=60000;
                    break;
            }
             break;
        case CAMIONETA:
              switch (tipolavado) {
                case SIMPLE:
                    valor= 40000;
                    break;
                case POLICHADO:
                    valor= 60000 ;   
                    break;
                case DELUX:
                     valor= 80000;
                    break;
              }
               break;
        case MOTO:
               switch (tipolavado) {
                case SIMPLE:
                    valor= 10000 ;
                    break;
                case POLICHADO:
                    valor= 15000 ;   
                    break;
                case DELUX:
                     valor= 20000 ;
      }
       break;
    }
      return valor;
  }
}
