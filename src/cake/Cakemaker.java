
package cake;
import framework.*;


public class Cakemaker extends Maker{
    protected Product createProduct(String name){
        return new Cake(name);
    }
    
}
