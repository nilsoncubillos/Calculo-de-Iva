
package beans;

import javax.ejb.Stateless;

/**
 *
 * @author ncubillos
 */
@Stateless
public class Calcular {
 
    public double CalcularIva(double Precio) {
    
        if (Precio>0){
            
     double iva=0.19;
     double calcular = (Precio*iva)+Precio;
     return calcular;
        }           
          else {
            return 0;
        }

    }
}
